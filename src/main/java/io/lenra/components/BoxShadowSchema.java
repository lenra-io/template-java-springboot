
package io.lenra.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * BoxShadow
 * <p>
 * Element of type BoxShadow
 * 
 */
public class BoxShadowSchema {

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
     * The blur radius
     * 
     */
    @SerializedName("blurRadius")
    @Expose
    private Double blurRadius = 0.0D;
    /**
     * The spread radius
     * 
     */
    @SerializedName("spreadRadius")
    @Expose
    private Double spreadRadius = 0.0D;
    /**
     * Offset
     * <p>
     * Element of type Offset
     * 
     */
    @SerializedName("offset")
    @Expose
    private OffsetSchema offset;

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

    public BoxShadowSchema withColor(Integer color) {
        this.color = color;
        return this;
    }

    /**
     * The blur radius
     * 
     */
    public Double getBlurRadius() {
        return blurRadius;
    }

    /**
     * The blur radius
     * 
     */
    public void setBlurRadius(Double blurRadius) {
        this.blurRadius = blurRadius;
    }

    public BoxShadowSchema withBlurRadius(Double blurRadius) {
        this.blurRadius = blurRadius;
        return this;
    }

    /**
     * The spread radius
     * 
     */
    public Double getSpreadRadius() {
        return spreadRadius;
    }

    /**
     * The spread radius
     * 
     */
    public void setSpreadRadius(Double spreadRadius) {
        this.spreadRadius = spreadRadius;
    }

    public BoxShadowSchema withSpreadRadius(Double spreadRadius) {
        this.spreadRadius = spreadRadius;
        return this;
    }

    /**
     * Offset
     * <p>
     * Element of type Offset
     * 
     */
    public OffsetSchema getOffset() {
        return offset;
    }

    /**
     * Offset
     * <p>
     * Element of type Offset
     * 
     */
    public void setOffset(OffsetSchema offset) {
        this.offset = offset;
    }

    public BoxShadowSchema withOffset(OffsetSchema offset) {
        this.offset = offset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BoxShadowSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null) ? "<null>" : this.color));
        sb.append(',');
        sb.append("blurRadius");
        sb.append('=');
        sb.append(((this.blurRadius == null) ? "<null>" : this.blurRadius));
        sb.append(',');
        sb.append("spreadRadius");
        sb.append('=');
        sb.append(((this.spreadRadius == null) ? "<null>" : this.spreadRadius));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null) ? "<null>" : this.offset));
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
        result = ((result * 31) + ((this.spreadRadius == null) ? 0 : this.spreadRadius.hashCode()));
        result = ((result * 31) + ((this.color == null) ? 0 : this.color.hashCode()));
        result = ((result * 31) + ((this.offset == null) ? 0 : this.offset.hashCode()));
        result = ((result * 31) + ((this.blurRadius == null) ? 0 : this.blurRadius.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BoxShadowSchema) == false) {
            return false;
        }
        BoxShadowSchema rhs = ((BoxShadowSchema) other);
        return (((((this.spreadRadius == rhs.spreadRadius)
                || ((this.spreadRadius != null) && this.spreadRadius.equals(rhs.spreadRadius)))
                && ((this.color == rhs.color) || ((this.color != null) && this.color.equals(rhs.color))))
                && ((this.offset == rhs.offset) || ((this.offset != null) && this.offset.equals(rhs.offset))))
                && ((this.blurRadius == rhs.blurRadius)
                        || ((this.blurRadius != null) && this.blurRadius.equals(rhs.blurRadius))));
    }

}
