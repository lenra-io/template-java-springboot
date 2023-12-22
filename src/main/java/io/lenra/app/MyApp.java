package io.lenra.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Component;

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
            new Manifest.Route("/counter", new View("counter"))
        )));
        return manifest;
    }

    @Override
    Map<String, ViewHandler<?, ?>> views() {
        return new HashMap<String, ViewHandler<?, ?>>() {{
            put("counter", new ViewHandler<>(CounterView::handle){});
        }};
    }

    @Override
    Map<String, Function<ListenerRequest, Object>> listeners() {
        return Map.of("increment", IncrementListener::handle);
    }
}
