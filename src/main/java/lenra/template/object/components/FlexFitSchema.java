
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * flexFit
 * <p>
 * How a flexible child is inscribed into the available space.
 * 
 */
public enum FlexFitSchema {

    @SerializedName("loose")
    LOOSE("loose"),
    @SerializedName("tight")
    TIGHT("tight");

    private final String value;
    private final static Map<String, FlexFitSchema> CONSTANTS = new HashMap<String, FlexFitSchema>();

    static {
        for (FlexFitSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    FlexFitSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static FlexFitSchema fromValue(String value) {
        FlexFitSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
