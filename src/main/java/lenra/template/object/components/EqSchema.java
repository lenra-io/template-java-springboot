
package lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Eq
 * <p>
 * Eq query identifier
 * 
 */
public class EqSchema {

    /**
     * Value
     * <p>
     * Value query identifier
     * 
     */
    @SerializedName("$eq")
    @Expose
    private Object $eq;

    /**
     * Value
     * <p>
     * Value query identifier
     * 
     */
    public Object get$eq() {
        return $eq;
    }

    /**
     * Value
     * <p>
     * Value query identifier
     * 
     */
    public void set$eq(Object $eq) {
        this.$eq = $eq;
    }

    public EqSchema with$eq(Object $eq) {
        this.$eq = $eq;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EqSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("$eq");
        sb.append('=');
        sb.append(((this.$eq == null) ? "<null>" : this.$eq));
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
        result = ((result * 31) + ((this.$eq == null) ? 0 : this.$eq.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EqSchema) == false) {
            return false;
        }
        EqSchema rhs = ((EqSchema) other);
        return ((this.$eq == rhs.$eq) || ((this.$eq != null) && this.$eq.equals(rhs.$eq)));
    }

}
