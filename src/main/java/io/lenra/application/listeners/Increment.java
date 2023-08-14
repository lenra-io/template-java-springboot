package io.lenra.application.listeners;

import com.google.gson.JsonObject;

import io.lenra.application.services.CounterApi;
import io.lenra.template.object.Listener;
import io.lenra.application.utils.Counter;

public class Increment implements Listener {
    private CounterApi counterApi = new CounterApi();

    public void run(JsonObject props, JsonObject event, JsonObject api) {
        Counter counter = counterApi.getCounter(api, props.get("id").getAsString());
        counter.setCount(counter.getCount() + 1);
        counterApi.updateCounter(api, counter);
    }
}
