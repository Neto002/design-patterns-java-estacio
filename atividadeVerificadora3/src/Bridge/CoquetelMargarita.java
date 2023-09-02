package Bridge;

public class CoquetelMargarita implements TipoCoquetel {
    @Override
    public void preparar() {
        System.out.println("Preparando margarita...");
    }
}
