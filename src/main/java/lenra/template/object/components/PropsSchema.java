
package lenra.template.object.components;

/**
 * Props
 * <p>
 * Parameters passed to the listener
 * 
 */
public class PropsSchema {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PropsSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
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
        if ((other instanceof PropsSchema) == false) {
            return false;
        }
        PropsSchema rhs = ((PropsSchema) other);
        return true;
    }

}
