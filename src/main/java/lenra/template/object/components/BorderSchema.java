
package lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Border
 * <p>
 * Element of type Border
 * 
 */
public class BorderSchema {

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    @SerializedName("top")
    @Expose
    private BorderSideSchema top;
    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    @SerializedName("left")
    @Expose
    private BorderSideSchema left;
    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    @SerializedName("bottom")
    @Expose
    private BorderSideSchema bottom;
    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    @SerializedName("right")
    @Expose
    private BorderSideSchema right;

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    public BorderSideSchema getTop() {
        return top;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    public void setTop(BorderSideSchema top) {
        this.top = top;
    }

    public BorderSchema withTop(BorderSideSchema top) {
        this.top = top;
        return this;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    public BorderSideSchema getLeft() {
        return left;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    public void setLeft(BorderSideSchema left) {
        this.left = left;
    }

    public BorderSchema withLeft(BorderSideSchema left) {
        this.left = left;
        return this;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    public BorderSideSchema getBottom() {
        return bottom;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    public void setBottom(BorderSideSchema bottom) {
        this.bottom = bottom;
    }

    public BorderSchema withBottom(BorderSideSchema bottom) {
        this.bottom = bottom;
        return this;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    public BorderSideSchema getRight() {
        return right;
    }

    /**
     * BorderSide
     * <p>
     * Element of type BorderSide
     * 
     */
    public void setRight(BorderSideSchema right) {
        this.right = right;
    }

    public BorderSchema withRight(BorderSideSchema right) {
        this.right = right;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BorderSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("top");
        sb.append('=');
        sb.append(((this.top == null) ? "<null>" : this.top));
        sb.append(',');
        sb.append("left");
        sb.append('=');
        sb.append(((this.left == null) ? "<null>" : this.left));
        sb.append(',');
        sb.append("bottom");
        sb.append('=');
        sb.append(((this.bottom == null) ? "<null>" : this.bottom));
        sb.append(',');
        sb.append("right");
        sb.append('=');
        sb.append(((this.right == null) ? "<null>" : this.right));
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
        result = ((result * 31) + ((this.right == null) ? 0 : this.right.hashCode()));
        result = ((result * 31) + ((this.top == null) ? 0 : this.top.hashCode()));
        result = ((result * 31) + ((this.left == null) ? 0 : this.left.hashCode()));
        result = ((result * 31) + ((this.bottom == null) ? 0 : this.bottom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BorderSchema) == false) {
            return false;
        }
        BorderSchema rhs = ((BorderSchema) other);
        return (((((this.right == rhs.right) || ((this.right != null) && this.right.equals(rhs.right)))
                && ((this.top == rhs.top) || ((this.top != null) && this.top.equals(rhs.top))))
                && ((this.left == rhs.left) || ((this.left != null) && this.left.equals(rhs.left))))
                && ((this.bottom == rhs.bottom) || ((this.bottom != null) && this.bottom.equals(rhs.bottom))));
    }

}
