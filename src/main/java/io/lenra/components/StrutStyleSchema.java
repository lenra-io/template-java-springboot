
package io.lenra.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * StrutStyle
 * <p>
 * Defines the strut of a text line.
 * 
 */
public class StrutStyleSchema {

    /**
     * A label to help identify this strut style.
     * 
     */
    @SerializedName("debugLabel")
    @Expose
    private String debugLabel;
    /**
     * The font family to use for this strut style.
     * 
     */
    @SerializedName("fontFamily")
    @Expose
    private String fontFamily;
    /**
     * A list of fallback font families to use for this strut style.
     * 
     */
    @SerializedName("fontFamilyFallback")
    @Expose
    private List<Object> fontFamilyFallback = new ArrayList<Object>();
    /**
     * The font size to use for this strut style.
     * 
     */
    @SerializedName("fontSize")
    @Expose
    private Double fontSize;
    /**
     * The font weight to use for this strut style.
     * 
     */
    @SerializedName("fontWeight")
    @Expose
    private String fontWeight;
    /**
     * Whether to force the strut height.
     * 
     */
    @SerializedName("forceStrutHeight")
    @Expose
    private Boolean forceStrutHeight;
    /**
     * The minimum height of the strut.
     * 
     */
    @SerializedName("height")
    @Expose
    private Double height;
    /**
     * The additional leading of the strut which is a multiple of fontSize.
     * 
     */
    @SerializedName("leading")
    @Expose
    private Double leading;
    /**
     * TextLeadingDitribution
     * <p>
     * The TextLeadingDistribution enum.
     * 
     */
    @SerializedName("leadingDistribution")
    @Expose
    private StrutStyleSchema.TextLeadingDistributionSchema leadingDistribution = StrutStyleSchema.TextLeadingDistributionSchema
            .fromValue("even");

    /**
     * A label to help identify this strut style.
     * 
     */
    public String getDebugLabel() {
        return debugLabel;
    }

    /**
     * A label to help identify this strut style.
     * 
     */
    public void setDebugLabel(String debugLabel) {
        this.debugLabel = debugLabel;
    }

    public StrutStyleSchema withDebugLabel(String debugLabel) {
        this.debugLabel = debugLabel;
        return this;
    }

    /**
     * The font family to use for this strut style.
     * 
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * The font family to use for this strut style.
     * 
     */
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public StrutStyleSchema withFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    /**
     * A list of fallback font families to use for this strut style.
     * 
     */
    public List<Object> getFontFamilyFallback() {
        return fontFamilyFallback;
    }

    /**
     * A list of fallback font families to use for this strut style.
     * 
     */
    public void setFontFamilyFallback(List<Object> fontFamilyFallback) {
        this.fontFamilyFallback = fontFamilyFallback;
    }

    public StrutStyleSchema withFontFamilyFallback(List<Object> fontFamilyFallback) {
        this.fontFamilyFallback = fontFamilyFallback;
        return this;
    }

    /**
     * The font size to use for this strut style.
     * 
     */
    public Double getFontSize() {
        return fontSize;
    }

    /**
     * The font size to use for this strut style.
     * 
     */
    public void setFontSize(Double fontSize) {
        this.fontSize = fontSize;
    }

