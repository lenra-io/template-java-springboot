
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * MaxLengthEnforcement
 * <p>
 * Component of type MaxLengthEnforcement.
 * 
 */
public enum MaxLengthEnforcementSchema {

    @SerializedName("none")
    NONE("none"),
    @SerializedName("enforced")
    ENFORCED("enforced"),
    @SerializedName("truncateAfterCompositionEnds")
    TRUNCATE_AFTER_COMPOSITION_ENDS("truncateAfterCompositionEnds");

    private final String value;
    private final static Map<String, MaxLengthEnforcementSchema> CONSTANTS = new HashMap<String, MaxLengthEnforcementSchema>();

    static {
        for (MaxLengthEnforcementSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MaxLengthEnforcementSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static MaxLengthEnforcementSchema fromValue(String value) {
        MaxLengthEnforcementSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
