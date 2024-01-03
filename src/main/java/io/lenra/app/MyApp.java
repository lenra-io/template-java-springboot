package io.lenra.app;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.lenra.api.ComponentsView;
import io.lenra.api.ComponentsViewDefinitionsFind;
import io.lenra.api.DataQuery;
import io.lenra.api.Exposer;
import io.lenra.api.ManifestSchema;
import io.lenra.api.Route;
import io.lenra.api.internal.ApiException;
import io.lenra.app.classes.Collection;
import io.lenra.app.listener.IncrementListener;
import io.lenra.app.request.ListenerRequest;
import io.lenra.app.view.CounterView;

@Component
public class MyApp extends LenraApplication {
    @Override
    ManifestSchema manifest() {
        ManifestSchema manifest = new ManifestSchema();

        ComponentsView counterSchema = new ComponentsView();
        ComponentsViewDefinitionsFind counterFind = new ComponentsViewDefinitionsFind();
        counterFind.setColl("counter");
        DataQuery counterQuery = new DataQuery();
        counterQuery.setAdditionalProperty("user", "global");
        counterFind.setQuery(counterQuery);
        counterSchema.setFind(counterFind);

        Route globalRoute = new Route();
        globalRoute.setPath("/counter/global");
        globalRoute.setView(counterSchema);

        ComponentsView counterMeSchema = new ComponentsView();
        ComponentsViewDefinitionsFind counterMeFind = new ComponentsViewDefinitionsFind();
        counterMeFind.setColl("counter");
        DataQuery counterMeQuery = new DataQuery();
        counterMeQuery.setAdditionalProperty("user", "@me");
        counterMeFind.setQuery(counterMeQuery);
        counterMeSchema.setFind(counterMeFind);

        Route meRoute = new Route();
        meRoute.setPath("/counter/me");
        meRoute.setView(counterMeSchema);

        Exposer jsonExposer = new Exposer();
        jsonExposer.setRoutes(List.of(globalRoute, meRoute));

        manifest.setJson(jsonExposer);

        return manifest;

        // manifest.setLenra(new Manifest.Exposer(List.of(new Manifest.Route("/", new View("lenra.main")))));
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
