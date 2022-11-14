
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * TextCapitalization
 * <p>
 * Component of type TextCapitalization.
 * 
 */
public enum TextCapitalizationSchema {

    @SerializedName("none")
    NONE("none"),
    @SerializedName("words")
    WORDS("words"),
    @SerializedName("sentences")
    SENTENCES("sentences"),
    @SerializedName("characters")
    CHARACTERS("characters");

    private final String value;
    private final static Map<String, TextCapitalizationSchema> CONSTANTS = new HashMap<String, TextCapitalizationSchema>();

    static {
        for (TextCapitalizationSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TextCapitalizationSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TextCapitalizationSchema fromValue(String value) {
        TextCapitalizationSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
