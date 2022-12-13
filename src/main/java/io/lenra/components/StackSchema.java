
package io.lenra.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Stack
 * <p>
 * Element of type Stack
 * 
 */
public class StackSchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private StackSchema.Type type;
    /**
     * The children of the Stack.
     * (Required)
     * 
     */
    @SerializedName("children")
    @Expose
    private List<Object> children = new ArrayList<Object>();
    /**
     * Alignment
     * <p>
     * The alignment to use.
     * 
     */
    @SerializedName("alignment")
    @Expose
    private io.lenra.components.ImageSchema.AlignmentSchema alignment = io.lenra.components.ImageSchema.AlignmentSchema
            .fromValue("center");
    /**
     * StackFit
     * <p>
     * The StackFit enum.
     * 
     */
    @SerializedName("fit")
    @Expose
    private StackSchema.StackFitSchema fit = StackSchema.StackFitSchema.fromValue("passthrough");

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public StackSchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(StackSchema.Type type) {
        this.type = type;
    }

    public StackSchema withType(StackSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The children of the Stack.
     * (Required)
     * 
     */
    public List<Object> getChildren() {
        return children;
    }

    /**
     * The children of the Stack.
     * (Required)
     * 
     */
    public void setChildren(List<Object> children) {
        this.children = children;
    }

    public StackSchema withChildren(List<Object> children) {
        this.children = children;
        return this;
    }

    /**
     * Alignment
     * <p>
     * The alignment to use.
     * 
     */
    public io.lenra.components.ImageSchema.AlignmentSchema getAlignment() {
        return alignment;
    }

    /**
     * Alignment
     * <p>
     * The alignment to use.
     * 
     */
    public void setAlignment(io.lenra.components.ImageSchema.AlignmentSchema alignment) {
        this.alignment = alignment;
    }

    public StackSchema withAlignment(io.lenra.components.ImageSchema.AlignmentSchema alignment) {
        this.alignment = alignment;
        return this;
    }

    /**
     * StackFit
     * <p>
     * The StackFit enum.
     * 
     */
    public StackSchema.StackFitSchema getFit() {
        return fit;
    }

    /**
     * StackFit
     * <p>
     * The StackFit enum.
     * 
     */
    public void setFit(StackSchema.StackFitSchema fit) {
        this.fit = fit;
    }

    public StackSchema withFit(StackSchema.StackFitSchema fit) {
        this.fit = fit;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StackSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null) ? "<null>" : this.children));
        sb.append(',');
        sb.append("alignment");
        sb.append('=');
        sb.append(((this.alignment == null) ? "<null>" : this.alignment));
        sb.append(',');
        sb.append("fit");
        sb.append('=');
        sb.append(((this.fit == null) ? "<null>" : this.fit));
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
        result = ((result * 31) + ((this.alignment == null) ? 0 : this.alignment.hashCode()));
        result = ((result * 31) + ((this.children == null) ? 0 : this.children.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StackSchema) == false) {
            return false;
        }
        StackSchema rhs = ((StackSchema) other);
        return (((((this.fit == rhs.fit) || ((this.fit != null) && this.fit.equals(rhs.fit)))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.alignment == rhs.alignment)
                        || ((this.alignment != null) && this.alignment.equals(rhs.alignment))))
                && ((this.children == rhs.children)
                        || ((this.children != null) && this.children.equals(rhs.children))));
    }

    /**
     * StackFit
     * <p>
     * The StackFit enum.
     * 
     */
    public enum StackFitSchema {

        @SerializedName("expand")
        EXPAND("expand"),
        @SerializedName("loose")
        LOOSE("loose"),
        @SerializedName("passthrough")
        PASSTHROUGH("passthrough");

        private final String value;
        private final static Map<String, StackSchema.StackFitSchema> CONSTANTS = new HashMap<String, StackSchema.StackFitSchema>();

        static {
            for (StackSchema.StackFitSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        StackFitSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static StackSchema.StackFitSchema fromValue(String value) {
            StackSchema.StackFitSchema constant = CONSTANTS.get(value);
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

        @SerializedName("stack")
        STACK("stack");

        private final String value;
        private final static Map<String, StackSchema.Type> CONSTANTS = new HashMap<String, StackSchema.Type>();

        static {
            for (StackSchema.Type c : values()) {
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

        public static StackSchema.Type fromValue(String value) {
            StackSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
