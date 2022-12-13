
package lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Toggle
 * <p>
 * Element of type Toggle
 * 
 */
public class ToggleSchema {

    /**
     * The type of the element.
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private ToggleSchema.Type type;
    /**
     * The value of the element.
     * (Required)
     * 
     */
    @SerializedName("value")
    @Expose
    private Boolean value;
    /**
     * The splash radius when you click on the toggle.
     * 
     */
    @SerializedName("splashRadius")
    @Expose
    private Double splashRadius;
    /**
     * The default focus in boolean.
     * 
     */
    @SerializedName("autofocus")
    @Expose
    private Boolean autofocus;
    /**
     * Determines the way that drag start behavior is handled.
     * 
     */
    @SerializedName("dragStartBehavior")
    @Expose
    private ToggleSchema.DragStartBehavior dragStartBehavior;
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
     * ToggleStyle
     * <p>
     * Element of type ToggleStyle
     * 
     */
    @SerializedName("style")
    @Expose
    private ToggleStyleSchema style;
    /**
     * The name that will be used in the form.
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * The toggle is disabled if true
     * 
     */
    @SerializedName("disabled")
    @Expose
    private Boolean disabled = false;

    /**
     * The type of the element.
     * (Required)
     * 
     */
    public ToggleSchema.Type getType() {
        return type;
    }

    /**
     * The type of the element.
     * (Required)
     * 
     */
    public void setType(ToggleSchema.Type type) {
        this.type = type;
    }

    public ToggleSchema withType(ToggleSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The value of the element.
     * (Required)
     * 
     */
    public Boolean getValue() {
        return value;
    }

    /**
     * The value of the element.
     * (Required)
     * 
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

    public ToggleSchema withValue(Boolean value) {
        this.value = value;
        return this;
    }

    /**
     * The splash radius when you click on the toggle.
     * 
     */
    public Double getSplashRadius() {
        return splashRadius;
    }

    /**
     * The splash radius when you click on the toggle.
     * 
     */
    public void setSplashRadius(Double splashRadius) {
        this.splashRadius = splashRadius;
    }

    public ToggleSchema withSplashRadius(Double splashRadius) {
        this.splashRadius = splashRadius;
        return this;
    }

    /**
     * The default focus in boolean.
     * 
     */
    public Boolean getAutofocus() {
        return autofocus;
    }

    /**
     * The default focus in boolean.
     * 
     */
    public void setAutofocus(Boolean autofocus) {
        this.autofocus = autofocus;
    }

    public ToggleSchema withAutofocus(Boolean autofocus) {
        this.autofocus = autofocus;
        return this;
    }

    /**
     * Determines the way that drag start behavior is handled.
     * 
     */
    public ToggleSchema.DragStartBehavior getDragStartBehavior() {
        return dragStartBehavior;
    }

    /**
     * Determines the way that drag start behavior is handled.
     * 
     */
    public void setDragStartBehavior(ToggleSchema.DragStartBehavior dragStartBehavior) {
        this.dragStartBehavior = dragStartBehavior;
    }

    public ToggleSchema withDragStartBehavior(ToggleSchema.DragStartBehavior dragStartBehavior) {
        this.dragStartBehavior = dragStartBehavior;
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

    public ToggleSchema withOnPressed(ListenerSchema onPressed) {
        this.onPressed = onPressed;
        return this;
    }

    /**
     * ToggleStyle
     * <p>
     * Element of type ToggleStyle
     * 
     */
    public ToggleStyleSchema getStyle() {
        return style;
    }

    /**
     * ToggleStyle
     * <p>
     * Element of type ToggleStyle
     * 
     */
    public void setStyle(ToggleStyleSchema style) {
        this.style = style;
    }

    public ToggleSchema withStyle(ToggleStyleSchema style) {
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

    public ToggleSchema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The toggle is disabled if true
     * 
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * The toggle is disabled if true
     * 
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public ToggleSchema withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ToggleSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("splashRadius");
        sb.append('=');
        sb.append(((this.splashRadius == null)?"<null>":this.splashRadius));
        sb.append(',');
        sb.append("autofocus");
        sb.append('=');
        sb.append(((this.autofocus == null)?"<null>":this.autofocus));
        sb.append(',');
        sb.append("dragStartBehavior");
        sb.append('=');
        sb.append(((this.dragStartBehavior == null)?"<null>":this.dragStartBehavior));
        sb.append(',');
        sb.append("onPressed");
        sb.append('=');
        sb.append(((this.onPressed == null)?"<null>":this.onPressed));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("disabled");
        sb.append('=');
        sb.append(((this.disabled == null)?"<null>":this.disabled));
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
        result = ((result* 31)+((this.dragStartBehavior == null)? 0 :this.dragStartBehavior.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.disabled == null)? 0 :this.disabled.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.autofocus == null)? 0 :this.autofocus.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.splashRadius == null)? 0 :this.splashRadius.hashCode()));
        result = ((result* 31)+((this.onPressed == null)? 0 :this.onPressed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ToggleSchema) == false) {
            return false;
        }
        ToggleSchema rhs = ((ToggleSchema) other);
        return ((((((((((this.dragStartBehavior == rhs.dragStartBehavior)||((this.dragStartBehavior!= null)&&this.dragStartBehavior.equals(rhs.dragStartBehavior)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.disabled == rhs.disabled)||((this.disabled!= null)&&this.disabled.equals(rhs.disabled))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.autofocus == rhs.autofocus)||((this.autofocus!= null)&&this.autofocus.equals(rhs.autofocus))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.splashRadius == rhs.splashRadius)||((this.splashRadius!= null)&&this.splashRadius.equals(rhs.splashRadius))))&&((this.onPressed == rhs.onPressed)||((this.onPressed!= null)&&this.onPressed.equals(rhs.onPressed))));
    }


    /**
     * Determines the way that drag start behavior is handled.
     * 
     */
    public enum DragStartBehavior {

        @SerializedName("start")
        START("start"),
        @SerializedName("down")
        DOWN("down");
        private final String value;
        private final static Map<String, ToggleSchema.DragStartBehavior> CONSTANTS = new HashMap<String, ToggleSchema.DragStartBehavior>();

        static {
            for (ToggleSchema.DragStartBehavior c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DragStartBehavior(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ToggleSchema.DragStartBehavior fromValue(String value) {
            ToggleSchema.DragStartBehavior constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The type of the element.
     * 
     */
    public enum Type {

        @SerializedName("toggle")
        TOGGLE("toggle");
        private final String value;
        private final static Map<String, ToggleSchema.Type> CONSTANTS = new HashMap<String, ToggleSchema.Type>();

        static {
            for (ToggleSchema.Type c: values()) {
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

        public static ToggleSchema.Type fromValue(String value) {
            ToggleSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
