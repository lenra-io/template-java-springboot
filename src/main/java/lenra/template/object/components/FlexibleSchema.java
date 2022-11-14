
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Flexible
 * <p>
 * Element of type Flexible
 * 
 */
public class FlexibleSchema {

    /**
     * The type of the element
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private FlexibleSchema.Type type;
    /**
     * How a flexible child is inscribed into the available space.
     * 
     */
    @SerializedName("flex")
    @Expose
    private Integer flex = 1;
    /**
     * flexFit
     * <p>
     * How a flexible child is inscribed into the available space.
     * 
     */
    @SerializedName("fit")
    @Expose
    private FlexFitSchema fit = FlexFitSchema.fromValue("loose");
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("child")
    @Expose
    private Object child;

    /**
     * The type of the element
     * (Required)
     * 
     */
    public FlexibleSchema.Type getType() {
        return type;
    }

    /**
     * The type of the element
     * (Required)
     * 
     */
    public void setType(FlexibleSchema.Type type) {
        this.type = type;
    }

    public FlexibleSchema withType(FlexibleSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * How a flexible child is inscribed into the available space.
     * 
     */
    public Integer getFlex() {
        return flex;
    }

    /**
     * How a flexible child is inscribed into the available space.
     * 
     */
    public void setFlex(Integer flex) {
        this.flex = flex;
    }

    public FlexibleSchema withFlex(Integer flex) {
        this.flex = flex;
        return this;
    }

    /**
     * flexFit
     * <p>
     * How a flexible child is inscribed into the available space.
     * 
     */
    public FlexFitSchema getFit() {
        return fit;
    }

    /**
     * flexFit
     * <p>
     * How a flexible child is inscribed into the available space.
     * 
     */
    public void setFit(FlexFitSchema fit) {
        this.fit = fit;
    }

    public FlexibleSchema withFit(FlexFitSchema fit) {
        this.fit = fit;
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

    public FlexibleSchema withChild(Object child) {
        this.child = child;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FlexibleSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("flex");
        sb.append('=');
        sb.append(((this.flex == null) ? "<null>" : this.flex));
        sb.append(',');
        sb.append("fit");
        sb.append('=');
        sb.append(((this.fit == null) ? "<null>" : this.fit));
        sb.append(',');
        sb.append("child");
        sb.append('=');
        sb.append(((this.child == null) ? "<null>" : this.child));
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
        result = ((result * 31) + ((this.fit == null) ? 0 : this.fit.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.flex == null) ? 0 : this.flex.hashCode()));
        result = ((result * 31) + ((this.child == null) ? 0 : this.child.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlexibleSchema) == false) {
            return false;
        }
        FlexibleSchema rhs = ((FlexibleSchema) other);
        return (((((this.fit == rhs.fit) || ((this.fit != null) && this.fit.equals(rhs.fit)))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.flex == rhs.flex) || ((this.flex != null) && this.flex.equals(rhs.flex))))
                && ((this.child == rhs.child) || ((this.child != null) && this.child.equals(rhs.child))));
    }

    /**
     * The type of the element
     * 
     */
    public enum Type {

        @SerializedName("flexible")
        FLEXIBLE("flexible");

        private final String value;
        private final static Map<String, FlexibleSchema.Type> CONSTANTS = new HashMap<String, FlexibleSchema.Type>();

        static {
            for (FlexibleSchema.Type c : values()) {
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

        public static FlexibleSchema.Type fromValue(String value) {
            FlexibleSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
