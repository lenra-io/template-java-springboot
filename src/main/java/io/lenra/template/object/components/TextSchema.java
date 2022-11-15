
package io.lenra.template.object.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Text
 * <p>
 * Element of type Text
 * 
 */
public class TextSchema {

    /**
     * The type of the element
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private TextSchema.Type type;
    /**
     * the value displayed in the element
     * (Required)
     * 
     */
    @SerializedName("value")
    @Expose
    private String value;
    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    @SerializedName("style")
    @Expose
    private TextStyleSchema style;
    /**
     * Locale
     * <p>
     * Element of type locale
     * 
     */
    @SerializedName("locale")
    @Expose
    private LocaleSchema locale;
    /**
     * The value to explain a different semantics
     * 
     */
    @SerializedName("semanticsLabel")
    @Expose
    private String semanticsLabel;
    /**
     * Whether the assistive technologies should spell out this text character by
     * character
     * 
     */
    @SerializedName("spellOut")
    @Expose
    private Boolean spellOut;
    /**
     * The text alignment
     * 
     */
    @SerializedName("textAlign")
    @Expose
    private TextSchema.TextAlign textAlign = TextSchema.TextAlign.fromValue("left");
    /**
     * Additional texts to add after this text.
     * 
     */
    @SerializedName("children")
    @Expose
    private List<Child> children = new ArrayList<Child>();

    /**
     * The type of the element
     * (Required)
     * 
     */
    public TextSchema.Type getType() {
        return type;
    }

    /**
     * The type of the element
     * (Required)
     * 
     */
    public void setType(TextSchema.Type type) {
        this.type = type;
    }

    public TextSchema withType(TextSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * the value displayed in the element
     * (Required)
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * the value displayed in the element
     * (Required)
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    public TextSchema withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public TextStyleSchema getStyle() {
        return style;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public void setStyle(TextStyleSchema style) {
        this.style = style;
    }

    public TextSchema withStyle(TextStyleSchema style) {
        this.style = style;
        return this;
    }

    /**
     * Locale
     * <p>
     * Element of type locale
     * 
     */
    public LocaleSchema getLocale() {
        return locale;
    }

    /**
     * Locale
     * <p>
     * Element of type locale
     * 
     */
    public void setLocale(LocaleSchema locale) {
        this.locale = locale;
    }

    public TextSchema withLocale(LocaleSchema locale) {
        this.locale = locale;
        return this;
    }

    /**
     * The value to explain a different semantics
     * 
     */
    public String getSemanticsLabel() {
        return semanticsLabel;
    }

    /**
     * The value to explain a different semantics
     * 
     */
    public void setSemanticsLabel(String semanticsLabel) {
        this.semanticsLabel = semanticsLabel;
    }

    public TextSchema withSemanticsLabel(String semanticsLabel) {
        this.semanticsLabel = semanticsLabel;
        return this;
    }

    /**
     * Whether the assistive technologies should spell out this text character by
     * character
     * 
     */
    public Boolean getSpellOut() {
        return spellOut;
    }

    /**
     * Whether the assistive technologies should spell out this text character by
     * character
     * 
     */
    public void setSpellOut(Boolean spellOut) {
        this.spellOut = spellOut;
    }

    public TextSchema withSpellOut(Boolean spellOut) {
        this.spellOut = spellOut;
        return this;
    }

    /**
     * The text alignment
     * 
     */
    public TextSchema.TextAlign getTextAlign() {
        return textAlign;
    }

    /**
     * The text alignment
     * 
     */
    public void setTextAlign(TextSchema.TextAlign textAlign) {
        this.textAlign = textAlign;
    }

    public TextSchema withTextAlign(TextSchema.TextAlign textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    /**
     * Additional texts to add after this text.
     * 
     */
    public List<Child> getChildren() {
        return children;
    }

    /**
     * Additional texts to add after this text.
     * 
     */
    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public TextSchema withChildren(List<Child> children) {
        this.children = children;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null) ? "<null>" : this.value));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null) ? "<null>" : this.style));
        sb.append(',');
        sb.append("locale");
        sb.append('=');
        sb.append(((this.locale == null) ? "<null>" : this.locale));
        sb.append(',');
        sb.append("semanticsLabel");
        sb.append('=');
        sb.append(((this.semanticsLabel == null) ? "<null>" : this.semanticsLabel));
        sb.append(',');
        sb.append("spellOut");
        sb.append('=');
        sb.append(((this.spellOut == null) ? "<null>" : this.spellOut));
        sb.append(',');
        sb.append("textAlign");
        sb.append('=');
        sb.append(((this.textAlign == null) ? "<null>" : this.textAlign));
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
        result = ((result * 31) + ((this.textAlign == null) ? 0 : this.textAlign.hashCode()));
        result = ((result * 31) + ((this.children == null) ? 0 : this.children.hashCode()));
        result = ((result * 31) + ((this.spellOut == null) ? 0 : this.spellOut.hashCode()));
        result = ((result * 31) + ((this.style == null) ? 0 : this.style.hashCode()));
        result = ((result * 31) + ((this.semanticsLabel == null) ? 0 : this.semanticsLabel.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.locale == null) ? 0 : this.locale.hashCode()));
        result = ((result * 31) + ((this.value == null) ? 0 : this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TextSchema) == false) {
            return false;
        }
        TextSchema rhs = ((TextSchema) other);
        return (((((((((this.textAlign == rhs.textAlign)
                || ((this.textAlign != null) && this.textAlign.equals(rhs.textAlign)))
                && ((this.children == rhs.children) || ((this.children != null) && this.children.equals(rhs.children))))
                && ((this.spellOut == rhs.spellOut) || ((this.spellOut != null) && this.spellOut.equals(rhs.spellOut))))
                && ((this.style == rhs.style) || ((this.style != null) && this.style.equals(rhs.style))))
                && ((this.semanticsLabel == rhs.semanticsLabel)
                        || ((this.semanticsLabel != null) && this.semanticsLabel.equals(rhs.semanticsLabel))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.locale == rhs.locale) || ((this.locale != null) && this.locale.equals(rhs.locale))))
                && ((this.value == rhs.value) || ((this.value != null) && this.value.equals(rhs.value))));
    }

    /**
     * The text alignment
     * 
     */
    public enum TextAlign {

        @SerializedName("left")
        LEFT("left"),
        @SerializedName("center")
        CENTER("center"),
        @SerializedName("right")
        RIGHT("right"),
        @SerializedName("justify")
        JUSTIFY("justify"),
        @SerializedName("start")
        START("start"),
        @SerializedName("end")
        END("end");

        private final String value;
        private final static Map<String, TextSchema.TextAlign> CONSTANTS = new HashMap<String, TextSchema.TextAlign>();

        static {
            for (TextSchema.TextAlign c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TextAlign(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TextSchema.TextAlign fromValue(String value) {
            TextSchema.TextAlign constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * The type of the element
     * 
     */
    public enum Type {

        @SerializedName("text")
        TEXT("text");

        private final String value;
        private final static Map<String, TextSchema.Type> CONSTANTS = new HashMap<String, TextSchema.Type>();

        static {
            for (TextSchema.Type c : values()) {
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

        public static TextSchema.Type fromValue(String value) {
            TextSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
