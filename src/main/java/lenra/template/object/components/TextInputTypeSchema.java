
package lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * textInputType
 * <p>
 * Element of textInput Type
 * 
 */
public class TextInputTypeSchema {

    /**
     * Whether to show copy option in toolbar
     * 
     */
    @SerializedName("copy")
    @Expose
    private Boolean copy;
    /**
     * Whether to show cut option in toolbar
     * 
     */
    @SerializedName("cut")
    @Expose
    private Boolean cut;
    /**
     * Whether to show past option in toolbar
     * 
     */
    @SerializedName("paste")
    @Expose
    private Boolean paste;
    /**
     * Whether to show select all option in toolbar
     * 
     */
    @SerializedName("selectAll")
    @Expose
    private Boolean selectAll;

    /**
     * Whether to show copy option in toolbar
     * 
     */
    public Boolean getCopy() {
        return copy;
    }

    /**
     * Whether to show copy option in toolbar
     * 
     */
    public void setCopy(Boolean copy) {
        this.copy = copy;
    }

    public TextInputTypeSchema withCopy(Boolean copy) {
        this.copy = copy;
        return this;
    }

    /**
     * Whether to show cut option in toolbar
     * 
     */
    public Boolean getCut() {
        return cut;
    }

    /**
     * Whether to show cut option in toolbar
     * 
     */
    public void setCut(Boolean cut) {
        this.cut = cut;
    }

    public TextInputTypeSchema withCut(Boolean cut) {
        this.cut = cut;
        return this;
    }

    /**
     * Whether to show past option in toolbar
     * 
     */
    public Boolean getPaste() {
        return paste;
    }

    /**
     * Whether to show past option in toolbar
     * 
     */
    public void setPaste(Boolean paste) {
        this.paste = paste;
    }

    public TextInputTypeSchema withPaste(Boolean paste) {
        this.paste = paste;
        return this;
    }

    /**
     * Whether to show select all option in toolbar
     * 
     */
    public Boolean getSelectAll() {
        return selectAll;
    }

    /**
     * Whether to show select all option in toolbar
     * 
     */
    public void setSelectAll(Boolean selectAll) {
        this.selectAll = selectAll;
    }

    public TextInputTypeSchema withSelectAll(Boolean selectAll) {
        this.selectAll = selectAll;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextInputTypeSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("copy");
        sb.append('=');
        sb.append(((this.copy == null) ? "<null>" : this.copy));
        sb.append(',');
        sb.append("cut");
        sb.append('=');
        sb.append(((this.cut == null) ? "<null>" : this.cut));
        sb.append(',');
        sb.append("paste");
        sb.append('=');
        sb.append(((this.paste == null) ? "<null>" : this.paste));
        sb.append(',');
        sb.append("selectAll");
        sb.append('=');
        sb.append(((this.selectAll == null) ? "<null>" : this.selectAll));
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
        result = ((result * 31) + ((this.selectAll == null) ? 0 : this.selectAll.hashCode()));
        result = ((result * 31) + ((this.copy == null) ? 0 : this.copy.hashCode()));
        result = ((result * 31) + ((this.cut == null) ? 0 : this.cut.hashCode()));
        result = ((result * 31) + ((this.paste == null) ? 0 : this.paste.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TextInputTypeSchema) == false) {
            return false;
        }
        TextInputTypeSchema rhs = ((TextInputTypeSchema) other);
        return (((((this.selectAll == rhs.selectAll)
                || ((this.selectAll != null) && this.selectAll.equals(rhs.selectAll)))
                && ((this.copy == rhs.copy) || ((this.copy != null) && this.copy.equals(rhs.copy))))
                && ((this.cut == rhs.cut) || ((this.cut != null) && this.cut.equals(rhs.cut))))
                && ((this.paste == rhs.paste) || ((this.paste != null) && this.paste.equals(rhs.paste))));
    }

}
