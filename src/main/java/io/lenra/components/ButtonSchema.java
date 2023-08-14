
package io.lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Button
 * <p>
 * Element of type Button
 * 
 */
public class ButtonSchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private ButtonSchema.Type type;
    /**
     * The value of the text inside the button
     * (Required)
     * 
     */
    @SerializedName("text")
    @Expose
    private String text;
    /**
     * The button is disabled if true
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
    private ButtonSchema.SizeSchema size = ButtonSchema.SizeSchema.fromValue("medium");
    /**
     * Style
     * <p>
     * The style to use, the component will be changed according to the theme.
     * 
     */
    @SerializedName("mainStyle")
    @Expose
    private ButtonSchema.StyleSchema mainStyle = ButtonSchema.StyleSchema.fromValue("primary");
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onPressed")
    @Expose
    private ListenerSchema onPressed;
    @SerializedName("leftIcon")
    @Expose
    private LeftIcon leftIcon;
    @SerializedName("rightIcon")
    @Expose
    private RightIcon rightIcon;
    /**
     * Whether the button is a submit button for a form.
     * 
     */
    @SerializedName("submit")
    @Expose
    private Boolean submit = false;

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public ButtonSchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(ButtonSchema.Type type) {
        this.type = type;
    }

    public ButtonSchema withType(ButtonSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The value of the text inside the button
     * (Required)
     * 
     */
    public String getText() {
        return text;
    }

    /**
     * The value of the text inside the button
     * (Required)
     * 
     */
    public void setText(String text) {
        this.text = text;
    }

    public ButtonSchema withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * The button is disabled if true
     * 
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * The button is disabled if true
     * 
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public ButtonSchema withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Size
     * <p>
     * The size to use, the component will be sized according to the value.
     * 
     */
    public ButtonSchema.SizeSchema getSize() {
        return size;
    }

    /**
     * Size
     * <p>
     * The size to use, the component will be sized according to the value.
     * 
     */
    public void setSize(ButtonSchema.SizeSchema size) {
        this.size = size;
    }

    public ButtonSchema withSize(ButtonSchema.SizeSchema size) {
        this.size = size;
        return this;
    }

    /**
     * Style
     * <p>
     * The style to use, the component will be changed according to the theme.
     * 
     */
    public ButtonSchema.StyleSchema getMainStyle() {
        return mainStyle;
    }

    /**
     * Style
     * <p>
     * The style to use, the component will be changed according to the theme.
     * 
     */
    public void setMainStyle(ButtonSchema.StyleSchema mainStyle) {
        this.mainStyle = mainStyle;
    }

    public ButtonSchema withMainStyle(ButtonSchema.StyleSchema mainStyle) {
        this.mainStyle = mainStyle;
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

    public ButtonSchema withOnPressed(ListenerSchema onPressed) {
        this.onPressed = onPressed;
        return this;
    }

    public LeftIcon getLeftIcon() {
        return leftIcon;
    }

    public void setLeftIcon(LeftIcon leftIcon) {
        this.leftIcon = leftIcon;
    }

    public ButtonSchema withLeftIcon(LeftIcon leftIcon) {
        this.leftIcon = leftIcon;
        return this;
    }

    public RightIcon getRightIcon() {
        return rightIcon;
    }

    public void setRightIcon(RightIcon rightIcon) {
        this.rightIcon = rightIcon;
    }

    public ButtonSchema withRightIcon(RightIcon rightIcon) {
        this.rightIcon = rightIcon;
        return this;
    }

    /**
     * Whether the button is a submit button for a form.
     * 
     */
    public Boolean getSubmit() {
        return submit;
    }

    /**
     * Whether the button is a submit button for a form.
     * 
     */
    public void setSubmit(Boolean submit) {
        this.submit = submit;
    }

    public ButtonSchema withSubmit(Boolean submit) {
        this.submit = submit;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ButtonSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
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
        sb.append("onPressed");
        sb.append('=');
        sb.append(((this.onPressed == null) ? "<null>" : this.onPressed));
        sb.append(',');
        sb.append("leftIcon");
        sb.append('=');
        sb.append(((this.leftIcon == null) ? "<null>" : this.leftIcon));
        sb.append(',');
        sb.append("rightIcon");
        sb.append('=');
        sb.append(((this.rightIcon == null) ? "<null>" : this.rightIcon));
        sb.append(',');
        sb.append("submit");
        sb.append('=');
        sb.append(((this.submit == null) ? "<null>" : this.submit));
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
        result = ((result * 31) + ((this.rightIcon == null) ? 0 : this.rightIcon.hashCode()));
        result = ((result * 31) + ((this.size == null) ? 0 : this.size.hashCode()));
        result = ((result * 31) + ((this.submit == null) ? 0 : this.submit.hashCode()));
        result = ((result * 31) + ((this.leftIcon == null) ? 0 : this.leftIcon.hashCode()));
        result = ((result * 31) + ((this.mainStyle == null) ? 0 : this.mainStyle.hashCode()));
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
        if ((other instanceof ButtonSchema) == false) {
            return false;
        }
        ButtonSchema rhs = ((ButtonSchema) other);
        return ((((((((((this.rightIcon == rhs.rightIcon)
                || ((this.rightIcon != null) && this.rightIcon.equals(rhs.rightIcon)))
                && ((this.size == rhs.size) || ((this.size != null) && this.size.equals(rhs.size))))
                && ((this.submit == rhs.submit) || ((this.submit != null) && this.submit.equals(rhs.submit))))
                && ((this.leftIcon == rhs.leftIcon) || ((this.leftIcon != null) && this.leftIcon.equals(rhs.leftIcon))))
                && ((this.mainStyle == rhs.mainStyle)
                        || ((this.mainStyle != null) && this.mainStyle.equals(rhs.mainStyle))))
                && ((this.disabled == rhs.disabled) || ((this.disabled != null) && this.disabled.equals(rhs.disabled))))
                && ((this.text == rhs.text) || ((this.text != null) && this.text.equals(rhs.text))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.onPressed == rhs.onPressed)
                        || ((this.onPressed != null) && this.onPressed.equals(rhs.onPressed))));
    }

    /**
     * Size
     * <p>
     * The size to use, the component will be sized according to the value.
     * 
     */
    public enum SizeSchema {

        @SerializedName("small")
        SMALL("small"),
        @SerializedName("medium")
        MEDIUM("medium"),
        @SerializedName("large")
        LARGE("large");

        private final String value;
        private final static Map<String, ButtonSchema.SizeSchema> CONSTANTS = new HashMap<String, ButtonSchema.SizeSchema>();

        static {
            for (ButtonSchema.SizeSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SizeSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ButtonSchema.SizeSchema fromValue(String value) {
            ButtonSchema.SizeSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * Style
     * <p>
     * The style to use, the component will be changed according to the theme.
     * 
     */
    public enum StyleSchema {

        @SerializedName("primary")
        PRIMARY("primary"),
        @SerializedName("secondary")
        SECONDARY("secondary"),
        @SerializedName("tertiary")
        TERTIARY("tertiary");

        private final String value;
        private final static Map<String, ButtonSchema.StyleSchema> CONSTANTS = new HashMap<String, ButtonSchema.StyleSchema>();

        static {
            for (ButtonSchema.StyleSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        StyleSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ButtonSchema.StyleSchema fromValue(String value) {
            ButtonSchema.StyleSchema constant = CONSTANTS.get(value);
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

        @SerializedName("button")
        BUTTON("button");

        private final String value;
        private final static Map<String, ButtonSchema.Type> CONSTANTS = new HashMap<String, ButtonSchema.Type>();

        static {
            for (ButtonSchema.Type c : values()) {
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

        public static ButtonSchema.Type fromValue(String value) {
            ButtonSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
