
package io.lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeftIcon {

    @SerializedName("type")
    @Expose
    private LeftIcon.Type type;

    public LeftIcon.Type getType() {
        return type;
    }

    public void setType(LeftIcon.Type type) {
        this.type = type;
    }

    public LeftIcon withType(LeftIcon.Type type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LeftIcon.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LeftIcon) == false) {
            return false;
        }
        LeftIcon rhs = ((LeftIcon) other);
        return ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)));
    }

    public enum Type {

        @SerializedName("icon")
        ICON("icon");

        private final String value;
        private final static Map<String, LeftIcon.Type> CONSTANTS = new HashMap<String, LeftIcon.Type>();

        static {
            for (LeftIcon.Type c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static LeftIcon.Type fromValue(String value) {
            LeftIcon.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
