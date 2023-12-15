package io.lenra.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.lenra.app.component.View;
import io.lenra.app.data.Counter;
import io.lenra.app.listener.IncrementListener;
import io.lenra.app.request.ListenerRequest;
import io.lenra.app.request.ViewRequest;
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
    Map<String, Object> views() {
        ObjectMapper mapper = new ObjectMapper();
        var counterList = mapper.getTypeFactory().constructArrayType(Counter.class);
        var defaultRef = new TypeReference<Object>() {};
        var handler = new ViewHandler<List<Counter>, Object>(CounterView::handle, counterList, defaultRef);
        return new HashMap<String, Object>() {{
            put("counter", handler);
        }};
        // return Map.of("counter", new ViewHandler<List<Counter>, Object>(CounterView::handle, List<Counter>.class, Object.class));
    }

    @Override
    Map<String, Function<ListenerRequest, Object>> listeners() {
        return Map.of("increment", IncrementListener::handle);
    }

}
