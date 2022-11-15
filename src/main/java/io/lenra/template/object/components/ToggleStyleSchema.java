
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * ToggleStyle
 * <p>
 * Element of type ToggleStyle
 * 
 */
public class ToggleStyleSchema {

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
    @SerializedName("activeTrackColor")
    @Expose
    private Integer activeTrackColor;
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("inactiveTrackColor")
    @Expose
    private Integer inactiveTrackColor;
    /**
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("inactiveThumbColor")
    @Expose
    private Integer inactiveThumbColor;
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
     * Color
     * <p>
     * Color type
     * 
     */
    @SerializedName("focusColor")
    @Expose
    private Integer focusColor;
    /**
     * Image
     * <p>
     * Element of type Image
     * 
     */
    @SerializedName("activeThumbImage")
    @Expose
    private ImageSchema activeThumbImage;
    /**
     * Image
     * <p>
     * Element of type Image
     * 
     */
    @SerializedName("inactiveThumbImage")
    @Expose
    private ImageSchema inactiveThumbImage;
    @SerializedName("materialTapTargetSize")
    @Expose
    private ToggleStyleSchema.MaterialTapTargetSize materialTapTargetSize;

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

    public ToggleStyleSchema withActiveColor(Integer activeColor) {
        this.activeColor = activeColor;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getActiveTrackColor() {
        return activeTrackColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setActiveTrackColor(Integer activeTrackColor) {
        this.activeTrackColor = activeTrackColor;
    }

    public ToggleStyleSchema withActiveTrackColor(Integer activeTrackColor) {
        this.activeTrackColor = activeTrackColor;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getInactiveTrackColor() {
        return inactiveTrackColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setInactiveTrackColor(Integer inactiveTrackColor) {
        this.inactiveTrackColor = inactiveTrackColor;
    }

    public ToggleStyleSchema withInactiveTrackColor(Integer inactiveTrackColor) {
        this.inactiveTrackColor = inactiveTrackColor;
        return this;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public Integer getInactiveThumbColor() {
        return inactiveThumbColor;
    }

    /**
     * Color
     * <p>
     * Color type
     * 
     */
    public void setInactiveThumbColor(Integer inactiveThumbColor) {
        this.inactiveThumbColor = inactiveThumbColor;
    }

    public ToggleStyleSchema withInactiveThumbColor(Integer inactiveThumbColor) {
        this.inactiveThumbColor = inactiveThumbColor;
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

    public ToggleStyleSchema withHoverColor(Integer hoverColor) {
        this.hoverColor = hoverColor;
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

    public ToggleStyleSchema withFocusColor(Integer focusColor) {
        this.focusColor = focusColor;
        return this;
    }

    /**
     * Image
     * <p>
     * Element of type Image
     * 
     */
    public ImageSchema getActiveThumbImage() {
        return activeThumbImage;
    }

    /**
     * Image
     * <p>
     * Element of type Image
     * 
     */
    public void setActiveThumbImage(ImageSchema activeThumbImage) {
        this.activeThumbImage = activeThumbImage;
    }

    public ToggleStyleSchema withActiveThumbImage(ImageSchema activeThumbImage) {
        this.activeThumbImage = activeThumbImage;
        return this;
    }

    /**
     * Image
     * <p>
     * Element of type Image
     * 
     */
    public ImageSchema getInactiveThumbImage() {
        return inactiveThumbImage;
    }

    /**
     * Image
     * <p>
     * Element of type Image
     * 
     */
    public void setInactiveThumbImage(ImageSchema inactiveThumbImage) {
        this.inactiveThumbImage = inactiveThumbImage;
    }

    public ToggleStyleSchema withInactiveThumbImage(ImageSchema inactiveThumbImage) {
        this.inactiveThumbImage = inactiveThumbImage;
        return this;
    }

    public ToggleStyleSchema.MaterialTapTargetSize getMaterialTapTargetSize() {
        return materialTapTargetSize;
    }

    public void setMaterialTapTargetSize(ToggleStyleSchema.MaterialTapTargetSize materialTapTargetSize) {
        this.materialTapTargetSize = materialTapTargetSize;
    }

    public ToggleStyleSchema withMaterialTapTargetSize(ToggleStyleSchema.MaterialTapTargetSize materialTapTargetSize) {
        this.materialTapTargetSize = materialTapTargetSize;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ToggleStyleSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeColor");
        sb.append('=');
        sb.append(((this.activeColor == null) ? "<null>" : this.activeColor));
        sb.append(',');
        sb.append("activeTrackColor");
        sb.append('=');
        sb.append(((this.activeTrackColor == null) ? "<null>" : this.activeTrackColor));
        sb.append(',');
        sb.append("inactiveTrackColor");
        sb.append('=');
        sb.append(((this.inactiveTrackColor == null) ? "<null>" : this.inactiveTrackColor));
        sb.append(',');
        sb.append("inactiveThumbColor");
        sb.append('=');
        sb.append(((this.inactiveThumbColor == null) ? "<null>" : this.inactiveThumbColor));
        sb.append(',');
        sb.append("hoverColor");
        sb.append('=');
        sb.append(((this.hoverColor == null) ? "<null>" : this.hoverColor));
        sb.append(',');
        sb.append("focusColor");
        sb.append('=');
        sb.append(((this.focusColor == null) ? "<null>" : this.focusColor));
        sb.append(',');
        sb.append("activeThumbImage");
        sb.append('=');
        sb.append(((this.activeThumbImage == null) ? "<null>" : this.activeThumbImage));
        sb.append(',');
        sb.append("inactiveThumbImage");
        sb.append('=');
        sb.append(((this.inactiveThumbImage == null) ? "<null>" : this.inactiveThumbImage));
        sb.append(',');
        sb.append("materialTapTargetSize");
        sb.append('=');
        sb.append(((this.materialTapTargetSize == null) ? "<null>" : this.materialTapTargetSize));
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
        result = ((result * 31) + ((this.activeColor == null) ? 0 : this.activeColor.hashCode()));
        result = ((result * 31) + ((this.focusColor == null) ? 0 : this.focusColor.hashCode()));
        result = ((result * 31) + ((this.inactiveThumbImage == null) ? 0 : this.inactiveThumbImage.hashCode()));
        result = ((result * 31) + ((this.inactiveTrackColor == null) ? 0 : this.inactiveTrackColor.hashCode()));
        result = ((result * 31) + ((this.hoverColor == null) ? 0 : this.hoverColor.hashCode()));
        result = ((result * 31) + ((this.activeThumbImage == null) ? 0 : this.activeThumbImage.hashCode()));
        result = ((result * 31) + ((this.inactiveThumbColor == null) ? 0 : this.inactiveThumbColor.hashCode()));
        result = ((result * 31) + ((this.materialTapTargetSize == null) ? 0 : this.materialTapTargetSize.hashCode()));
        result = ((result * 31) + ((this.activeTrackColor == null) ? 0 : this.activeTrackColor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ToggleStyleSchema) == false) {
            return false;
        }
        ToggleStyleSchema rhs = ((ToggleStyleSchema) other);
        return ((((((((((this.activeColor == rhs.activeColor)
                || ((this.activeColor != null) && this.activeColor.equals(rhs.activeColor)))
                && ((this.focusColor == rhs.focusColor)
                        || ((this.focusColor != null) && this.focusColor.equals(rhs.focusColor))))
                && ((this.inactiveThumbImage == rhs.inactiveThumbImage) || ((this.inactiveThumbImage != null)
                        && this.inactiveThumbImage.equals(rhs.inactiveThumbImage))))
                && ((this.inactiveTrackColor == rhs.inactiveTrackColor) || ((this.inactiveTrackColor != null)
                        && this.inactiveTrackColor.equals(rhs.inactiveTrackColor))))
                && ((this.hoverColor == rhs.hoverColor)
                        || ((this.hoverColor != null) && this.hoverColor.equals(rhs.hoverColor))))
                && ((this.activeThumbImage == rhs.activeThumbImage)
                        || ((this.activeThumbImage != null) && this.activeThumbImage.equals(rhs.activeThumbImage))))
                && ((this.inactiveThumbColor == rhs.inactiveThumbColor) || ((this.inactiveThumbColor != null)
                        && this.inactiveThumbColor.equals(rhs.inactiveThumbColor))))
                && ((this.materialTapTargetSize == rhs.materialTapTargetSize) || ((this.materialTapTargetSize != null)
                        && this.materialTapTargetSize.equals(rhs.materialTapTargetSize))))
                && ((this.activeTrackColor == rhs.activeTrackColor)
                        || ((this.activeTrackColor != null) && this.activeTrackColor.equals(rhs.activeTrackColor))));
    }

    public enum MaterialTapTargetSize {

        @SerializedName("padded")
        PADDED("padded"),
        @SerializedName("shrinkWrap")
        SHRINK_WRAP("shrinkWrap");

        private final String value;
        private final static Map<String, ToggleStyleSchema.MaterialTapTargetSize> CONSTANTS = new HashMap<String, ToggleStyleSchema.MaterialTapTargetSize>();

        static {
            for (ToggleStyleSchema.MaterialTapTargetSize c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MaterialTapTargetSize(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ToggleStyleSchema.MaterialTapTargetSize fromValue(String value) {
            ToggleStyleSchema.MaterialTapTargetSize constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
