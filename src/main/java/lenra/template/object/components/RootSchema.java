
package lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Ui
 * <p>
 * The main json object that represents the Lenra UI
 * 
 */
public class RootSchema {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("root")
    @Expose
    private Object root;

    /**
     * 
     * (Required)
     * 
     */
    public Object getRoot() {
        return root;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setRoot(Object root) {
        this.root = root;
    }

    public RootSchema withRoot(Object root) {
        this.root = root;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RootSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("root");
        sb.append('=');
        sb.append(((this.root == null) ? "<null>" : this.root));
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
        result = ((result * 31) + ((this.root == null) ? 0 : this.root.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RootSchema) == false) {
            return false;
        }
        RootSchema rhs = ((RootSchema) other);
        return ((this.root == rhs.root) || ((this.root != null) && this.root.equals(rhs.root)));
    }

}
