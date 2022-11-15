
package io.lenra.template.object.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Locale
 * <p>
 * Element of type locale
 * 
 */
public class LocaleSchema {

    /**
     * The region subtag for the locale.
     * 
     */
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    /**
     * The primary language subtag for the locale.
     * 
     */
    @SerializedName("languageCode")
    @Expose
    private String languageCode;
    /**
     * The script subtag for the locale.
     * 
     */
    @SerializedName("scriptCode")
    @Expose
    private String scriptCode;

    /**
     * The region subtag for the locale.
     * 
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * The region subtag for the locale.
     * 
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public LocaleSchema withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The primary language subtag for the locale.
     * 
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * The primary language subtag for the locale.
     * 
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public LocaleSchema withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * The script subtag for the locale.
     * 
     */
    public String getScriptCode() {
        return scriptCode;
    }

    /**
     * The script subtag for the locale.
     * 
     */
    public void setScriptCode(String scriptCode) {
        this.scriptCode = scriptCode;
    }

    public LocaleSchema withScriptCode(String scriptCode) {
        this.scriptCode = scriptCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null) ? "<null>" : this.countryCode));
        sb.append(',');
        sb.append("languageCode");
        sb.append('=');
        sb.append(((this.languageCode == null) ? "<null>" : this.languageCode));
        sb.append(',');
        sb.append("scriptCode");
        sb.append('=');
        sb.append(((this.scriptCode == null) ? "<null>" : this.scriptCode));
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
        result = ((result * 31) + ((this.scriptCode == null) ? 0 : this.scriptCode.hashCode()));
        result = ((result * 31) + ((this.languageCode == null) ? 0 : this.languageCode.hashCode()));
        result = ((result * 31) + ((this.countryCode == null) ? 0 : this.countryCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocaleSchema) == false) {
            return false;
        }
        LocaleSchema rhs = ((LocaleSchema) other);
        return ((((this.scriptCode == rhs.scriptCode)
                || ((this.scriptCode != null) && this.scriptCode.equals(rhs.scriptCode)))
                && ((this.languageCode == rhs.languageCode)
                        || ((this.languageCode != null) && this.languageCode.equals(rhs.languageCode))))
                && ((this.countryCode == rhs.countryCode)
                        || ((this.countryCode != null) && this.countryCode.equals(rhs.countryCode))));
    }

}
