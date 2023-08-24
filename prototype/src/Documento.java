public abstract class Documento implements ICloneable {
    public Documento clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return (Documento) clone;
    }
}
