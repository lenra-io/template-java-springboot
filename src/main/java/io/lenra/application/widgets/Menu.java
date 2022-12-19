package io.lenra.application.widgets;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.lenra.template.object.Widget;
import io.lenra.components.*;
import io.lenra.components.FlexSchema.CrossAxisAlignment;
import io.lenra.components.FlexSchema.MainAxisAlignment;
import io.lenra.components.TextSchema.TextAlign;
import io.lenra.components.TextStyleSchema.FontWeight;

public class Menu implements Widget {

        public Object render(JsonArray data, JsonObject props,
                        JsonObject context) {
                List<Object> child_list = new LinkedList<Object>();
                child_list.add(logo());

                child_list.add(header());

                BoxDecorationSchema decoration = new BoxDecorationSchema()
                                .withColor(0xFFFFFFFFL)
                                .withBoxShadow(new BoxShadowSchema()
                                                .withBlurRadius(8.0)
                                                .withColor(0x1A000000L)
                                                .withOffset(new OffsetSchema()
                                                                .withDx(0.0)
                                                                .withDy(1.0)));

                PaddingSchema padding = new PaddingSchema().withTop(16.0).withBottom(16.0).withLeft(32.0).withRight(32.0);

                FlexSchema child = new FlexSchema()
                                .withType(FlexSchema.Type.FLEX)
                                .withFillParent(true)
                                .withMainAxisAlignment(MainAxisAlignment.SPACE_BETWEEN)
                                .withCrossAxisAlignment(CrossAxisAlignment.CENTER)
                                .withPadding(new PaddingSchema().withRight(32.0))
                                .withChildren(child_list);
                return new ContainerSchema().withType(ContainerSchema.Type.CONTAINER).withDecoration(decoration)
                                .withPadding(padding).withChild(child);

        }

        private Object logo() {
                return new ContainerSchema()
                                .withType(ContainerSchema.Type.CONTAINER)
                                .withConstraints(new BoxConstraintsSchema()
                                                .withMaxHeight(32.0)
                                                .withMinHeight(32.0)
                                                .withMaxWidth(32.0)
                                                .withMinWidth(32.0))
                                .withChild(new ImageSchema()
                                                .withType(ImageSchema.Type.IMAGE)
                                                .withSrc("logo.png"));
        }

        private Object header() {
                TextSchema text = new TextSchema()
                                .withType(TextSchema.Type.TEXT)
                                .withValue("Hello World")
                                .withTextAlign(TextAlign.CENTER)
                                .withStyle(new TextStyleSchema()
                                                .withFontWeight(FontWeight.BOLD)
                                                .withFontSize(24.0));

                return new FlexibleSchema()
                                .withType(FlexibleSchema.Type.FLEXIBLE)
                                .withChild(new ContainerSchema()
                                                .withType(ContainerSchema.Type.CONTAINER)
                                                .withChild(text));
        }
}
