
package lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Checkbox
 * <p>
 * Element of type Checkbox
 * 
 */
public class CheckboxSchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private CheckboxSchema.Type type;
    /**
     * The default state of the checkbox
     * (Required)
     * 
     */
    @SerializedName("value")
    @Expose
    private Boolean value;
    /**
     * Whether the checkbox can have 3 states.
     * 
     */
    @SerializedName("tristate")
    @Expose
    private Boolean tristate;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onPressed")
    @Expose
    private ListenerSchema onPressed;
    /**
     * CheckboxStyle
     * <p>
     * Element of type CheckboxStyle
     * 
     */
    @SerializedName("style")
    @Expose
    private CheckboxStyleSchema style;
    /**
     * Material Tap Target Size
     * <p>
     * Element of type MaterialTapTargetSize
     * 
     */
    @SerializedName("materialTapTargetSize")
    @Expose
    private CheckboxSchema.MaterialTapTargetSizeSchema materialTapTargetSize;
    /**
     * Whether the checkbox is focused initially.
     * 
     */
    @SerializedName("autofocus")
    @Expose
    private Boolean autofocus;
    /**
     * The name that will be used in the form.
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public CheckboxSchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(CheckboxSchema.Type type) {
        this.type = type;
    }

    public CheckboxSchema withType(CheckboxSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The default state of the checkbox
     * (Required)
     * 
     */
    public Boolean getValue() {
        return value;
    }

    /**
     * The default state of the checkbox
     * (Required)
     * 
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

    public CheckboxSchema withValue(Boolean value) {
        this.value = value;
        return this;
    }

    /**
     * Whether the checkbox can have 3 states.
     * 
     */
    public Boolean getTristate() {
        return tristate;
    }

    /**
     * Whether the checkbox can have 3 states.
     * 
     */
    public void setTristate(Boolean tristate) {
        this.tristate = tristate;
    }

    public CheckboxSchema withTristate(Boolean tristate) {
        this.tristate = tristate;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnPressed() {
        return onPressed;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnPressed(ListenerSchema onPressed) {
        this.onPressed = onPressed;
    }

    public CheckboxSchema withOnPressed(ListenerSchema onPressed) {
        this.onPressed = onPressed;
        return this;
    }

    /**
     * CheckboxStyle
     * <p>
     * Element of type CheckboxStyle
     * 
     */
    public CheckboxStyleSchema getStyle() {
        return style;
    }

    /**
     * CheckboxStyle
     * <p>
     * Element of type CheckboxStyle
     * 
     */
    public void setStyle(CheckboxStyleSchema style) {
        this.style = style;
    }

    public CheckboxSchema withStyle(CheckboxStyleSchema style) {
        this.style = style;
        return this;
    }

    /**
     * Material Tap Target Size
     * <p>
     * Element of type MaterialTapTargetSize
     * 
     */
    public CheckboxSchema.MaterialTapTargetSizeSchema getMaterialTapTargetSize() {
        return materialTapTargetSize;
    }

    /**
     * Material Tap Target Size
     * <p>
     * Element of type MaterialTapTargetSize
     * 
     */
    public void setMaterialTapTargetSize(CheckboxSchema.MaterialTapTargetSizeSchema materialTapTargetSize) {
        this.materialTapTargetSize = materialTapTargetSize;
    }

    public CheckboxSchema withMaterialTapTargetSize(CheckboxSchema.MaterialTapTargetSizeSchema materialTapTargetSize) {
        this.materialTapTargetSize = materialTapTargetSize;
        return this;
    }

    /**
     * Whether the checkbox is focused initially.
     * 
     */
    public Boolean getAutofocus() {
        return autofocus;
    }

    /**
     * Whether the checkbox is focused initially.
     * 
     */
    public void setAutofocus(Boolean autofocus) {
        this.autofocus = autofocus;
    }

    public CheckboxSchema withAutofocus(Boolean autofocus) {
        this.autofocus = autofocus;
        return this;
    }

    /**
     * The name that will be used in the form.
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * The name that will be used in the form.
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public CheckboxSchema withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CheckboxSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("tristate");
        sb.append('=');
        sb.append(((this.tristate == null)?"<null>":this.tristate));
        sb.append(',');
        sb.append("onPressed");
        sb.append('=');
        sb.append(((this.onPressed == null)?"<null>":this.onPressed));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("materialTapTargetSize");
        sb.append('=');
        sb.append(((this.materialTapTargetSize == null)?"<null>":this.materialTapTargetSize));
        sb.append(',');
        sb.append("autofocus");
        sb.append('=');
        sb.append(((this.autofocus == null)?"<null>":this.autofocus));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.tristate == null)? 0 :this.tristate.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.autofocus == null)? 0 :this.autofocus.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.onPressed == null)? 0 :this.onPressed.hashCode()));
        result = ((result* 31)+((this.materialTapTargetSize == null)? 0 :this.materialTapTargetSize.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckboxSchema) == false) {
            return false;
        }
        CheckboxSchema rhs = ((CheckboxSchema) other);
        return (((((((((this.tristate == rhs.tristate)||((this.tristate!= null)&&this.tristate.equals(rhs.tristate)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.autofocus == rhs.autofocus)||((this.autofocus!= null)&&this.autofocus.equals(rhs.autofocus))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.onPressed == rhs.onPressed)||((this.onPressed!= null)&&this.onPressed.equals(rhs.onPressed))))&&((this.materialTapTargetSize == rhs.materialTapTargetSize)||((this.materialTapTargetSize!= null)&&this.materialTapTargetSize.equals(rhs.materialTapTargetSize))));
    }


    /**
     * Material Tap Target Size
     * <p>
     * Element of type MaterialTapTargetSize
     * 
     */
    public enum MaterialTapTargetSizeSchema {

        @SerializedName("shrinkWrap")
        SHRINK_WRAP("shrinkWrap"),
        @SerializedName("padded")
        PADDED("padded");
        private final String value;
        private final static Map<String, CheckboxSchema.MaterialTapTargetSizeSchema> CONSTANTS = new HashMap<String, CheckboxSchema.MaterialTapTargetSizeSchema>();

        static {
            for (CheckboxSchema.MaterialTapTargetSizeSchema c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MaterialTapTargetSizeSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CheckboxSchema.MaterialTapTargetSizeSchema fromValue(String value) {
            CheckboxSchema.MaterialTapTargetSizeSchema constant = CONSTANTS.get(value);
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

        @SerializedName("checkbox")
        CHECKBOX("checkbox");
        private final String value;
        private final static Map<String, CheckboxSchema.Type> CONSTANTS = new HashMap<String, CheckboxSchema.Type>();

        static {
            for (CheckboxSchema.Type c: values()) {
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

        public static CheckboxSchema.Type fromValue(String value) {
            CheckboxSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
