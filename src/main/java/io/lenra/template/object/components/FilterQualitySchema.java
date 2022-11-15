
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * Filter Quality
 * <p>
 * The filter quality to use.
 * 
 */
public enum FilterQualitySchema {

    @SerializedName("high")
    HIGH("high"),
    @SerializedName("medium")
    MEDIUM("medium"),
    @SerializedName("low")
    LOW("low"),
    @SerializedName("none")
    NONE("none");

    private final String value;
    private final static Map<String, FilterQualitySchema> CONSTANTS = new HashMap<String, FilterQualitySchema>();

    static {
        for (FilterQualitySchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    FilterQualitySchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static FilterQualitySchema fromValue(String value) {
        FilterQualitySchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
