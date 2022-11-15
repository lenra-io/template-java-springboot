
package io.lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Query
 * <p>
 * Query query identifier
 * 
 */
public class QuerySchema {

    /**
     * ShortAnd
     * <p>
     * ShortAnd query identifier
     * 
     */
    @SerializedName("$find")
    @Expose
    private ShortAndSchema $find;

    /**
     * ShortAnd
     * <p>
     * ShortAnd query identifier
     * 
     */
    public ShortAndSchema get$find() {
        return $find;
    }

    /**
     * ShortAnd
     * <p>
     * ShortAnd query identifier
     * 
     */
    public void set$find(ShortAndSchema $find) {
        this.$find = $find;
    }

    public QuerySchema with$find(ShortAndSchema $find) {
        this.$find = $find;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuerySchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("$find");
        sb.append('=');
        sb.append(((this.$find == null) ? "<null>" : this.$find));
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
        result = ((result * 31) + ((this.$find == null) ? 0 : this.$find.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuerySchema) == false) {
            return false;
        }
        QuerySchema rhs = ((QuerySchema) other);
        return ((this.$find == rhs.$find) || ((this.$find != null) && this.$find.equals(rhs.$find)));
    }

}
