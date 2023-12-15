package io.lenra.app.listener;

import io.lenra.app.component.Listener;
import io.lenra.app.request.ViewRequest;

public class IncrementListener {
    private int count;
    private Listener onIncrement;

    public IncrementListener() {
    }

    public IncrementListener(int count, Listener onIncrement) {
        this.count = count;
        this.onIncrement = onIncrement;
    }

    public int getCount() {
        return count;
    }

    public Listener getOnIncrement() {
        return onIncrement;
    }

    public static IncrementListener handle(ViewRequest request) {
        return new IncrementListener(1, new Listener("onIncrement"));
    }
}
