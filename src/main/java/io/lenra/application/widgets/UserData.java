package io.lenra.application.widgets;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.lenra.template.object.Widget;
import io.lenra.template.object.components.*;

public class UserData implements Widget {

    public Object render(JsonArray data, JsonObject props,
            JsonObject context) {
        return new TextSchema().withValue(data.get(0).getAsString());
    }
}