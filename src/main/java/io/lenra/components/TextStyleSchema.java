
package lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * TextStyle
 * <p>
 * The style of the Text.
 * 
 */
public class TextStyleSchema {

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("color")
    @Expose
    private Integer color;
    /**
     * Text Decoration
     * <p>
     * Allows you to underline, overline or strike out the text.
     * 
     */
    @SerializedName("decoration")
    @Expose
    private TextStyleSchema.TextDecorationSchema decoration = TextStyleSchema.TextDecorationSchema.fromValue("none");
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("decorationColor")
    @Expose
    private Integer decorationColor;
    /**
     * Text Decoration Style
     * <p>
     * The style in which to draw a text decoration.
     * 
     */
    @SerializedName("decorationStyle")
    @Expose
    private TextStyleSchema.TextDecorationStyleSchema decorationStyle = TextStyleSchema.TextDecorationStyleSchema
            .fromValue("solid");
    /**
     * The thickness of the decoration.
     * 
     */
    @SerializedName("decorationThickness")
    @Expose
    private Double decorationThickness = 1.0D;
    /**
     * The font family of the text.
     * 
     */
    @SerializedName("fontFamily")
    @Expose
    private String fontFamily;
    // /**
    // * The list of font families to use if the first font family could not be
    // found.
    // *
    // */
    // @SerializedName("fontFamilyFallback")
    // @Expose
    // private List<String> fontFamilyFallback = new ArrayList<String>();
    /**
     * The size of the text.
     * 
     */
    @SerializedName("fontSize")
    @Expose
    private Double fontSize = 1.0D;
    /**
     * The style of the text.
     * 
     */
    @SerializedName("fontStyle")
    @Expose
    private TextStyleSchema.FontStyle fontStyle;
    /**
     * The weight of the text.
     * 
     */
    @SerializedName("fontWeight")
    @Expose
    private TextStyleSchema.FontWeight fontWeight;
    /**
     * The height of this text.
     * 
     */
    @SerializedName("height")
    @Expose
    private Double height = 1.0D;
    /**
     * The amount of space to add between each letter.
     * 
     */
    @SerializedName("letterSpacing")
    @Expose
    private Double letterSpacing = 1.0D;
    /**
     * How visual text overflow should be handled.
     * 
     */
    @SerializedName("overflow")
    @Expose
    private TextStyleSchema.Overflow overflow;
    /**
     * A list of Shadows that will be painted underneath the text.
     * 
     */
    // @SerializedName("shadows")
    // @Expose
    // private List<BoxShadowSchema> shadows = new ArrayList<BoxShadowSchema>();
    /**
     * textBaseline
     * <p>
     * A horizontal line used for aligning text.
     * 
     */
    @SerializedName("textBaseline")
    @Expose
    private lenra.components.FlexSchema.TextBaselineSchema textBaseline = lenra.components.FlexSchema.TextBaselineSchema
            .fromValue("alphabetic");
    /**
     * The amount of space to add at each sequence of white-space.
     * 
     */
    @SerializedName("wordSpacing")
    @Expose
    private Double wordSpacing = 1.0D;

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getColor() {
        return color;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setColor(Integer color) {
        this.color = color;
    }

    public TextStyleSchema withColor(Integer color) {
        this.color = color;
        return this;
    }

    /**
     * Text Decoration
     * <p>
     * Allows you to underline, overline or strike out the text.
     * 
     */
    public TextStyleSchema.TextDecorationSchema getDecoration() {
        return decoration;
    }

    /**
     * Text Decoration
     * <p>
     * Allows you to underline, overline or strike out the text.
     * 
     */
    public void setDecoration(TextStyleSchema.TextDecorationSchema decoration) {
        this.decoration = decoration;
    }

    public TextStyleSchema withDecoration(TextStyleSchema.TextDecorationSchema decoration) {
        this.decoration = decoration;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getDecorationColor() {
        return decorationColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setDecorationColor(Integer decorationColor) {
        this.decorationColor = decorationColor;
    }

    public TextStyleSchema withDecorationColor(Integer decorationColor) {
        this.decorationColor = decorationColor;
        return this;
    }

    /**
     * Text Decoration Style
     * <p>
     * The style in which to draw a text decoration.
     * 
     */
    public TextStyleSchema.TextDecorationStyleSchema getDecorationStyle() {
        return decorationStyle;
    }

    /**
     * Text Decoration Style
     * <p>
     * The style in which to draw a text decoration.
     * 
     */
    public void setDecorationStyle(TextStyleSchema.TextDecorationStyleSchema decorationStyle) {
        this.decorationStyle = decorationStyle;
    }

    public TextStyleSchema withDecorationStyle(TextStyleSchema.TextDecorationStyleSchema decorationStyle) {
        this.decorationStyle = decorationStyle;
        return this;
    }

    /**
     * The thickness of the decoration.
     * 
     */
    public Double getDecorationThickness() {
        return decorationThickness;
    }

    /**
     * The thickness of the decoration.
     * 
     */
    public void setDecorationThickness(Double decorationThickness) {
        this.decorationThickness = decorationThickness;
    }

    public TextStyleSchema withDecorationThickness(Double decorationThickness) {
        this.decorationThickness = decorationThickness;
        return this;
    }

    /**
     * The font family of the text.
     * 
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * The font family of the text.
     * 
     */
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public TextStyleSchema withFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    /**
     * The list of font families to use if the first font family could not be found.
     * 
     */
    // public List<String> getFontFamilyFallback() {
    // return fontFamilyFallback;
    // }

    // /**
    // * The list of font families to use if the first font family could not be
    // found.
    // *
    // */
    // public void setFontFamilyFallback(List<String> fontFamilyFallback) {
    // this.fontFamilyFallback = fontFamilyFallback;
    // }

    // public TextStyleSchema withFontFamilyFallback(List<String>
    // fontFamilyFallback) {
    // this.fontFamilyFallback = fontFamilyFallback;
    // return this;
    // }

    /**
     * The size of the text.
     * 
     */
    public Double getFontSize() {
        return fontSize;
    }

    /**
     * The size of the text.
     * 
     */
    public void setFontSize(Double fontSize) {
        this.fontSize = fontSize;
    }

    public TextStyleSchema withFontSize(Double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * The style of the text.
     * 
     */
    public TextStyleSchema.FontStyle getFontStyle() {
        return fontStyle;
    }

    /**
     * The style of the text.
     * 
     */
    public void setFontStyle(TextStyleSchema.FontStyle fontStyle) {
        this.fontStyle = fontStyle;
    }

    public TextStyleSchema withFontStyle(TextStyleSchema.FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    /**
     * The weight of the text.
     * 
     */
    public TextStyleSchema.FontWeight getFontWeight() {
        return fontWeight;
    }

    /**
     * The weight of the text.
     * 
     */
    public void setFontWeight(TextStyleSchema.FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public TextStyleSchema withFontWeight(TextStyleSchema.FontWeight fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    /**
     * The height of this text.
     * 
     */
    public Double getHeight() {
        return height;
    }

    /**
     * The height of this text.
     * 
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    public TextStyleSchema withHeight(Double height) {
        this.height = height;
        return this;
    }

    /**
     * The amount of space to add between each letter.
     * 
     */
    public Double getLetterSpacing() {
        return letterSpacing;
    }

    /**
     * The amount of space to add between each letter.
     * 
     */
    public void setLetterSpacing(Double letterSpacing) {
        this.letterSpacing = letterSpacing;
    }

    public TextStyleSchema withLetterSpacing(Double letterSpacing) {
        this.letterSpacing = letterSpacing;
        return this;
    }

    /**
     * How visual text overflow should be handled.
     * 
     */
    public TextStyleSchema.Overflow getOverflow() {
        return overflow;
    }

    /**
     * How visual text overflow should be handled.
     * 
     */
    public void setOverflow(TextStyleSchema.Overflow overflow) {
        this.overflow = overflow;
    }

    public TextStyleSchema withOverflow(TextStyleSchema.Overflow overflow) {
        this.overflow = overflow;
        return this;
    }

    /**
     * A list of Shadows that will be painted underneath the text.
     * 
     */
    // public List<BoxShadowSchema> getShadows() {
    // return shadows;
    // }

    // /**
    // * A list of Shadows that will be painted underneath the text.
    // *
    // */
    // public void setShadows(List<BoxShadowSchema> shadows) {
    // this.shadows = shadows;
    // }

    // public TextStyleSchema withShadows(List<BoxShadowSchema> shadows) {
    // this.shadows = shadows;
    // return this;
    // }

    /**
     * textBaseline
     * <p>
     * A horizontal line used for aligning text.
     * 
     */
    public lenra.components.FlexSchema.TextBaselineSchema getTextBaseline() {
        return textBaseline;
    }

    /**
     * textBaseline
     * <p>
     * A horizontal line used for aligning text.
     * 
     */
    public void setTextBaseline(lenra.components.FlexSchema.TextBaselineSchema textBaseline) {
        this.textBaseline = textBaseline;
    }

    public TextStyleSchema withTextBaseline(lenra.components.FlexSchema.TextBaselineSchema textBaseline) {
        this.textBaseline = textBaseline;
        return this;
    }

    /**
     * The amount of space to add at each sequence of white-space.
     * 
     */
    public Double getWordSpacing() {
        return wordSpacing;
    }

    /**
     * The amount of space to add at each sequence of white-space.
     * 
     */
    public void setWordSpacing(Double wordSpacing) {
        this.wordSpacing = wordSpacing;
    }

    public TextStyleSchema withWordSpacing(Double wordSpacing) {
        this.wordSpacing = wordSpacing;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextStyleSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null) ? "<null>" : this.color));
        sb.append(',');
        sb.append("decoration");
        sb.append('=');
        sb.append(((this.decoration == null) ? "<null>" : this.decoration));
        sb.append(',');
        sb.append("decorationColor");
        sb.append('=');
        sb.append(((this.decorationColor == null) ? "<null>" : this.decorationColor));
        sb.append(',');
        sb.append("decorationStyle");
        sb.append('=');
        sb.append(((this.decorationStyle == null) ? "<null>" : this.decorationStyle));
        sb.append(',');
        sb.append("decorationThickness");
        sb.append('=');
        sb.append(((this.decorationThickness == null) ? "<null>" : this.decorationThickness));
        sb.append(',');
        sb.append("fontFamily");
        sb.append('=');
        sb.append(((this.fontFamily == null) ? "<null>" : this.fontFamily));
        sb.append(',');
        sb.append("fontFamilyFallback");
        // sb.append('=');
        // sb.append(((this.fontFamilyFallback == null) ? "<null>" :
        // this.fontFamilyFallback));
        // sb.append(',');
        sb.append("fontSize");
        sb.append('=');
        sb.append(((this.fontSize == null) ? "<null>" : this.fontSize));
        sb.append(',');
        sb.append("fontStyle");
        sb.append('=');
        sb.append(((this.fontStyle == null) ? "<null>" : this.fontStyle));
        sb.append(',');
        sb.append("fontWeight");
        sb.append('=');
        sb.append(((this.fontWeight == null) ? "<null>" : this.fontWeight));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null) ? "<null>" : this.height));
        sb.append(',');
        sb.append("letterSpacing");
        sb.append('=');
        sb.append(((this.letterSpacing == null) ? "<null>" : this.letterSpacing));
        sb.append(',');
        sb.append("overflow");
        sb.append('=');
        sb.append(((this.overflow == null) ? "<null>" : this.overflow));
        sb.append(',');
        sb.append("shadows");
        // sb.append('=');
        // sb.append(((this.shadows == null) ? "<null>" : this.shadows));
        // sb.append(',');
        sb.append("textBaseline");
        sb.append('=');
        sb.append(((this.textBaseline == null) ? "<null>" : this.textBaseline));
        sb.append(',');
        sb.append("wordSpacing");
        sb.append('=');
        sb.append(((this.wordSpacing == null) ? "<null>" : this.wordSpacing));
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
        result = ((result * 31) + ((this.textBaseline == null) ? 0 : this.textBaseline.hashCode()));
        result = ((result * 31) + ((this.decorationStyle == null) ? 0 : this.decorationStyle.hashCode()));
        result = ((result * 31) + ((this.color == null) ? 0 : this.color.hashCode()));
        result = ((result * 31) + ((this.wordSpacing == null) ? 0 : this.wordSpacing.hashCode()));
        result = ((result * 31) + ((this.decorationThickness == null) ? 0 : this.decorationThickness.hashCode()));
        result = ((result * 31) + ((this.letterSpacing == null) ? 0 : this.letterSpacing.hashCode()));
        result = ((result * 31) + ((this.fontStyle == null) ? 0 : this.fontStyle.hashCode()));
        result = ((result * 31) + ((this.decorationColor == null) ? 0 : this.decorationColor.hashCode()));
        result = ((result * 31) + ((this.fontFamily == null) ? 0 : this.fontFamily.hashCode()));
        result = ((result * 31) + ((this.overflow == null) ? 0 : this.overflow.hashCode()));
        // result = ((result * 31) + ((this.shadows == null) ? 0 :
        // this.shadows.hashCode()));
        result = ((result * 31) + ((this.fontSize == null) ? 0 : this.fontSize.hashCode()));
        result = ((result * 31) + ((this.decoration == null) ? 0 : this.decoration.hashCode()));
        result = ((result * 31) + ((this.fontWeight == null) ? 0 : this.fontWeight.hashCode()));
        // result = ((result * 31) + ((this.fontFamilyFallback == null) ? 0 :
        // this.fontFamilyFallback.hashCode()));
        result = ((result * 31) + ((this.height == null) ? 0 : this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TextStyleSchema) == false) {
            return false;
        }
        TextStyleSchema rhs = ((TextStyleSchema) other);
        return (((((((((((((((((this.textBaseline == rhs.textBaseline)
                || ((this.textBaseline != null) && this.textBaseline.equals(rhs.textBaseline)))
                && ((this.decorationStyle == rhs.decorationStyle)
                        || ((this.decorationStyle != null) && this.decorationStyle.equals(rhs.decorationStyle))))
                && ((this.color == rhs.color) || ((this.color != null) && this.color.equals(rhs.color))))
                && ((this.wordSpacing == rhs.wordSpacing)
                        || ((this.wordSpacing != null) && this.wordSpacing.equals(rhs.wordSpacing))))
                && ((this.decorationThickness == rhs.decorationThickness) || ((this.decorationThickness != null)
                        && this.decorationThickness.equals(rhs.decorationThickness))))
                && ((this.letterSpacing == rhs.letterSpacing)
                        || ((this.letterSpacing != null) && this.letterSpacing.equals(rhs.letterSpacing))))
                && ((this.fontStyle == rhs.fontStyle)
                        || ((this.fontStyle != null) && this.fontStyle.equals(rhs.fontStyle))))
                && ((this.decorationColor == rhs.decorationColor)
                        || ((this.decorationColor != null) && this.decorationColor.equals(rhs.decorationColor))))
                && ((this.fontFamily == rhs.fontFamily)
                        || ((this.fontFamily != null) && this.fontFamily.equals(rhs.fontFamily))))
                && ((this.overflow == rhs.overflow) || ((this.overflow != null) && this.overflow.equals(rhs.overflow))))
        // && ((this.shadows == rhs.shadows) || ((this.shadows != null) &&
        // this.shadows.equals(rhs.shadows)))
        )
                && ((this.fontSize == rhs.fontSize) || ((this.fontSize != null) && this.fontSize.equals(rhs.fontSize))))
                && ((this.decoration == rhs.decoration)
                        || ((this.decoration != null) && this.decoration.equals(rhs.decoration))))
                && ((this.fontWeight == rhs.fontWeight)
                        || ((this.fontWeight != null) && this.fontWeight.equals(rhs.fontWeight))))
        // && ((this.fontFamilyFallback == rhs.fontFamilyFallback) ||
        // ((this.fontFamilyFallback != null)
        // && this.fontFamilyFallback.equals(rhs.fontFamilyFallback)))
        )
                && ((this.height == rhs.height) || ((this.height != null) && this.height.equals(rhs.height))));
    }

    /**
     * The style of the text.
     * 
     */
    public enum FontStyle {

        @SerializedName("italic")
        ITALIC("italic"),
        @SerializedName("normal")
        NORMAL("normal");

        private final String value;
        private final static Map<String, TextStyleSchema.FontStyle> CONSTANTS = new HashMap<String, TextStyleSchema.FontStyle>();

        static {
            for (TextStyleSchema.FontStyle c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FontStyle(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TextStyleSchema.FontStyle fromValue(String value) {
            TextStyleSchema.FontStyle constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * The weight of the text.
     * 
     */
    public enum FontWeight {

        @SerializedName("bold")
        BOLD("bold"),
        @SerializedName("normal")
        NORMAL("normal"),
        @SerializedName("w100")
        W_100("w100"),
        @SerializedName("w200")
        W_200("w200"),
        @SerializedName("w300")
        W_300("w300"),
        @SerializedName("w400")
        W_400("w400"),
        @SerializedName("w500")
        W_500("w500"),
        @SerializedName("w600")
        W_600("w600"),
        @SerializedName("w700")
        W_700("w700"),
        @SerializedName("w800")
        W_800("w800"),
        @SerializedName("w900")
        W_900("w900");

        private final String value;
        private final static Map<String, TextStyleSchema.FontWeight> CONSTANTS = new HashMap<String, TextStyleSchema.FontWeight>();

        static {
            for (TextStyleSchema.FontWeight c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FontWeight(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TextStyleSchema.FontWeight fromValue(String value) {
            TextStyleSchema.FontWeight constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * How visual text overflow should be handled.
     * 
     */
    public enum Overflow {

        @SerializedName("clip")
        CLIP("clip"),
        @SerializedName("ellipsis")
        ELLIPSIS("ellipsis"),
        @SerializedName("fade")
        FADE("fade"),
        @SerializedName("visible")
        VISIBLE("visible");

        private final String value;
        private final static Map<String, TextStyleSchema.Overflow> CONSTANTS = new HashMap<String, TextStyleSchema.Overflow>();

        static {
            for (TextStyleSchema.Overflow c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Overflow(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TextStyleSchema.Overflow fromValue(String value) {
            TextStyleSchema.Overflow constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * Text Decoration
     * <p>
     * Allows you to underline, overline or strike out the text.
     * 
     */
    public enum TextDecorationSchema {

        @SerializedName("lineThrough")
        LINE_THROUGH("lineThrough"),
        @SerializedName("overline")
        OVERLINE("overline"),
        @SerializedName("underline")
        UNDERLINE("underline"),
        @SerializedName("none")
        NONE("none");

        private final String value;
        private final static Map<String, TextStyleSchema.TextDecorationSchema> CONSTANTS = new HashMap<String, TextStyleSchema.TextDecorationSchema>();

        static {
            for (TextStyleSchema.TextDecorationSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TextDecorationSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TextStyleSchema.TextDecorationSchema fromValue(String value) {
            TextStyleSchema.TextDecorationSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * Text Decoration Style
     * <p>
     * The style in which to draw a text decoration.
     * 
     */
    public enum TextDecorationStyleSchema {

        @SerializedName("dashed")
        DASHED("dashed"),
        @SerializedName("dotted")
        DOTTED("dotted"),
        @SerializedName("double")
        DOUBLE("double"),
        @SerializedName("solid")
        SOLID("solid"),
        @SerializedName("wavy")
        WAVY("wavy");

        private final String value;
        private final static Map<String, TextStyleSchema.TextDecorationStyleSchema> CONSTANTS = new HashMap<String, TextStyleSchema.TextDecorationStyleSchema>();

        static {
            for (TextStyleSchema.TextDecorationStyleSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TextDecorationStyleSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TextStyleSchema.TextDecorationStyleSchema fromValue(String value) {
            TextStyleSchema.TextDecorationStyleSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
