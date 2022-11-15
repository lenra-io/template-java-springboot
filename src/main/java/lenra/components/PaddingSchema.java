
package lenra.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Padding
 * <p>
 * Element of type Padding
 * 
 */
public class PaddingSchema {

    @SerializedName("top")
    @Expose
    private Double top = 0.0D;
    @SerializedName("left")
    @Expose
    private Double left = 0.0D;
    @SerializedName("bottom")
    @Expose
    private Double bottom = 0.0D;
    @SerializedName("right")
    @Expose
    private Double right = 0.0D;

    public Double getTop() {
        return top;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    public PaddingSchema withTop(Double top) {
        this.top = top;
        return this;
    }

    public Double getLeft() {
        return left;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    public PaddingSchema withLeft(Double left) {
        this.left = left;
        return this;
    }

    public Double getBottom() {
        return bottom;
    }

    public void setBottom(Double bottom) {
        this.bottom = bottom;
    }

    public PaddingSchema withBottom(Double bottom) {
        this.bottom = bottom;
        return this;
    }

    public Double getRight() {
        return right;
    }

    public void setRight(Double right) {
        this.right = right;
    }

    public PaddingSchema withRight(Double right) {
        this.right = right;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaddingSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("top");
        sb.append('=');
        sb.append(((this.top == null)?"<null>":this.top));
        sb.append(',');
        sb.append("left");
        sb.append('=');
        sb.append(((this.left == null)?"<null>":this.left));
        sb.append(',');
        sb.append("bottom");
        sb.append('=');
        sb.append(((this.bottom == null)?"<null>":this.bottom));
        sb.append(',');
        sb.append("right");
        sb.append('=');
        sb.append(((this.right == null)?"<null>":this.right));
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
        result = ((result* 31)+((this.right == null)? 0 :this.right.hashCode()));
        result = ((result* 31)+((this.top == null)? 0 :this.top.hashCode()));
        result = ((result* 31)+((this.left == null)? 0 :this.left.hashCode()));
        result = ((result* 31)+((this.bottom == null)? 0 :this.bottom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaddingSchema) == false) {
            return false;
        }
        PaddingSchema rhs = ((PaddingSchema) other);
        return (((((this.right == rhs.right)||((this.right!= null)&&this.right.equals(rhs.right)))&&((this.top == rhs.top)||((this.top!= null)&&this.top.equals(rhs.top))))&&((this.left == rhs.left)||((this.left!= null)&&this.left.equals(rhs.left))))&&((this.bottom == rhs.bottom)||((this.bottom!= null)&&this.bottom.equals(rhs.bottom))));
    }

}
