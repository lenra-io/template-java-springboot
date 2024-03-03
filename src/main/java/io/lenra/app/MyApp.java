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

import io.lenra.api.components.View;
import io.lenra.api.components.view.definitions.Find;
import io.lenra.api.data.Query;
import io.lenra.api.internal.ApiException;
import io.lenra.app.Manifest.Exposer;
import io.lenra.app.Manifest.Route;
import io.lenra.app.api.Collection;
import io.lenra.app.handlers.ListenerHandler;
import io.lenra.app.handlers.ViewHandler;
import io.lenra.app.listener.IncrementListener;
import io.lenra.app.request.AppRequest;
import io.lenra.app.request.ListenerRequest;
import io.lenra.app.view.CounterView;
import jakarta.inject.Named;

@Named
@RestController
@SpringBootApplication
public class MyApp extends LenraApplication {
    @Override
    Manifest manifest() {
        Manifest manifest = new Manifest();

        // ComponentsView counterSchema = new ComponentsView();
        // ComponentsViewDefinitionsFind counterFind = new
        // ComponentsViewDefinitionsFind();
        // counterFind.setColl("counter");
        // DataQuery counterQuery = new DataQuery();
        // counterQuery.setAdditionalProperty("user", "global");
        // counterFind.setQuery(counterQuery);
        // counterSchema.setName("counter");
        // counterSchema.setFind(counterFind);

        // var view = new View("counter");
        // TODO: set the find

        Route globalRoute = new Route("/counter/global", new View() {
            {
                setName("counter");
                setFind(new Find() {
                    {
                        setColl("counter");
                        setQuery(new Query() {
                            {
                                put("user", "global");
                            }
                        });
                    }
                });
            }
        });
        globalRoute.setRoles(List.of("guest", "user"));

        // ComponentsView counterMeSchema = new ComponentsView();
        // ComponentsViewDefinitionsFind counterMeFind = new
        // ComponentsViewDefinitionsFind();
        // counterMeFind.setColl("counter");
        // DataQuery counterMeQuery = new DataQuery();
        // counterMeQuery.setAdditionalProperty("user", "@me");
        // counterMeFind.setQuery(counterMeQuery);
        // counterMeSchema.setName("counter");
        // counterMeSchema.setFind(counterMeFind);

        // view = new View("counter");
        // TODO: set the find

        Route meRoute = new Route("/counter/global", new View() {
            {
                setName("counter");
                setFind(new Find() {
                    {
                        setColl("counter");
                        setQuery(new Query() {
                            {
                                put("user", "@me");
                            }
                        });
                    }
                });
            }
        });

        manifest.setJson(new Exposer(List.of(globalRoute, meRoute)));

        // manifest.setL enra(new Manifest.Exposer(List.of(new Manifest.Route("/", new
        // View("lenra.main")))));

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
        List<Map<String, Object>> counters = counterColl.find(Map.of("user", user), Map.of());

        if (counters.size() == 0) {
            counterColl.createDoc(new io.lenra.app.data.Counter(user, 0));
        }
    }

    ///////////// Spring Boot app

    @PostMapping(value = "/**", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object index(@RequestBody AppRequest<?> request) {
        System.err.println("Request: " + request);
        try {
            return request.handle(this);
        } catch (NullPointerException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, e.getMessage(), e);

        }
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
