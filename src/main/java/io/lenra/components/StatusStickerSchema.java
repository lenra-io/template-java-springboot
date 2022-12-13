
package io.lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * StatusSticker
 * <p>
 * Element of type StatusSticker
 * 
 */
public class StatusStickerSchema {

    /**
     * The type of the element
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private StatusStickerSchema.Type type;
    /**
     * the status of the element
     * (Required)
     * 
     */
    @SerializedName("status")
    @Expose
    private StatusStickerSchema.Status status;

    /**
     * The type of the element
     * (Required)
     * 
     */
    public StatusStickerSchema.Type getType() {
        return type;
    }

    /**
     * The type of the element
     * (Required)
     * 
     */
    public void setType(StatusStickerSchema.Type type) {
        this.type = type;
    }

    public StatusStickerSchema withType(StatusStickerSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * the status of the element
     * (Required)
     * 
     */
    public StatusStickerSchema.Status getStatus() {
        return status;
    }

    /**
     * the status of the element
     * (Required)
     * 
     */
    public void setStatus(StatusStickerSchema.Status status) {
        this.status = status;
    }

    public StatusStickerSchema withStatus(StatusStickerSchema.Status status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StatusStickerSchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null) ? "<null>" : this.status));
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
        result = ((result * 31) + ((this.status == null) ? 0 : this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatusStickerSchema) == false) {
            return false;
        }
        StatusStickerSchema rhs = ((StatusStickerSchema) other);
        return (((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))
                && ((this.status == rhs.status) || ((this.status != null) && this.status.equals(rhs.status))));
    }

    /**
     * the status of the element
     * 
     */
    public enum Status {

        @SerializedName("success")
        SUCCESS("success"),
        @SerializedName("warning")
        WARNING("warning"),
        @SerializedName("error")
        ERROR("error"),
        @SerializedName("pending")
        PENDING("pending");

        private final String value;
        private final static Map<String, StatusStickerSchema.Status> CONSTANTS = new HashMap<String, StatusStickerSchema.Status>();

        static {
            for (StatusStickerSchema.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static StatusStickerSchema.Status fromValue(String value) {
            StatusStickerSchema.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * The type of the element
     * 
     */
    public enum Type {

        @SerializedName("statusSticker")
        STATUS_STICKER("statusSticker");

        private final String value;
        private final static Map<String, StatusStickerSchema.Type> CONSTANTS = new HashMap<String, StatusStickerSchema.Type>();

        static {
            for (StatusStickerSchema.Type c : values()) {
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

        public static StatusStickerSchema.Type fromValue(String value) {
            StatusStickerSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
