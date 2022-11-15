
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * Direction
 * <p>
 * The direction of the component (horizontal/vertical)
 * 
 */
public enum DirectionSchema {

    @SerializedName("horizontal")
    HORIZONTAL("horizontal"),
    @SerializedName("vertical")
    VERTICAL("vertical");

    private final String value;
    private final static Map<String, DirectionSchema> CONSTANTS = new HashMap<String, DirectionSchema>();

    static {
        for (DirectionSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DirectionSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static DirectionSchema fromValue(String value) {
        DirectionSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
