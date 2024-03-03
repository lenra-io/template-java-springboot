package io.lenra.app;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.lenra.api.Exposer;
import io.lenra.api.Manifest;
import io.lenra.api.Route;
import io.lenra.api.components.View;
import io.lenra.api.components.view.definitions.Find;
import io.lenra.api.internal.ApiException;
import io.lenra.app.api.Collection;
import io.lenra.app.handlers.ListenerHandler;
import io.lenra.app.handlers.ViewHandler;
import io.lenra.app.listener.IncrementListener;
import io.lenra.api.AppRequest;
import io.lenra.app.request.ListenerRequest;
import io.lenra.app.view.CounterView;
import jakarta.inject.Named;

@Named
@RestController
@SpringBootApplication
public class MyApp extends LenraApplication {
    @Override
    protected Manifest manifest() {
        return Manifest.builder()
                .json(Exposer.builder()
                        .route(Route.builder()
                                .path("/counter/global")
                                .view(View.builder()
                                        .name("counter")
                                        .find(Find.builder()
                                                .coll("counter")
                                                .query(Map.of("user", "global"))
                                                .build())
                                        .build())
                                .role("guest")
                                .role("user")
                                .build())
                        .route(Route.builder()
                                .path("/counter/me")
                                .view(View.builder()
                                        .name("counter")
                                        .find(Find.builder()
                                                .coll("counter")
                                                .query(Map.of("user", "@me"))
                                                .build())
                                        .build())
                                .build())
                        .build())
                .build();
    }

    @Override
    protected Map<String, ViewHandler<?, ?>> views() {
        return Map.of(
                "counter", new ViewHandler<>(CounterView::handle) {
                },
                "lenra.counter", new ViewHandler<>(CounterView::handle) {
                });
    }

    @Override
    protected Map<String, ListenerHandler<?>> listeners() {
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
        List<Map<String, Object>> counters = counterColl.find(Map.of("user", user), Map.of());

        if (counters.size() == 0) {
            counterColl.createDoc(new io.lenra.app.data.Counter(user, 0));
        }
    }

    ///////////// Spring Boot app

    @PostMapping(value = "/**", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object index(@RequestBody AppRequest request) {
        System.err.println(request);
        return handle(request);
        // try {
        //     return request.handle(this);
        // } catch (NullPointerException e) {
        //     throw new ResponseStatusException(
        //             HttpStatus.NOT_FOUND, e.getMessage(), e);

        // }
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
