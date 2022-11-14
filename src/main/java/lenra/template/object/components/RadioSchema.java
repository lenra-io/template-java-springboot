
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Radio
 * <p>
 * Element of type Radio
 * 
 */
public class RadioSchema {

    /**
     * The type of the element
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private RadioSchema.Type type;
    /**
     * Whether the radio will be selected initially.
     * 
     */
    @SerializedName("autofocus")
    @Expose
    private Boolean autofocus;
    /**
     * The value of the radio
     * (Required)
     * 
     */
    @SerializedName("value")
    @Expose
    private String value;
    /**
     * The value group of the radio
     * (Required)
     * 
     */
    @SerializedName("groupValue")
    @Expose
    private String groupValue;
    /**
     * Material Tap Target Size
     * <p>
     * Element of type MaterialTapTargetSize
     * 
     */
    @SerializedName("materialTapTargetSize")
    @Expose
    private lenra.template.object.components.CheckboxSchema.MaterialTapTargetSizeSchema materialTapTargetSize;
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
     * Whether the radio is allowed to go from checked to unchecked when clicking on
     * it.
     * 
     */
    @SerializedName("toggleable")
    @Expose
    private Boolean toggleable;
    /**
     * Radio Style
     * <p>
     * Element of type RadioStyle
     * 
     */
    @SerializedName("style")
    @Expose
    private RadioStyleSchema style;
    /**
     * The name that will be used in the form.
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * The type of the element
     * (Required)
     * 
     */
    public RadioSchema.Type getType() {
        return type;
    }

    /**
     * The type of the element
     * (Required)
     * 
     */
    public void setType(RadioSchema.Type type) {
        this.type = type;
    }

    public RadioSchema withType(RadioSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Whether the radio will be selected initially.
     * 
     */
    public Boolean getAutofocus() {
        return autofocus;
    }

    /**
     * Whether the radio will be selected initially.
     * 
     */
    public void setAutofocus(Boolean autofocus) {
        this.autofocus = autofocus;
    }

    public RadioSchema withAutofocus(Boolean autofocus) {
        this.autofocus = autofocus;
        return this;
    }

    /**
     * The value of the radio
     * (Required)
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * The value of the radio
     * (Required)
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    public RadioSchema withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value group of the radio
     * (Required)
     * 
     */
    public String getGroupValue() {
        return groupValue;
    }

    /**
     * The value group of the radio
     * (Required)
     * 
     */
    public void setGroupValue(String groupValue) {
        this.groupValue = groupValue;
    }

    public RadioSchema withGroupValue(String groupValue) {
        this.groupValue = groupValue;
        return this;
    }

    /**
     * Material Tap Target Size
     * <p>
     * Element of type MaterialTapTargetSize
     * 
     */
    public lenra.template.object.components.CheckboxSchema.MaterialTapTargetSizeSchema getMaterialTapTargetSize() {
        return materialTapTargetSize;
    }

    /**
     * Material Tap Target Size
     * <p>
     * Element of type MaterialTapTargetSize
     * 
     */
    public void setMaterialTapTargetSize(
            lenra.template.object.components.CheckboxSchema.MaterialTapTargetSizeSchema materialTapTargetSize) {
        this.materialTapTargetSize = materialTapTargetSize;
    }

    public RadioSchema withMaterialTapTargetSize(
            lenra.template.object.components.CheckboxSchema.MaterialTapTargetSizeSchema materialTapTargetSize) {
        this.materialTapTargetSize = materialTapTargetSize;
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

    public RadioSchema withOnPressed(ListenerSchema onPressed) {
        this.onPressed = onPressed;
        return this;
    }

    /**
     * Whether the radio is allowed to go from checked to unchecked when clicking on
     * it.
     * 
     */
    public Boolean getToggleable() {
        return toggleable;
    }

    /**
     * Whether the radio is allowed to go from checked to unchecked when clicking on
     * it.
     * 
     */
    public void setToggleable(Boolean toggleable) {
        this.toggleable = toggleable;
    }

    public RadioSchema withToggleable(Boolean toggleable) {
        this.toggleable = toggleable;
        return this;
    }

    /**
     * Radio Style
     * <p>
     * Element of type RadioStyle
     * 
     */
    public RadioStyleSchema getStyle() {
        return style;
    }

    /**
     * Radio Style
     * <p>
     * Element of type RadioStyle
     * 
     */
    public void setStyle(RadioStyleSchema style) {
        this.style = style;
    }

    public RadioSchema withStyle(RadioStyleSchema style) {
        this.style = style;
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

    public RadioSchema withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RadioSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("autofocus");
        sb.append('=');
        sb.append(((this.autofocus == null) ? "<null>" : this.autofocus));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null) ? "<null>" : this.value));
        sb.append(',');
        sb.append("groupValue");
        sb.append('=');
        sb.append(((this.groupValue == null) ? "<null>" : this.groupValue));
        sb.append(',');
        sb.append("materialTapTargetSize");
        sb.append('=');
        sb.append(((this.materialTapTargetSize == null) ? "<null>" : this.materialTapTargetSize));
        sb.append(',');
        sb.append("onPressed");
        sb.append('=');
        sb.append(((this.onPressed == null) ? "<null>" : this.onPressed));
        sb.append(',');
        sb.append("toggleable");
        sb.append('=');
        sb.append(((this.toggleable == null) ? "<null>" : this.toggleable));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null) ? "<null>" : this.style));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
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
        result = ((result * 31) + ((this.toggleable == null) ? 0 : this.toggleable.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.style == null) ? 0 : this.style.hashCode()));
        result = ((result * 31) + ((this.groupValue == null) ? 0 : this.groupValue.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.autofocus == null) ? 0 : this.autofocus.hashCode()));
        result = ((result * 31) + ((this.value == null) ? 0 : this.value.hashCode()));
        result = ((result * 31) + ((this.materialTapTargetSize == null) ? 0 : this.materialTapTargetSize.hashCode()));
        result = ((result * 31) + ((this.onPressed == null) ? 0 : this.onPressed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RadioSchema) == false) {
            return false;
        }
        RadioSchema rhs = ((RadioSchema) other);
        return ((((((((((this.toggleable == rhs.toggleable)
                || ((this.toggleable != null) && this.toggleable.equals(rhs.toggleable)))
                && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
                && ((this.style == rhs.style) || ((this.style != null) && this.style.equals(rhs.style))))
                && ((this.groupValue == rhs.groupValue)
                        || ((this.groupValue != null) && this.groupValue.equals(rhs.groupValue))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.autofocus == rhs.autofocus)
                        || ((this.autofocus != null) && this.autofocus.equals(rhs.autofocus))))
                && ((this.value == rhs.value) || ((this.value != null) && this.value.equals(rhs.value))))
                && ((this.materialTapTargetSize == rhs.materialTapTargetSize) || ((this.materialTapTargetSize != null)
                        && this.materialTapTargetSize.equals(rhs.materialTapTargetSize))))
                && ((this.onPressed == rhs.onPressed)
                        || ((this.onPressed != null) && this.onPressed.equals(rhs.onPressed))));
    }

    /**
     * The type of the element
     * 
     */
    public enum Type {

        @SerializedName("radio")
        RADIO("radio");

        private final String value;
        private final static Map<String, RadioSchema.Type> CONSTANTS = new HashMap<String, RadioSchema.Type>();

        static {
            for (RadioSchema.Type c : values()) {
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

        public static RadioSchema.Type fromValue(String value) {
            RadioSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
