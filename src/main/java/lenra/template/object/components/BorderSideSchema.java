
package lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * BorderSide
 * <p>
 * Element of type BorderSide
 * 
 */
public class BorderSideSchema {

    /**
     * The width of the Border
     * 
     */
    @SerializedName("width")
    @Expose
    private Double width = 1.0D;
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
     * The width of the Border
     * 
     */
    public Double getWidth() {
        return width;
    }

    /**
     * The width of the Border
     * 
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    public BorderSideSchema withWidth(Double width) {
        this.width = width;
        return this;
    }

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

    public BorderSideSchema withColor(Integer color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BorderSideSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null) ? "<null>" : this.width));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null) ? "<null>" : this.color));
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
        result = ((result * 31) + ((this.color == null) ? 0 : this.color.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BorderSideSchema) == false) {
            return false;
        }
        BorderSideSchema rhs = ((BorderSideSchema) other);
        return (((this.width == rhs.width) || ((this.width != null) && this.width.equals(rhs.width)))
                && ((this.color == rhs.color) || ((this.color != null) && this.color.equals(rhs.color))));
    }

}
