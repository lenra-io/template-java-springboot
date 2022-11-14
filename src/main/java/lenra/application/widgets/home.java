package lenra.application.widgets;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import lenra.template.object.Widget;
import lenra.template.object.View;
import lenra.template.object.components.*;
import lenra.template.object.components.FlexSchema.CrossAxisAlignment;
import lenra.template.object.components.FlexSchema.MainAxisAlignment;

public class home implements Widget {

    public home() {
    }

    public Object render(JsonArray data, JsonObject props,
            JsonObject context) {
        List<Object> child_list = new LinkedList<Object>();
        child_list.add(new WidgetSchema().withName("counter").withColl("counter").withQuery(new QuerySchema().with$find());
        return new FlexSchema().withDirection(DirectionSchema.VERTICAL).withSpacing(4.0)
                .withMainAxisAlignment(MainAxisAlignment.SPACE_EVENLY).withCrossAxisAlignment(CrossAxisAlignment.CENTER)
                .withChildren(child_list);
    }

}
