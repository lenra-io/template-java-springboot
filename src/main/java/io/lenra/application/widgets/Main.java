package io.lenra.application.widgets;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.lenra.template.object.Widget;
import io.lenra.components.*;
import io.lenra.components.FlexSchema.CrossAxisAlignment;
import io.lenra.components.FlexSchema.DirectionSchema;

public class Main implements Widget {

        public Object render(JsonArray data, JsonObject props,
                        JsonObject context) {
                List<Object> flex_child = new LinkedList<Object>();
                flex_child.add(
                                new WidgetSchema().withType(WidgetSchema.Type.WIDGET).withName("menu")
                                                .withProps(null));
                flex_child.add(
                                new WidgetSchema().withType(WidgetSchema.Type.WIDGET).withName("home")
                                                .withProps(null));

                return new FlexSchema()
                                .withType(FlexSchema.Type.FLEX)
                                .withDirection(DirectionSchema.VERTICAL)
                                .withScroll(true)
                                .withSpacing(4.0)
                                .withCrossAxisAlignment(CrossAxisAlignment.CENTER)
                                .withChildren(flex_child);
        }

}
