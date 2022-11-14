package lenra.template.object;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public interface Widget {
    public Object render(JsonArray data, JsonObject props,
            JsonObject context);
}
