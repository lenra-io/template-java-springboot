
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * DragStartBehavior
 * <p>
 * Component of type DragStartBehavior.
 * 
 */
public enum DragStartBehaviorSchema {

    @SerializedName("start")
    START("start"),
    @SerializedName("down")
    DOWN("down");

    private final String value;
    private final static Map<String, DragStartBehaviorSchema> CONSTANTS = new HashMap<String, DragStartBehaviorSchema>();

    static {
        for (DragStartBehaviorSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DragStartBehaviorSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static DragStartBehaviorSchema fromValue(String value) {
        DragStartBehaviorSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
