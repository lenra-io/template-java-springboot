package io.lenra.app.view;

import java.util.List;

import io.lenra.app.ViewHandler.ViewReq;
import io.lenra.app.component.Listener;
import io.lenra.app.data.Counter;
import io.lenra.app.request.ViewRequest;

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

    public static CounterView handle(ViewReq<List<Counter>, Object> request) {
        var counters = request.data;
        var counter = counters.get(0);
        return new CounterView(counter.getCount(), new Listener("onIncrement"));
    }
}
