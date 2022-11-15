
package lenra.components;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Basic Listener
 * <p>
 * 
 * 
 */
public class ListenerSchema {

    /**
     * Action
     * <p>
     * The action name to call
     * (Required)
     * 
     */
    @SerializedName("action")
    @Expose
    private String action;
    /**
     * Parameters passed to the listener
     * 
     */
    @SerializedName("props")
    @Expose
    private JsonObject props;

    /**
     * Action
     * <p>
     * The action name to call
     * (Required)
     * 
     */
    public String getAction() {
        return action;
    }

    /**
     * Action
     * <p>
     * The action name to call
     * (Required)
     * 
     */
    public void setAction(String action) {
        this.action = action;
    }

    public ListenerSchema withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Parameters passed to the listener
     * 
     */
    public JsonObject getProps() {
        return props;
    }

    /**
     * Parameters passed to the listener
     * 
     */
    public void setProps(JsonObject props) {
        this.props = props;
    }

    public ListenerSchema withProps(JsonObject props) {
        this.props = props;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListenerSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null) ? "<null>" : this.action));
        sb.append(',');
        sb.append("props");
        sb.append('=');
        sb.append(((this.props == null) ? "<null>" : this.props));
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
        result = ((result * 31) + ((this.action == null) ? 0 : this.action.hashCode()));
        result = ((result * 31) + ((this.props == null) ? 0 : this.props.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListenerSchema) == false) {
            return false;
        }
        ListenerSchema rhs = ((ListenerSchema) other);
        return (((this.action == rhs.action) || ((this.action != null) && this.action.equals(rhs.action)))
                && ((this.props == rhs.props) || ((this.props != null) && this.props.equals(rhs.props))));
    }

}
