package lenra.application.widgets;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import lenra.template.object.Widget;
import lenra.template.object.View;
import lenra.template.object.components.*;

public class counter implements Widget {

    public counter() {
    }

    public Object render(JsonArray data, JsonObject props,
            JsonObject context) {
        return new text(data.get(0).getAsString());
    };

}
