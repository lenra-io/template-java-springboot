
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Dropdown Button
 * <p>
 * Element of type Dropdown Button
 * 
 */
public class DropdownButtonSchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private DropdownButtonSchema.Type type;
    /**
     * The text of the dropdown button
     * (Required)
     * 
     */
    @SerializedName("text")
    @Expose
    private String text;
    /**
     * If true, the dropdown button is disabled
     * 
     */
    @SerializedName("disabled")
    @Expose
    private Boolean disabled = false;
    /**
     * Size
     * <p>
     * The size to use, the component will be sized according to the value.
     * 
     */
    @SerializedName("size")
    @Expose
    private io.lenra.template.object.components.ButtonSchema.SizeSchema size = io.lenra.template.object.components.ButtonSchema.SizeSchema
            .fromValue("medium");
    /**
     * Style
     * <p>
     * The style to use, the component will be changed according to the theme.
     * 
     */
    @SerializedName("mainStyle")
    @Expose
    private io.lenra.template.object.components.ButtonSchema.StyleSchema mainStyle = io.lenra.template.object.components.ButtonSchema.StyleSchema
            .fromValue("primary");
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("child")
    @Expose
    private Object child;
    @SerializedName("icon")
    @Expose
    private Icon icon;

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public DropdownButtonSchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(DropdownButtonSchema.Type type) {
        this.type = type;
    }

    public DropdownButtonSchema withType(DropdownButtonSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The text of the dropdown button
     * (Required)
     * 
     */
    public String getText() {
        return text;
    }

    /**
     * The text of the dropdown button
     * (Required)
     * 
     */
    public void setText(String text) {
        this.text = text;
    }

    public DropdownButtonSchema withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * If true, the dropdown button is disabled
     * 
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * If true, the dropdown button is disabled
     * 
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public DropdownButtonSchema withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Size
     * <p>
     * The size to use, the component will be sized according to the value.
     * 
     */
    public io.lenra.template.object.components.ButtonSchema.SizeSchema getSize() {
        return size;
    }

    /**
     * Size
     * <p>
     * The size to use, the component will be sized according to the value.
     * 
     */
    public void setSize(io.lenra.template.object.components.ButtonSchema.SizeSchema size) {
        this.size = size;
    }

    public DropdownButtonSchema withSize(io.lenra.template.object.components.ButtonSchema.SizeSchema size) {
        this.size = size;
        return this;
    }

    /**
     * Style
     * <p>
     * The style to use, the component will be changed according to the theme.
     * 
     */
    public io.lenra.template.object.components.ButtonSchema.StyleSchema getMainStyle() {
        return mainStyle;
    }

    /**
     * Style
     * <p>
     * The style to use, the component will be changed according to the theme.
     * 
     */
    public void setMainStyle(io.lenra.template.object.components.ButtonSchema.StyleSchema mainStyle) {
        this.mainStyle = mainStyle;
    }

    public DropdownButtonSchema withMainStyle(
            io.lenra.template.object.components.ButtonSchema.StyleSchema mainStyle) {
        this.mainStyle = mainStyle;
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

    public DropdownButtonSchema withChild(Object child) {
        this.child = child;
        return this;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public DropdownButtonSchema withIcon(Icon icon) {
        this.icon = icon;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DropdownButtonSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null) ? "<null>" : this.text));
        sb.append(',');
        sb.append("disabled");
        sb.append('=');
        sb.append(((this.disabled == null) ? "<null>" : this.disabled));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null) ? "<null>" : this.size));
        sb.append(',');
        sb.append("mainStyle");
        sb.append('=');
        sb.append(((this.mainStyle == null) ? "<null>" : this.mainStyle));
        sb.append(',');
        sb.append("child");
        sb.append('=');
        sb.append(((this.child == null) ? "<null>" : this.child));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null) ? "<null>" : this.icon));
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
        result = ((result * 31) + ((this.size == null) ? 0 : this.size.hashCode()));
        result = ((result * 31) + ((this.mainStyle == null) ? 0 : this.mainStyle.hashCode()));
        result = ((result * 31) + ((this.icon == null) ? 0 : this.icon.hashCode()));
        result = ((result * 31) + ((this.disabled == null) ? 0 : this.disabled.hashCode()));
        result = ((result * 31) + ((this.text == null) ? 0 : this.text.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.child == null) ? 0 : this.child.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DropdownButtonSchema) == false) {
            return false;
        }
        DropdownButtonSchema rhs = ((DropdownButtonSchema) other);
        return ((((((((this.size == rhs.size) || ((this.size != null) && this.size.equals(rhs.size)))
                && ((this.mainStyle == rhs.mainStyle)
                        || ((this.mainStyle != null) && this.mainStyle.equals(rhs.mainStyle))))
                && ((this.icon == rhs.icon) || ((this.icon != null) && this.icon.equals(rhs.icon))))
                && ((this.disabled == rhs.disabled) || ((this.disabled != null) && this.disabled.equals(rhs.disabled))))
                && ((this.text == rhs.text) || ((this.text != null) && this.text.equals(rhs.text))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.child == rhs.child) || ((this.child != null) && this.child.equals(rhs.child))));
    }

    /**
     * The identifier of the component
     * 
     */
    public enum Type {

        @SerializedName("dropdownButton")
        DROPDOWN_BUTTON("dropdownButton");

        private final String value;
        private final static Map<String, DropdownButtonSchema.Type> CONSTANTS = new HashMap<String, DropdownButtonSchema.Type>();

        static {
            for (DropdownButtonSchema.Type c : values()) {
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

        public static DropdownButtonSchema.Type fromValue(String value) {
            DropdownButtonSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
