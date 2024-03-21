package io.lenra.app.listener;

import java.util.Map;
import io.lenra.api.internal.ApiException;
import io.lenra.app.annotation.AppListener;
import io.lenra.app.api.Api;
import io.lenra.app.data.Counter;

public class Increment {
    @AppListener
    public static void increment(Map<String, Object> props, Api api) {
        try {
            var coll = api.data().coll(Counter.class);
            var counters = coll.find(props, Map.of());
            var counter = counters.get(0);
            counter.setCount(counter.getCount() + 1);
            coll.updateDoc(counter);
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }
}
