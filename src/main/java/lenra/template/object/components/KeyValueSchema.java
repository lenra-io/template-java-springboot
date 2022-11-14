
package lenra.template.object.components;

/**
 * KeyValue
 * <p>
 * KeyValue query identifier
 * 
 */
public class KeyValueSchema {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyValueSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyValueSchema) == false) {
            return false;
        }
        KeyValueSchema rhs = ((KeyValueSchema) other);
        return true;
    }

}
