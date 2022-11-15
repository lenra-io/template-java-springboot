
package io.lenra.template.object.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Menu
 * <p>
 * Element of type Menu
 * 
 */
public class MenuSchema {

    /**
     * The type of the element
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private MenuSchema.Type type;
    /**
     * The menu items
     * (Required)
     * 
     */
    @SerializedName("children")
    @Expose
    private List<Object> children = new ArrayList<Object>();

    /**
     * The type of the element
     * (Required)
     * 
     */
    public MenuSchema.Type getType() {
        return type;
    }

    /**
     * The type of the element
     * (Required)
     * 
     */
    public void setType(MenuSchema.Type type) {
        this.type = type;
    }

    public MenuSchema withType(MenuSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The menu items
     * (Required)
     * 
     */
    public List<Object> getChildren() {
        return children;
    }

    /**
     * The menu items
     * (Required)
     * 
     */
    public void setChildren(List<Object> children) {
        this.children = children;
    }

    public MenuSchema withChildren(List<Object> children) {
        this.children = children;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MenuSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null) ? "<null>" : this.children));
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
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.children == null) ? 0 : this.children.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MenuSchema) == false) {
            return false;
        }
        MenuSchema rhs = ((MenuSchema) other);
        return (((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))
                && ((this.children == rhs.children)
                        || ((this.children != null) && this.children.equals(rhs.children))));
    }

    /**
     * The type of the element
     * 
     */
    public enum Type {

        @SerializedName("menu")
        MENU("menu");

        private final String value;
        private final static Map<String, MenuSchema.Type> CONSTANTS = new HashMap<String, MenuSchema.Type>();

        static {
            for (MenuSchema.Type c : values()) {
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

        public static MenuSchema.Type fromValue(String value) {
            MenuSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
