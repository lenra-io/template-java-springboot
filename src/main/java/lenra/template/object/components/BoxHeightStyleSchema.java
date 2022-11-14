
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * BoxHeightStyle
 * <p>
 * Component of type BoxHeightStyle.
 * 
 */
public enum BoxHeightStyleSchema {

    @SerializedName("includeLineSpacingBottom")
    INCLUDE_LINE_SPACING_BOTTOM("includeLineSpacingBottom"),
    @SerializedName("includeLineSpacingMiddle")
    INCLUDE_LINE_SPACING_MIDDLE("includeLineSpacingMiddle"),
    @SerializedName("includeLineSpacingTop")
    INCLUDE_LINE_SPACING_TOP("includeLineSpacingTop"),
    @SerializedName("max")
    MAX("max"),
    @SerializedName("strut")
    STRUT("strut"),
    @SerializedName("tight")
    TIGHT("tight");

    private final String value;
    private final static Map<String, BoxHeightStyleSchema> CONSTANTS = new HashMap<String, BoxHeightStyleSchema>();

    static {
        for (BoxHeightStyleSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    BoxHeightStyleSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static BoxHeightStyleSchema fromValue(String value) {
        BoxHeightStyleSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
