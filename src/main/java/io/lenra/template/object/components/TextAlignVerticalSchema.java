
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * TextAlignVertical
 * <p>
 * Component of type TextAlignVertical.
 * 
 */
public enum TextAlignVerticalSchema {

    @SerializedName("bottom")
    BOTTOM("bottom"),
    @SerializedName("center")
    CENTER("center"),
    @SerializedName("top")
    TOP("top");

    private final String value;
    private final static Map<String, TextAlignVerticalSchema> CONSTANTS = new HashMap<String, TextAlignVerticalSchema>();

    static {
        for (TextAlignVerticalSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TextAlignVerticalSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TextAlignVerticalSchema fromValue(String value) {
        TextAlignVerticalSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
