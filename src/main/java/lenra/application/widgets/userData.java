package lenra.application.widgets;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import lenra.template.object.Widget;
import lenra.template.object.components.*;

public class userData implements Widget {

    public userData() {
    }

    public Object render(JsonArray data, JsonObject props,
            JsonObject context) {
        return new TextSchema().withValue(data.get(0).getAsString());
    }
}
