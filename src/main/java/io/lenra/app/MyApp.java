package io.lenra.app;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.lenra.app.component.View;
import io.lenra.app.listener.IncrementListener;
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
        return Map.of(
            "counter", new ViewHandler<>(CounterView::handle){},
            "lenra.counter", new ViewHandler<>(CounterView::handle){}
        );
    }

    @Override
    Map<String, ListenerHandler<?>> listeners() {
        return Map.of("increment", new ListenerHandler<>(IncrementListener::handle){});
    }
}
