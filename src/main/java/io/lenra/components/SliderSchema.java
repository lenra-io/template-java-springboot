
package lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Slider
 * <p>
 * Element of type Slider
 * 
 */
public class SliderSchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private SliderSchema.Type type;
    /**
     * SliderStyle
     * <p>
     * Element of type SliderStyle
     * 
     */
    @SerializedName("style")
    @Expose
    private SliderStyleSchema style;
    /**
     * Whether the slider should be focused initially.
     * 
     */
    @SerializedName("autofocus")
    @Expose
    private Boolean autofocus = false;
    /**
     * The number of divisions to show on the slider.
     * 
     */
    @SerializedName("divisions")
    @Expose
    private Double divisions;
    /**
     * The label of the slider.
     * 
     */
    @SerializedName("label")
    @Expose
    private String label;
    /**
     * The minimum value of the slider.
     * 
     */
    @SerializedName("min")
    @Expose
    private Double min = 0.0D;
    /**
     * The maximum value of the slider.
     * 
     */
    @SerializedName("max")
    @Expose
    private Double max = 1.0D;
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
    @SerializedName("onChangeEnd")
    @Expose
    private ListenerSchema onChangeEnd;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onChangeStart")
    @Expose
    private ListenerSchema onChangeStart;
    /**
     * The current value of the slider.
     * 
     */
    @SerializedName("value")
    @Expose
    private Double value = 0.0D;
    /**
     * The name that will be used in the form.
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public SliderSchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(SliderSchema.Type type) {
        this.type = type;
    }

    public SliderSchema withType(SliderSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * SliderStyle
     * <p>
     * Element of type SliderStyle
     * 
     */
    public SliderStyleSchema getStyle() {
        return style;
    }

    /**
     * SliderStyle
     * <p>
     * Element of type SliderStyle
     * 
     */
    public void setStyle(SliderStyleSchema style) {
        this.style = style;
    }

    public SliderSchema withStyle(SliderStyleSchema style) {
        this.style = style;
        return this;
    }

    /**
     * Whether the slider should be focused initially.
     * 
     */
    public Boolean getAutofocus() {
        return autofocus;
    }

    /**
     * Whether the slider should be focused initially.
     * 
     */
    public void setAutofocus(Boolean autofocus) {
        this.autofocus = autofocus;
    }

    public SliderSchema withAutofocus(Boolean autofocus) {
        this.autofocus = autofocus;
        return this;
    }

    /**
     * The number of divisions to show on the slider.
     * 
     */
    public Double getDivisions() {
        return divisions;
    }

    /**
     * The number of divisions to show on the slider.
     * 
     */
    public void setDivisions(Double divisions) {
        this.divisions = divisions;
    }

    public SliderSchema withDivisions(Double divisions) {
        this.divisions = divisions;
        return this;
    }

    /**
     * The label of the slider.
     * 
     */
    public String getLabel() {
        return label;
    }

    /**
     * The label of the slider.
     * 
     */
    public void setLabel(String label) {
        this.label = label;
    }

    public SliderSchema withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * The minimum value of the slider.
     * 
     */
    public Double getMin() {
        return min;
    }

    /**
     * The minimum value of the slider.
     * 
     */
    public void setMin(Double min) {
        this.min = min;
    }

    public SliderSchema withMin(Double min) {
        this.min = min;
        return this;
    }

    /**
     * The maximum value of the slider.
     * 
     */
    public Double getMax() {
        return max;
    }

    /**
     * The maximum value of the slider.
     * 
     */
    public void setMax(Double max) {
        this.max = max;
    }

    public SliderSchema withMax(Double max) {
        this.max = max;
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

    public SliderSchema withOnChanged(ListenerSchema onChanged) {
        this.onChanged = onChanged;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnChangeEnd() {
        return onChangeEnd;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnChangeEnd(ListenerSchema onChangeEnd) {
        this.onChangeEnd = onChangeEnd;
    }

    public SliderSchema withOnChangeEnd(ListenerSchema onChangeEnd) {
        this.onChangeEnd = onChangeEnd;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnChangeStart() {
        return onChangeStart;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnChangeStart(ListenerSchema onChangeStart) {
        this.onChangeStart = onChangeStart;
    }

    public SliderSchema withOnChangeStart(ListenerSchema onChangeStart) {
        this.onChangeStart = onChangeStart;
        return this;
    }

    /**
     * The current value of the slider.
     * 
     */
    public Double getValue() {
        return value;
    }

    /**
     * The current value of the slider.
     * 
     */
    public void setValue(Double value) {
        this.value = value;
    }

    public SliderSchema withValue(Double value) {
        this.value = value;
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

    public SliderSchema withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SliderSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("autofocus");
        sb.append('=');
        sb.append(((this.autofocus == null)?"<null>":this.autofocus));
        sb.append(',');
        sb.append("divisions");
        sb.append('=');
        sb.append(((this.divisions == null)?"<null>":this.divisions));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("min");
        sb.append('=');
        sb.append(((this.min == null)?"<null>":this.min));
        sb.append(',');
        sb.append("max");
        sb.append('=');
        sb.append(((this.max == null)?"<null>":this.max));
        sb.append(',');
        sb.append("onChanged");
        sb.append('=');
        sb.append(((this.onChanged == null)?"<null>":this.onChanged));
        sb.append(',');
        sb.append("onChangeEnd");
        sb.append('=');
        sb.append(((this.onChangeEnd == null)?"<null>":this.onChangeEnd));
        sb.append(',');
        sb.append("onChangeStart");
        sb.append('=');
        sb.append(((this.onChangeStart == null)?"<null>":this.onChangeStart));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.onChanged == null)? 0 :this.onChanged.hashCode()));
        result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.onChangeEnd == null)? 0 :this.onChangeEnd.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.autofocus == null)? 0 :this.autofocus.hashCode()));
        result = ((result* 31)+((this.divisions == null)? 0 :this.divisions.hashCode()));
        result = ((result* 31)+((this.min == null)? 0 :this.min.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.onChangeStart == null)? 0 :this.onChangeStart.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SliderSchema) == false) {
            return false;
        }
        SliderSchema rhs = ((SliderSchema) other);
        return (((((((((((((this.onChanged == rhs.onChanged)||((this.onChanged!= null)&&this.onChanged.equals(rhs.onChanged)))&&((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.onChangeEnd == rhs.onChangeEnd)||((this.onChangeEnd!= null)&&this.onChangeEnd.equals(rhs.onChangeEnd))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.autofocus == rhs.autofocus)||((this.autofocus!= null)&&this.autofocus.equals(rhs.autofocus))))&&((this.divisions == rhs.divisions)||((this.divisions!= null)&&this.divisions.equals(rhs.divisions))))&&((this.min == rhs.min)||((this.min!= null)&&this.min.equals(rhs.min))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.onChangeStart == rhs.onChangeStart)||((this.onChangeStart!= null)&&this.onChangeStart.equals(rhs.onChangeStart))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }


    /**
     * The identifier of the component
     * 
     */
    public enum Type {

        @SerializedName("slider")
        SLIDER("slider");
        private final String value;
        private final static Map<String, SliderSchema.Type> CONSTANTS = new HashMap<String, SliderSchema.Type>();

        static {
            for (SliderSchema.Type c: values()) {
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

        public static SliderSchema.Type fromValue(String value) {
            SliderSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
