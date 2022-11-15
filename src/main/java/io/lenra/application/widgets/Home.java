package io.lenra.application.widgets;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.lenra.template.object.Widget;
import lenra.components.*;
import lenra.components.FlexSchema.CrossAxisAlignment;
import lenra.components.FlexSchema.DirectionSchema;
import lenra.components.FlexSchema.MainAxisAlignment;

public class Home implements Widget {

    public Object render(JsonArray data, JsonObject props,
            JsonObject context) {
        List<Object> child_list = new LinkedList<Object>();
        JsonObject Query = new JsonObject();
        Query.addProperty("user", "global");

        JsonObject Props = new JsonObject();
        Props.addProperty("text", "My personnal counter");

        child_list.add(
                new WidgetSchema().withName("counter").withColl("counter").withQuery(Query)
                        .withProps(Props));

        JsonObject Query1 = new JsonObject();
        Query1.addProperty("user", "global");

        JsonObject Props1 = new JsonObject();
        Props1.addProperty("text", "The common counter");
        child_list.add(
                new WidgetSchema().withName("counter").withColl("counter").withQuery(Query1)
                        .withProps(Props1));
        return new FlexSchema().withDirection(DirectionSchema.VERTICAL).withSpacing(4.0)
                .withMainAxisAlignment(MainAxisAlignment.SPACE_EVENLY).withCrossAxisAlignment(CrossAxisAlignment.CENTER)
                .withChildren(child_list);
    }

}
