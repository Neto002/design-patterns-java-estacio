package Comandos;

public class ComandoTroco2 implements ComandoTroco {
    private int quantidade;

    public ComandoTroco2(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        System.out.println("Notas de R$2.00: " + quantidade);
    }
}
