
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * Box Fit
 * <p>
 * How the box should be fitted in its parent.
 * 
 */
public enum BoxFitSchema {

    @SerializedName("contain")
    CONTAIN("contain"),
    @SerializedName("cover")
    COVER("cover"),
    @SerializedName("fill")
    FILL("fill"),
    @SerializedName("fitHeight")
    FIT_HEIGHT("fitHeight"),
    @SerializedName("fitWidth")
    FIT_WIDTH("fitWidth"),
    @SerializedName("none")
    NONE("none"),
    @SerializedName("scaleDown")
    SCALE_DOWN("scaleDown");

    private final String value;
    private final static Map<String, BoxFitSchema> CONSTANTS = new HashMap<String, BoxFitSchema>();

    static {
        for (BoxFitSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    BoxFitSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static BoxFitSchema fromValue(String value) {
        BoxFitSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
