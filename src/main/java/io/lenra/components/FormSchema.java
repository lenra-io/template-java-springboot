
package lenra.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Form
 * <p>
 * Element of type Form
 * 
 */
public class FormSchema {

    /**
     * The type of the element
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private FormSchema.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("child")
    @Expose
    private Object child;
    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    @SerializedName("onSubmit")
    @Expose
    private ListenerSchema onSubmit;

    /**
     * The type of the element
     * (Required)
     * 
     */
    public FormSchema.Type getType() {
        return type;
    }

    /**
     * The type of the element
     * (Required)
     * 
     */
    public void setType(FormSchema.Type type) {
        this.type = type;
    }

    public FormSchema withType(FormSchema.Type type) {
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

    public FormSchema withChild(Object child) {
        this.child = child;
        return this;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public ListenerSchema getOnSubmit() {
        return onSubmit;
    }

    /**
     * Basic Listener
     * <p>
     * 
     * 
     */
    public void setOnSubmit(ListenerSchema onSubmit) {
        this.onSubmit = onSubmit;
    }

    public FormSchema withOnSubmit(ListenerSchema onSubmit) {
        this.onSubmit = onSubmit;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FormSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("child");
        sb.append('=');
        sb.append(((this.child == null)?"<null>":this.child));
        sb.append(',');
        sb.append("onSubmit");
        sb.append('=');
        sb.append(((this.onSubmit == null)?"<null>":this.onSubmit));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.onSubmit == null)? 0 :this.onSubmit.hashCode()));
        result = ((result* 31)+((this.child == null)? 0 :this.child.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FormSchema) == false) {
            return false;
        }
        FormSchema rhs = ((FormSchema) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.onSubmit == rhs.onSubmit)||((this.onSubmit!= null)&&this.onSubmit.equals(rhs.onSubmit))))&&((this.child == rhs.child)||((this.child!= null)&&this.child.equals(rhs.child))));
    }


    /**
     * The type of the element
     * 
     */
    public enum Type {

        @SerializedName("form")
        FORM("form");
        private final String value;
        private final static Map<String, FormSchema.Type> CONSTANTS = new HashMap<String, FormSchema.Type>();

        static {
            for (FormSchema.Type c: values()) {
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

        public static FormSchema.Type fromValue(String value) {
            FormSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
