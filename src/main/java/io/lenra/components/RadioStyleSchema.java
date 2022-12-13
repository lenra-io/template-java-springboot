
package lenra.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Radio Style
 * <p>
 * Element of type RadioStyle
 * 
 */
public class RadioStyleSchema {

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("activeColor")
    @Expose
    private Integer activeColor;
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
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("hovercolor")
    @Expose
    private Integer hovercolor;
    /**
     * The splash radius of the radio button
     * 
     */
    @SerializedName("splashRadius")
    @Expose
    private Double splashRadius;
    /**
     * VisualDensity
     * <p>
     * The visual density of UI components.
     * 
     */
    @SerializedName("visualDensity")
    @Expose
    private lenra.components.CheckboxStyleSchema.VisualDensitySchema visualDensity = lenra.components.CheckboxStyleSchema.VisualDensitySchema.fromValue("standard");

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getActiveColor() {
        return activeColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setActiveColor(Integer activeColor) {
        this.activeColor = activeColor;
    }

    public RadioStyleSchema withActiveColor(Integer activeColor) {
        this.activeColor = activeColor;
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

    public RadioStyleSchema withFocusColor(Integer focusColor) {
        this.focusColor = focusColor;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getHovercolor() {
        return hovercolor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setHovercolor(Integer hovercolor) {
        this.hovercolor = hovercolor;
    }

    public RadioStyleSchema withHovercolor(Integer hovercolor) {
        this.hovercolor = hovercolor;
        return this;
    }

    /**
     * The splash radius of the radio button
     * 
     */
    public Double getSplashRadius() {
        return splashRadius;
    }

    /**
     * The splash radius of the radio button
     * 
     */
    public void setSplashRadius(Double splashRadius) {
        this.splashRadius = splashRadius;
    }

    public RadioStyleSchema withSplashRadius(Double splashRadius) {
        this.splashRadius = splashRadius;
        return this;
    }

    /**
     * VisualDensity
     * <p>
     * The visual density of UI components.
     * 
     */
    public lenra.components.CheckboxStyleSchema.VisualDensitySchema getVisualDensity() {
        return visualDensity;
    }

    /**
     * VisualDensity
     * <p>
     * The visual density of UI components.
     * 
     */
    public void setVisualDensity(lenra.components.CheckboxStyleSchema.VisualDensitySchema visualDensity) {
        this.visualDensity = visualDensity;
    }

    public RadioStyleSchema withVisualDensity(lenra.components.CheckboxStyleSchema.VisualDensitySchema visualDensity) {
        this.visualDensity = visualDensity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RadioStyleSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeColor");
        sb.append('=');
        sb.append(((this.activeColor == null)?"<null>":this.activeColor));
        sb.append(',');
        sb.append("focusColor");
        sb.append('=');
        sb.append(((this.focusColor == null)?"<null>":this.focusColor));
        sb.append(',');
        sb.append("hovercolor");
        sb.append('=');
        sb.append(((this.hovercolor == null)?"<null>":this.hovercolor));
        sb.append(',');
        sb.append("splashRadius");
        sb.append('=');
        sb.append(((this.splashRadius == null)?"<null>":this.splashRadius));
        sb.append(',');
        sb.append("visualDensity");
        sb.append('=');
        sb.append(((this.visualDensity == null)?"<null>":this.visualDensity));
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
        result = ((result* 31)+((this.visualDensity == null)? 0 :this.visualDensity.hashCode()));
        result = ((result* 31)+((this.activeColor == null)? 0 :this.activeColor.hashCode()));
        result = ((result* 31)+((this.focusColor == null)? 0 :this.focusColor.hashCode()));
        result = ((result* 31)+((this.hovercolor == null)? 0 :this.hovercolor.hashCode()));
        result = ((result* 31)+((this.splashRadius == null)? 0 :this.splashRadius.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RadioStyleSchema) == false) {
            return false;
        }
        RadioStyleSchema rhs = ((RadioStyleSchema) other);
        return ((((((this.visualDensity == rhs.visualDensity)||((this.visualDensity!= null)&&this.visualDensity.equals(rhs.visualDensity)))&&((this.activeColor == rhs.activeColor)||((this.activeColor!= null)&&this.activeColor.equals(rhs.activeColor))))&&((this.focusColor == rhs.focusColor)||((this.focusColor!= null)&&this.focusColor.equals(rhs.focusColor))))&&((this.hovercolor == rhs.hovercolor)||((this.hovercolor!= null)&&this.hovercolor.equals(rhs.hovercolor))))&&((this.splashRadius == rhs.splashRadius)||((this.splashRadius!= null)&&this.splashRadius.equals(rhs.splashRadius))));
    }

}
