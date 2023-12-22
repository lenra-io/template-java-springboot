package io.lenra.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.lenra.app.ViewHandler.JavaTypeDataMapper;
import io.lenra.app.ViewHandler.TypeReferenceDataMapper;
import io.lenra.app.component.View;
import io.lenra.app.data.Counter;
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
    Map<String, ViewHandler> views() {
        ObjectMapper mapper = new ObjectMapper();
        var counterList = mapper.getTypeFactory().constructArrayType(Counter.class);
        var defaultRef = new TypeReference<Object>() {};
        var handler = new ViewHandler<Counter[], Object>(CounterView::handle, new JavaTypeDataMapper<Counter[]>(counterList), new TypeReferenceDataMapper<Object>(defaultRef));
        return new HashMap<String, ViewHandler>() {{
            put("counter", handler);
        }};
    }

    @Override
    Map<String, Function<ListenerRequest, Object>> listeners() {
        return Map.of("increment", IncrementListener::handle);
    }

}
