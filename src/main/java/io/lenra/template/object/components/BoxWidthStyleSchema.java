
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * BoxWidthStyle
 * <p>
 * Component of type BoxWidthStyle.
 * 
 */
public enum BoxWidthStyleSchema {

    @SerializedName("max")
    MAX("max"),
    @SerializedName("tight")
    TIGHT("tight");

    private final String value;
    private final static Map<String, BoxWidthStyleSchema> CONSTANTS = new HashMap<String, BoxWidthStyleSchema>();

    static {
        for (BoxWidthStyleSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    BoxWidthStyleSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static BoxWidthStyleSchema fromValue(String value) {
        BoxWidthStyleSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
