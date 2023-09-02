package Bridge;

public class CoquetelMojito implements TipoCoquetel {
    @Override
    public void preparar() {
        System.out.println("Preparando mojito...");
    }
}
