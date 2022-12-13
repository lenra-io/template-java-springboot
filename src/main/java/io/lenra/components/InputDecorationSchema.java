
package io.lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * InputDecoration
 * <p>
 * Element of type InputDecoration
 * 
 */
public class InputDecorationSchema {

    /**
     * Whether to align the label with the hint or not. Defaults to false.
     * 
     */
    @SerializedName("alignLabelWithHint")
    @Expose
    private Boolean alignLabelWithHint = false;
    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    @SerializedName("border")
    @Expose
    private InputBorderSchema border;
    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    @SerializedName("constraints")
    @Expose
    private BoxConstraintsSchema constraints;
    /**
     * Padding
     * <p>
     * Element of type Padding
     * 
     */
    @SerializedName("contentPadding")
    @Expose
    private PaddingSchema contentPadding;
    @SerializedName("counter")
    @Expose
    private Object counter;
    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    @SerializedName("counterStyle")
    @Expose
    private TextStyleSchema counterStyle;
    /**
     * The text to place below the line as a character counter.
     * 
     */
    @SerializedName("counterText")
    @Expose
    private String counterText;
    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    @SerializedName("disabledBorder")
    @Expose
    private InputBorderSchema disabledBorder;
    /**
     * Whether the input is enabled or disabled.
     * 
     */
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    @SerializedName("enabledBorder")
    @Expose
    private InputBorderSchema enabledBorder;
    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    @SerializedName("errorBorder")
    @Expose
    private InputBorderSchema errorBorder;
    /**
     * The maximum number of lines the error text can use.
     * 
     */
    @SerializedName("errorMaxLines")
    @Expose
    private Integer errorMaxLines;
    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    @SerializedName("errorStyle")
    @Expose
    private TextStyleSchema errorStyle;
    /**
     * The error text to display when the input has an error.
     * 
     */
    @SerializedName("errorText")
    @Expose
    private String errorText;
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("fillColor")
    @Expose
    private Integer fillColor;
    /**
     * Whether the input is filled with fillColor.
     * 
     */
    @SerializedName("filled")
    @Expose
    private Boolean filled;
    /**
     * FloatingLabelBehavior
     * <p>
     * Element of type FloatingLabelBehavior.
     * 
     */
    @SerializedName("floatingLabelBehavior")
    @Expose
    private InputDecorationSchema.FloatingLabelBehaviorSchema floatingLabelBehavior;
    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    @SerializedName("floatingLabelStyle")
    @Expose
    private TextStyleSchema floatingLabelStyle;
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("focusColor")
    @Expose
    private Integer focusColor;
    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    @SerializedName("focusedBorder")
    @Expose
    private InputBorderSchema focusedBorder;
    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    @SerializedName("focusedErrorBorder")
    @Expose
    private InputBorderSchema focusedErrorBorder;
    /**
     * The maximum number of lines the helper text can use.
     * 
     */
    @SerializedName("helperMaxLines")
    @Expose
    private Integer helperMaxLines;
    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    @SerializedName("helperStyle")
    @Expose
    private TextStyleSchema helperStyle;
    /**
     * The helper text to display.
     * 
     */
    @SerializedName("helperText")
    @Expose
    private String helperText;
    /**
     * The maximum number of lines the hint text can use.
     * 
     */
    @SerializedName("hintMaxLines")
    @Expose
    private Integer hintMaxLines;
    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    @SerializedName("hintStyle")
    @Expose
    private TextStyleSchema hintStyle;
    /**
     * The hint text to display.
     * 
     */
    @SerializedName("hintText")
    @Expose
    private String hintText;
    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    @SerializedName("hintTextDirection")
    @Expose
    private io.lenra.components.FlexSchema.TextDirectionSchema hintTextDirection = io.lenra.components.FlexSchema.TextDirectionSchema
            .fromValue("ltr");
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("hoverColor")
    @Expose
    private Integer hoverColor;
    @SerializedName("icon")
    @Expose
    private Object icon;
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("iconColor")
    @Expose
    private Integer iconColor;
    /**
     * Whether the decoration is the same size as the input field.
     * 
     */
    @SerializedName("isCollapsed")
    @Expose
    private Boolean isCollapsed;
    /**
     * Whether the decoration is dense.
     * 
     */
    @SerializedName("isDense")
    @Expose
    private Boolean isDense;
    @SerializedName("label")
    @Expose
    private Object label;
    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    @SerializedName("labelStyle")
    @Expose
    private TextStyleSchema labelStyle;
    /**
     * The text that describes the input field.
     * 
     */
    @SerializedName("labelText")
    @Expose
    private String labelText;
    @SerializedName("prefix")
    @Expose
    private Object prefix;
    @SerializedName("prefixIcon")
    @Expose
    private Object prefixIcon;
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("prefixIconColor")
    @Expose
    private Integer prefixIconColor;
    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    @SerializedName("prefixIconConstraints")
    @Expose
    private BoxConstraintsSchema prefixIconConstraints;
    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    @SerializedName("prefixStyle")
    @Expose
    private TextStyleSchema prefixStyle;
    /**
     * The text to display before the input.
     * 
     */
    @SerializedName("prefixText")
    @Expose
    private String prefixText;
    /**
     * The semantic label for the counterText.
     * 
     */
    @SerializedName("semanticCounterText")
    @Expose
    private String semanticCounterText;
    @SerializedName("suffix")
    @Expose
    private Object suffix;
    @SerializedName("suffixIcon")
    @Expose
    private Object suffixIcon;
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("suffixIconColor")
    @Expose
    private Integer suffixIconColor;
    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    @SerializedName("suffixIconConstraints")
    @Expose
    private BoxConstraintsSchema suffixIconConstraints;
    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    @SerializedName("suffixStyle")
    @Expose
    private TextStyleSchema suffixStyle;
    /**
     * The text to display after the input.
     * 
     */
    @SerializedName("suffixText")
    @Expose
    private String suffixText;

