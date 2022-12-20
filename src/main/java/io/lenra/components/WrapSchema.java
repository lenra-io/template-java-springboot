
package io.lenra.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Wrap
 * <p>
 * Element of type Wrap
 * 
 */
public class WrapSchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private WrapSchema.Type type;
    /**
     * The children of the wrap.
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
    private io.lenra.components.FlexSchema.DirectionSchema direction = io.lenra.components.FlexSchema.DirectionSchema
            .fromValue("horizontal");
    /**
     * Wrap CrossAlignment
     * <p>
     * How the objects in the Wrap should be aligned on the CrossAxis.
     * 
     */
    @SerializedName("crossAxisAlignment")
    @Expose
    private WrapSchema.WrapCrossAlignmentSchema crossAxisAlignment = WrapSchema.WrapCrossAlignmentSchema
            .fromValue("start");
    /**
     * The spacing between each child of the wrap.
     * 
     */
    @SerializedName("spacing")
    @Expose
    private Double spacing = 0.0D;
    /**
     * The spacing between each run of the wrap.
     * 
     */
    @SerializedName("runSpacing")
    @Expose
    private Double runSpacing = 0.0D;
    /**
     * Wrap Alignment
     * <p>
     * How the objects in the Wrap should be aligned.
     * 
     */
    @SerializedName("alignment")
    @Expose
    private WrapSchema.WrapAlignmentSchema alignment = WrapSchema.WrapAlignmentSchema.fromValue("start");
    /**
     * Wrap Alignment
     * <p>
     * How the objects in the Wrap should be aligned.
     * 
     */
    @SerializedName("runAlignment")
    @Expose
    private WrapSchema.WrapAlignmentSchema runAlignment = WrapSchema.WrapAlignmentSchema.fromValue("start");
    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    @SerializedName("horizontalDirection")
    @Expose
    private io.lenra.components.FlexSchema.TextDirectionSchema horizontalDirection = io.lenra.components.FlexSchema.TextDirectionSchema
            .fromValue("ltr");
    /**
     * Vertical Direction
     * <p>
     * How the objects should be aligned following the vertical axis.
     * 
     */
    @SerializedName("verticalDirection")
    @Expose
    private io.lenra.components.FlexSchema.VerticalDirectionSchema verticalDirection = io.lenra.components.FlexSchema.VerticalDirectionSchema
            .fromValue("down");

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public WrapSchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(WrapSchema.Type type) {
        this.type = type;
    }

    public WrapSchema withType(WrapSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The children of the wrap.
     * (Required)
     * 
     */
    public List<Object> getChildren() {
        return children;
    }

    /**
     * The children of the wrap.
     * (Required)
     * 
     */
    public void setChildren(List<Object> children) {
        this.children = children;
    }

    public WrapSchema withChildren(List<Object> children) {
        this.children = children;
        return this;
    }

    /**
     * Direction
     * <p>
     * The direction of the component (horizontal/vertical)
     * 
     */
    public io.lenra.components.FlexSchema.DirectionSchema getDirection() {
        return direction;
    }

    /**
     * Direction
     * <p>
     * The direction of the component (horizontal/vertical)
     * 
     */
    public void setDirection(io.lenra.components.FlexSchema.DirectionSchema direction) {
        this.direction = direction;
    }

    public WrapSchema withDirection(io.lenra.components.FlexSchema.DirectionSchema direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Wrap CrossAlignment
     * <p>
     * How the objects in the Wrap should be aligned on the CrossAxis.
     * 
     */
    public WrapSchema.WrapCrossAlignmentSchema getCrossAxisAlignment() {
        return crossAxisAlignment;
    }

    /**
     * Wrap CrossAlignment
     * <p>
     * How the objects in the Wrap should be aligned on the CrossAxis.
     * 
     */
    public void setCrossAxisAlignment(WrapSchema.WrapCrossAlignmentSchema crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public WrapSchema withCrossAxisAlignment(WrapSchema.WrapCrossAlignmentSchema crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
        return this;
    }

    /**
     * The spacing between each child of the wrap.
     * 
     */
    public Double getSpacing() {
        return spacing;
    }

    /**
     * The spacing between each child of the wrap.
     * 
     */
    public void setSpacing(Double spacing) {
        this.spacing = spacing;
    }

    public WrapSchema withSpacing(Double spacing) {
        this.spacing = spacing;
        return this;
    }

    /**
     * The spacing between each run of the wrap.
     * 
     */
    public Double getRunSpacing() {
        return runSpacing;
    }

    /**
     * The spacing between each run of the wrap.
     * 
     */
    public void setRunSpacing(Double runSpacing) {
        this.runSpacing = runSpacing;
    }

    public WrapSchema withRunSpacing(Double runSpacing) {
        this.runSpacing = runSpacing;
        return this;
    }

    /**
     * Wrap Alignment
     * <p>
     * How the objects in the Wrap should be aligned.
     * 
     */
    public WrapSchema.WrapAlignmentSchema getAlignment() {
        return alignment;
    }

    /**
     * Wrap Alignment
     * <p>
     * How the objects in the Wrap should be aligned.
     * 
     */
    public void setAlignment(WrapSchema.WrapAlignmentSchema alignment) {
        this.alignment = alignment;
    }

    public WrapSchema withAlignment(WrapSchema.WrapAlignmentSchema alignment) {
        this.alignment = alignment;
        return this;
    }

    /**
     * Wrap Alignment
     * <p>
     * How the objects in the Wrap should be aligned.
     * 
     */
    public WrapSchema.WrapAlignmentSchema getRunAlignment() {
        return runAlignment;
    }

    /**
     * Wrap Alignment
     * <p>
     * How the objects in the Wrap should be aligned.
     * 
     */
    public void setRunAlignment(WrapSchema.WrapAlignmentSchema runAlignment) {
        this.runAlignment = runAlignment;
    }

    public WrapSchema withRunAlignment(WrapSchema.WrapAlignmentSchema runAlignment) {
        this.runAlignment = runAlignment;
        return this;
    }

    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    public io.lenra.components.FlexSchema.TextDirectionSchema getHorizontalDirection() {
        return horizontalDirection;
    }

    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    public void setHorizontalDirection(io.lenra.components.FlexSchema.TextDirectionSchema horizontalDirection) {
        this.horizontalDirection = horizontalDirection;
    }

    public WrapSchema withHorizontalDirection(io.lenra.components.FlexSchema.TextDirectionSchema horizontalDirection) {
        this.horizontalDirection = horizontalDirection;
        return this;
    }

    /**
     * Vertical Direction
     * <p>
     * How the objects should be aligned following the vertical axis.
     * 
     */
    public io.lenra.components.FlexSchema.VerticalDirectionSchema getVerticalDirection() {
        return verticalDirection;
    }

    /**
     * Vertical Direction
     * <p>
     * How the objects should be aligned following the vertical axis.
     * 
     */
    public void setVerticalDirection(io.lenra.components.FlexSchema.VerticalDirectionSchema verticalDirection) {
        this.verticalDirection = verticalDirection;
    }

    public WrapSchema withVerticalDirection(io.lenra.components.FlexSchema.VerticalDirectionSchema verticalDirection) {
        this.verticalDirection = verticalDirection;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WrapSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
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
        sb.append("crossAxisAlignment");
        sb.append('=');
        sb.append(((this.crossAxisAlignment == null) ? "<null>" : this.crossAxisAlignment));
        sb.append(',');
        sb.append("spacing");
        sb.append('=');
        sb.append(((this.spacing == null) ? "<null>" : this.spacing));
        sb.append(',');
        sb.append("runSpacing");
        sb.append('=');
        sb.append(((this.runSpacing == null) ? "<null>" : this.runSpacing));
        sb.append(',');
        sb.append("alignment");
        sb.append('=');
        sb.append(((this.alignment == null) ? "<null>" : this.alignment));
        sb.append(',');
        sb.append("runAlignment");
        sb.append('=');
        sb.append(((this.runAlignment == null) ? "<null>" : this.runAlignment));
        sb.append(',');
        sb.append("horizontalDirection");
        sb.append('=');
        sb.append(((this.horizontalDirection == null) ? "<null>" : this.horizontalDirection));
        sb.append(',');
        sb.append("verticalDirection");
        sb.append('=');
        sb.append(((this.verticalDirection == null) ? "<null>" : this.verticalDirection));
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
        result = ((result * 31) + ((this.spacing == null) ? 0 : this.spacing.hashCode()));
        result = ((result * 31) + ((this.children == null) ? 0 : this.children.hashCode()));
        result = ((result * 31) + ((this.crossAxisAlignment == null) ? 0 : this.crossAxisAlignment.hashCode()));
        result = ((result * 31) + ((this.horizontalDirection == null) ? 0 : this.horizontalDirection.hashCode()));
        result = ((result * 31) + ((this.runAlignment == null) ? 0 : this.runAlignment.hashCode()));
        result = ((result * 31) + ((this.verticalDirection == null) ? 0 : this.verticalDirection.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.alignment == null) ? 0 : this.alignment.hashCode()));
        result = ((result * 31) + ((this.runSpacing == null) ? 0 : this.runSpacing.hashCode()));
        result = ((result * 31) + ((this.direction == null) ? 0 : this.direction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WrapSchema) == false) {
            return false;
        }
        WrapSchema rhs = ((WrapSchema) other);
        return (((((((((((this.spacing == rhs.spacing) || ((this.spacing != null) && this.spacing.equals(rhs.spacing)))
                && ((this.children == rhs.children) || ((this.children != null) && this.children.equals(rhs.children))))
                && ((this.crossAxisAlignment == rhs.crossAxisAlignment) || ((this.crossAxisAlignment != null)
                        && this.crossAxisAlignment.equals(rhs.crossAxisAlignment))))
                && ((this.horizontalDirection == rhs.horizontalDirection) || ((this.horizontalDirection != null)
                        && this.horizontalDirection.equals(rhs.horizontalDirection))))
                && ((this.runAlignment == rhs.runAlignment)
                        || ((this.runAlignment != null) && this.runAlignment.equals(rhs.runAlignment))))
                && ((this.verticalDirection == rhs.verticalDirection)
                        || ((this.verticalDirection != null) && this.verticalDirection.equals(rhs.verticalDirection))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.alignment == rhs.alignment)
                        || ((this.alignment != null) && this.alignment.equals(rhs.alignment))))
                && ((this.runSpacing == rhs.runSpacing)
                        || ((this.runSpacing != null) && this.runSpacing.equals(rhs.runSpacing))))
                && ((this.direction == rhs.direction)
                        || ((this.direction != null) && this.direction.equals(rhs.direction))));
    }

    /**
     * The identifier of the component
     * 
     */
    public enum Type {

        @SerializedName("wrap")
        WRAP("wrap");

        private final String value;
        private final static Map<String, WrapSchema.Type> CONSTANTS = new HashMap<String, WrapSchema.Type>();

        static {
            for (WrapSchema.Type c : values()) {
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

        public static WrapSchema.Type fromValue(String value) {
            WrapSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * Wrap Alignment
     * <p>
     * How the objects in the Wrap should be aligned.
     * 
     */
    public enum WrapAlignmentSchema {

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
        private final static Map<String, WrapSchema.WrapAlignmentSchema> CONSTANTS = new HashMap<String, WrapSchema.WrapAlignmentSchema>();

        static {
            for (WrapSchema.WrapAlignmentSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        WrapAlignmentSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static WrapSchema.WrapAlignmentSchema fromValue(String value) {
            WrapSchema.WrapAlignmentSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * Wrap CrossAlignment
     * <p>
     * How the objects in the Wrap should be aligned on the CrossAxis.
     * 
     */
    public enum WrapCrossAlignmentSchema {

        @SerializedName("start")
        START("start"),
        @SerializedName("end")
        END("end"),
        @SerializedName("center")
        CENTER("center");

        private final String value;
        private final static Map<String, WrapSchema.WrapCrossAlignmentSchema> CONSTANTS = new HashMap<String, WrapSchema.WrapCrossAlignmentSchema>();

        static {
            for (WrapSchema.WrapCrossAlignmentSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        WrapCrossAlignmentSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static WrapSchema.WrapCrossAlignmentSchema fromValue(String value) {
            WrapSchema.WrapCrossAlignmentSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
