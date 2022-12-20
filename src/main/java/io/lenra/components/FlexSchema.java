
package io.lenra.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Flex
 * <p>
 * Element of type Flex
 * 
 */
public class FlexSchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private FlexSchema.Type type;
    /**
     * The children
     * (Required)
     * 
     */
    @SerializedName("children")
    @Expose
    private List<Object> children = new ArrayList<Object>();
    /**
     * Direction
     * <p>
     * The direction of the component (horizontal/vertical)
     * 
     */
    @SerializedName("direction")
    @Expose
    private FlexSchema.DirectionSchema direction = FlexSchema.DirectionSchema.fromValue("horizontal");
    /**
     * The alignment along the main axis
     * 
     */
    @SerializedName("mainAxisAlignment")
    @Expose
    private FlexSchema.MainAxisAlignment mainAxisAlignment = FlexSchema.MainAxisAlignment.fromValue("start");
    /**
     * The alignment along the cross axis
     * 
     */
    @SerializedName("crossAxisAlignment")
    @Expose
    private FlexSchema.CrossAxisAlignment crossAxisAlignment = FlexSchema.CrossAxisAlignment.fromValue("start");
    /**
     * The multiplier of the base size for the minimal spacing
     * 
     */
    @SerializedName("spacing")
    @Expose
    private Double spacing = 0.0D;
    /**
     * if true the flex will fill the main axis. Otherwise it will take the children
     * size.
     * 
     */
    @SerializedName("fillParent")
    @Expose
    private Boolean fillParent = false;
    /**
     * If true the flex will scroll if there is too many item in the Main Axis.
     * 
     */
    @SerializedName("scroll")
    @Expose
    private Boolean scroll = false;
    /**
     * Padding
     * <p>
     * Element of type Padding
     * 
     */
    @SerializedName("padding")
    @Expose
    private PaddingSchema padding;
    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    @SerializedName("horizontalDirection")
    @Expose
    private FlexSchema.TextDirectionSchema horizontalDirection = FlexSchema.TextDirectionSchema.fromValue("ltr");
    /**
     * Vertical Direction
     * <p>
     * How the objects should be aligned following the vertical axis.
     * 
     */
    @SerializedName("verticalDirection")
    @Expose
    private FlexSchema.VerticalDirectionSchema verticalDirection = FlexSchema.VerticalDirectionSchema.fromValue("down");
    /**
     * textBaseline
     * <p>
     * A horizontal line used for aligning text.
     * 
     */
    @SerializedName("textBaseline")
    @Expose
    private FlexSchema.TextBaselineSchema textBaseline = FlexSchema.TextBaselineSchema.fromValue("alphabetic");

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public FlexSchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(FlexSchema.Type type) {
        this.type = type;
    }

    public FlexSchema withType(FlexSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The children
     * (Required)
     * 
     */
    public List<Object> getChildren() {
        return children;
    }

    /**
     * The children
     * (Required)
     * 
     */
    public void setChildren(List<Object> children) {
        this.children = children;
    }

    public FlexSchema withChildren(List<Object> children) {
        this.children = children;
        return this;
    }

    /**
     * Direction
     * <p>
     * The direction of the component (horizontal/vertical)
     * 
     */
    public FlexSchema.DirectionSchema getDirection() {
        return direction;
    }

    /**
     * Direction
     * <p>
     * The direction of the component (horizontal/vertical)
     * 
     */
    public void setDirection(FlexSchema.DirectionSchema direction) {
        this.direction = direction;
    }

    public FlexSchema withDirection(FlexSchema.DirectionSchema direction) {
        this.direction = direction;
        return this;
    }

    /**
     * The alignment along the main axis
     * 
     */
    public FlexSchema.MainAxisAlignment getMainAxisAlignment() {
        return mainAxisAlignment;
    }

    /**
     * The alignment along the main axis
     * 
     */
    public void setMainAxisAlignment(FlexSchema.MainAxisAlignment mainAxisAlignment) {
        this.mainAxisAlignment = mainAxisAlignment;
    }

    public FlexSchema withMainAxisAlignment(FlexSchema.MainAxisAlignment mainAxisAlignment) {
        this.mainAxisAlignment = mainAxisAlignment;
        return this;
    }

    /**
     * The alignment along the cross axis
     * 
     */
    public FlexSchema.CrossAxisAlignment getCrossAxisAlignment() {
        return crossAxisAlignment;
    }

    /**
     * The alignment along the cross axis
     * 
     */
    public void setCrossAxisAlignment(FlexSchema.CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public FlexSchema withCrossAxisAlignment(FlexSchema.CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
        return this;
    }

    /**
     * The multiplier of the base size for the minimal spacing
     * 
     */
    public Double getSpacing() {
        return spacing;
    }

    /**
     * The multiplier of the base size for the minimal spacing
     * 
     */
    public void setSpacing(Double spacing) {
        this.spacing = spacing;
    }

    public FlexSchema withSpacing(Double spacing) {
        this.spacing = spacing;
        return this;
    }

    /**
     * if true the flex will fill the main axis. Otherwise it will take the children
     * size.
     * 
     */
    public Boolean getFillParent() {
        return fillParent;
    }

    /**
     * if true the flex will fill the main axis. Otherwise it will take the children
     * size.
     * 
     */
    public void setFillParent(Boolean fillParent) {
        this.fillParent = fillParent;
    }

    public FlexSchema withFillParent(Boolean fillParent) {
        this.fillParent = fillParent;
        return this;
    }

    /**
     * If true the flex will scroll if there is too many item in the Main Axis.
     * 
     */
    public Boolean getScroll() {
        return scroll;
    }

    /**
     * If true the flex will scroll if there is too many item in the Main Axis.
     * 
     */
    public void setScroll(Boolean scroll) {
        this.scroll = scroll;
    }

    public FlexSchema withScroll(Boolean scroll) {
        this.scroll = scroll;
        return this;
    }

    /**
     * Padding
     * <p>
     * Element of type Padding
     * 
     */
    public PaddingSchema getPadding() {
        return padding;
    }

    /**
     * Padding
     * <p>
     * Element of type Padding
     * 
     */
    public void setPadding(PaddingSchema padding) {
        this.padding = padding;
    }

    public FlexSchema withPadding(PaddingSchema padding) {
        this.padding = padding;
        return this;
    }

    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    public FlexSchema.TextDirectionSchema getHorizontalDirection() {
        return horizontalDirection;
    }

    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    public void setHorizontalDirection(FlexSchema.TextDirectionSchema horizontalDirection) {
        this.horizontalDirection = horizontalDirection;
    }

    public FlexSchema withHorizontalDirection(FlexSchema.TextDirectionSchema horizontalDirection) {
        this.horizontalDirection = horizontalDirection;
        return this;
    }

    /**
     * Vertical Direction
     * <p>
     * How the objects should be aligned following the vertical axis.
     * 
     */
    public FlexSchema.VerticalDirectionSchema getVerticalDirection() {
        return verticalDirection;
    }

    /**
     * Vertical Direction
     * <p>
     * How the objects should be aligned following the vertical axis.
     * 
     */
    public void setVerticalDirection(FlexSchema.VerticalDirectionSchema verticalDirection) {
        this.verticalDirection = verticalDirection;
    }

    public FlexSchema withVerticalDirection(FlexSchema.VerticalDirectionSchema verticalDirection) {
        this.verticalDirection = verticalDirection;
        return this;
    }

    /**
     * textBaseline
     * <p>
     * A horizontal line used for aligning text.
     * 
     */
    public FlexSchema.TextBaselineSchema getTextBaseline() {
        return textBaseline;
    }

    /**
     * textBaseline
     * <p>
     * A horizontal line used for aligning text.
     * 
     */
    public void setTextBaseline(FlexSchema.TextBaselineSchema textBaseline) {
        this.textBaseline = textBaseline;
    }

    public FlexSchema withTextBaseline(FlexSchema.TextBaselineSchema textBaseline) {
        this.textBaseline = textBaseline;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FlexSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null) ? "<null>" : this.children));
        sb.append(',');
        sb.append("direction");
        sb.append('=');
        sb.append(((this.direction == null) ? "<null>" : this.direction));
        sb.append(',');
        sb.append("mainAxisAlignment");
        sb.append('=');
        sb.append(((this.mainAxisAlignment == null) ? "<null>" : this.mainAxisAlignment));
        sb.append(',');
        sb.append("crossAxisAlignment");
        sb.append('=');
        sb.append(((this.crossAxisAlignment == null) ? "<null>" : this.crossAxisAlignment));
        sb.append(',');
        sb.append("spacing");
        sb.append('=');
        sb.append(((this.spacing == null) ? "<null>" : this.spacing));
        sb.append(',');
        sb.append("fillParent");
        sb.append('=');
        sb.append(((this.fillParent == null) ? "<null>" : this.fillParent));
        sb.append(',');
        sb.append("scroll");
        sb.append('=');
        sb.append(((this.scroll == null) ? "<null>" : this.scroll));
        sb.append(',');
        sb.append("padding");
        sb.append('=');
        sb.append(((this.padding == null) ? "<null>" : this.padding));
        sb.append(',');
        sb.append("horizontalDirection");
        sb.append('=');
        sb.append(((this.horizontalDirection == null) ? "<null>" : this.horizontalDirection));
        sb.append(',');
        sb.append("verticalDirection");
        sb.append('=');
        sb.append(((this.verticalDirection == null) ? "<null>" : this.verticalDirection));
        sb.append(',');
        sb.append("textBaseline");
        sb.append('=');
        sb.append(((this.textBaseline == null) ? "<null>" : this.textBaseline));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.textBaseline == null) ? 0 : this.textBaseline.hashCode()));
        result = ((result * 31) + ((this.padding == null) ? 0 : this.padding.hashCode()));
        result = ((result * 31) + ((this.mainAxisAlignment == null) ? 0 : this.mainAxisAlignment.hashCode()));
        result = ((result * 31) + ((this.crossAxisAlignment == null) ? 0 : this.crossAxisAlignment.hashCode()));
        result = ((result * 31) + ((this.scroll == null) ? 0 : this.scroll.hashCode()));
        result = ((result * 31) + ((this.fillParent == null) ? 0 : this.fillParent.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.spacing == null) ? 0 : this.spacing.hashCode()));
        result = ((result * 31) + ((this.children == null) ? 0 : this.children.hashCode()));
        result = ((result * 31) + ((this.horizontalDirection == null) ? 0 : this.horizontalDirection.hashCode()));
        result = ((result * 31) + ((this.verticalDirection == null) ? 0 : this.verticalDirection.hashCode()));
        result = ((result * 31) + ((this.direction == null) ? 0 : this.direction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlexSchema) == false) {
            return false;
        }
        FlexSchema rhs = ((FlexSchema) other);
        return (((((((((((((this.textBaseline == rhs.textBaseline)
                || ((this.textBaseline != null) && this.textBaseline.equals(rhs.textBaseline)))
                && ((this.padding == rhs.padding) || ((this.padding != null) && this.padding.equals(rhs.padding))))
                && ((this.mainAxisAlignment == rhs.mainAxisAlignment)
                        || ((this.mainAxisAlignment != null) && this.mainAxisAlignment.equals(rhs.mainAxisAlignment))))
                && ((this.crossAxisAlignment == rhs.crossAxisAlignment) || ((this.crossAxisAlignment != null)
                        && this.crossAxisAlignment.equals(rhs.crossAxisAlignment))))
                && ((this.scroll == rhs.scroll) || ((this.scroll != null) && this.scroll.equals(rhs.scroll))))
                && ((this.fillParent == rhs.fillParent)
                        || ((this.fillParent != null) && this.fillParent.equals(rhs.fillParent))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.spacing == rhs.spacing) || ((this.spacing != null) && this.spacing.equals(rhs.spacing))))
                && ((this.children == rhs.children) || ((this.children != null) && this.children.equals(rhs.children))))
                && ((this.horizontalDirection == rhs.horizontalDirection) || ((this.horizontalDirection != null)
                        && this.horizontalDirection.equals(rhs.horizontalDirection))))
                && ((this.verticalDirection == rhs.verticalDirection)
                        || ((this.verticalDirection != null) && this.verticalDirection.equals(rhs.verticalDirection))))
                && ((this.direction == rhs.direction)
                        || ((this.direction != null) && this.direction.equals(rhs.direction))));
    }

    /**
     * The alignment along the cross axis
     * 
     */
    public enum CrossAxisAlignment {

        @SerializedName("start")
        START("start"),
        @SerializedName("end")
        END("end"),
        @SerializedName("center")
        CENTER("center"),
        @SerializedName("stretch")
        STRETCH("stretch"),
        @SerializedName("baseline")
        BASELINE("baseline");

        private final String value;
        private final static Map<String, FlexSchema.CrossAxisAlignment> CONSTANTS = new HashMap<String, FlexSchema.CrossAxisAlignment>();

        static {
            for (FlexSchema.CrossAxisAlignment c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CrossAxisAlignment(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static FlexSchema.CrossAxisAlignment fromValue(String value) {
            FlexSchema.CrossAxisAlignment constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * Direction
     * <p>
     * The direction of the component (horizontal/vertical)
     * 
     */
    public enum DirectionSchema {

        @SerializedName("horizontal")
        HORIZONTAL("horizontal"),
        @SerializedName("vertical")
        VERTICAL("vertical");

        private final String value;
        private final static Map<String, FlexSchema.DirectionSchema> CONSTANTS = new HashMap<String, FlexSchema.DirectionSchema>();

        static {
            for (FlexSchema.DirectionSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DirectionSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static FlexSchema.DirectionSchema fromValue(String value) {
            FlexSchema.DirectionSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * The alignment along the main axis
     * 
     */
    public enum MainAxisAlignment {

        @SerializedName("start")
        START("start"),
        @SerializedName("end")
        END("end"),
        @SerializedName("center")
        CENTER("center"),
        @SerializedName("spaceBetween")
        SPACE_BETWEEN("spaceBetween"),
        @SerializedName("spaceAround")
        SPACE_AROUND("spaceAround"),
        @SerializedName("spaceEvenly")
        SPACE_EVENLY("spaceEvenly");

        private final String value;
        private final static Map<String, FlexSchema.MainAxisAlignment> CONSTANTS = new HashMap<String, FlexSchema.MainAxisAlignment>();

        static {
            for (FlexSchema.MainAxisAlignment c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MainAxisAlignment(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static FlexSchema.MainAxisAlignment fromValue(String value) {
            FlexSchema.MainAxisAlignment constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * textBaseline
     * <p>
     * A horizontal line used for aligning text.
     * 
     */
    public enum TextBaselineSchema {

        @SerializedName("alphabetic")
        ALPHABETIC("alphabetic"),
        @SerializedName("ideographic")
        IDEOGRAPHIC("ideographic");

        private final String value;
        private final static Map<String, FlexSchema.TextBaselineSchema> CONSTANTS = new HashMap<String, FlexSchema.TextBaselineSchema>();

        static {
            for (FlexSchema.TextBaselineSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TextBaselineSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static FlexSchema.TextBaselineSchema fromValue(String value) {
            FlexSchema.TextBaselineSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    public enum TextDirectionSchema {

        @SerializedName("ltr")
        LTR("ltr"),
        @SerializedName("rtl")
        RTL("rtl");

        private final String value;
        private final static Map<String, FlexSchema.TextDirectionSchema> CONSTANTS = new HashMap<String, FlexSchema.TextDirectionSchema>();

        static {
            for (FlexSchema.TextDirectionSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TextDirectionSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static FlexSchema.TextDirectionSchema fromValue(String value) {
            FlexSchema.TextDirectionSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * The identifier of the component
     * 
     */
    public enum Type {

        @SerializedName("flex")
        FLEX("flex");

        private final String value;
        private final static Map<String, FlexSchema.Type> CONSTANTS = new HashMap<String, FlexSchema.Type>();

        static {
            for (FlexSchema.Type c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static FlexSchema.Type fromValue(String value) {
            FlexSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * Vertical Direction
     * <p>
     * How the objects should be aligned following the vertical axis.
     * 
     */
    public enum VerticalDirectionSchema {

        @SerializedName("down")
        DOWN("down"),
        @SerializedName("up")
        UP("up");

        private final String value;
        private final static Map<String, FlexSchema.VerticalDirectionSchema> CONSTANTS = new HashMap<String, FlexSchema.VerticalDirectionSchema>();

        static {
            for (FlexSchema.VerticalDirectionSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        VerticalDirectionSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static FlexSchema.VerticalDirectionSchema fromValue(String value) {
            FlexSchema.VerticalDirectionSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
