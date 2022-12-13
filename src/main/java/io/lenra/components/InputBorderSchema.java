
package lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * InputBorder
 * <p>
 * Element of type InputBorder
 * 
 */
public class InputBorderSchema {

    @SerializedName("type")
    @Expose
    private InputBorderSchema.Type type = InputBorderSchema.Type.fromValue("underline");
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
     * BorderSide
     * <p>
     * Element of type BorderSide
     * (Required)
     * 
     */
    @SerializedName("borderSide")
    @Expose
    private BorderSideSchema borderSide;

    public InputBorderSchema.Type getType() {
        return type;
    }

    public void setType(InputBorderSchema.Type type) {
        this.type = type;
    }

    public InputBorderSchema withType(InputBorderSchema.Type type) {
        this.type = type;
        return this;
    }

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

    public InputBorderSchema withBorderRadius(BorderRadiusSchema borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * (Required)
     * 
     */
    public BorderSideSchema getBorderSide() {
        return borderSide;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * (Required)
     * 
     */
    public void setBorderSide(BorderSideSchema borderSide) {
        this.borderSide = borderSide;
    }

    public InputBorderSchema withBorderSide(BorderSideSchema borderSide) {
        this.borderSide = borderSide;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InputBorderSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("borderRadius");
        sb.append('=');
        sb.append(((this.borderRadius == null)?"<null>":this.borderRadius));
        sb.append(',');
        sb.append("borderSide");
        sb.append('=');
        sb.append(((this.borderSide == null)?"<null>":this.borderSide));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.borderRadius == null)? 0 :this.borderRadius.hashCode()));
        result = ((result* 31)+((this.borderSide == null)? 0 :this.borderSide.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputBorderSchema) == false) {
            return false;
        }
        InputBorderSchema rhs = ((InputBorderSchema) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.borderRadius == rhs.borderRadius)||((this.borderRadius!= null)&&this.borderRadius.equals(rhs.borderRadius))))&&((this.borderSide == rhs.borderSide)||((this.borderSide!= null)&&this.borderSide.equals(rhs.borderSide))));
    }

    public enum Type {

        @SerializedName("underline")
        UNDERLINE("underline"),
        @SerializedName("outline")
        OUTLINE("outline");
        private final String value;
        private final static Map<String, InputBorderSchema.Type> CONSTANTS = new HashMap<String, InputBorderSchema.Type>();

        static {
            for (InputBorderSchema.Type c: values()) {
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

        public static InputBorderSchema.Type fromValue(String value) {
            InputBorderSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
