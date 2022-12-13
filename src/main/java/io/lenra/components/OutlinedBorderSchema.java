
package lenra.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * OutlinedBorder
 * <p>
 * Element of type OutlinedBorder
 * 
 */
public class OutlinedBorderSchema {

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

    public OutlinedBorderSchema withSide(BorderSideSchema side) {
        this.side = side;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OutlinedBorderSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("side");
        sb.append('=');
        sb.append(((this.side == null)?"<null>":this.side));
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
        result = ((result* 31)+((this.side == null)? 0 :this.side.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OutlinedBorderSchema) == false) {
            return false;
        }
        OutlinedBorderSchema rhs = ((OutlinedBorderSchema) other);
        return ((this.side == rhs.side)||((this.side!= null)&&this.side.equals(rhs.side)));
    }

}
