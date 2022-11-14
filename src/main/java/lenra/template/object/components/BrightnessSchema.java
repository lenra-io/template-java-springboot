
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * Brightness
 * <p>
 * Component of type Brightness.
 * 
 */
public enum BrightnessSchema {

    @SerializedName("dark")
    DARK("dark"),
    @SerializedName("light")
    LIGHT("light");

    private final String value;
    private final static Map<String, BrightnessSchema> CONSTANTS = new HashMap<String, BrightnessSchema>();

    static {
        for (BrightnessSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    BrightnessSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static BrightnessSchema fromValue(String value) {
        BrightnessSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
