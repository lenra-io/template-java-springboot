
package io.lenra.components;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Widget
 * <p>
 * Element of type widget
 * 
 */
public class WidgetSchema {

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private WidgetSchema.Type type;
    /**
     * The name of the widget
     * (Required)
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * Props
     * <p>
     * Parameters passed to the listener
     * 
     */
    @SerializedName("props")
    @Expose
    private JsonObject props;
    /**
     * The query to apply to the data.
     * 
     */
    @SerializedName("query")
    @Expose
    private JsonObject query;
    /**
     * the collection where the query is applied
     * 
     */
    @SerializedName("coll")
    @Expose
    private String coll;
    @SerializedName("context")
    @Expose
    private Boolean context;

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public WidgetSchema.Type getType() {
        return type;
    }

    /**
     * The identifier of the component
     * (Required)
     * 
     */
    public void setType(WidgetSchema.Type type) {
        this.type = type;
    }

    public WidgetSchema withType(WidgetSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The name of the widget
     * (Required)
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the widget
     * (Required)
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public WidgetSchema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Props
     * <p>
     * Parameters passed to the listener
     * 
     */
    public JsonObject getProps() {
        return props;
    }

    /**
     * Props
     * <p>
     * Parameters passed to the listener
     * 
     */
    public void setProps(JsonObject props) {
        this.props = props;
    }

    public WidgetSchema withProps(JsonObject props) {
        this.props = props;
        return this;
    }

    /**
     * The query to apply to the data.
     * 
     */
    public JsonObject getQuery() {
        return query;
    }

    /**
     * The query to apply to the data.
     * 
     */
    public void setQuery(JsonObject query) {
        this.query = query;
    }

    public WidgetSchema withQuery(JsonObject query) {
        this.query = query;
        return this;
    }

    /**
     * the collection where the query is applied
     * 
     */
    public String getColl() {
        return coll;
    }

    /**
     * the collection where the query is applied
     * 
     */
    public void setColl(String coll) {
        this.coll = coll;
    }

    public WidgetSchema withColl(String coll) {
        this.coll = coll;
        return this;
    }

    public Boolean getContext() {
        return context;
    }

    public void setContext(Boolean context) {
        this.context = context;
    }

    public WidgetSchema withContext(Boolean context) {
        this.context = context;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WidgetSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("props");
        sb.append('=');
        sb.append(((this.props == null) ? "<null>" : this.props));
        sb.append(',');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null) ? "<null>" : this.query));
        sb.append(',');
        sb.append("coll");
        sb.append('=');
        sb.append(((this.coll == null) ? "<null>" : this.coll));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null) ? "<null>" : this.context));
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
        result = ((result * 31) + ((this.coll == null) ? 0 : this.coll.hashCode()));
        result = ((result * 31) + ((this.query == null) ? 0 : this.query.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.context == null) ? 0 : this.context.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.props == null) ? 0 : this.props.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WidgetSchema) == false) {
            return false;
        }
        WidgetSchema rhs = ((WidgetSchema) other);
        return (((((((this.coll == rhs.coll) || ((this.coll != null) && this.coll.equals(rhs.coll)))
                && ((this.query == rhs.query) || ((this.query != null) && this.query.equals(rhs.query))))
                && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
                && ((this.context == rhs.context) || ((this.context != null) && this.context.equals(rhs.context))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.props == rhs.props) || ((this.props != null) && this.props.equals(rhs.props))));
    }

    /**
     * The identifier of the component
     * 
     */
    public enum Type {

        @SerializedName("widget")
        WIDGET("widget");

        private final String value;
        private final static Map<String, WidgetSchema.Type> CONSTANTS = new HashMap<String, WidgetSchema.Type>();

        static {
            for (WidgetSchema.Type c : values()) {
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

        public static WidgetSchema.Type fromValue(String value) {
            WidgetSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
