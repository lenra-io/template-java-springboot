
package lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Offset
 * <p>
 * Element of type Offset
 * 
 */
public class OffsetSchema {

    /**
     * The Offset along the x axis
     * 
     */
    @SerializedName("dx")
    @Expose
    private Double dx = 0.0D;
    /**
     * The Offset along the y axis
     * 
     */
    @SerializedName("dy")
    @Expose
    private Double dy = 0.0D;

    /**
     * The Offset along the x axis
     * 
     */
    public Double getDx() {
        return dx;
    }

    /**
     * The Offset along the x axis
     * 
     */
    public void setDx(Double dx) {
        this.dx = dx;
    }

    public OffsetSchema withDx(Double dx) {
        this.dx = dx;
        return this;
    }

    /**
     * The Offset along the y axis
     * 
     */
    public Double getDy() {
        return dy;
    }

    /**
     * The Offset along the y axis
     * 
     */
    public void setDy(Double dy) {
        this.dy = dy;
    }

    public OffsetSchema withDy(Double dy) {
        this.dy = dy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OffsetSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("dx");
        sb.append('=');
        sb.append(((this.dx == null) ? "<null>" : this.dx));
        sb.append(',');
        sb.append("dy");
        sb.append('=');
        sb.append(((this.dy == null) ? "<null>" : this.dy));
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
        result = ((result * 31) + ((this.dx == null) ? 0 : this.dx.hashCode()));
        result = ((result * 31) + ((this.dy == null) ? 0 : this.dy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OffsetSchema) == false) {
            return false;
        }
        OffsetSchema rhs = ((OffsetSchema) other);
        return (((this.dx == rhs.dx) || ((this.dx != null) && this.dx.equals(rhs.dx)))
                && ((this.dy == rhs.dy) || ((this.dy != null) && this.dy.equals(rhs.dy))));
    }

}
