package io.lenra.application.widgets;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.lenra.template.object.Widget;
import io.lenra.template.object.components.*;
import io.lenra.template.object.components.FlexSchema.CrossAxisAlignment;

public class Main implements Widget {

    public Object render(JsonArray data, JsonObject props,
            JsonObject context) {
        List<Object> flex_child = new LinkedList<Object>();
        flex_child.add(new WidgetSchema().withName("menu"));
        flex_child.add(new WidgetSchema().withName("home"));

        return new FlexSchema().withDirection(DirectionSchema.VERTICAL).withScroll(true).withSpacing(4.0)
                .withCrossAxisAlignment(CrossAxisAlignment.CENTER).withChildren(flex_child);
    }

}
