package io.lenra.application.widgets;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.lenra.template.object.Widget;
import io.lenra.template.object.components.*;
import io.lenra.template.object.components.FlexSchema.CrossAxisAlignment;
import io.lenra.template.object.components.FlexSchema.MainAxisAlignment;

public class Home implements Widget {

    public Object render(JsonArray data, JsonObject props,
            JsonObject context) {
        List<Object> child_list = new LinkedList<Object>();
        child_list.add(new WidgetSchema().withName("counter").withColl("counter"));
        return new FlexSchema().withDirection(DirectionSchema.VERTICAL).withSpacing(4.0)
                .withMainAxisAlignment(MainAxisAlignment.SPACE_EVENLY).withCrossAxisAlignment(CrossAxisAlignment.CENTER)
                .withChildren(child_list);
    }

}
