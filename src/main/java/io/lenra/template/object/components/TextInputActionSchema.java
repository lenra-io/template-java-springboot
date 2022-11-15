
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * TextInputAction
 * <p>
 * Component of type TextInputAction.
 * 
 */
public enum TextInputActionSchema {

    @SerializedName("continueAction")
    CONTINUE_ACTION("continueAction"),
    @SerializedName("done")
    DONE("done"),
    @SerializedName("emergencyCall")
    EMERGENCY_CALL("emergencyCall"),
    @SerializedName("go")
    GO("go"),
    @SerializedName("join")
    JOIN("join"),
    @SerializedName("newline")
    NEWLINE("newline"),
    @SerializedName("next")
    NEXT("next"),
    @SerializedName("none")
    NONE("none"),
    @SerializedName("previous")
    PREVIOUS("previous"),
    @SerializedName("route")
    ROUTE("route"),
    @SerializedName("search")
    SEARCH("search"),
    @SerializedName("send")
    SEND("send"),
    @SerializedName("unspecified")
    UNSPECIFIED("unspecified");

    private final String value;
    private final static Map<String, TextInputActionSchema> CONSTANTS = new HashMap<String, TextInputActionSchema>();

    static {
        for (TextInputActionSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TextInputActionSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TextInputActionSchema fromValue(String value) {
        TextInputActionSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
