package io.lenra.app.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.lenra.app.component.Listener;
import io.lenra.app.data.Counter;
import io.lenra.app.request.ViewRequest;

// TODO: define it glabally: https://www.baeldung.com/jackson-ignore-null-fields#globally
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CounterView {
    private int count;
    private Listener onIncrement;

    public CounterView() {
    }

    public CounterView(int count, Listener onIncrement) {
        this.count = count;
        this.onIncrement = onIncrement;
    }

    public int getCount() {
        return count;
    }

    public Listener getOnIncrement() {
        return onIncrement;
    }

    public static CounterView handle(ViewRequest<List<Counter>, Map<String, Object>> request) {
        List<Counter> counters = request.getData();
        Counter counter = counters.get(0);
        System.out.println("props: " + request.getProps());
        return new CounterView(counter.getCount(), new Listener("increment", Map.of("_id", counter.getId())));
    }
}
