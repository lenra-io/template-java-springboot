
package lenra.template.object.components;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Contains
 * <p>
 * Contains query identifier
 * 
 */
public class ContainsSchema {

    @SerializedName("$contains")
    @Expose
    private List<Object> $contains = new ArrayList<Object>();

    public List<Object> get$contains() {
        return $contains;
    }

    public void set$contains(List<Object> $contains) {
        this.$contains = $contains;
    }

    public ContainsSchema with$contains(List<Object> $contains) {
        this.$contains = $contains;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContainsSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("$contains");
        sb.append('=');
        sb.append(((this.$contains == null) ? "<null>" : this.$contains));
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
        result = ((result * 31) + ((this.$contains == null) ? 0 : this.$contains.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainsSchema) == false) {
            return false;
        }
        ContainsSchema rhs = ((ContainsSchema) other);
        return ((this.$contains == rhs.$contains)
                || ((this.$contains != null) && this.$contains.equals(rhs.$contains)));
    }

}
