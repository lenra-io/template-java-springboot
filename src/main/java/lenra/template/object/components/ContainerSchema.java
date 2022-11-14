
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Container
 * <p>
 * Element of type container
 * 
 */
public class ContainerSchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private ContainerSchema.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("child")
    @Expose
    private Object child;
    /**
     * Border
     * <p>
     * Element of type Border
     * 
     */
    @SerializedName("border")
    @Expose
    private BorderSchema border;
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
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    @SerializedName("constraints")
    @Expose
    private BoxConstraintsSchema constraints;
    /**
     * BoxDecoration
     * <p>
     * Element of type BoxDecoration
     * 
     */
    @SerializedName("decoration")
    @Expose
    private BoxDecorationSchema decoration;

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public ContainerSchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(ContainerSchema.Type type) {
        this.type = type;
    }

    public ContainerSchema withType(ContainerSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Object getChild() {
        return child;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setChild(Object child) {
        this.child = child;
    }

    public ContainerSchema withChild(Object child) {
        this.child = child;
        return this;
    }

    /**
     * Border
     * <p>
     * Element of type Border
     * 
     */
    public BorderSchema getBorder() {
        return border;
    }

    /**
     * Border
     * <p>
     * Element of type Border
     * 
     */
    public void setBorder(BorderSchema border) {
        this.border = border;
    }

    public ContainerSchema withBorder(BorderSchema border) {
        this.border = border;
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

    public ContainerSchema withPadding(PaddingSchema padding) {
        this.padding = padding;
        return this;
    }

    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    public BoxConstraintsSchema getConstraints() {
        return constraints;
    }

    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    public void setConstraints(BoxConstraintsSchema constraints) {
        this.constraints = constraints;
    }

    public ContainerSchema withConstraints(BoxConstraintsSchema constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * BoxDecoration
     * <p>
     * Element of type BoxDecoration
     * 
     */
    public BoxDecorationSchema getDecoration() {
        return decoration;
    }

    /**
     * BoxDecoration
     * <p>
     * Element of type BoxDecoration
     * 
     */
    public void setDecoration(BoxDecorationSchema decoration) {
        this.decoration = decoration;
    }

    public ContainerSchema withDecoration(BoxDecorationSchema decoration) {
        this.decoration = decoration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContainerSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("child");
        sb.append('=');
        sb.append(((this.child == null) ? "<null>" : this.child));
        sb.append(',');
        sb.append("border");
        sb.append('=');
        sb.append(((this.border == null) ? "<null>" : this.border));
        sb.append(',');
        sb.append("padding");
        sb.append('=');
        sb.append(((this.padding == null) ? "<null>" : this.padding));
        sb.append(',');
        sb.append("constraints");
        sb.append('=');
        sb.append(((this.constraints == null) ? "<null>" : this.constraints));
        sb.append(',');
        sb.append("decoration");
        sb.append('=');
        sb.append(((this.decoration == null) ? "<null>" : this.decoration));
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
        result = ((result * 31) + ((this.border == null) ? 0 : this.border.hashCode()));
        result = ((result * 31) + ((this.padding == null) ? 0 : this.padding.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.constraints == null) ? 0 : this.constraints.hashCode()));
        result = ((result * 31) + ((this.decoration == null) ? 0 : this.decoration.hashCode()));
        result = ((result * 31) + ((this.child == null) ? 0 : this.child.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerSchema) == false) {
            return false;
        }
        ContainerSchema rhs = ((ContainerSchema) other);
        return (((((((this.border == rhs.border) || ((this.border != null) && this.border.equals(rhs.border)))
                && ((this.padding == rhs.padding) || ((this.padding != null) && this.padding.equals(rhs.padding))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.constraints == rhs.constraints)
                        || ((this.constraints != null) && this.constraints.equals(rhs.constraints))))
                && ((this.decoration == rhs.decoration)
                        || ((this.decoration != null) && this.decoration.equals(rhs.decoration))))
                && ((this.child == rhs.child) || ((this.child != null) && this.child.equals(rhs.child))));
    }

    /**
     * The identifier of the component
     * 
     */
    public enum Type {

        @SerializedName("container")
        CONTAINER("container");

        private final String value;
        private final static Map<String, ContainerSchema.Type> CONSTANTS = new HashMap<String, ContainerSchema.Type>();

        static {
            for (ContainerSchema.Type c : values()) {
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

        public static ContainerSchema.Type fromValue(String value) {
            ContainerSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
