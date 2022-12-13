
package io.lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * CheckboxStyle
 * <p>
 * Element of type CheckboxStyle
 * 
 */
public class CheckboxStyleSchema {

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
    @SerializedName("checkColor")
    @Expose
    private Integer checkColor;
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
    @SerializedName("hoverColor")
    @Expose
    private Integer hoverColor;
    /**
     * The splash radius.
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
    private CheckboxStyleSchema.VisualDensitySchema visualDensity = CheckboxStyleSchema.VisualDensitySchema
            .fromValue("standard");
    /**
     * OutlinedBorder
     * <p>
     * Element of type OutlinedBorder
     * 
     */
    @SerializedName("shape")
    @Expose
    private OutlinedBorderSchema shape;
    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    @SerializedName("side")
    @Expose
    private BorderSideSchema side;

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

    public CheckboxStyleSchema withActiveColor(Integer activeColor) {
        this.activeColor = activeColor;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getCheckColor() {
        return checkColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setCheckColor(Integer checkColor) {
        this.checkColor = checkColor;
    }

    public CheckboxStyleSchema withCheckColor(Integer checkColor) {
        this.checkColor = checkColor;
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

    public CheckboxStyleSchema withFocusColor(Integer focusColor) {
        this.focusColor = focusColor;
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

    public CheckboxStyleSchema withHoverColor(Integer hoverColor) {
        this.hoverColor = hoverColor;
        return this;
    }

    /**
     * The splash radius.
     * 
     */
    public Double getSplashRadius() {
        return splashRadius;
    }

    /**
     * The splash radius.
     * 
     */
    public void setSplashRadius(Double splashRadius) {
        this.splashRadius = splashRadius;
    }

    public CheckboxStyleSchema withSplashRadius(Double splashRadius) {
        this.splashRadius = splashRadius;
        return this;
    }

    /**
     * VisualDensity
     * <p>
     * The visual density of UI components.
     * 
     */
    public CheckboxStyleSchema.VisualDensitySchema getVisualDensity() {
        return visualDensity;
    }

    /**
     * VisualDensity
     * <p>
     * The visual density of UI components.
     * 
     */
    public void setVisualDensity(CheckboxStyleSchema.VisualDensitySchema visualDensity) {
        this.visualDensity = visualDensity;
    }

    public CheckboxStyleSchema withVisualDensity(CheckboxStyleSchema.VisualDensitySchema visualDensity) {
        this.visualDensity = visualDensity;
        return this;
    }

    /**
     * OutlinedBorder
     * <p>
     * Element of type OutlinedBorder
     * 
     */
    public OutlinedBorderSchema getShape() {
        return shape;
    }

    /**
     * OutlinedBorder
     * <p>
     * Element of type OutlinedBorder
     * 
     */
    public void setShape(OutlinedBorderSchema shape) {
        this.shape = shape;
    }

    public CheckboxStyleSchema withShape(OutlinedBorderSchema shape) {
        this.shape = shape;
        return this;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    public BorderSideSchema getSide() {
        return side;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    public void setSide(BorderSideSchema side) {
        this.side = side;
    }

    public CheckboxStyleSchema withSide(BorderSideSchema side) {
        this.side = side;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CheckboxStyleSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeColor");
        sb.append('=');
        sb.append(((this.activeColor == null) ? "<null>" : this.activeColor));
        sb.append(',');
        sb.append("checkColor");
        sb.append('=');
        sb.append(((this.checkColor == null) ? "<null>" : this.checkColor));
        sb.append(',');
        sb.append("focusColor");
        sb.append('=');
        sb.append(((this.focusColor == null) ? "<null>" : this.focusColor));
        sb.append(',');
        sb.append("hoverColor");
        sb.append('=');
        sb.append(((this.hoverColor == null) ? "<null>" : this.hoverColor));
        sb.append(',');
        sb.append("splashRadius");
        sb.append('=');
        sb.append(((this.splashRadius == null) ? "<null>" : this.splashRadius));
        sb.append(',');
        sb.append("visualDensity");
        sb.append('=');
        sb.append(((this.visualDensity == null) ? "<null>" : this.visualDensity));
        sb.append(',');
        sb.append("shape");
        sb.append('=');
        sb.append(((this.shape == null) ? "<null>" : this.shape));
        sb.append(',');
        sb.append("side");
        sb.append('=');
        sb.append(((this.side == null) ? "<null>" : this.side));
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
        result = ((result * 31) + ((this.side == null) ? 0 : this.side.hashCode()));
        result = ((result * 31) + ((this.activeColor == null) ? 0 : this.activeColor.hashCode()));
        result = ((result * 31) + ((this.shape == null) ? 0 : this.shape.hashCode()));
        result = ((result * 31) + ((this.checkColor == null) ? 0 : this.checkColor.hashCode()));
        result = ((result * 31) + ((this.focusColor == null) ? 0 : this.focusColor.hashCode()));
        result = ((result * 31) + ((this.visualDensity == null) ? 0 : this.visualDensity.hashCode()));
        result = ((result * 31) + ((this.hoverColor == null) ? 0 : this.hoverColor.hashCode()));
        result = ((result * 31) + ((this.splashRadius == null) ? 0 : this.splashRadius.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckboxStyleSchema) == false) {
            return false;
        }
        CheckboxStyleSchema rhs = ((CheckboxStyleSchema) other);
        return (((((((((this.side == rhs.side) || ((this.side != null) && this.side.equals(rhs.side)))
                && ((this.activeColor == rhs.activeColor)
                        || ((this.activeColor != null) && this.activeColor.equals(rhs.activeColor))))
                && ((this.shape == rhs.shape) || ((this.shape != null) && this.shape.equals(rhs.shape))))
                && ((this.checkColor == rhs.checkColor)
                        || ((this.checkColor != null) && this.checkColor.equals(rhs.checkColor))))
                && ((this.focusColor == rhs.focusColor)
                        || ((this.focusColor != null) && this.focusColor.equals(rhs.focusColor))))
                && ((this.visualDensity == rhs.visualDensity)
                        || ((this.visualDensity != null) && this.visualDensity.equals(rhs.visualDensity))))
                && ((this.hoverColor == rhs.hoverColor)
                        || ((this.hoverColor != null) && this.hoverColor.equals(rhs.hoverColor))))
                && ((this.splashRadius == rhs.splashRadius)
                        || ((this.splashRadius != null) && this.splashRadius.equals(rhs.splashRadius))));
    }

    /**
     * VisualDensity
     * <p>
     * The visual density of UI components.
     * 
     */
    public enum VisualDensitySchema {

        @SerializedName("comfortable")
        COMFORTABLE("comfortable"),
        @SerializedName("compact")
        COMPACT("compact"),
        @SerializedName("standard")
        STANDARD("standard");

        private final String value;
        private final static Map<String, CheckboxStyleSchema.VisualDensitySchema> CONSTANTS = new HashMap<String, CheckboxStyleSchema.VisualDensitySchema>();

        static {
            for (CheckboxStyleSchema.VisualDensitySchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        VisualDensitySchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CheckboxStyleSchema.VisualDensitySchema fromValue(String value) {
            CheckboxStyleSchema.VisualDensitySchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
