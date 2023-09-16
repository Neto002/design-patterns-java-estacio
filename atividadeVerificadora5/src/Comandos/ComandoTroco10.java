package Comandos;

public class ComandoTroco10 implements ComandoTroco {
    private int quantidade;

    public ComandoTroco10(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        System.out.println("Notas de R$10.00: " + quantidade);
    }
}
