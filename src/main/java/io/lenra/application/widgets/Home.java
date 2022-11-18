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

                child_list.add(privateCounter());

                child_list.add(globalCounter());

                return new FlexSchema()
                                .withType(FlexSchema.Type.FLEX)
                                .withDirection(DirectionSchema.VERTICAL)
                                .withSpacing(4.0)
                                .withMainAxisAlignment(MainAxisAlignment.SPACE_EVENLY)
                                .withCrossAxisAlignment(CrossAxisAlignment.CENTER)
                                .withChildren(child_list);
        }

        private Object privateCounter() {
                JsonObject Query = new JsonObject();
                Query.addProperty("user", "@me");

                JsonObject Props = new JsonObject();
                Props.addProperty("text", "My personnal counter");
                return new WidgetSchema()
                                .withType(WidgetSchema.Type.WIDGET)
                                .withName("counter")
                                .withColl("counter")
                                .withQuery(Query)
                                .withProps(Props);
        }

        private Object globalCounter() {
                JsonObject Query = new JsonObject();
                Query.addProperty("user", "global");

                JsonObject Props = new JsonObject();
                Props.addProperty("text", "The common counter");

                return new WidgetSchema()
                                .withType(WidgetSchema.Type.WIDGET)
                                .withName("counter")
                                .withColl("counter").withQuery(Query)
                                .withProps(Props);
        }
}
