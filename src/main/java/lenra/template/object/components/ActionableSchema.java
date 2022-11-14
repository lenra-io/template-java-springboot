
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Actionable
 * <p>
 * Element of type Actionable
 * 
 */
public class ActionableSchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private ActionableSchema.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("child")
    @Expose
    private Object child;
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
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onDoublePressed")
    @Expose
    private ListenerSchema onDoublePressed;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onLongPressed")
    @Expose
    private ListenerSchema onLongPressed;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onPressedCancel")
    @Expose
    private ListenerSchema onPressedCancel;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onHovered")
    @Expose
    private ListenerSchema onHovered;

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public ActionableSchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(ActionableSchema.Type type) {
        this.type = type;
    }

    public ActionableSchema withType(ActionableSchema.Type type) {
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

    public ActionableSchema withChild(Object child) {
        this.child = child;
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

    public ActionableSchema withOnPressed(ListenerSchema onPressed) {
        this.onPressed = onPressed;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnDoublePressed() {
        return onDoublePressed;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnDoublePressed(ListenerSchema onDoublePressed) {
        this.onDoublePressed = onDoublePressed;
    }

    public ActionableSchema withOnDoublePressed(ListenerSchema onDoublePressed) {
        this.onDoublePressed = onDoublePressed;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnLongPressed() {
        return onLongPressed;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnLongPressed(ListenerSchema onLongPressed) {
        this.onLongPressed = onLongPressed;
    }

    public ActionableSchema withOnLongPressed(ListenerSchema onLongPressed) {
        this.onLongPressed = onLongPressed;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnPressedCancel() {
        return onPressedCancel;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnPressedCancel(ListenerSchema onPressedCancel) {
        this.onPressedCancel = onPressedCancel;
    }

    public ActionableSchema withOnPressedCancel(ListenerSchema onPressedCancel) {
        this.onPressedCancel = onPressedCancel;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnHovered() {
        return onHovered;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnHovered(ListenerSchema onHovered) {
        this.onHovered = onHovered;
    }

    public ActionableSchema withOnHovered(ListenerSchema onHovered) {
        this.onHovered = onHovered;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ActionableSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("child");
        sb.append('=');
        sb.append(((this.child == null) ? "<null>" : this.child));
        sb.append(',');
        sb.append("onPressed");
        sb.append('=');
        sb.append(((this.onPressed == null) ? "<null>" : this.onPressed));
        sb.append(',');
        sb.append("onDoublePressed");
        sb.append('=');
        sb.append(((this.onDoublePressed == null) ? "<null>" : this.onDoublePressed));
        sb.append(',');
        sb.append("onLongPressed");
        sb.append('=');
        sb.append(((this.onLongPressed == null) ? "<null>" : this.onLongPressed));
        sb.append(',');
        sb.append("onPressedCancel");
        sb.append('=');
        sb.append(((this.onPressedCancel == null) ? "<null>" : this.onPressedCancel));
        sb.append(',');
        sb.append("onHovered");
        sb.append('=');
        sb.append(((this.onHovered == null) ? "<null>" : this.onHovered));
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
        result = ((result * 31) + ((this.onLongPressed == null) ? 0 : this.onLongPressed.hashCode()));
        result = ((result * 31) + ((this.onPressedCancel == null) ? 0 : this.onPressedCancel.hashCode()));
        result = ((result * 31) + ((this.onHovered == null) ? 0 : this.onHovered.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.onPressed == null) ? 0 : this.onPressed.hashCode()));
        result = ((result * 31) + ((this.onDoublePressed == null) ? 0 : this.onDoublePressed.hashCode()));
        result = ((result * 31) + ((this.child == null) ? 0 : this.child.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActionableSchema) == false) {
            return false;
        }
        ActionableSchema rhs = ((ActionableSchema) other);
        return ((((((((this.onLongPressed == rhs.onLongPressed)
                || ((this.onLongPressed != null) && this.onLongPressed.equals(rhs.onLongPressed)))
                && ((this.onPressedCancel == rhs.onPressedCancel)
                        || ((this.onPressedCancel != null) && this.onPressedCancel.equals(rhs.onPressedCancel))))
                && ((this.onHovered == rhs.onHovered)
                        || ((this.onHovered != null) && this.onHovered.equals(rhs.onHovered))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.onPressed == rhs.onPressed)
                        || ((this.onPressed != null) && this.onPressed.equals(rhs.onPressed))))
                && ((this.onDoublePressed == rhs.onDoublePressed)
                        || ((this.onDoublePressed != null) && this.onDoublePressed.equals(rhs.onDoublePressed))))
                && ((this.child == rhs.child) || ((this.child != null) && this.child.equals(rhs.child))));
    }

    /**
     * The identifier of the component
     * 
     */
    public enum Type {

        @SerializedName("actionable")
        ACTIONABLE("actionable");

        private final String value;
        private final static Map<String, ActionableSchema.Type> CONSTANTS = new HashMap<String, ActionableSchema.Type>();

        static {
            for (ActionableSchema.Type c : values()) {
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

        public static ActionableSchema.Type fromValue(String value) {
            ActionableSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
