package io.lenra.app;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.lenra.api.internal.ApiException;
import io.lenra.app.classes.Collection;
import io.lenra.app.component.View;
import io.lenra.app.listener.IncrementListener;
import io.lenra.app.request.ListenerRequest;
import io.lenra.app.view.CounterView;

@Component
public class MyApp extends LenraApplication {
    @Override
    Manifest manifest() {
        var manifest = new Manifest();
        manifest.setJson(new Manifest.Exposer(List.of(
                new Manifest.Route("/counter/global", new View("counter")),
                new Manifest.Route("/counter/me", new View("counter")))));

        manifest.setLenra(new Manifest.Exposer(List.of(new Manifest.Route("/", new View("lenra.main")))));
        return manifest;
    }

    @Override
    Map<String, ViewHandler<?, ?>> views() {
        return Map.of(
                "counter", new ViewHandler<>(CounterView::handle) {
                },
                "lenra.counter", new ViewHandler<>(CounterView::handle) {
                });
    }

    @Override
    Map<String, ListenerHandler<?>> listeners() {
        return Map.of(
                "increment", new ListenerHandler<>(IncrementListener::handle) {
                },
                "onEnvStart", new ListenerHandler<>((ListenerRequest<Object> props) -> {
                    try {
                        createCounter(props, "global");
                    } catch (ApiException e) {
                        e.printStackTrace();
                    }
                    return null;
                }) {
                },
                "onUserFirstJoin", new ListenerHandler<>((ListenerRequest<Object> props) -> {
                    try {
                        createCounter(props, "@me");
                    } catch (ApiException e) {
                        e.printStackTrace();
                    }
                    return null;
                }) {
                },
                "onSessionStart", new ListenerHandler<>((ListenerRequest<Object> props) -> null) {
                });
    }

    void createCounter(ListenerRequest<Object> request, String user) throws ApiException {
        Collection counterColl = request.getApi().data().coll("counter");
        Map<String, Object> counters = counterColl.find(Map.of("user", user), Map.of());

        if (counters.size() == 0) {
            counterColl.createDoc(new io.lenra.app.data.Counter(user, 0));
        }
    }
}
