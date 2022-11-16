package io.lenra.application.listeners;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.lenra.application.Resources.Counter;
import io.lenra.application.services.CounterApi;
import io.lenra.template.object.Listener;

public class OnEnvStart implements Listener {
    private CounterApi counterApi = new CounterApi();

    public void run(JsonObject props, JsonObject event, JsonObject api) {
        JsonObject query = new JsonObject();
        query.addProperty("user", "global");
        JsonArray counters = counterApi.executeQuery(api, "counter", query);

        if (counters.size() == 0) {
            Counter newCounter = new Counter(0, "global");
            counterApi.createCounter(api, newCounter);
        }
    }

}
