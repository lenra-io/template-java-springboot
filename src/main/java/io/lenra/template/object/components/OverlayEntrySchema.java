
package io.lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Overlay Entry
 * <p>
 * Element of type OverlayEntry
 * 
 */
public class OverlayEntrySchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private OverlayEntrySchema.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("child")
    @Expose
    private Object child;
    /**
     * Whether this entry must be included in the tree even if there is a fully
     * opaque entry above it.
     * 
     */
    @SerializedName("maintainState")
    @Expose
    private Boolean maintainState = false;
    /**
     * Whether this entry occludes the entire overlay.
     * 
     */
    @SerializedName("opaque")
    @Expose
    private Boolean opaque = false;
    /**
     * Whether this entry should be shown.
     * 
     */
    @SerializedName("showOverlay")
    @Expose
    private Boolean showOverlay = false;

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public OverlayEntrySchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(OverlayEntrySchema.Type type) {
        this.type = type;
    }

    public OverlayEntrySchema withType(OverlayEntrySchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Object getChild() {
        return child;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setChild(Object child) {
        this.child = child;
    }

    public OverlayEntrySchema withChild(Object child) {
        this.child = child;
        return this;
    }

    /**
     * Whether this entry must be included in the tree even if there is a fully
     * opaque entry above it.
     * 
     */
    public Boolean getMaintainState() {
        return maintainState;
    }

    /**
     * Whether this entry must be included in the tree even if there is a fully
     * opaque entry above it.
     * 
     */
    public void setMaintainState(Boolean maintainState) {
        this.maintainState = maintainState;
    }

    public OverlayEntrySchema withMaintainState(Boolean maintainState) {
        this.maintainState = maintainState;
        return this;
    }

    /**
     * Whether this entry occludes the entire overlay.
     * 
     */
    public Boolean getOpaque() {
        return opaque;
    }

    /**
     * Whether this entry occludes the entire overlay.
     * 
     */
    public void setOpaque(Boolean opaque) {
        this.opaque = opaque;
    }

    public OverlayEntrySchema withOpaque(Boolean opaque) {
        this.opaque = opaque;
        return this;
    }

    /**
     * Whether this entry should be shown.
     * 
     */
    public Boolean getShowOverlay() {
        return showOverlay;
    }

    /**
     * Whether this entry should be shown.
     * 
     */
    public void setShowOverlay(Boolean showOverlay) {
        this.showOverlay = showOverlay;
    }

    public OverlayEntrySchema withShowOverlay(Boolean showOverlay) {
        this.showOverlay = showOverlay;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OverlayEntrySchema.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("child");
        sb.append('=');
        sb.append(((this.child == null) ? "<null>" : this.child));
        sb.append(',');
        sb.append("maintainState");
        sb.append('=');
        sb.append(((this.maintainState == null) ? "<null>" : this.maintainState));
        sb.append(',');
        sb.append("opaque");
        sb.append('=');
        sb.append(((this.opaque == null) ? "<null>" : this.opaque));
        sb.append(',');
        sb.append("showOverlay");
        sb.append('=');
        sb.append(((this.showOverlay == null) ? "<null>" : this.showOverlay));
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
        result = ((result * 31) + ((this.maintainState == null) ? 0 : this.maintainState.hashCode()));
        result = ((result * 31) + ((this.opaque == null) ? 0 : this.opaque.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.showOverlay == null) ? 0 : this.showOverlay.hashCode()));
        result = ((result * 31) + ((this.child == null) ? 0 : this.child.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OverlayEntrySchema) == false) {
            return false;
        }
        OverlayEntrySchema rhs = ((OverlayEntrySchema) other);
        return ((((((this.maintainState == rhs.maintainState)
                || ((this.maintainState != null) && this.maintainState.equals(rhs.maintainState)))
                && ((this.opaque == rhs.opaque) || ((this.opaque != null) && this.opaque.equals(rhs.opaque))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.showOverlay == rhs.showOverlay)
                        || ((this.showOverlay != null) && this.showOverlay.equals(rhs.showOverlay))))
                && ((this.child == rhs.child) || ((this.child != null) && this.child.equals(rhs.child))));
    }

    /**
     * The identifier of the component
     * 
     */
    public enum Type {

        @SerializedName("overlayEntry")
        OVERLAY_ENTRY("overlayEntry");

        private final String value;
        private final static Map<String, OverlayEntrySchema.Type> CONSTANTS = new HashMap<String, OverlayEntrySchema.Type>();

        static {
            for (OverlayEntrySchema.Type c : values()) {
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

        public static OverlayEntrySchema.Type fromValue(String value) {
            OverlayEntrySchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
