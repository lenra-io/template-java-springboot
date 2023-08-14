
package io.lenra.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * TextField
 * <p>
 * Element of type TextField
 * 
 */
public class TextfieldSchema {

    /**
     * The type of the element
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private TextfieldSchema.Type type;
    /**
     * The value displayed inside the Textfield
     * (Required)
     * 
     */
    @SerializedName("value")
    @Expose
    private String value;
    /**
     * Whether to enable the autocorrection
     * 
     */
    @SerializedName("autocorrect")
    @Expose
    private Boolean autocorrect;
    /**
     * AutofillHints
     * <p>
     * The AutofillHints enum to handle textfield's autocompletion.
     * 
     */
    @SerializedName("autofillHints")
    @Expose
    private List<AutofillHintsSchema> autofillHints = new ArrayList<AutofillHintsSchema>();
    /**
     * Whether this Textfield should be focused initially.
     * 
     */
    @SerializedName("autofocus")
    @Expose
    private Boolean autofocus;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("buildCounter")
    @Expose
    private ListenerSchema buildCounter;
    /**
     * TextFieldStyle
     * <p>
     * Element of type TextFieldStyle
     * 
     */
    @SerializedName("style")
    @Expose
    private TextFieldStyleSchema style;
    /**
     * DragStartBehavior
     * <p>
     * Component of type DragStartBehavior.
     * 
     */
    @SerializedName("dragStartBehavior")
    @Expose
    private TextfieldSchema.DragStartBehaviorSchema dragStartBehavior;
    /**
     * Whether the text field is enabled.
     * 
     */
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    /**
     * Whether to enable user interface options to change the text selection.
     * 
     */
    @SerializedName("enableInteractiveSelection")
    @Expose
    private Boolean enableInteractiveSelection;
    /**
     * Whether the TextField is sized to fill its parent.
     * 
     */
    @SerializedName("expands")
    @Expose
    private Boolean expands;
    /**
     * textInputType
     * <p>
     * Element of textInput Type
     * 
     */
    @SerializedName("keyboardType")
    @Expose
    private TextInputTypeSchema keyboardType;
    /**
     * The maximum number of characters to allow in the text field.
     * 
     */
    @SerializedName("maxLength")
    @Expose
    private Integer maxLength;
    /**
     * MaxLengthEnforcement
     * <p>
     * Component of type MaxLengthEnforcement.
     * 
     */
    @SerializedName("maxLengthEnforcement")
    @Expose
    private TextfieldSchema.MaxLengthEnforcementSchema maxLengthEnforcement;
    /**
     * The maximum number of lines to show at one time.
     * 
     */
    @SerializedName("maxLines")
    @Expose
    private Integer maxLines;
    /**
     * The minimum number of lines to occupy on the screen.
     * 
     */
    @SerializedName("minLines")
    @Expose
    private Integer minLines;
    /**
     * Whether to hide the text being edited.
     * 
     */
    @SerializedName("obscureText")
    @Expose
    private Boolean obscureText;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onAppPrivateCommand")
    @Expose
    private ListenerSchema onAppPrivateCommand;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onChanged")
    @Expose
    private ListenerSchema onChanged;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onEditingComplete")
    @Expose
    private ListenerSchema onEditingComplete;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onSubmitted")
    @Expose
    private ListenerSchema onSubmitted;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onTap")
    @Expose
    private ListenerSchema onTap;
    /**
     * Whether the text can be changed.
     * 
     */
    @SerializedName("readOnly")
    @Expose
    private Boolean readOnly;
    /**
     * Whether to show the cursor.
     * 
     */
    @SerializedName("showCursor")
    @Expose
    private Boolean showCursor;
    /**
     * TextCapitalization
     * <p>
     * Component of type TextCapitalization.
     * 
     */
    @SerializedName("textCapitalization")
    @Expose
    private TextfieldSchema.TextCapitalizationSchema textCapitalization;
    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    @SerializedName("textDirection")
    @Expose
    private io.lenra.components.FlexSchema.TextDirectionSchema textDirection = io.lenra.components.FlexSchema.TextDirectionSchema
            .fromValue("ltr");
    /**
     * TextInputAction
     * <p>
     * Component of type TextInputAction.
     * 
     */
    @SerializedName("textInputAction")
    @Expose
    private TextfieldSchema.TextInputActionSchema textInputAction;
    /**
     * toolbarOptions
     * <p>
     * Element of type toolbar options
     * 
     */
    @SerializedName("toolbarOptions")
    @Expose
    private ToolbarOptionsSchema toolbarOptions;
    /**
     * The name that will be used in the form.
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * The type of the element
     * (Required)
     * 
     */
    public TextfieldSchema.Type getType() {
        return type;
    }