    /**
     * Whether to align the label with the hint or not. Defaults to false.
     * 
     */
    public Boolean getAlignLabelWithHint() {
        return alignLabelWithHint;
    }

    /**
     * Whether to align the label with the hint or not. Defaults to false.
     * 
     */
    public void setAlignLabelWithHint(Boolean alignLabelWithHint) {
        this.alignLabelWithHint = alignLabelWithHint;
    }

    public InputDecorationSchema withAlignLabelWithHint(Boolean alignLabelWithHint) {
        this.alignLabelWithHint = alignLabelWithHint;
        return this;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public InputBorderSchema getBorder() {
        return border;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public void setBorder(InputBorderSchema border) {
        this.border = border;
    }

    public InputDecorationSchema withBorder(InputBorderSchema border) {
        this.border = border;
        return this;
    }

    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    public BoxConstraintsSchema getConstraints() {
        return constraints;
    }

    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    public void setConstraints(BoxConstraintsSchema constraints) {
        this.constraints = constraints;
    }

    public InputDecorationSchema withConstraints(BoxConstraintsSchema constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Padding
     * <p>
     * Element of type Padding
     * 
     */
    public PaddingSchema getContentPadding() {
        return contentPadding;
    }

    /**
     * Padding
     * <p>
     * Element of type Padding
     * 
     */
    public void setContentPadding(PaddingSchema contentPadding) {
        this.contentPadding = contentPadding;
    }

    public InputDecorationSchema withContentPadding(PaddingSchema contentPadding) {
        this.contentPadding = contentPadding;
        return this;
    }

    public Object getCounter() {
        return counter;
    }

    public void setCounter(Object counter) {
        this.counter = counter;
    }

    public InputDecorationSchema withCounter(Object counter) {
        this.counter = counter;
        return this;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public TextStyleSchema getCounterStyle() {
        return counterStyle;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public void setCounterStyle(TextStyleSchema counterStyle) {
        this.counterStyle = counterStyle;
    }

    public InputDecorationSchema withCounterStyle(TextStyleSchema counterStyle) {
        this.counterStyle = counterStyle;
        return this;
    }

    /**
     * The text to place below the line as a character counter.
     * 
     */
    public String getCounterText() {
        return counterText;
    }

    /**
     * The text to place below the line as a character counter.
     * 
     */
    public void setCounterText(String counterText) {
        this.counterText = counterText;
    }

    public InputDecorationSchema withCounterText(String counterText) {
        this.counterText = counterText;
        return this;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public InputBorderSchema getDisabledBorder() {
        return disabledBorder;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public void setDisabledBorder(InputBorderSchema disabledBorder) {
        this.disabledBorder = disabledBorder;
    }

    public InputDecorationSchema withDisabledBorder(InputBorderSchema disabledBorder) {
        this.disabledBorder = disabledBorder;
        return this;
    }

    /**
     * Whether the input is enabled or disabled.
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Whether the input is enabled or disabled.
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public InputDecorationSchema withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public InputBorderSchema getEnabledBorder() {
        return enabledBorder;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public void setEnabledBorder(InputBorderSchema enabledBorder) {
        this.enabledBorder = enabledBorder;
    }

    public InputDecorationSchema withEnabledBorder(InputBorderSchema enabledBorder) {
        this.enabledBorder = enabledBorder;
        return this;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public InputBorderSchema getErrorBorder() {
        return errorBorder;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public void setErrorBorder(InputBorderSchema errorBorder) {
        this.errorBorder = errorBorder;
    }

    public InputDecorationSchema withErrorBorder(InputBorderSchema errorBorder) {
        this.errorBorder = errorBorder;
        return this;
    }

    /**
     * The maximum number of lines the error text can use.
     * 
     */
    public Integer getErrorMaxLines() {
        return errorMaxLines;
    }

    /**
     * The maximum number of lines the error text can use.
     * 
     */
    public void setErrorMaxLines(Integer errorMaxLines) {
        this.errorMaxLines = errorMaxLines;
    }

    public InputDecorationSchema withErrorMaxLines(Integer errorMaxLines) {
        this.errorMaxLines = errorMaxLines;
        return this;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public TextStyleSchema getErrorStyle() {
        return errorStyle;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public void setErrorStyle(TextStyleSchema errorStyle) {
        this.errorStyle = errorStyle;
    }

    public InputDecorationSchema withErrorStyle(TextStyleSchema errorStyle) {
        this.errorStyle = errorStyle;
        return this;
    }

    /**
     * The error text to display when the input has an error.
     * 
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * The error text to display when the input has an error.
     * 
     */
    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public InputDecorationSchema withErrorText(String errorText) {
        this.errorText = errorText;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getFillColor() {
        return fillColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setFillColor(Integer fillColor) {
        this.fillColor = fillColor;
    }

    public InputDecorationSchema withFillColor(Integer fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    /**
     * Whether the input is filled with fillColor.
     * 
     */
    public Boolean getFilled() {
        return filled;
    }

    /**
     * Whether the input is filled with fillColor.
     * 
     */
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public InputDecorationSchema withFilled(Boolean filled) {
        this.filled = filled;
        return this;
    }

    /**
     * FloatingLabelBehavior
     * <p>
     * Element of type FloatingLabelBehavior.
     * 
     */
    public InputDecorationSchema.FloatingLabelBehaviorSchema getFloatingLabelBehavior() {
        return floatingLabelBehavior;
    }

    /**
     * FloatingLabelBehavior
     * <p>
     * Element of type FloatingLabelBehavior.
     * 
     */
    public void setFloatingLabelBehavior(InputDecorationSchema.FloatingLabelBehaviorSchema floatingLabelBehavior) {
        this.floatingLabelBehavior = floatingLabelBehavior;
    }

    public InputDecorationSchema withFloatingLabelBehavior(
            InputDecorationSchema.FloatingLabelBehaviorSchema floatingLabelBehavior) {
        this.floatingLabelBehavior = floatingLabelBehavior;
        return this;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public TextStyleSchema getFloatingLabelStyle() {
        return floatingLabelStyle;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public void setFloatingLabelStyle(TextStyleSchema floatingLabelStyle) {
        this.floatingLabelStyle = floatingLabelStyle;
    }

    public InputDecorationSchema withFloatingLabelStyle(TextStyleSchema floatingLabelStyle) {
        this.floatingLabelStyle = floatingLabelStyle;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getFocusColor() {
        return focusColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setFocusColor(Integer focusColor) {
        this.focusColor = focusColor;
    }

    public InputDecorationSchema withFocusColor(Integer focusColor) {
        this.focusColor = focusColor;
        return this;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public InputBorderSchema getFocusedBorder() {
        return focusedBorder;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public void setFocusedBorder(InputBorderSchema focusedBorder) {
        this.focusedBorder = focusedBorder;
    }

    public InputDecorationSchema withFocusedBorder(InputBorderSchema focusedBorder) {
        this.focusedBorder = focusedBorder;
        return this;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public InputBorderSchema getFocusedErrorBorder() {
        return focusedErrorBorder;
    }

    /**
     * InputBorder
     * <p>
     * Element of type InputBorder
     * 
     */
    public void setFocusedErrorBorder(InputBorderSchema focusedErrorBorder) {
        this.focusedErrorBorder = focusedErrorBorder;
    }

    public InputDecorationSchema withFocusedErrorBorder(InputBorderSchema focusedErrorBorder) {
        this.focusedErrorBorder = focusedErrorBorder;
        return this;
    }

    /**
     * The maximum number of lines the helper text can use.
     * 
     */
    public Integer getHelperMaxLines() {
        return helperMaxLines;
    }

    /**
     * The maximum number of lines the helper text can use.
     * 
     */
    public void setHelperMaxLines(Integer helperMaxLines) {
        this.helperMaxLines = helperMaxLines;
    }

    public InputDecorationSchema withHelperMaxLines(Integer helperMaxLines) {
        this.helperMaxLines = helperMaxLines;
        return this;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public TextStyleSchema getHelperStyle() {
        return helperStyle;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public void setHelperStyle(TextStyleSchema helperStyle) {
        this.helperStyle = helperStyle;
    }

    public InputDecorationSchema withHelperStyle(TextStyleSchema helperStyle) {
        this.helperStyle = helperStyle;
        return this;
    }

    /**
     * The helper text to display.
     * 
     */
    public String getHelperText() {
        return helperText;
    }

    /**
     * The helper text to display.
     * 
     */
    public void setHelperText(String helperText) {
        this.helperText = helperText;
    }

    public InputDecorationSchema withHelperText(String helperText) {
        this.helperText = helperText;
        return this;
    }

    /**
     * The maximum number of lines the hint text can use.
     * 
     */
    public Integer getHintMaxLines() {
        return hintMaxLines;
    }

    /**
     * The maximum number of lines the hint text can use.
     * 
     */
    public void setHintMaxLines(Integer hintMaxLines) {
        this.hintMaxLines = hintMaxLines;
    }

    public InputDecorationSchema withHintMaxLines(Integer hintMaxLines) {
        this.hintMaxLines = hintMaxLines;
        return this;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public TextStyleSchema getHintStyle() {
        return hintStyle;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public void setHintStyle(TextStyleSchema hintStyle) {
        this.hintStyle = hintStyle;
    }

    public InputDecorationSchema withHintStyle(TextStyleSchema hintStyle) {
        this.hintStyle = hintStyle;
        return this;
    }

    /**
     * The hint text to display.
     * 
     */
    public String getHintText() {
        return hintText;
    }

    /**
     * The hint text to display.
     * 
     */
    public void setHintText(String hintText) {
        this.hintText = hintText;
    }

    public InputDecorationSchema withHintText(String hintText) {
        this.hintText = hintText;
        return this;
    }

    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    public io.lenra.components.FlexSchema.TextDirectionSchema getHintTextDirection() {
        return hintTextDirection;
    }

    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    public void setHintTextDirection(io.lenra.components.FlexSchema.TextDirectionSchema hintTextDirection) {
        this.hintTextDirection = hintTextDirection;
    }

    public InputDecorationSchema withHintTextDirection(
            io.lenra.components.FlexSchema.TextDirectionSchema hintTextDirection) {
        this.hintTextDirection = hintTextDirection;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getHoverColor() {
        return hoverColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setHoverColor(Integer hoverColor) {
        this.hoverColor = hoverColor;
    }

    public InputDecorationSchema withHoverColor(Integer hoverColor) {
        this.hoverColor = hoverColor;
        return this;
    }

    public Object getIcon() {
        return icon;
    }

    public void setIcon(Object icon) {
        this.icon = icon;
    }

    public InputDecorationSchema withIcon(Object icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getIconColor() {
        return iconColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setIconColor(Integer iconColor) {
        this.iconColor = iconColor;
    }

    public InputDecorationSchema withIconColor(Integer iconColor) {
        this.iconColor = iconColor;
        return this;
    }

    /**
     * Whether the decoration is the same size as the input field.
     * 
     */
    public Boolean getIsCollapsed() {
        return isCollapsed;
    }

    /**
     * Whether the decoration is the same size as the input field.
     * 
     */
    public void setIsCollapsed(Boolean isCollapsed) {
        this.isCollapsed = isCollapsed;
    }

    public InputDecorationSchema withIsCollapsed(Boolean isCollapsed) {
        this.isCollapsed = isCollapsed;
        return this;
    }

    /**
     * Whether the decoration is dense.
     * 
     */
    public Boolean getIsDense() {
        return isDense;
    }

    /**
     * Whether the decoration is dense.
     * 
     */
    public void setIsDense(Boolean isDense) {
        this.isDense = isDense;
    }

    public InputDecorationSchema withIsDense(Boolean isDense) {
        this.isDense = isDense;
        return this;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    public InputDecorationSchema withLabel(Object label) {
        this.label = label;
        return this;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public TextStyleSchema getLabelStyle() {
        return labelStyle;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public void setLabelStyle(TextStyleSchema labelStyle) {
        this.labelStyle = labelStyle;
    }

    public InputDecorationSchema withLabelStyle(TextStyleSchema labelStyle) {
        this.labelStyle = labelStyle;
        return this;
    }

    /**
     * The text that describes the input field.
     * 
     */
    public String getLabelText() {
        return labelText;
    }

    /**
     * The text that describes the input field.
     * 
     */
    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    public InputDecorationSchema withLabelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    public Object getPrefix() {
        return prefix;
    }

    public void setPrefix(Object prefix) {
        this.prefix = prefix;
    }

    public InputDecorationSchema withPrefix(Object prefix) {
        this.prefix = prefix;
        return this;
    }

    public Object getPrefixIcon() {
        return prefixIcon;
    }

    public void setPrefixIcon(Object prefixIcon) {
        this.prefixIcon = prefixIcon;
    }

    public InputDecorationSchema withPrefixIcon(Object prefixIcon) {
        this.prefixIcon = prefixIcon;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getPrefixIconColor() {
        return prefixIconColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setPrefixIconColor(Integer prefixIconColor) {
        this.prefixIconColor = prefixIconColor;
    }

    public InputDecorationSchema withPrefixIconColor(Integer prefixIconColor) {
        this.prefixIconColor = prefixIconColor;
        return this;
    }

    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    public BoxConstraintsSchema getPrefixIconConstraints() {
        return prefixIconConstraints;
    }

    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    public void setPrefixIconConstraints(BoxConstraintsSchema prefixIconConstraints) {
        this.prefixIconConstraints = prefixIconConstraints;
    }

    public InputDecorationSchema withPrefixIconConstraints(BoxConstraintsSchema prefixIconConstraints) {
        this.prefixIconConstraints = prefixIconConstraints;
        return this;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public TextStyleSchema getPrefixStyle() {
        return prefixStyle;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public void setPrefixStyle(TextStyleSchema prefixStyle) {
        this.prefixStyle = prefixStyle;
    }

    public InputDecorationSchema withPrefixStyle(TextStyleSchema prefixStyle) {
        this.prefixStyle = prefixStyle;
        return this;
    }

    /**
     * The text to display before the input.
     * 
     */
    public String getPrefixText() {
        return prefixText;
    }

    /**
     * The text to display before the input.
     * 
     */
    public void setPrefixText(String prefixText) {
        this.prefixText = prefixText;
    }

    public InputDecorationSchema withPrefixText(String prefixText) {
        this.prefixText = prefixText;
        return this;
    }

    /**
     * The semantic label for the counterText.
     * 
     */
    public String getSemanticCounterText() {
        return semanticCounterText;
    }

    /**
     * The semantic label for the counterText.
     * 
     */
    public void setSemanticCounterText(String semanticCounterText) {
        this.semanticCounterText = semanticCounterText;
    }

    public InputDecorationSchema withSemanticCounterText(String semanticCounterText) {
        this.semanticCounterText = semanticCounterText;
        return this;
    }

    public Object getSuffix() {
        return suffix;
    }

    public void setSuffix(Object suffix) {
        this.suffix = suffix;
    }

    public InputDecorationSchema withSuffix(Object suffix) {
        this.suffix = suffix;
        return this;
    }

    public Object getSuffixIcon() {
        return suffixIcon;
    }

    public void setSuffixIcon(Object suffixIcon) {
        this.suffixIcon = suffixIcon;
    }

    public InputDecorationSchema withSuffixIcon(Object suffixIcon) {
        this.suffixIcon = suffixIcon;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getSuffixIconColor() {
        return suffixIconColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setSuffixIconColor(Integer suffixIconColor) {
        this.suffixIconColor = suffixIconColor;
    }

    public InputDecorationSchema withSuffixIconColor(Integer suffixIconColor) {
        this.suffixIconColor = suffixIconColor;
        return this;
    }

    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    public BoxConstraintsSchema getSuffixIconConstraints() {
        return suffixIconConstraints;
    }

    /**
     * BoxConstraints
     * <p>
     * Element of type BoxConstraints
     * 
     */
    public void setSuffixIconConstraints(BoxConstraintsSchema suffixIconConstraints) {
        this.suffixIconConstraints = suffixIconConstraints;
    }

    public InputDecorationSchema withSuffixIconConstraints(BoxConstraintsSchema suffixIconConstraints) {
        this.suffixIconConstraints = suffixIconConstraints;
        return this;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public TextStyleSchema getSuffixStyle() {
        return suffixStyle;
    }

    /**
     * TextStyle
     * <p>
     * The style of the Text.
     * 
     */
    public void setSuffixStyle(TextStyleSchema suffixStyle) {
        this.suffixStyle = suffixStyle;
    }

    public InputDecorationSchema withSuffixStyle(TextStyleSchema suffixStyle) {
        this.suffixStyle = suffixStyle;
        return this;
    }

    /**
     * The text to display after the input.
     * 
     */
    public String getSuffixText() {
        return suffixText;
    }

    /**
     * The text to display after the input.
     * 
     */
    public void setSuffixText(String suffixText) {
        this.suffixText = suffixText;
    }

    public InputDecorationSchema withSuffixText(String suffixText) {
        this.suffixText = suffixText;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InputDecorationSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("alignLabelWithHint");
        sb.append('=');
        sb.append(((this.alignLabelWithHint == null) ? "<null>" : this.alignLabelWithHint));
        sb.append(',');
        sb.append("border");
        sb.append('=');
        sb.append(((this.border == null) ? "<null>" : this.border));
        sb.append(',');
        sb.append("constraints");
        sb.append('=');
        sb.append(((this.constraints == null) ? "<null>" : this.constraints));
        sb.append(',');
        sb.append("contentPadding");
        sb.append('=');
        sb.append(((this.contentPadding == null) ? "<null>" : this.contentPadding));
        sb.append(',');
        sb.append("counter");
        sb.append('=');
        sb.append(((this.counter == null) ? "<null>" : this.counter));
        sb.append(',');
        sb.append("counterStyle");
        sb.append('=');
        sb.append(((this.counterStyle == null) ? "<null>" : this.counterStyle));
        sb.append(',');
        sb.append("counterText");
        sb.append('=');
        sb.append(((this.counterText == null) ? "<null>" : this.counterText));
        sb.append(',');
        sb.append("disabledBorder");
        sb.append('=');
        sb.append(((this.disabledBorder == null) ? "<null>" : this.disabledBorder));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null) ? "<null>" : this.enabled));
        sb.append(',');
        sb.append("enabledBorder");
        sb.append('=');
        sb.append(((this.enabledBorder == null) ? "<null>" : this.enabledBorder));
        sb.append(',');
        sb.append("errorBorder");
        sb.append('=');
        sb.append(((this.errorBorder == null) ? "<null>" : this.errorBorder));
        sb.append(',');
        sb.append("errorMaxLines");
        sb.append('=');
        sb.append(((this.errorMaxLines == null) ? "<null>" : this.errorMaxLines));
        sb.append(',');
        sb.append("errorStyle");
        sb.append('=');
        sb.append(((this.errorStyle == null) ? "<null>" : this.errorStyle));
        sb.append(',');
        sb.append("errorText");
        sb.append('=');
        sb.append(((this.errorText == null) ? "<null>" : this.errorText));
        sb.append(',');
        sb.append("fillColor");
        sb.append('=');
        sb.append(((this.fillColor == null) ? "<null>" : this.fillColor));
        sb.append(',');
        sb.append("filled");
        sb.append('=');
        sb.append(((this.filled == null) ? "<null>" : this.filled));
        sb.append(',');
        sb.append("floatingLabelBehavior");
        sb.append('=');
        sb.append(((this.floatingLabelBehavior == null) ? "<null>" : this.floatingLabelBehavior));
        sb.append(',');
        sb.append("floatingLabelStyle");
        sb.append('=');
        sb.append(((this.floatingLabelStyle == null) ? "<null>" : this.floatingLabelStyle));
        sb.append(',');
        sb.append("focusColor");
        sb.append('=');
        sb.append(((this.focusColor == null) ? "<null>" : this.focusColor));
        sb.append(',');
        sb.append("focusedBorder");
        sb.append('=');
        sb.append(((this.focusedBorder == null) ? "<null>" : this.focusedBorder));
        sb.append(',');
        sb.append("focusedErrorBorder");
        sb.append('=');
        sb.append(((this.focusedErrorBorder == null) ? "<null>" : this.focusedErrorBorder));
        sb.append(',');
        sb.append("helperMaxLines");
        sb.append('=');
        sb.append(((this.helperMaxLines == null) ? "<null>" : this.helperMaxLines));
        sb.append(',');
        sb.append("helperStyle");
        sb.append('=');
        sb.append(((this.helperStyle == null) ? "<null>" : this.helperStyle));
        sb.append(',');
        sb.append("helperText");
        sb.append('=');
        sb.append(((this.helperText == null) ? "<null>" : this.helperText));
        sb.append(',');
        sb.append("hintMaxLines");
        sb.append('=');
        sb.append(((this.hintMaxLines == null) ? "<null>" : this.hintMaxLines));
        sb.append(',');
        sb.append("hintStyle");
        sb.append('=');
        sb.append(((this.hintStyle == null) ? "<null>" : this.hintStyle));
        sb.append(',');
        sb.append("hintText");
        sb.append('=');
        sb.append(((this.hintText == null) ? "<null>" : this.hintText));
        sb.append(',');
        sb.append("hintTextDirection");
        sb.append('=');
        sb.append(((this.hintTextDirection == null) ? "<null>" : this.hintTextDirection));
        sb.append(',');
        sb.append("hoverColor");
        sb.append('=');
        sb.append(((this.hoverColor == null) ? "<null>" : this.hoverColor));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null) ? "<null>" : this.icon));
        sb.append(',');
        sb.append("iconColor");
        sb.append('=');
        sb.append(((this.iconColor == null) ? "<null>" : this.iconColor));
        sb.append(',');
        sb.append("isCollapsed");
        sb.append('=');
        sb.append(((this.isCollapsed == null) ? "<null>" : this.isCollapsed));
        sb.append(',');
        sb.append("isDense");
        sb.append('=');
        sb.append(((this.isDense == null) ? "<null>" : this.isDense));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null) ? "<null>" : this.label));
        sb.append(',');
        sb.append("labelStyle");
        sb.append('=');
        sb.append(((this.labelStyle == null) ? "<null>" : this.labelStyle));
        sb.append(',');
        sb.append("labelText");
        sb.append('=');
        sb.append(((this.labelText == null) ? "<null>" : this.labelText));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null) ? "<null>" : this.prefix));
        sb.append(',');
        sb.append("prefixIcon");
        sb.append('=');
        sb.append(((this.prefixIcon == null) ? "<null>" : this.prefixIcon));
        sb.append(',');
        sb.append("prefixIconColor");
        sb.append('=');
        sb.append(((this.prefixIconColor == null) ? "<null>" : this.prefixIconColor));
        sb.append(',');
        sb.append("prefixIconConstraints");
        sb.append('=');
        sb.append(((this.prefixIconConstraints == null) ? "<null>" : this.prefixIconConstraints));
        sb.append(',');
        sb.append("prefixStyle");
        sb.append('=');
        sb.append(((this.prefixStyle == null) ? "<null>" : this.prefixStyle));
        sb.append(',');
        sb.append("prefixText");
        sb.append('=');
        sb.append(((this.prefixText == null) ? "<null>" : this.prefixText));
        sb.append(',');
        sb.append("semanticCounterText");
        sb.append('=');
        sb.append(((this.semanticCounterText == null) ? "<null>" : this.semanticCounterText));
        sb.append(',');
        sb.append("suffix");
        sb.append('=');
        sb.append(((this.suffix == null) ? "<null>" : this.suffix));
        sb.append(',');
        sb.append("suffixIcon");
        sb.append('=');
        sb.append(((this.suffixIcon == null) ? "<null>" : this.suffixIcon));
        sb.append(',');
        sb.append("suffixIconColor");
        sb.append('=');
        sb.append(((this.suffixIconColor == null) ? "<null>" : this.suffixIconColor));
        sb.append(',');
        sb.append("suffixIconConstraints");
        sb.append('=');
        sb.append(((this.suffixIconConstraints == null) ? "<null>" : this.suffixIconConstraints));
        sb.append(',');
        sb.append("suffixStyle");
        sb.append('=');
        sb.append(((this.suffixStyle == null) ? "<null>" : this.suffixStyle));
        sb.append(',');
        sb.append("suffixText");
        sb.append('=');
        sb.append(((this.suffixText == null) ? "<null>" : this.suffixText));
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
        result = ((result * 31) + ((this.isCollapsed == null) ? 0 : this.isCollapsed.hashCode()));
        result = ((result * 31) + ((this.prefixIconColor == null) ? 0 : this.prefixIconColor.hashCode()));
        result = ((result * 31) + ((this.hintMaxLines == null) ? 0 : this.hintMaxLines.hashCode()));
        result = ((result * 31) + ((this.prefix == null) ? 0 : this.prefix.hashCode()));
        result = ((result * 31) + ((this.labelText == null) ? 0 : this.labelText.hashCode()));
        result = ((result * 31) + ((this.hoverColor == null) ? 0 : this.hoverColor.hashCode()));
        result = ((result * 31) + ((this.prefixIconConstraints == null) ? 0 : this.prefixIconConstraints.hashCode()));
        result = ((result * 31) + ((this.isDense == null) ? 0 : this.isDense.hashCode()));
        result = ((result * 31) + ((this.suffix == null) ? 0 : this.suffix.hashCode()));
        result = ((result * 31) + ((this.constraints == null) ? 0 : this.constraints.hashCode()));
        result = ((result * 31) + ((this.helperMaxLines == null) ? 0 : this.helperMaxLines.hashCode()));
        result = ((result * 31) + ((this.counterStyle == null) ? 0 : this.counterStyle.hashCode()));
        result = ((result * 31) + ((this.labelStyle == null) ? 0 : this.labelStyle.hashCode()));
        result = ((result * 31) + ((this.semanticCounterText == null) ? 0 : this.semanticCounterText.hashCode()));
        result = ((result * 31) + ((this.border == null) ? 0 : this.border.hashCode()));
        result = ((result * 31) + ((this.counterText == null) ? 0 : this.counterText.hashCode()));
        result = ((result * 31) + ((this.suffixStyle == null) ? 0 : this.suffixStyle.hashCode()));
        result = ((result * 31) + ((this.enabledBorder == null) ? 0 : this.enabledBorder.hashCode()));
        result = ((result * 31) + ((this.helperText == null) ? 0 : this.helperText.hashCode()));
        result = ((result * 31) + ((this.errorMaxLines == null) ? 0 : this.errorMaxLines.hashCode()));
        result = ((result * 31) + ((this.suffixIconColor == null) ? 0 : this.suffixIconColor.hashCode()));
        result = ((result * 31) + ((this.suffixIconConstraints == null) ? 0 : this.suffixIconConstraints.hashCode()));
        result = ((result * 31) + ((this.focusedBorder == null) ? 0 : this.focusedBorder.hashCode()));
        result = ((result * 31) + ((this.floatingLabelBehavior == null) ? 0 : this.floatingLabelBehavior.hashCode()));
        result = ((result * 31) + ((this.focusColor == null) ? 0 : this.focusColor.hashCode()));
        result = ((result * 31) + ((this.hintTextDirection == null) ? 0 : this.hintTextDirection.hashCode()));
        result = ((result * 31) + ((this.suffixText == null) ? 0 : this.suffixText.hashCode()));
        result = ((result * 31) + ((this.hintStyle == null) ? 0 : this.hintStyle.hashCode()));
        result = ((result * 31) + ((this.prefixIcon == null) ? 0 : this.prefixIcon.hashCode()));
        result = ((result * 31) + ((this.disabledBorder == null) ? 0 : this.disabledBorder.hashCode()));
        result = ((result * 31) + ((this.prefixText == null) ? 0 : this.prefixText.hashCode()));
        result = ((result * 31) + ((this.contentPadding == null) ? 0 : this.contentPadding.hashCode()));
        result = ((result * 31) + ((this.focusedErrorBorder == null) ? 0 : this.focusedErrorBorder.hashCode()));
        result = ((result * 31) + ((this.icon == null) ? 0 : this.icon.hashCode()));
        result = ((result * 31) + ((this.suffixIcon == null) ? 0 : this.suffixIcon.hashCode()));
        result = ((result * 31) + ((this.alignLabelWithHint == null) ? 0 : this.alignLabelWithHint.hashCode()));
        result = ((result * 31) + ((this.helperStyle == null) ? 0 : this.helperStyle.hashCode()));
        result = ((result * 31) + ((this.prefixStyle == null) ? 0 : this.prefixStyle.hashCode()));
        result = ((result * 31) + ((this.enabled == null) ? 0 : this.enabled.hashCode()));
        result = ((result * 31) + ((this.fillColor == null) ? 0 : this.fillColor.hashCode()));
        result = ((result * 31) + ((this.errorStyle == null) ? 0 : this.errorStyle.hashCode()));
        result = ((result * 31) + ((this.errorBorder == null) ? 0 : this.errorBorder.hashCode()));
        result = ((result * 31) + ((this.floatingLabelStyle == null) ? 0 : this.floatingLabelStyle.hashCode()));
        result = ((result * 31) + ((this.filled == null) ? 0 : this.filled.hashCode()));
        result = ((result * 31) + ((this.counter == null) ? 0 : this.counter.hashCode()));
        result = ((result * 31) + ((this.label == null) ? 0 : this.label.hashCode()));
        result = ((result * 31) + ((this.errorText == null) ? 0 : this.errorText.hashCode()));
        result = ((result * 31) + ((this.hintText == null) ? 0 : this.hintText.hashCode()));
        result = ((result * 31) + ((this.iconColor == null) ? 0 : this.iconColor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputDecorationSchema) == false) {
            return false;
        }
        InputDecorationSchema rhs = ((InputDecorationSchema) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.isCollapsed == rhs.isCollapsed)
                || ((this.isCollapsed != null) && this.isCollapsed.equals(rhs.isCollapsed)))
                && ((this.prefixIconColor == rhs.prefixIconColor)
                        || ((this.prefixIconColor != null) && this.prefixIconColor.equals(rhs.prefixIconColor))))
                && ((this.hintMaxLines == rhs.hintMaxLines)
                        || ((this.hintMaxLines != null) && this.hintMaxLines.equals(rhs.hintMaxLines))))
                && ((this.prefix == rhs.prefix) || ((this.prefix != null) && this.prefix.equals(rhs.prefix))))
                && ((this.labelText == rhs.labelText)
                        || ((this.labelText != null) && this.labelText.equals(rhs.labelText))))
                && ((this.hoverColor == rhs.hoverColor)
                        || ((this.hoverColor != null) && this.hoverColor.equals(rhs.hoverColor))))
                && ((this.prefixIconConstraints == rhs.prefixIconConstraints) || ((this.prefixIconConstraints != null)
                        && this.prefixIconConstraints.equals(rhs.prefixIconConstraints))))
                && ((this.isDense == rhs.isDense) || ((this.isDense != null) && this.isDense.equals(rhs.isDense))))
                && ((this.suffix == rhs.suffix) || ((this.suffix != null) && this.suffix.equals(rhs.suffix))))
                && ((this.constraints == rhs.constraints)
                        || ((this.constraints != null) && this.constraints.equals(rhs.constraints))))
                && ((this.helperMaxLines == rhs.helperMaxLines)
                        || ((this.helperMaxLines != null) && this.helperMaxLines.equals(rhs.helperMaxLines))))
                && ((this.counterStyle == rhs.counterStyle)
                        || ((this.counterStyle != null) && this.counterStyle.equals(rhs.counterStyle))))
                && ((this.labelStyle == rhs.labelStyle)
                        || ((this.labelStyle != null) && this.labelStyle.equals(rhs.labelStyle))))
                && ((this.semanticCounterText == rhs.semanticCounterText) || ((this.semanticCounterText != null)
                        && this.semanticCounterText.equals(rhs.semanticCounterText))))
                && ((this.border == rhs.border) || ((this.border != null) && this.border.equals(rhs.border))))
                && ((this.counterText == rhs.counterText)
                        || ((this.counterText != null) && this.counterText.equals(rhs.counterText))))
                && ((this.suffixStyle == rhs.suffixStyle)
                        || ((this.suffixStyle != null) && this.suffixStyle.equals(rhs.suffixStyle))))
                && ((this.enabledBorder == rhs.enabledBorder)
                        || ((this.enabledBorder != null) && this.enabledBorder.equals(rhs.enabledBorder))))
                && ((this.helperText == rhs.helperText)
                        || ((this.helperText != null) && this.helperText.equals(rhs.helperText))))
                && ((this.errorMaxLines == rhs.errorMaxLines)
                        || ((this.errorMaxLines != null) && this.errorMaxLines.equals(rhs.errorMaxLines))))
                && ((this.suffixIconColor == rhs.suffixIconColor)
                        || ((this.suffixIconColor != null) && this.suffixIconColor.equals(rhs.suffixIconColor))))
                && ((this.suffixIconConstraints == rhs.suffixIconConstraints) || ((this.suffixIconConstraints != null)
                        && this.suffixIconConstraints.equals(rhs.suffixIconConstraints))))
                && ((this.focusedBorder == rhs.focusedBorder)
                        || ((this.focusedBorder != null) && this.focusedBorder.equals(rhs.focusedBorder))))
                && ((this.floatingLabelBehavior == rhs.floatingLabelBehavior) || ((this.floatingLabelBehavior != null)
                        && this.floatingLabelBehavior.equals(rhs.floatingLabelBehavior))))
                && ((this.focusColor == rhs.focusColor)
                        || ((this.focusColor != null) && this.focusColor.equals(rhs.focusColor))))
                && ((this.hintTextDirection == rhs.hintTextDirection)
                        || ((this.hintTextDirection != null) && this.hintTextDirection.equals(rhs.hintTextDirection))))
                && ((this.suffixText == rhs.suffixText)
                        || ((this.suffixText != null) && this.suffixText.equals(rhs.suffixText))))
                && ((this.hintStyle == rhs.hintStyle)
                        || ((this.hintStyle != null) && this.hintStyle.equals(rhs.hintStyle))))
                && ((this.prefixIcon == rhs.prefixIcon)
                        || ((this.prefixIcon != null) && this.prefixIcon.equals(rhs.prefixIcon))))
                && ((this.disabledBorder == rhs.disabledBorder)
                        || ((this.disabledBorder != null) && this.disabledBorder.equals(rhs.disabledBorder))))
                && ((this.prefixText == rhs.prefixText)
                        || ((this.prefixText != null) && this.prefixText.equals(rhs.prefixText))))
                && ((this.contentPadding == rhs.contentPadding)
                        || ((this.contentPadding != null) && this.contentPadding.equals(rhs.contentPadding))))
                && ((this.focusedErrorBorder == rhs.focusedErrorBorder) || ((this.focusedErrorBorder != null)
                        && this.focusedErrorBorder.equals(rhs.focusedErrorBorder))))
                && ((this.icon == rhs.icon) || ((this.icon != null) && this.icon.equals(rhs.icon))))
                && ((this.suffixIcon == rhs.suffixIcon)
                        || ((this.suffixIcon != null) && this.suffixIcon.equals(rhs.suffixIcon))))
                && ((this.alignLabelWithHint == rhs.alignLabelWithHint) || ((this.alignLabelWithHint != null)
                        && this.alignLabelWithHint.equals(rhs.alignLabelWithHint))))
                && ((this.helperStyle == rhs.helperStyle)
                        || ((this.helperStyle != null) && this.helperStyle.equals(rhs.helperStyle))))
                && ((this.prefixStyle == rhs.prefixStyle)
                        || ((this.prefixStyle != null) && this.prefixStyle.equals(rhs.prefixStyle))))
                && ((this.enabled == rhs.enabled) || ((this.enabled != null) && this.enabled.equals(rhs.enabled))))
                && ((this.fillColor == rhs.fillColor)
                        || ((this.fillColor != null) && this.fillColor.equals(rhs.fillColor))))
                && ((this.errorStyle == rhs.errorStyle)
                        || ((this.errorStyle != null) && this.errorStyle.equals(rhs.errorStyle))))
                && ((this.errorBorder == rhs.errorBorder)
                        || ((this.errorBorder != null) && this.errorBorder.equals(rhs.errorBorder))))
                && ((this.floatingLabelStyle == rhs.floatingLabelStyle) || ((this.floatingLabelStyle != null)
                        && this.floatingLabelStyle.equals(rhs.floatingLabelStyle))))
                && ((this.filled == rhs.filled) || ((this.filled != null) && this.filled.equals(rhs.filled))))
                && ((this.counter == rhs.counter) || ((this.counter != null) && this.counter.equals(rhs.counter))))
                && ((this.label == rhs.label) || ((this.label != null) && this.label.equals(rhs.label))))
                && ((this.errorText == rhs.errorText)
                        || ((this.errorText != null) && this.errorText.equals(rhs.errorText))))
                && ((this.hintText == rhs.hintText) || ((this.hintText != null) && this.hintText.equals(rhs.hintText))))
                && ((this.iconColor == rhs.iconColor)
                        || ((this.iconColor != null) && this.iconColor.equals(rhs.iconColor))));
    }

    /**
     * FloatingLabelBehavior
     * <p>
     * Element of type FloatingLabelBehavior.
     * 
     */
    public enum FloatingLabelBehaviorSchema {

        @SerializedName("always")
        ALWAYS("always"),
        @SerializedName("auto")
        AUTO("auto"),
        @SerializedName("never")
        NEVER("never");

        private final String value;
        private final static Map<String, InputDecorationSchema.FloatingLabelBehaviorSchema> CONSTANTS = new HashMap<String, InputDecorationSchema.FloatingLabelBehaviorSchema>();

        static {
            for (InputDecorationSchema.FloatingLabelBehaviorSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FloatingLabelBehaviorSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static InputDecorationSchema.FloatingLabelBehaviorSchema fromValue(String value) {
            InputDecorationSchema.FloatingLabelBehaviorSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
