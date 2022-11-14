
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * BoxDecoration
 * <p>
 * Element of type BoxDecoration
 * 
 */
public class BoxDecorationSchema {

    /**
     * BorderRadius
     * <p>
     * Element of type BorderRadius
     * 
     */
    @SerializedName("borderRadius")
    @Expose
    private BorderRadiusSchema borderRadius;
    /**
     * BoxShadow
     * <p>
     * Element of type BoxShadow
     * 
     */
    @SerializedName("boxShadow")
    @Expose
    private BoxShadowSchema boxShadow;
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("color")
    @Expose
    private Integer color;
    /**
     * BoxShape
     * <p>
     * The BoxShape enum, used to define the shape of a box.
     * 
     */
    @SerializedName("shape")
    @Expose
    private BoxDecorationSchema.BoxShapeSchema shape = BoxDecorationSchema.BoxShapeSchema.fromValue("rectangle");

    /**
     * BorderRadius
     * <p>
     * Element of type BorderRadius
     * 
     */
    public BorderRadiusSchema getBorderRadius() {
        return borderRadius;
    }

    /**
     * BorderRadius
     * <p>
     * Element of type BorderRadius
     * 
     */
    public void setBorderRadius(BorderRadiusSchema borderRadius) {
        this.borderRadius = borderRadius;
    }

    public BoxDecorationSchema withBorderRadius(BorderRadiusSchema borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    /**
     * BoxShadow
     * <p>
     * Element of type BoxShadow
     * 
     */
    public BoxShadowSchema getBoxShadow() {
        return boxShadow;
    }

    /**
     * BoxShadow
     * <p>
     * Element of type BoxShadow
     * 
     */
    public void setBoxShadow(BoxShadowSchema boxShadow) {
        this.boxShadow = boxShadow;
    }

    public BoxDecorationSchema withBoxShadow(BoxShadowSchema boxShadow) {
        this.boxShadow = boxShadow;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getColor() {
        return color;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setColor(Integer color) {
        this.color = color;
    }

    public BoxDecorationSchema withColor(Integer color) {
        this.color = color;
        return this;
    }

    /**
     * BoxShape
     * <p>
     * The BoxShape enum, used to define the shape of a box.
     * 
     */
    public BoxDecorationSchema.BoxShapeSchema getShape() {
        return shape;
    }

    /**
     * BoxShape
     * <p>
     * The BoxShape enum, used to define the shape of a box.
     * 
     */
    public void setShape(BoxDecorationSchema.BoxShapeSchema shape) {
        this.shape = shape;
    }

    public BoxDecorationSchema withShape(BoxDecorationSchema.BoxShapeSchema shape) {
        this.shape = shape;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BoxDecorationSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("borderRadius");
        sb.append('=');
        sb.append(((this.borderRadius == null) ? "<null>" : this.borderRadius));
        sb.append(',');
        sb.append("boxShadow");
        sb.append('=');
        sb.append(((this.boxShadow == null) ? "<null>" : this.boxShadow));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null) ? "<null>" : this.color));
        sb.append(',');
        sb.append("shape");
        sb.append('=');
        sb.append(((this.shape == null) ? "<null>" : this.shape));
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
        result = ((result * 31) + ((this.boxShadow == null) ? 0 : this.boxShadow.hashCode()));
        result = ((result * 31) + ((this.borderRadius == null) ? 0 : this.borderRadius.hashCode()));
        result = ((result * 31) + ((this.color == null) ? 0 : this.color.hashCode()));
        result = ((result * 31) + ((this.shape == null) ? 0 : this.shape.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BoxDecorationSchema) == false) {
            return false;
        }
        BoxDecorationSchema rhs = ((BoxDecorationSchema) other);
        return (((((this.boxShadow == rhs.boxShadow)
                || ((this.boxShadow != null) && this.boxShadow.equals(rhs.boxShadow)))
                && ((this.borderRadius == rhs.borderRadius)
                        || ((this.borderRadius != null) && this.borderRadius.equals(rhs.borderRadius))))
                && ((this.color == rhs.color) || ((this.color != null) && this.color.equals(rhs.color))))
                && ((this.shape == rhs.shape) || ((this.shape != null) && this.shape.equals(rhs.shape))));
    }

    /**
     * BoxShape
     * <p>
     * The BoxShape enum, used to define the shape of a box.
     * 
     */
    public enum BoxShapeSchema {

        @SerializedName("circle")
        CIRCLE("circle"),
        @SerializedName("rectangle")
        RECTANGLE("rectangle");

        private final String value;
        private final static Map<String, BoxDecorationSchema.BoxShapeSchema> CONSTANTS = new HashMap<String, BoxDecorationSchema.BoxShapeSchema>();

        static {
            for (BoxDecorationSchema.BoxShapeSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        BoxShapeSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static BoxDecorationSchema.BoxShapeSchema fromValue(String value) {
            BoxDecorationSchema.BoxShapeSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
