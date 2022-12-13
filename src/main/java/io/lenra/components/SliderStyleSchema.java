
package io.lenra.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * SliderStyle
 * <p>
 * Element of type SliderStyle
 * 
 */
public class SliderStyleSchema {

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
    @SerializedName("inactiveColor")
    @Expose
    private Integer inactiveColor;
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("thumbColor")
    @Expose
    private Integer thumbColor;

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

    public SliderStyleSchema withActiveColor(Integer activeColor) {
        this.activeColor = activeColor;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getInactiveColor() {
        return inactiveColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setInactiveColor(Integer inactiveColor) {
        this.inactiveColor = inactiveColor;
    }

    public SliderStyleSchema withInactiveColor(Integer inactiveColor) {
        this.inactiveColor = inactiveColor;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getThumbColor() {
        return thumbColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setThumbColor(Integer thumbColor) {
        this.thumbColor = thumbColor;
    }

    public SliderStyleSchema withThumbColor(Integer thumbColor) {
        this.thumbColor = thumbColor;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SliderStyleSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeColor");
        sb.append('=');
        sb.append(((this.activeColor == null) ? "<null>" : this.activeColor));
        sb.append(',');
        sb.append("inactiveColor");
        sb.append('=');
        sb.append(((this.inactiveColor == null) ? "<null>" : this.inactiveColor));
        sb.append(',');
        sb.append("thumbColor");
        sb.append('=');
        sb.append(((this.thumbColor == null) ? "<null>" : this.thumbColor));
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
        result = ((result * 31) + ((this.thumbColor == null) ? 0 : this.thumbColor.hashCode()));
        result = ((result * 31) + ((this.inactiveColor == null) ? 0 : this.inactiveColor.hashCode()));
        result = ((result * 31) + ((this.activeColor == null) ? 0 : this.activeColor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SliderStyleSchema) == false) {
            return false;
        }
        SliderStyleSchema rhs = ((SliderStyleSchema) other);
        return ((((this.thumbColor == rhs.thumbColor)
                || ((this.thumbColor != null) && this.thumbColor.equals(rhs.thumbColor)))
                && ((this.inactiveColor == rhs.inactiveColor)
                        || ((this.inactiveColor != null) && this.inactiveColor.equals(rhs.inactiveColor))))
                && ((this.activeColor == rhs.activeColor)
                        || ((this.activeColor != null) && this.activeColor.equals(rhs.activeColor))));
    }

}
