
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * TextAlign
 * <p>
 * Component of type TextAlign.
 * 
 */
public enum TextAlignSchema {

    @SerializedName("left")
    LEFT("left"),
    @SerializedName("right")
    RIGHT("right"),
    @SerializedName("center")
    CENTER("center"),
    @SerializedName("justify")
    JUSTIFY("justify"),
    @SerializedName("start")
    START("start"),
    @SerializedName("end")
    END("end");

    private final String value;
    private final static Map<String, TextAlignSchema> CONSTANTS = new HashMap<String, TextAlignSchema>();

    static {
        for (TextAlignSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TextAlignSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TextAlignSchema fromValue(String value) {
        TextAlignSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
