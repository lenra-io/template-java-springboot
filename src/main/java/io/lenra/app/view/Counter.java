package io.lenra.app.view;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.lenra.api.components.Listener;
import io.lenra.app.annotation.View;

import lombok.Data;
import lombok.AllArgsConstructor;

public class Counter {
    @View
    public static CounterView counter(List<io.lenra.app.data.Counter> counters) {
        var counter = counters.get(0);
        return new CounterView(counter.getCount(), new Listener("increment") {
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
    }

}
