package io.lenra.template.object;

import com.google.gson.JsonObject;

public interface Listener {
    public void run(JsonObject props, JsonObject event, JsonObject api);
}
