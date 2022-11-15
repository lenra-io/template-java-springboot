
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * Alignment
 * <p>
 * The alignment to use.
 * 
 */
public enum AlignmentSchema {

    @SerializedName("bottomCenter")
    BOTTOM_CENTER("bottomCenter"),
    @SerializedName("bottomLeft")
    BOTTOM_LEFT("bottomLeft"),
    @SerializedName("bottomRight")
    BOTTOM_RIGHT("bottomRight"),
    @SerializedName("center")
    CENTER("center"),
    @SerializedName("centerLeft")
    CENTER_LEFT("centerLeft"),
    @SerializedName("centerRight")
    CENTER_RIGHT("centerRight"),
    @SerializedName("topCenter")
    TOP_CENTER("topCenter"),
    @SerializedName("topLeft")
    TOP_LEFT("topLeft"),
    @SerializedName("topRight")
    TOP_RIGHT("topRight");

    private final String value;
    private final static Map<String, AlignmentSchema> CONSTANTS = new HashMap<String, AlignmentSchema>();

    static {
        for (AlignmentSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AlignmentSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static AlignmentSchema fromValue(String value) {
        AlignmentSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