    public StrutStyleSchema withFontSize(Double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * The font weight to use for this strut style.
     * 
     */
    public String getFontWeight() {
        return fontWeight;
    }

    /**
     * The font weight to use for this strut style.
     * 
     */
    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    public StrutStyleSchema withFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    /**
     * Whether to force the strut height.
     * 
     */
    public Boolean getForceStrutHeight() {
        return forceStrutHeight;
    }

    /**
     * Whether to force the strut height.
     * 
     */
    public void setForceStrutHeight(Boolean forceStrutHeight) {
        this.forceStrutHeight = forceStrutHeight;
    }

    public StrutStyleSchema withForceStrutHeight(Boolean forceStrutHeight) {
        this.forceStrutHeight = forceStrutHeight;
        return this;
    }

    /**
     * The minimum height of the strut.
     * 
     */
    public Double getHeight() {
        return height;
    }

    /**
     * The minimum height of the strut.
     * 
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    public StrutStyleSchema withHeight(Double height) {
        this.height = height;
        return this;
    }

    /**
     * The additional leading of the strut which is a multiple of fontSize.
     * 
     */
    public Double getLeading() {
        return leading;
    }

    /**
     * The additional leading of the strut which is a multiple of fontSize.
     * 
     */
    public void setLeading(Double leading) {
        this.leading = leading;
    }

    public StrutStyleSchema withLeading(Double leading) {
        this.leading = leading;
        return this;
    }

    /**
     * TextLeadingDitribution
     * <p>
     * The TextLeadingDistribution enum.
     * 
     */
    public StrutStyleSchema.TextLeadingDistributionSchema getLeadingDistribution() {
        return leadingDistribution;
    }

    /**
     * TextLeadingDitribution
     * <p>
     * The TextLeadingDistribution enum.
     * 
     */
    public void setLeadingDistribution(StrutStyleSchema.TextLeadingDistributionSchema leadingDistribution) {
        this.leadingDistribution = leadingDistribution;
    }

    public StrutStyleSchema withLeadingDistribution(
            StrutStyleSchema.TextLeadingDistributionSchema leadingDistribution) {
        this.leadingDistribution = leadingDistribution;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StrutStyleSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("debugLabel");
        sb.append('=');
        sb.append(((this.debugLabel == null) ? "<null>" : this.debugLabel));
        sb.append(',');
        sb.append("fontFamily");
        sb.append('=');
        sb.append(((this.fontFamily == null) ? "<null>" : this.fontFamily));
        sb.append(',');
        sb.append("fontFamilyFallback");
        sb.append('=');
        sb.append(((this.fontFamilyFallback == null) ? "<null>" : this.fontFamilyFallback));
        sb.append(',');
        sb.append("fontSize");
        sb.append('=');
        sb.append(((this.fontSize == null) ? "<null>" : this.fontSize));
        sb.append(',');
        sb.append("fontWeight");
        sb.append('=');
        sb.append(((this.fontWeight == null) ? "<null>" : this.fontWeight));
        sb.append(',');
        sb.append("forceStrutHeight");
        sb.append('=');
        sb.append(((this.forceStrutHeight == null) ? "<null>" : this.forceStrutHeight));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null) ? "<null>" : this.height));
        sb.append(',');
        sb.append("leading");
        sb.append('=');
        sb.append(((this.leading == null) ? "<null>" : this.leading));
        sb.append(',');
        sb.append("leadingDistribution");
        sb.append('=');
        sb.append(((this.leadingDistribution == null) ? "<null>" : this.leadingDistribution));
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
        result = ((result * 31) + ((this.fontFamily == null) ? 0 : this.fontFamily.hashCode()));
        result = ((result * 31) + ((this.leading == null) ? 0 : this.leading.hashCode()));
        result = ((result * 31) + ((this.leadingDistribution == null) ? 0 : this.leadingDistribution.hashCode()));
        result = ((result * 31) + ((this.debugLabel == null) ? 0 : this.debugLabel.hashCode()));
        result = ((result * 31) + ((this.fontSize == null) ? 0 : this.fontSize.hashCode()));
        result = ((result * 31) + ((this.forceStrutHeight == null) ? 0 : this.forceStrutHeight.hashCode()));
        result = ((result * 31) + ((this.fontWeight == null) ? 0 : this.fontWeight.hashCode()));
        result = ((result * 31) + ((this.fontFamilyFallback == null) ? 0 : this.fontFamilyFallback.hashCode()));
        result = ((result * 31) + ((this.height == null) ? 0 : this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StrutStyleSchema) == false) {
            return false;
        }
        StrutStyleSchema rhs = ((StrutStyleSchema) other);
        return ((((((((((this.fontFamily == rhs.fontFamily)
                || ((this.fontFamily != null) && this.fontFamily.equals(rhs.fontFamily)))
                && ((this.leading == rhs.leading) || ((this.leading != null) && this.leading.equals(rhs.leading))))
                && ((this.leadingDistribution == rhs.leadingDistribution) || ((this.leadingDistribution != null)
                        && this.leadingDistribution.equals(rhs.leadingDistribution))))
                && ((this.debugLabel == rhs.debugLabel)
                        || ((this.debugLabel != null) && this.debugLabel.equals(rhs.debugLabel))))
                && ((this.fontSize == rhs.fontSize) || ((this.fontSize != null) && this.fontSize.equals(rhs.fontSize))))
                && ((this.forceStrutHeight == rhs.forceStrutHeight)
                        || ((this.forceStrutHeight != null) && this.forceStrutHeight.equals(rhs.forceStrutHeight))))
                && ((this.fontWeight == rhs.fontWeight)
                        || ((this.fontWeight != null) && this.fontWeight.equals(rhs.fontWeight))))
                && ((this.fontFamilyFallback == rhs.fontFamilyFallback) || ((this.fontFamilyFallback != null)
                        && this.fontFamilyFallback.equals(rhs.fontFamilyFallback))))
                && ((this.height == rhs.height) || ((this.height != null) && this.height.equals(rhs.height))));
    }

    /**
     * TextLeadingDitribution
     * <p>
     * The TextLeadingDistribution enum.
     * 
     */
    public enum TextLeadingDistributionSchema {

        @SerializedName("even")
        EVEN("even"),
        @SerializedName("proportional")
        PROPORTIONAL("proportional");

        private final String value;
        private final static Map<String, StrutStyleSchema.TextLeadingDistributionSchema> CONSTANTS = new HashMap<String, StrutStyleSchema.TextLeadingDistributionSchema>();

        static {
            for (StrutStyleSchema.TextLeadingDistributionSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TextLeadingDistributionSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static StrutStyleSchema.TextLeadingDistributionSchema fromValue(String value) {
            StrutStyleSchema.TextLeadingDistributionSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
