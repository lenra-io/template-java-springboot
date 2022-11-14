package lenra.application.widgets;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import lenra.template.object.Widget;
import lenra.template.object.components.*;
import lenra.template.object.components.FlexSchema.CrossAxisAlignment;
import lenra.template.object.components.FlexSchema.MainAxisAlignment;
import lenra.template.object.components.TextSchema.TextAlign;
import lenra.template.object.components.TextStyleSchema.FontWeight;

public class menu implements Widget {

    public menu() {
    }

    public Object render(JsonArray data, JsonObject props,
            JsonObject context) {
        List<Object> child_list = new LinkedList<Object>();
        child_list.add(new ContainerSchema()
                .withConstraints(
                        new BoxConstraintsSchema().withMaxHeight(32.0).withMinHeight(32.0).withMaxWidth(32.0)
                                .withMinWidth(32.0))
                .withChild(new ImageSchema().withSrc("logo.png")));

        child_list.add(new FlexibleSchema()
                .withChild(new ContainerSchema()
                        .withChild(new TextSchema().withValue("Hello World").withTextAlign(TextAlign.CENTER)
                                .withStyle(new TextStyleSchema().withFontWeight(FontWeight.BOLD).withFontSize(24.0)))));

        BoxDecorationSchema decoration = new BoxDecorationSchema().withColor(0xFFFFFFFF)
                .withBoxShadow(new BoxShadowSchema().withBlurRadius(8.0).withColor(0x1A000000)
                        .withOffset(new OffsetSchema().withDx(0.0).withDy(1.0)));

        PaddingSchema padding = new PaddingSchema().withTop(2.0).withBottom(2.0).withLeft(4.0).withRight(4.0);

        FlexSchema child = new FlexSchema().withFillParent(true).withMainAxisAlignment(MainAxisAlignment.SPACE_BETWEEN)
                .withCrossAxisAlignment(CrossAxisAlignment.CENTER).withPadding(new PaddingSchema().withRight(4.0))
                .withChildren(null);
        return new ContainerSchema().withDecoration(decoration).withPadding(padding).withChild(child);

    }

}
