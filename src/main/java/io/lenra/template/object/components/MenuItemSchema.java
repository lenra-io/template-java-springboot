
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * MenuItem
 * <p>
 * Element of type MenuItem
 * 
 */
public class MenuItemSchema {

    /**
     * The type of the element
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private MenuItemSchema.Type type;
    /**
     * The text of the element
     * (Required)
     * 
     */
    @SerializedName("text")
    @Expose
    private String text;
    /**
     * Whether the element is selected or not.
     * 
     */
    @SerializedName("isSelected")
    @Expose
    private Boolean isSelected = false;
    /**
     * Whether the element should be disabled or not.
     * 
     */
    @SerializedName("disabled")
    @Expose
    private Boolean disabled = false;
    @SerializedName("icon")
    @Expose
    private Icon__1 icon;
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
     * The type of the element
     * (Required)
     * 
     */
    public MenuItemSchema.Type getType() {
        return type;
    }

    /**
     * The type of the element
     * (Required)
     * 
     */
    public void setType(MenuItemSchema.Type type) {
        this.type = type;
    }

    public MenuItemSchema withType(MenuItemSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The text of the element
     * (Required)
     * 
     */
    public String getText() {
        return text;
    }

    /**
     * The text of the element
     * (Required)
     * 
     */
    public void setText(String text) {
        this.text = text;
    }

    public MenuItemSchema withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Whether the element is selected or not.
     * 
     */
    public Boolean getIsSelected() {
        return isSelected;
    }

    /**
     * Whether the element is selected or not.
     * 
     */
    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public MenuItemSchema withIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
        return this;
    }

    /**
     * Whether the element should be disabled or not.
     * 
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * Whether the element should be disabled or not.
     * 
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public MenuItemSchema withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    public Icon__1 getIcon() {
        return icon;
    }

    public void setIcon(Icon__1 icon) {
        this.icon = icon;
    }

    public MenuItemSchema withIcon(Icon__1 icon) {
        this.icon = icon;
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

    public MenuItemSchema withOnPressed(ListenerSchema onPressed) {
        this.onPressed = onPressed;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MenuItemSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null) ? "<null>" : this.text));
        sb.append(',');
        sb.append("isSelected");
        sb.append('=');
        sb.append(((this.isSelected == null) ? "<null>" : this.isSelected));
        sb.append(',');
        sb.append("disabled");
        sb.append('=');
        sb.append(((this.disabled == null) ? "<null>" : this.disabled));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null) ? "<null>" : this.icon));
        sb.append(',');
        sb.append("onPressed");
        sb.append('=');
        sb.append(((this.onPressed == null) ? "<null>" : this.onPressed));
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
        result = ((result * 31) + ((this.isSelected == null) ? 0 : this.isSelected.hashCode()));
        result = ((result * 31) + ((this.icon == null) ? 0 : this.icon.hashCode()));
        result = ((result * 31) + ((this.disabled == null) ? 0 : this.disabled.hashCode()));
        result = ((result * 31) + ((this.text == null) ? 0 : this.text.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.onPressed == null) ? 0 : this.onPressed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MenuItemSchema) == false) {
            return false;
        }
        MenuItemSchema rhs = ((MenuItemSchema) other);
        return (((((((this.isSelected == rhs.isSelected)
                || ((this.isSelected != null) && this.isSelected.equals(rhs.isSelected)))
                && ((this.icon == rhs.icon) || ((this.icon != null) && this.icon.equals(rhs.icon))))
                && ((this.disabled == rhs.disabled) || ((this.disabled != null) && this.disabled.equals(rhs.disabled))))
                && ((this.text == rhs.text) || ((this.text != null) && this.text.equals(rhs.text))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.onPressed == rhs.onPressed)
                        || ((this.onPressed != null) && this.onPressed.equals(rhs.onPressed))));
    }

    /**
     * The type of the element
     * 
     */
    public enum Type {

        @SerializedName("menuItem")
        MENU_ITEM("menuItem");

        private final String value;
        private final static Map<String, MenuItemSchema.Type> CONSTANTS = new HashMap<String, MenuItemSchema.Type>();

        static {
            for (MenuItemSchema.Type c : values()) {
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

        public static MenuItemSchema.Type fromValue(String value) {
            MenuItemSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
