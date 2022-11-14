
package lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * BoxConstraints
 * <p>
 * Element of type BoxConstraints
 * 
 */
public class BoxConstraintsSchema {

    /**
     * The minWidth of the constraint
     * 
     */
    @SerializedName("minWidth")
    @Expose
    private Double minWidth = 0.0D;
    /**
     * The maxWidth of the constraint, -1 means Infinity
     * 
     */
    @SerializedName("maxWidth")
    @Expose
    private Double maxWidth = -1.0D;
    /**
     * The minHeight of the constraint
     * 
     */
    @SerializedName("minHeight")
    @Expose
    private Double minHeight = 0.0D;
    /**
     * The maxHeight of the constraint, -1 means Infinity
     * 
     */
    @SerializedName("maxHeight")
    @Expose
    private Double maxHeight = -1.0D;

    /**
     * The minWidth of the constraint
     * 
     */
    public Double getMinWidth() {
        return minWidth;
    }

    /**
     * The minWidth of the constraint
     * 
     */
    public void setMinWidth(Double minWidth) {
        this.minWidth = minWidth;
    }

    public BoxConstraintsSchema withMinWidth(Double minWidth) {
        this.minWidth = minWidth;
        return this;
    }

    /**
     * The maxWidth of the constraint, -1 means Infinity
     * 
     */
    public Double getMaxWidth() {
        return maxWidth;
    }

    /**
     * The maxWidth of the constraint, -1 means Infinity
     * 
     */
    public void setMaxWidth(Double maxWidth) {
        this.maxWidth = maxWidth;
    }

    public BoxConstraintsSchema withMaxWidth(Double maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    /**
     * The minHeight of the constraint
     * 
     */
    public Double getMinHeight() {
        return minHeight;
    }

    /**
     * The minHeight of the constraint
     * 
     */
    public void setMinHeight(Double minHeight) {
        this.minHeight = minHeight;
    }

    public BoxConstraintsSchema withMinHeight(Double minHeight) {
        this.minHeight = minHeight;
        return this;
    }

    /**
     * The maxHeight of the constraint, -1 means Infinity
     * 
     */
    public Double getMaxHeight() {
        return maxHeight;
    }

    /**
     * The maxHeight of the constraint, -1 means Infinity
     * 
     */
    public void setMaxHeight(Double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public BoxConstraintsSchema withMaxHeight(Double maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BoxConstraintsSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("minWidth");
        sb.append('=');
        sb.append(((this.minWidth == null) ? "<null>" : this.minWidth));
        sb.append(',');
        sb.append("maxWidth");
        sb.append('=');
        sb.append(((this.maxWidth == null) ? "<null>" : this.maxWidth));
        sb.append(',');
        sb.append("minHeight");
        sb.append('=');
        sb.append(((this.minHeight == null) ? "<null>" : this.minHeight));
        sb.append(',');
        sb.append("maxHeight");
        sb.append('=');
        sb.append(((this.maxHeight == null) ? "<null>" : this.maxHeight));
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
        result = ((result * 31) + ((this.minHeight == null) ? 0 : this.minHeight.hashCode()));
        result = ((result * 31) + ((this.minWidth == null) ? 0 : this.minWidth.hashCode()));
        result = ((result * 31) + ((this.maxHeight == null) ? 0 : this.maxHeight.hashCode()));
        result = ((result * 31) + ((this.maxWidth == null) ? 0 : this.maxWidth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BoxConstraintsSchema) == false) {
            return false;
        }
        BoxConstraintsSchema rhs = ((BoxConstraintsSchema) other);
        return (((((this.minHeight == rhs.minHeight)
                || ((this.minHeight != null) && this.minHeight.equals(rhs.minHeight)))
                && ((this.minWidth == rhs.minWidth) || ((this.minWidth != null) && this.minWidth.equals(rhs.minWidth))))
                && ((this.maxHeight == rhs.maxHeight)
                        || ((this.maxHeight != null) && this.maxHeight.equals(rhs.maxHeight))))
                && ((this.maxWidth == rhs.maxWidth)
                        || ((this.maxWidth != null) && this.maxWidth.equals(rhs.maxWidth))));
    }

}
