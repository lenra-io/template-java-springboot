
package lenra.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * BorderRadius
 * <p>
 * Element of type BorderRadius
 * 
 */
public class BorderRadiusSchema {

    @SerializedName("topLeft")
    @Expose
    private RadiusType topLeft;
    @SerializedName("topRight")
    @Expose
    private RadiusType topRight;
    @SerializedName("bottomLeft")
    @Expose
    private RadiusType bottomLeft;
    @SerializedName("bottomRight")
    @Expose
    private RadiusType bottomRight;

    public RadiusType getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(RadiusType topLeft) {
        this.topLeft = topLeft;
    }

    public BorderRadiusSchema withTopLeft(RadiusType topLeft) {
        this.topLeft = topLeft;
        return this;
    }

    public RadiusType getTopRight() {
        return topRight;
    }

    public void setTopRight(RadiusType topRight) {
        this.topRight = topRight;
    }

    public BorderRadiusSchema withTopRight(RadiusType topRight) {
        this.topRight = topRight;
        return this;
    }

    public RadiusType getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(RadiusType bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public BorderRadiusSchema withBottomLeft(RadiusType bottomLeft) {
        this.bottomLeft = bottomLeft;
        return this;
    }

    public RadiusType getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(RadiusType bottomRight) {
        this.bottomRight = bottomRight;
    }

    public BorderRadiusSchema withBottomRight(RadiusType bottomRight) {
        this.bottomRight = bottomRight;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BorderRadiusSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topLeft");
        sb.append('=');
        sb.append(((this.topLeft == null)?"<null>":this.topLeft));
        sb.append(',');
        sb.append("topRight");
        sb.append('=');
        sb.append(((this.topRight == null)?"<null>":this.topRight));
        sb.append(',');
        sb.append("bottomLeft");
        sb.append('=');
        sb.append(((this.bottomLeft == null)?"<null>":this.bottomLeft));
        sb.append(',');
        sb.append("bottomRight");
        sb.append('=');
        sb.append(((this.bottomRight == null)?"<null>":this.bottomRight));
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
        result = ((result* 31)+((this.topRight == null)? 0 :this.topRight.hashCode()));
        result = ((result* 31)+((this.bottomLeft == null)? 0 :this.bottomLeft.hashCode()));
        result = ((result* 31)+((this.bottomRight == null)? 0 :this.bottomRight.hashCode()));
        result = ((result* 31)+((this.topLeft == null)? 0 :this.topLeft.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BorderRadiusSchema) == false) {
            return false;
        }
        BorderRadiusSchema rhs = ((BorderRadiusSchema) other);
        return (((((this.topRight == rhs.topRight)||((this.topRight!= null)&&this.topRight.equals(rhs.topRight)))&&((this.bottomLeft == rhs.bottomLeft)||((this.bottomLeft!= null)&&this.bottomLeft.equals(rhs.bottomLeft))))&&((this.bottomRight == rhs.bottomRight)||((this.bottomRight!= null)&&this.bottomRight.equals(rhs.bottomRight))))&&((this.topLeft == rhs.topLeft)||((this.topLeft!= null)&&this.topLeft.equals(rhs.topLeft))));
    }

}
