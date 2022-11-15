
package io.lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Rect
 * <p>
 * Element of type Rect
 * 
 */
public class RectSchema {

    /**
     * The left position of the rectangle.
     * 
     */
    @SerializedName("left")
    @Expose
    private Double left;
    /**
     * The top position of the rectangle.
     * 
     */
    @SerializedName("top")
    @Expose
    private Double top;
    /**
     * The width of the rectangle.
     * 
     */
    @SerializedName("width")
    @Expose
    private Double width;
    /**
     * The height of the rectangle.
     * 
     */
    @SerializedName("height")
    @Expose
    private Double height;

    /**
     * The left position of the rectangle.
     * 
     */
    public Double getLeft() {
        return left;
    }

    /**
     * The left position of the rectangle.
     * 
     */
    public void setLeft(Double left) {
        this.left = left;
    }

    public RectSchema withLeft(Double left) {
        this.left = left;
        return this;
    }

    /**
     * The top position of the rectangle.
     * 
     */
    public Double getTop() {
        return top;
    }

    /**
     * The top position of the rectangle.
     * 
     */
    public void setTop(Double top) {
        this.top = top;
    }

    public RectSchema withTop(Double top) {
        this.top = top;
        return this;
    }

    /**
     * The width of the rectangle.
     * 
     */
    public Double getWidth() {
        return width;
    }

    /**
     * The width of the rectangle.
     * 
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    public RectSchema withWidth(Double width) {
        this.width = width;
        return this;
    }

    /**
     * The height of the rectangle.
     * 
     */
    public Double getHeight() {
        return height;
    }

    /**
     * The height of the rectangle.
     * 
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    public RectSchema withHeight(Double height) {
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RectSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("left");
        sb.append('=');
        sb.append(((this.left == null) ? "<null>" : this.left));
        sb.append(',');
        sb.append("top");
        sb.append('=');
        sb.append(((this.top == null) ? "<null>" : this.top));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null) ? "<null>" : this.width));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null) ? "<null>" : this.height));
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
        result = ((result * 31) + ((this.width == null) ? 0 : this.width.hashCode()));
        result = ((result * 31) + ((this.top == null) ? 0 : this.top.hashCode()));
        result = ((result * 31) + ((this.left == null) ? 0 : this.left.hashCode()));
        result = ((result * 31) + ((this.height == null) ? 0 : this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RectSchema) == false) {
            return false;
        }
        RectSchema rhs = ((RectSchema) other);
        return (((((this.width == rhs.width) || ((this.width != null) && this.width.equals(rhs.width)))
                && ((this.top == rhs.top) || ((this.top != null) && this.top.equals(rhs.top))))
                && ((this.left == rhs.left) || ((this.left != null) && this.left.equals(rhs.left))))
                && ((this.height == rhs.height) || ((this.height != null) && this.height.equals(rhs.height))));
    }

}
