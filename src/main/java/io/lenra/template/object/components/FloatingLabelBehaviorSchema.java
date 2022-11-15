
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * FloatingLabelBehavior
 * <p>
 * Element of type FloatingLabelBehavior.
 * 
 */
public enum FloatingLabelBehaviorSchema {

    @SerializedName("always")
    ALWAYS("always"),
    @SerializedName("auto")
    AUTO("auto"),
    @SerializedName("never")
    NEVER("never");

    private final String value;
    private final static Map<String, FloatingLabelBehaviorSchema> CONSTANTS = new HashMap<String, FloatingLabelBehaviorSchema>();

    static {
        for (FloatingLabelBehaviorSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    FloatingLabelBehaviorSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static FloatingLabelBehaviorSchema fromValue(String value) {
        FloatingLabelBehaviorSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
