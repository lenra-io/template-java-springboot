
package io.lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * TextFieldStyle
 * <p>
 * Element of type TextFieldStyle
 * 
 */
public class TextFieldStyleSchema {

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("cursorColor")
    @Expose
    private Integer cursorColor;
    /**
     * The height of the cursor.
     * 
     */
    @SerializedName("cursorHeight")
    @Expose
    private Double cursorHeight;
    /**
     * Radius
     * <p>
     * Element of type Radius
     * 
     */
    @SerializedName("cursorRadius")
    @Expose
    private RadiusSchema cursorRadius;
    /**
     * The width of the cursor.
     * 
     */
    @SerializedName("cursorWidth")
    @Expose
    private Double cursorWidth;
    /**
     * InputDecoration
     * <p>
     * Element of type InputDecoration
     * 
     */
    @SerializedName("decoration")
    @Expose
    private InputDecorationSchema decoration;
    /**
     * Brightness
     * <p>
     * Component of type Brightness.
     * 
     */
    @SerializedName("keyboardAppearance")
    @Expose
    private BrightnessSchema keyboardAppearance;
    /**
     * The character used to obscure the text.
     * 
     */
    @SerializedName("obscuringCharacter")
    @Expose
    private String obscuringCharacter;
    /**
     * Padding
     * <p>
     * Element of type Padding
     * 
     */
    @SerializedName("scrollPadding")
    @Expose
    private PaddingSchema scrollPadding;
    /**
     * BoxHeightStyle
     * <p>
     * Component of type BoxHeightStyle.
     * 
     */
    @SerializedName("selectionHeightStyle")
    @Expose
    private BoxHeightStyleSchema selectionHeightStyle;
    /**
     * BoxWidthStyle
     * <p>
     * Component of type BoxWidthStyle.
     * 
     */
    @SerializedName("selectionWidthStyle")
    @Expose
    private BoxWidthStyleSchema selectionWidthStyle;
    /**
     * StrutStyle
     * <p>
     * Defines the strut of a text line.
     * 
     */
    @SerializedName("strutStyle")
    @Expose
    private StrutStyleSchema strutStyle;
    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    @SerializedName("textStyle")
    @Expose
    private TextStyleSchema textStyle;
    /**
     * TextAlign
     * <p>
     * Component of type TextAlign.
     * 
     */
    @SerializedName("textAlign")
    @Expose
    private TextAlignSchema textAlign;
    /**
     * TextAlignVertical
     * <p>
     * Component of type TextAlignVertical.
     * 
     */
    @SerializedName("textAlignVertical")
    @Expose
    private TextAlignVerticalSchema textAlignVertical;

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getCursorColor() {
        return cursorColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setCursorColor(Integer cursorColor) {
        this.cursorColor = cursorColor;
    }

    public TextFieldStyleSchema withCursorColor(Integer cursorColor) {
        this.cursorColor = cursorColor;
        return this;
    }

    /**
     * The height of the cursor.
     * 
     */
    public Double getCursorHeight() {
        return cursorHeight;
    }

    /**
     * The height of the cursor.
     * 
     */
    public void setCursorHeight(Double cursorHeight) {
        this.cursorHeight = cursorHeight;
    }

    public TextFieldStyleSchema withCursorHeight(Double cursorHeight) {
        this.cursorHeight = cursorHeight;
        return this;
    }

    /**
     * Radius
     * <p>
     * Element of type Radius
     * 
     */
    public RadiusSchema getCursorRadius() {
        return cursorRadius;
    }

    /**
     * Radius
     * <p>
     * Element of type Radius
     * 
     */
    public void setCursorRadius(RadiusSchema cursorRadius) {
        this.cursorRadius = cursorRadius;
    }

    public TextFieldStyleSchema withCursorRadius(RadiusSchema cursorRadius) {
        this.cursorRadius = cursorRadius;
        return this;
    }

    /**
     * The width of the cursor.
     * 
     */
    public Double getCursorWidth() {
        return cursorWidth;
    }

    /**
     * The width of the cursor.
     * 
     */
    public void setCursorWidth(Double cursorWidth) {
        this.cursorWidth = cursorWidth;
    }

    public TextFieldStyleSchema withCursorWidth(Double cursorWidth) {
        this.cursorWidth = cursorWidth;
        return this;
    }

    /**
     * InputDecoration
     * <p>
     * Element of type InputDecoration
     * 
     */
    public InputDecorationSchema getDecoration() {
        return decoration;
    }

    /**
     * InputDecoration
     * <p>
     * Element of type InputDecoration
     * 
     */
    public void setDecoration(InputDecorationSchema decoration) {
        this.decoration = decoration;
    }

    public TextFieldStyleSchema withDecoration(InputDecorationSchema decoration) {
        this.decoration = decoration;
        return this;
    }

    /**
     * Brightness
     * <p>
     * Component of type Brightness.
     * 
     */
    public BrightnessSchema getKeyboardAppearance() {
        return keyboardAppearance;
    }

    /**
     * Brightness
     * <p>
     * Component of type Brightness.
     * 
     */
    public void setKeyboardAppearance(BrightnessSchema keyboardAppearance) {
        this.keyboardAppearance = keyboardAppearance;
    }

    public TextFieldStyleSchema withKeyboardAppearance(BrightnessSchema keyboardAppearance) {
        this.keyboardAppearance = keyboardAppearance;
        return this;
    }

    /**
     * The character used to obscure the text.
     * 
     */
    public String getObscuringCharacter() {
        return obscuringCharacter;
    }

    /**
     * The character used to obscure the text.
     * 
     */
    public void setObscuringCharacter(String obscuringCharacter) {
        this.obscuringCharacter = obscuringCharacter;
    }

    public TextFieldStyleSchema withObscuringCharacter(String obscuringCharacter) {
        this.obscuringCharacter = obscuringCharacter;
        return this;
    }

    /**
     * Padding
     * <p>
     * Element of type Padding
     * 
     */
    public PaddingSchema getScrollPadding() {
        return scrollPadding;
    }

    /**
     * Padding
     * <p>
     * Element of type Padding
     * 
     */
    public void setScrollPadding(PaddingSchema scrollPadding) {
        this.scrollPadding = scrollPadding;
    }

    public TextFieldStyleSchema withScrollPadding(PaddingSchema scrollPadding) {
        this.scrollPadding = scrollPadding;
        return this;
    }

    /**
     * BoxHeightStyle
     * <p>
     * Component of type BoxHeightStyle.
     * 
     */
    public BoxHeightStyleSchema getSelectionHeightStyle() {
        return selectionHeightStyle;
    }

    /**
     * BoxHeightStyle
     * <p>
     * Component of type BoxHeightStyle.
     * 
     */
    public void setSelectionHeightStyle(BoxHeightStyleSchema selectionHeightStyle) {
        this.selectionHeightStyle = selectionHeightStyle;
    }

    public TextFieldStyleSchema withSelectionHeightStyle(BoxHeightStyleSchema selectionHeightStyle) {
        this.selectionHeightStyle = selectionHeightStyle;
        return this;
    }

    /**
     * BoxWidthStyle
     * <p>
     * Component of type BoxWidthStyle.
     * 
     */
    public BoxWidthStyleSchema getSelectionWidthStyle() {
        return selectionWidthStyle;
    }

    /**
     * BoxWidthStyle
     * <p>
     * Component of type BoxWidthStyle.
     * 
     */
    public void setSelectionWidthStyle(BoxWidthStyleSchema selectionWidthStyle) {
        this.selectionWidthStyle = selectionWidthStyle;
    }

    public TextFieldStyleSchema withSelectionWidthStyle(BoxWidthStyleSchema selectionWidthStyle) {
        this.selectionWidthStyle = selectionWidthStyle;
        return this;
    }

    /**
     * StrutStyle
     * <p>
     * Defines the strut of a text line.
     * 
     */
    public StrutStyleSchema getStrutStyle() {
        return strutStyle;
    }

    /**
     * StrutStyle
     * <p>
     * Defines the strut of a text line.
     * 
     */
    public void setStrutStyle(StrutStyleSchema strutStyle) {
        this.strutStyle = strutStyle;
    }

    public TextFieldStyleSchema withStrutStyle(StrutStyleSchema strutStyle) {
        this.strutStyle = strutStyle;
        return this;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public TextStyleSchema getTextStyle() {
        return textStyle;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public void setTextStyle(TextStyleSchema textStyle) {
        this.textStyle = textStyle;
    }

    public TextFieldStyleSchema withTextStyle(TextStyleSchema textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * TextAlign
     * <p>
     * Component of type TextAlign.
     * 
     */
    public TextAlignSchema getTextAlign() {
        return textAlign;
    }

    /**
     * TextAlign
     * <p>
     * Component of type TextAlign.
     * 
     */
    public void setTextAlign(TextAlignSchema textAlign) {
        this.textAlign = textAlign;
    }

    public TextFieldStyleSchema withTextAlign(TextAlignSchema textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    /**
     * TextAlignVertical
     * <p>
     * Component of type TextAlignVertical.
     * 
     */
    public TextAlignVerticalSchema getTextAlignVertical() {
        return textAlignVertical;
    }

    /**
     * TextAlignVertical
     * <p>
     * Component of type TextAlignVertical.
     * 
     */
    public void setTextAlignVertical(TextAlignVerticalSchema textAlignVertical) {
        this.textAlignVertical = textAlignVertical;
    }

    public TextFieldStyleSchema withTextAlignVertical(TextAlignVerticalSchema textAlignVertical) {
        this.textAlignVertical = textAlignVertical;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextFieldStyleSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cursorColor");
        sb.append('=');
        sb.append(((this.cursorColor == null) ? "<null>" : this.cursorColor));
        sb.append(',');
        sb.append("cursorHeight");
        sb.append('=');
        sb.append(((this.cursorHeight == null) ? "<null>" : this.cursorHeight));
        sb.append(',');
        sb.append("cursorRadius");
        sb.append('=');
        sb.append(((this.cursorRadius == null) ? "<null>" : this.cursorRadius));
        sb.append(',');
        sb.append("cursorWidth");
        sb.append('=');
        sb.append(((this.cursorWidth == null) ? "<null>" : this.cursorWidth));
        sb.append(',');
        sb.append("decoration");
        sb.append('=');
        sb.append(((this.decoration == null) ? "<null>" : this.decoration));
        sb.append(',');
        sb.append("keyboardAppearance");
        sb.append('=');
        sb.append(((this.keyboardAppearance == null) ? "<null>" : this.keyboardAppearance));
        sb.append(',');
        sb.append("obscuringCharacter");
        sb.append('=');
        sb.append(((this.obscuringCharacter == null) ? "<null>" : this.obscuringCharacter));
        sb.append(',');
        sb.append("scrollPadding");
        sb.append('=');
        sb.append(((this.scrollPadding == null) ? "<null>" : this.scrollPadding));
        sb.append(',');
        sb.append("selectionHeightStyle");
        sb.append('=');
        sb.append(((this.selectionHeightStyle == null) ? "<null>" : this.selectionHeightStyle));
        sb.append(',');
        sb.append("selectionWidthStyle");
        sb.append('=');
        sb.append(((this.selectionWidthStyle == null) ? "<null>" : this.selectionWidthStyle));
        sb.append(',');
        sb.append("strutStyle");
        sb.append('=');
        sb.append(((this.strutStyle == null) ? "<null>" : this.strutStyle));
        sb.append(',');
        sb.append("textStyle");
        sb.append('=');
        sb.append(((this.textStyle == null) ? "<null>" : this.textStyle));
        sb.append(',');
        sb.append("textAlign");
        sb.append('=');
        sb.append(((this.textAlign == null) ? "<null>" : this.textAlign));
        sb.append(',');
        sb.append("textAlignVertical");
        sb.append('=');
        sb.append(((this.textAlignVertical == null) ? "<null>" : this.textAlignVertical));
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
        result = ((result * 31) + ((this.scrollPadding == null) ? 0 : this.scrollPadding.hashCode()));
        result = ((result * 31) + ((this.textAlignVertical == null) ? 0 : this.textAlignVertical.hashCode()));
        result = ((result * 31) + ((this.textAlign == null) ? 0 : this.textAlign.hashCode()));
        result = ((result * 31) + ((this.cursorWidth == null) ? 0 : this.cursorWidth.hashCode()));
        result = ((result * 31) + ((this.cursorHeight == null) ? 0 : this.cursorHeight.hashCode()));
        result = ((result * 31) + ((this.cursorColor == null) ? 0 : this.cursorColor.hashCode()));
        result = ((result * 31) + ((this.cursorRadius == null) ? 0 : this.cursorRadius.hashCode()));
        result = ((result * 31) + ((this.keyboardAppearance == null) ? 0 : this.keyboardAppearance.hashCode()));
        result = ((result * 31) + ((this.selectionWidthStyle == null) ? 0 : this.selectionWidthStyle.hashCode()));
        result = ((result * 31) + ((this.selectionHeightStyle == null) ? 0 : this.selectionHeightStyle.hashCode()));
        result = ((result * 31) + ((this.strutStyle == null) ? 0 : this.strutStyle.hashCode()));
        result = ((result * 31) + ((this.textStyle == null) ? 0 : this.textStyle.hashCode()));
        result = ((result * 31) + ((this.decoration == null) ? 0 : this.decoration.hashCode()));
        result = ((result * 31) + ((this.obscuringCharacter == null) ? 0 : this.obscuringCharacter.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TextFieldStyleSchema) == false) {
            return false;
        }
        TextFieldStyleSchema rhs = ((TextFieldStyleSchema) other);
        return (((((((((((((((this.scrollPadding == rhs.scrollPadding)
                || ((this.scrollPadding != null) && this.scrollPadding.equals(rhs.scrollPadding)))
                && ((this.textAlignVertical == rhs.textAlignVertical)
                        || ((this.textAlignVertical != null) && this.textAlignVertical.equals(rhs.textAlignVertical))))
                && ((this.textAlign == rhs.textAlign)
                        || ((this.textAlign != null) && this.textAlign.equals(rhs.textAlign))))
                && ((this.cursorWidth == rhs.cursorWidth)
                        || ((this.cursorWidth != null) && this.cursorWidth.equals(rhs.cursorWidth))))
                && ((this.cursorHeight == rhs.cursorHeight)
                        || ((this.cursorHeight != null) && this.cursorHeight.equals(rhs.cursorHeight))))
                && ((this.cursorColor == rhs.cursorColor)
                        || ((this.cursorColor != null) && this.cursorColor.equals(rhs.cursorColor))))
                && ((this.cursorRadius == rhs.cursorRadius)
                        || ((this.cursorRadius != null) && this.cursorRadius.equals(rhs.cursorRadius))))
                && ((this.keyboardAppearance == rhs.keyboardAppearance) || ((this.keyboardAppearance != null)
                        && this.keyboardAppearance.equals(rhs.keyboardAppearance))))
                && ((this.selectionWidthStyle == rhs.selectionWidthStyle) || ((this.selectionWidthStyle != null)
                        && this.selectionWidthStyle.equals(rhs.selectionWidthStyle))))
                && ((this.selectionHeightStyle == rhs.selectionHeightStyle) || ((this.selectionHeightStyle != null)
                        && this.selectionHeightStyle.equals(rhs.selectionHeightStyle))))
                && ((this.strutStyle == rhs.strutStyle)
                        || ((this.strutStyle != null) && this.strutStyle.equals(rhs.strutStyle))))
                && ((this.textStyle == rhs.textStyle)
                        || ((this.textStyle != null) && this.textStyle.equals(rhs.textStyle))))
                && ((this.decoration == rhs.decoration)
                        || ((this.decoration != null) && this.decoration.equals(rhs.decoration))))
                && ((this.obscuringCharacter == rhs.obscuringCharacter) || ((this.obscuringCharacter != null)
                        && this.obscuringCharacter.equals(rhs.obscuringCharacter))));
    }

}
