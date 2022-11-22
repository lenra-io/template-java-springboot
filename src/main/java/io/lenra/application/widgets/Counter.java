package io.lenra.application.widgets;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.lenra.template.object.Widget;
import lenra.components.ButtonSchema;
import lenra.components.FlexSchema;
import lenra.components.ListenerSchema;
import lenra.components.TextSchema;
import lenra.components.FlexSchema.CrossAxisAlignment;
import lenra.components.FlexSchema.MainAxisAlignment;

public class Counter implements Widget {

        public Object render(JsonArray data, JsonObject props,
                        JsonObject context) {
                System.out.println(data);
                List<Object> child_list = new LinkedList<Object>();

                String counterText = props.get("text").getAsString()
                                + ": " +
                                data.get(0).getAsJsonObject().get("count").getAsString();

                child_list.add(new TextSchema()
                                .withType(TextSchema.Type.TEXT)
                                .withValue(counterText));

                JsonObject Props = new JsonObject();
                Props.addProperty("id", data.get(0).getAsJsonObject().get("_id").getAsString());

                child_list.add(new ButtonSchema()
                                .withType(ButtonSchema.Type.BUTTON)
                                .withText("+")
                                .withOnPressed(new ListenerSchema()
                                                .withAction("increment")
                                                .withProps(Props)));

                return new FlexSchema()
                                .withType(FlexSchema.Type.FLEX)
                                .withSpacing(2.0)
                                .withMainAxisAlignment(MainAxisAlignment.SPACE_EVENLY)
                                .withCrossAxisAlignment(CrossAxisAlignment.CENTER)
                                .withChildren(child_list);
        };

}
