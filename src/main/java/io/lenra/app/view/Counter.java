package io.lenra.app.view;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.lenra.api.components.Listener;
import io.lenra.app.handlers.ViewHandler;
import io.lenra.app.handlers.ViewHandlerNew;
import io.lenra.app.request.ViewRequest;
import io.lenra.app.view.Counter.CounterView;
import io.lenra.app.annotation.View;

import lombok.Data;
import lombok.AllArgsConstructor;

public class Counter {
    @View
    public static CounterView counter(List<io.lenra.app.data.Counter> counters) {
        io.lenra.app.data.Counter counter = counters.get(0);
        return new CounterView(counter.getCount(),
                new Listener("increment") {
                    {
                        setProps(Map.of("_id", counter.getId()));
                    }
                });
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Data
    @AllArgsConstructor
    public static class CounterView {
        private int value;
        private Listener onIncrement;

        public static CounterView handle(ViewRequest<List<Counter>, Map<String, Object>> request) {
            List<Counter> counters = request.getData();
            Counter counter = counters.get(0);
            return new CounterView(counter.getCount(), Listener.builder().name("increment")
                    .props(Map.of("_id", counter.getId())).build());
        }

        public static final ViewHandlerNew<List<Counter>, Map<String, Object>, CounterView> handleNew =
                (data, props) -> {
                    Counter counter = data.get(0);
                    return new CounterView(counter.getCount(), Listener.builder().name("increment")
                            .props(Map.of("_id", counter.getId())).build());
                };
    }

}
