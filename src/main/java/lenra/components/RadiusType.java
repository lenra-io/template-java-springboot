
package lenra.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RadiusType {

    @SerializedName("x")
    @Expose
    private Double x = 0.0D;
    @SerializedName("y")
    @Expose
    private Double y = 0.0D;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public RadiusType withX(Double x) {
        this.x = x;
        return this;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public RadiusType withY(Double y) {
        this.y = y;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RadiusType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("x");
        sb.append('=');
        sb.append(((this.x == null)?"<null>":this.x));
        sb.append(',');
        sb.append("y");
        sb.append('=');
        sb.append(((this.y == null)?"<null>":this.y));
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
        result = ((result* 31)+((this.x == null)? 0 :this.x.hashCode()));
        result = ((result* 31)+((this.y == null)? 0 :this.y.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RadiusType) == false) {
            return false;
        }
        RadiusType rhs = ((RadiusType) other);
        return (((this.x == rhs.x)||((this.x!= null)&&this.x.equals(rhs.x)))&&((this.y == rhs.y)||((this.y!= null)&&this.y.equals(rhs.y))));
    }

}