    /**
     * The type of the element
     * (Required)
     * 
     */
    public void setType(TextfieldSchema.Type type) {
        this.type = type;
    }

    public TextfieldSchema withType(TextfieldSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The value displayed inside the Textfield
     * (Required)
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * The value displayed inside the Textfield
     * (Required)
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    public TextfieldSchema withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Whether to enable the autocorrection
     * 
     */
    public Boolean getAutocorrect() {
        return autocorrect;
    }

    /**
     * Whether to enable the autocorrection
     * 
     */
    public void setAutocorrect(Boolean autocorrect) {
        this.autocorrect = autocorrect;
    }

    public TextfieldSchema withAutocorrect(Boolean autocorrect) {
        this.autocorrect = autocorrect;
        return this;
    }

    /**
     * AutofillHints
     * <p>
     * The AutofillHints enum to handle textfield's autocompletion.
     * 
     */
    public List<AutofillHintsSchema> getAutofillHints() {
        return autofillHints;
    }

    /**
     * AutofillHints
     * <p>
     * The AutofillHints enum to handle textfield's autocompletion.
     * 
     */
    public void setAutofillHints(List<AutofillHintsSchema> autofillHints) {
        this.autofillHints = autofillHints;
    }

    public TextfieldSchema withAutofillHints(List<AutofillHintsSchema> autofillHints) {
        this.autofillHints = autofillHints;
        return this;
    }

    /**
     * Whether this Textfield should be focused initially.
     * 
     */
    public Boolean getAutofocus() {
        return autofocus;
    }

    /**
     * Whether this Textfield should be focused initially.
     * 
     */
    public void setAutofocus(Boolean autofocus) {
        this.autofocus = autofocus;
    }

    public TextfieldSchema withAutofocus(Boolean autofocus) {
        this.autofocus = autofocus;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getBuildCounter() {
        return buildCounter;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setBuildCounter(ListenerSchema buildCounter) {
        this.buildCounter = buildCounter;
    }

    public TextfieldSchema withBuildCounter(ListenerSchema buildCounter) {
        this.buildCounter = buildCounter;
        return this;
    }

    /**
     * TextFieldStyle
     * <p>
     * Element of type TextFieldStyle
     * 
     */
    public TextFieldStyleSchema getStyle() {
        return style;
    }

    /**
     * TextFieldStyle
     * <p>
     * Element of type TextFieldStyle
     * 
     */
    public void setStyle(TextFieldStyleSchema style) {
        this.style = style;
    }

    public TextfieldSchema withStyle(TextFieldStyleSchema style) {
        this.style = style;
        return this;
    }

    /**
     * DragStartBehavior
     * <p>
     * Component of type DragStartBehavior.
     * 
     */
    public TextfieldSchema.DragStartBehaviorSchema getDragStartBehavior() {
        return dragStartBehavior;
    }

    /**
     * DragStartBehavior
     * <p>
     * Component of type DragStartBehavior.
     * 
     */
    public void setDragStartBehavior(TextfieldSchema.DragStartBehaviorSchema dragStartBehavior) {
        this.dragStartBehavior = dragStartBehavior;
    }

    public TextfieldSchema withDragStartBehavior(TextfieldSchema.DragStartBehaviorSchema dragStartBehavior) {
        this.dragStartBehavior = dragStartBehavior;
        return this;
    }

    /**
     * Whether the text field is enabled.
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Whether the text field is enabled.
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public TextfieldSchema withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Whether to enable user interface options to change the text selection.
     * 
     */
    public Boolean getEnableInteractiveSelection() {
        return enableInteractiveSelection;
    }

    /**
     * Whether to enable user interface options to change the text selection.
     * 
     */
    public void setEnableInteractiveSelection(Boolean enableInteractiveSelection) {
        this.enableInteractiveSelection = enableInteractiveSelection;
    }

    public TextfieldSchema withEnableInteractiveSelection(Boolean enableInteractiveSelection) {
        this.enableInteractiveSelection = enableInteractiveSelection;
        return this;
    }

    /**
     * Whether the TextField is sized to fill its parent.
     * 
     */
    public Boolean getExpands() {
        return expands;
    }

    /**
     * Whether the TextField is sized to fill its parent.
     * 
     */
    public void setExpands(Boolean expands) {
        this.expands = expands;
    }

    public TextfieldSchema withExpands(Boolean expands) {
        this.expands = expands;
        return this;
    }

    /**
     * textInputType
     * <p>
     * Element of textInput Type
     * 
     */
    public TextInputTypeSchema getKeyboardType() {
        return keyboardType;
    }

    /**
     * textInputType
     * <p>
     * Element of textInput Type
     * 
     */
    public void setKeyboardType(TextInputTypeSchema keyboardType) {
        this.keyboardType = keyboardType;
    }

    public TextfieldSchema withKeyboardType(TextInputTypeSchema keyboardType) {
        this.keyboardType = keyboardType;
        return this;
    }

    /**
     * The maximum number of characters to allow in the text field.
     * 
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * The maximum number of characters to allow in the text field.
     * 
     */
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public TextfieldSchema withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * MaxLengthEnforcement
     * <p>
     * Component of type MaxLengthEnforcement.
     * 
     */
    public TextfieldSchema.MaxLengthEnforcementSchema getMaxLengthEnforcement() {
        return maxLengthEnforcement;
    }

    /**
     * MaxLengthEnforcement
     * <p>
     * Component of type MaxLengthEnforcement.
     * 
     */
    public void setMaxLengthEnforcement(TextfieldSchema.MaxLengthEnforcementSchema maxLengthEnforcement) {
        this.maxLengthEnforcement = maxLengthEnforcement;
    }

    public TextfieldSchema withMaxLengthEnforcement(TextfieldSchema.MaxLengthEnforcementSchema maxLengthEnforcement) {
        this.maxLengthEnforcement = maxLengthEnforcement;
        return this;
    }

    /**
     * The maximum number of lines to show at one time.
     * 
     */
    public Integer getMaxLines() {
        return maxLines;
    }

    /**
     * The maximum number of lines to show at one time.
     * 
     */
    public void setMaxLines(Integer maxLines) {
        this.maxLines = maxLines;
    }

    public TextfieldSchema withMaxLines(Integer maxLines) {
        this.maxLines = maxLines;
        return this;
    }

    /**
     * The minimum number of lines to occupy on the screen.
     * 
     */
    public Integer getMinLines() {
        return minLines;
    }

    /**
     * The minimum number of lines to occupy on the screen.
     * 
     */
    public void setMinLines(Integer minLines) {
        this.minLines = minLines;
    }

    public TextfieldSchema withMinLines(Integer minLines) {
        this.minLines = minLines;
        return this;
    }

    /**
     * Whether to hide the text being edited.
     * 
     */
    public Boolean getObscureText() {
        return obscureText;
    }

    /**
     * Whether to hide the text being edited.
     * 
     */
    public void setObscureText(Boolean obscureText) {
        this.obscureText = obscureText;
    }

    public TextfieldSchema withObscureText(Boolean obscureText) {
        this.obscureText = obscureText;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnAppPrivateCommand() {
        return onAppPrivateCommand;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnAppPrivateCommand(ListenerSchema onAppPrivateCommand) {
        this.onAppPrivateCommand = onAppPrivateCommand;
    }

    public TextfieldSchema withOnAppPrivateCommand(ListenerSchema onAppPrivateCommand) {
        this.onAppPrivateCommand = onAppPrivateCommand;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnChanged() {
        return onChanged;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnChanged(ListenerSchema onChanged) {
        this.onChanged = onChanged;
    }

    public TextfieldSchema withOnChanged(ListenerSchema onChanged) {
        this.onChanged = onChanged;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnEditingComplete() {
        return onEditingComplete;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnEditingComplete(ListenerSchema onEditingComplete) {
        this.onEditingComplete = onEditingComplete;
    }

    public TextfieldSchema withOnEditingComplete(ListenerSchema onEditingComplete) {
        this.onEditingComplete = onEditingComplete;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnSubmitted() {
        return onSubmitted;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnSubmitted(ListenerSchema onSubmitted) {
        this.onSubmitted = onSubmitted;
    }

    public TextfieldSchema withOnSubmitted(ListenerSchema onSubmitted) {
        this.onSubmitted = onSubmitted;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnTap() {
        return onTap;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnTap(ListenerSchema onTap) {
        this.onTap = onTap;
    }

    public TextfieldSchema withOnTap(ListenerSchema onTap) {
        this.onTap = onTap;
        return this;
    }

    /**
     * Whether the text can be changed.
     * 
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * Whether the text can be changed.
     * 
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public TextfieldSchema withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Whether to show the cursor.
     * 
     */
    public Boolean getShowCursor() {
        return showCursor;
    }

    /**
     * Whether to show the cursor.
     * 
     */
    public void setShowCursor(Boolean showCursor) {
        this.showCursor = showCursor;
    }

    public TextfieldSchema withShowCursor(Boolean showCursor) {
        this.showCursor = showCursor;
        return this;
    }

    /**
     * TextCapitalization
     * <p>
     * Component of type TextCapitalization.
     * 
     */
    public TextfieldSchema.TextCapitalizationSchema getTextCapitalization() {
        return textCapitalization;
    }

    /**
     * TextCapitalization
     * <p>
     * Component of type TextCapitalization.
     * 
     */
    public void setTextCapitalization(TextfieldSchema.TextCapitalizationSchema textCapitalization) {
        this.textCapitalization = textCapitalization;
    }

    public TextfieldSchema withTextCapitalization(TextfieldSchema.TextCapitalizationSchema textCapitalization) {
        this.textCapitalization = textCapitalization;
        return this;
    }

    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    public io.lenra.components.FlexSchema.TextDirectionSchema getTextDirection() {
        return textDirection;
    }

    /**
     * Text Direction
     * <p>
     * In which direction the elements should be placed following the horizontal
     * axis.
     * 
     */
    public void setTextDirection(io.lenra.components.FlexSchema.TextDirectionSchema textDirection) {
        this.textDirection = textDirection;
    }

    public TextfieldSchema withTextDirection(io.lenra.components.FlexSchema.TextDirectionSchema textDirection) {
        this.textDirection = textDirection;
        return this;
    }

    /**
     * TextInputAction
     * <p>
     * Component of type TextInputAction.
     * 
     */
    public TextfieldSchema.TextInputActionSchema getTextInputAction() {
        return textInputAction;
    }

    /**
     * TextInputAction
     * <p>
     * Component of type TextInputAction.
     * 
     */
    public void setTextInputAction(TextfieldSchema.TextInputActionSchema textInputAction) {
        this.textInputAction = textInputAction;
    }

    public TextfieldSchema withTextInputAction(TextfieldSchema.TextInputActionSchema textInputAction) {
        this.textInputAction = textInputAction;
        return this;
    }

    /**
     * toolbarOptions
     * <p>
     * Element of type toolbar options
     * 
     */
    public ToolbarOptionsSchema getToolbarOptions() {
        return toolbarOptions;
    }

    /**
     * toolbarOptions
     * <p>
     * Element of type toolbar options
     * 
     */
    public void setToolbarOptions(ToolbarOptionsSchema toolbarOptions) {
        this.toolbarOptions = toolbarOptions;
    }

    public TextfieldSchema withToolbarOptions(ToolbarOptionsSchema toolbarOptions) {
        this.toolbarOptions = toolbarOptions;
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

    public TextfieldSchema withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextfieldSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null) ? "<null>" : this.value));
        sb.append(',');
        sb.append("autocorrect");
        sb.append('=');
        sb.append(((this.autocorrect == null) ? "<null>" : this.autocorrect));
        sb.append(',');
        sb.append("autofillHints");
        sb.append('=');
        sb.append(((this.autofillHints == null) ? "<null>" : this.autofillHints));
        sb.append(',');
        sb.append("autofocus");
        sb.append('=');
        sb.append(((this.autofocus == null) ? "<null>" : this.autofocus));
        sb.append(',');
        sb.append("buildCounter");
        sb.append('=');
        sb.append(((this.buildCounter == null) ? "<null>" : this.buildCounter));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null) ? "<null>" : this.style));
        sb.append(',');
        sb.append("dragStartBehavior");
        sb.append('=');
        sb.append(((this.dragStartBehavior == null) ? "<null>" : this.dragStartBehavior));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null) ? "<null>" : this.enabled));
        sb.append(',');
        sb.append("enableInteractiveSelection");
        sb.append('=');
        sb.append(((this.enableInteractiveSelection == null) ? "<null>" : this.enableInteractiveSelection));
        sb.append(',');
        sb.append("expands");
        sb.append('=');
        sb.append(((this.expands == null) ? "<null>" : this.expands));
        sb.append(',');
        sb.append("keyboardType");
        sb.append('=');
        sb.append(((this.keyboardType == null) ? "<null>" : this.keyboardType));
        sb.append(',');
        sb.append("maxLength");
        sb.append('=');
        sb.append(((this.maxLength == null) ? "<null>" : this.maxLength));
        sb.append(',');
        sb.append("maxLengthEnforcement");
        sb.append('=');
        sb.append(((this.maxLengthEnforcement == null) ? "<null>" : this.maxLengthEnforcement));
        sb.append(',');
        sb.append("maxLines");
        sb.append('=');
        sb.append(((this.maxLines == null) ? "<null>" : this.maxLines));
        sb.append(',');
        sb.append("minLines");
        sb.append('=');
        sb.append(((this.minLines == null) ? "<null>" : this.minLines));
        sb.append(',');
        sb.append("obscureText");
        sb.append('=');
        sb.append(((this.obscureText == null) ? "<null>" : this.obscureText));
        sb.append(',');
        sb.append("onAppPrivateCommand");
        sb.append('=');
        sb.append(((this.onAppPrivateCommand == null) ? "<null>" : this.onAppPrivateCommand));
        sb.append(',');
        sb.append("onChanged");
        sb.append('=');
        sb.append(((this.onChanged == null) ? "<null>" : this.onChanged));
        sb.append(',');
        sb.append("onEditingComplete");
        sb.append('=');
        sb.append(((this.onEditingComplete == null) ? "<null>" : this.onEditingComplete));
        sb.append(',');
        sb.append("onSubmitted");
        sb.append('=');
        sb.append(((this.onSubmitted == null) ? "<null>" : this.onSubmitted));
        sb.append(',');
        sb.append("onTap");
        sb.append('=');
        sb.append(((this.onTap == null) ? "<null>" : this.onTap));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null) ? "<null>" : this.readOnly));
        sb.append(',');
        sb.append("showCursor");
        sb.append('=');
        sb.append(((this.showCursor == null) ? "<null>" : this.showCursor));
        sb.append(',');
        sb.append("textCapitalization");
        sb.append('=');
        sb.append(((this.textCapitalization == null) ? "<null>" : this.textCapitalization));
        sb.append(',');
        sb.append("textDirection");
        sb.append('=');
        sb.append(((this.textDirection == null) ? "<null>" : this.textDirection));
        sb.append(',');
        sb.append("textInputAction");
        sb.append('=');
        sb.append(((this.textInputAction == null) ? "<null>" : this.textInputAction));
        sb.append(',');
        sb.append("toolbarOptions");
        sb.append('=');
        sb.append(((this.toolbarOptions == null) ? "<null>" : this.toolbarOptions));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
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
        result = ((result * 31) + ((this.toolbarOptions == null) ? 0 : this.toolbarOptions.hashCode()));
        result = ((result * 31) + ((this.maxLengthEnforcement == null) ? 0 : this.maxLengthEnforcement.hashCode()));
        result = ((result * 31) + ((this.textCapitalization == null) ? 0 : this.textCapitalization.hashCode()));
        result = ((result * 31) + ((this.onEditingComplete == null) ? 0 : this.onEditingComplete.hashCode()));
        result = ((result * 31) + ((this.onTap == null) ? 0 : this.onTap.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.enabled == null) ? 0 : this.enabled.hashCode()));
        result = ((result * 31) + ((this.autocorrect == null) ? 0 : this.autocorrect.hashCode()));
        result = ((result * 31) + ((this.onAppPrivateCommand == null) ? 0 : this.onAppPrivateCommand.hashCode()));
        result = ((result * 31) + ((this.textDirection == null) ? 0 : this.textDirection.hashCode()));
        result = ((result * 31)
                + ((this.enableInteractiveSelection == null) ? 0 : this.enableInteractiveSelection.hashCode()));
        result = ((result * 31) + ((this.value == null) ? 0 : this.value.hashCode()));
        result = ((result * 31) + ((this.showCursor == null) ? 0 : this.showCursor.hashCode()));
        result = ((result * 31) + ((this.obscureText == null) ? 0 : this.obscureText.hashCode()));
        result = ((result * 31) + ((this.buildCounter == null) ? 0 : this.buildCounter.hashCode()));
        result = ((result * 31) + ((this.onChanged == null) ? 0 : this.onChanged.hashCode()));
        result = ((result * 31) + ((this.readOnly == null) ? 0 : this.readOnly.hashCode()));
        result = ((result * 31) + ((this.expands == null) ? 0 : this.expands.hashCode()));
        result = ((result * 31) + ((this.autofocus == null) ? 0 : this.autofocus.hashCode()));
        result = ((result * 31) + ((this.minLines == null) ? 0 : this.minLines.hashCode()));
        result = ((result * 31) + ((this.onSubmitted == null) ? 0 : this.onSubmitted.hashCode()));
        result = ((result * 31) + ((this.textInputAction == null) ? 0 : this.textInputAction.hashCode()));
        result = ((result * 31) + ((this.dragStartBehavior == null) ? 0 : this.dragStartBehavior.hashCode()));
        result = ((result * 31) + ((this.keyboardType == null) ? 0 : this.keyboardType.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.autofillHints == null) ? 0 : this.autofillHints.hashCode()));
        result = ((result * 31) + ((this.maxLines == null) ? 0 : this.maxLines.hashCode()));
        result = ((result * 31) + ((this.style == null) ? 0 : this.style.hashCode()));
        result = ((result * 31) + ((this.maxLength == null) ? 0 : this.maxLength.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TextfieldSchema) == false) {
            return false;
        }
        TextfieldSchema rhs = ((TextfieldSchema) other);
        return ((((((((((((((((((((((((((((((this.toolbarOptions == rhs.toolbarOptions)
                || ((this.toolbarOptions != null) && this.toolbarOptions.equals(rhs.toolbarOptions)))
                && ((this.maxLengthEnforcement == rhs.maxLengthEnforcement) || ((this.maxLengthEnforcement != null)
                        && this.maxLengthEnforcement.equals(rhs.maxLengthEnforcement))))
                && ((this.textCapitalization == rhs.textCapitalization) || ((this.textCapitalization != null)
                        && this.textCapitalization.equals(rhs.textCapitalization))))
                && ((this.onEditingComplete == rhs.onEditingComplete)
                        || ((this.onEditingComplete != null) && this.onEditingComplete.equals(rhs.onEditingComplete))))
                && ((this.onTap == rhs.onTap) || ((this.onTap != null) && this.onTap.equals(rhs.onTap))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.enabled == rhs.enabled) || ((this.enabled != null) && this.enabled.equals(rhs.enabled))))
                && ((this.autocorrect == rhs.autocorrect)
                        || ((this.autocorrect != null) && this.autocorrect.equals(rhs.autocorrect))))
                && ((this.onAppPrivateCommand == rhs.onAppPrivateCommand) || ((this.onAppPrivateCommand != null)
                        && this.onAppPrivateCommand.equals(rhs.onAppPrivateCommand))))
                && ((this.textDirection == rhs.textDirection)
                        || ((this.textDirection != null) && this.textDirection.equals(rhs.textDirection))))
                && ((this.enableInteractiveSelection == rhs.enableInteractiveSelection)
                        || ((this.enableInteractiveSelection != null)
                                && this.enableInteractiveSelection.equals(rhs.enableInteractiveSelection))))
                && ((this.value == rhs.value) || ((this.value != null) && this.value.equals(rhs.value))))
                && ((this.showCursor == rhs.showCursor)
                        || ((this.showCursor != null) && this.showCursor.equals(rhs.showCursor))))
                && ((this.obscureText == rhs.obscureText)
                        || ((this.obscureText != null) && this.obscureText.equals(rhs.obscureText))))
                && ((this.buildCounter == rhs.buildCounter)
                        || ((this.buildCounter != null) && this.buildCounter.equals(rhs.buildCounter))))
                && ((this.onChanged == rhs.onChanged)
                        || ((this.onChanged != null) && this.onChanged.equals(rhs.onChanged))))
                && ((this.readOnly == rhs.readOnly) || ((this.readOnly != null) && this.readOnly.equals(rhs.readOnly))))
                && ((this.expands == rhs.expands) || ((this.expands != null) && this.expands.equals(rhs.expands))))
                && ((this.autofocus == rhs.autofocus)
                        || ((this.autofocus != null) && this.autofocus.equals(rhs.autofocus))))
                && ((this.minLines == rhs.minLines) || ((this.minLines != null) && this.minLines.equals(rhs.minLines))))
                && ((this.onSubmitted == rhs.onSubmitted)
                        || ((this.onSubmitted != null) && this.onSubmitted.equals(rhs.onSubmitted))))
                && ((this.textInputAction == rhs.textInputAction)
                        || ((this.textInputAction != null) && this.textInputAction.equals(rhs.textInputAction))))
                && ((this.dragStartBehavior == rhs.dragStartBehavior)
                        || ((this.dragStartBehavior != null) && this.dragStartBehavior.equals(rhs.dragStartBehavior))))
                && ((this.keyboardType == rhs.keyboardType)
                        || ((this.keyboardType != null) && this.keyboardType.equals(rhs.keyboardType))))
                && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
                && ((this.autofillHints == rhs.autofillHints)
                        || ((this.autofillHints != null) && this.autofillHints.equals(rhs.autofillHints))))
                && ((this.maxLines == rhs.maxLines) || ((this.maxLines != null) && this.maxLines.equals(rhs.maxLines))))
                && ((this.style == rhs.style) || ((this.style != null) && this.style.equals(rhs.style))))
                && ((this.maxLength == rhs.maxLength)
                        || ((this.maxLength != null) && this.maxLength.equals(rhs.maxLength))));
    }

    /**
     * DragStartBehavior
     * <p>
     * Component of type DragStartBehavior.
     * 
     */
    public enum DragStartBehaviorSchema {

        @SerializedName("start")
        START("start"),
        @SerializedName("down")
        DOWN("down");

        private final String value;
        private final static Map<String, TextfieldSchema.DragStartBehaviorSchema> CONSTANTS = new HashMap<String, TextfieldSchema.DragStartBehaviorSchema>();

        static {
            for (TextfieldSchema.DragStartBehaviorSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DragStartBehaviorSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TextfieldSchema.DragStartBehaviorSchema fromValue(String value) {
            TextfieldSchema.DragStartBehaviorSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * MaxLengthEnforcement
     * <p>
     * Component of type MaxLengthEnforcement.
     * 
     */
    public enum MaxLengthEnforcementSchema {

        @SerializedName("none")
        NONE("none"),
        @SerializedName("enforced")
        ENFORCED("enforced"),
        @SerializedName("truncateAfterCompositionEnds")
        TRUNCATE_AFTER_COMPOSITION_ENDS("truncateAfterCompositionEnds");

        private final String value;
        private final static Map<String, TextfieldSchema.MaxLengthEnforcementSchema> CONSTANTS = new HashMap<String, TextfieldSchema.MaxLengthEnforcementSchema>();

        static {
            for (TextfieldSchema.MaxLengthEnforcementSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MaxLengthEnforcementSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TextfieldSchema.MaxLengthEnforcementSchema fromValue(String value) {
            TextfieldSchema.MaxLengthEnforcementSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * TextCapitalization
     * <p>
     * Component of type TextCapitalization.
     * 
     */
    public enum TextCapitalizationSchema {

        @SerializedName("none")
        NONE("none"),
        @SerializedName("words")
        WORDS("words"),
        @SerializedName("sentences")
        SENTENCES("sentences"),
        @SerializedName("characters")
        CHARACTERS("characters");

        private final String value;
        private final static Map<String, TextfieldSchema.TextCapitalizationSchema> CONSTANTS = new HashMap<String, TextfieldSchema.TextCapitalizationSchema>();

        static {
            for (TextfieldSchema.TextCapitalizationSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TextCapitalizationSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TextfieldSchema.TextCapitalizationSchema fromValue(String value) {
            TextfieldSchema.TextCapitalizationSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * TextInputAction
     * <p>
     * Component of type TextInputAction.
     * 
     */
    public enum TextInputActionSchema {

        @SerializedName("continueAction")
        CONTINUE_ACTION("continueAction"),
        @SerializedName("done")
        DONE("done"),
        @SerializedName("emergencyCall")
        EMERGENCY_CALL("emergencyCall"),
        @SerializedName("go")
        GO("go"),
        @SerializedName("join")
        JOIN("join"),
        @SerializedName("newline")
        NEWLINE("newline"),
        @SerializedName("next")
        NEXT("next"),
        @SerializedName("none")
        NONE("none"),
        @SerializedName("previous")
        PREVIOUS("previous"),
        @SerializedName("route")
        ROUTE("route"),
        @SerializedName("search")
        SEARCH("search"),
        @SerializedName("send")
        SEND("send"),
        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        private final String value;
        private final static Map<String, TextfieldSchema.TextInputActionSchema> CONSTANTS = new HashMap<String, TextfieldSchema.TextInputActionSchema>();

        static {
            for (TextfieldSchema.TextInputActionSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TextInputActionSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TextfieldSchema.TextInputActionSchema fromValue(String value) {
            TextfieldSchema.TextInputActionSchema constant = CONSTANTS.get(value);
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

        @SerializedName("textfield")
        TEXTFIELD("textfield");

        private final String value;
        private final static Map<String, TextfieldSchema.Type> CONSTANTS = new HashMap<String, TextfieldSchema.Type>();

        static {
            for (TextfieldSchema.Type c : values()) {
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

        public static TextfieldSchema.Type fromValue(String value) {
            TextfieldSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
