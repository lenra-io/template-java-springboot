
package io.lenra.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * toolbarOptions
 * <p>
 * Element of type toolbar options
 * 
 */
public class ToolbarOptionsSchema {

    /**
     * The number is decimal, allowing a decimal point to provide fractional
     * 
     */
    @SerializedName("decimal")
    @Expose
    private Boolean decimal;
    /**
     * The number is signed, allowing a positive or negative sign at the start.
     * 
     */
    @SerializedName("signed")
    @Expose
    private Boolean signed;

    /**
     * The number is decimal, allowing a decimal point to provide fractional
     * 
     */
    public Boolean getDecimal() {
        return decimal;
    }

    /**
     * The number is decimal, allowing a decimal point to provide fractional
     * 
     */
    public void setDecimal(Boolean decimal) {
        this.decimal = decimal;
    }

    public ToolbarOptionsSchema withDecimal(Boolean decimal) {
        this.decimal = decimal;
        return this;
    }

    /**
     * The number is signed, allowing a positive or negative sign at the start.
     * 
     */
    public Boolean getSigned() {
        return signed;
    }

    /**
     * The number is signed, allowing a positive or negative sign at the start.
     * 
     */
    public void setSigned(Boolean signed) {
        this.signed = signed;
    }

    public ToolbarOptionsSchema withSigned(Boolean signed) {
        this.signed = signed;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolbarOptionsSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("decimal");
        sb.append('=');
        sb.append(((this.decimal == null) ? "<null>" : this.decimal));
        sb.append(',');
        sb.append("signed");
        sb.append('=');
        sb.append(((this.signed == null) ? "<null>" : this.signed));
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
        result = ((result * 31) + ((this.decimal == null) ? 0 : this.decimal.hashCode()));
        result = ((result * 31) + ((this.signed == null) ? 0 : this.signed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ToolbarOptionsSchema) == false) {
            return false;
        }
        ToolbarOptionsSchema rhs = ((ToolbarOptionsSchema) other);
        return (((this.decimal == rhs.decimal) || ((this.decimal != null) && this.decimal.equals(rhs.decimal)))
                && ((this.signed == rhs.signed) || ((this.signed != null) && this.signed.equals(rhs.signed))));
    }

}
