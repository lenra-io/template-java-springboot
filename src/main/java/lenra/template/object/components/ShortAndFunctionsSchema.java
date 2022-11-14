
package lenra.template.object.components;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * ShortAndFunctions
 * <p>
 * ShortAndFunctions query identifier
 * 
 */
public class ShortAndFunctionsSchema {

    /**
     * And
     * <p>
     * And query identifier
     * 
     */
    @SerializedName("$and")
    @Expose
    private List<ShortAndSchema> $and = new ArrayList<ShortAndSchema>();

    /**
     * And
     * <p>
     * And query identifier
     * 
     */
    public List<ShortAndSchema> get$and() {
        return $and;
    }

    /**
     * And
     * <p>
     * And query identifier
     * 
     */
    public void set$and(List<ShortAndSchema> $and) {
        this.$and = $and;
    }

    public ShortAndFunctionsSchema with$and(List<ShortAndSchema> $and) {
        this.$and = $and;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShortAndFunctionsSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$and");
        sb.append('=');
        sb.append(((this.$and == null) ? "<null>" : this.$and));
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
        result = ((result * 31) + ((this.$and == null) ? 0 : this.$and.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShortAndFunctionsSchema) == false) {
            return false;
        }
        ShortAndFunctionsSchema rhs = ((ShortAndFunctionsSchema) other);
        return ((this.$and == rhs.$and) || ((this.$and != null) && this.$and.equals(rhs.$and)));
    }

}
