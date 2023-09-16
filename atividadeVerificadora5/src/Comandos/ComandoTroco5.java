package Comandos;

public class ComandoTroco5 implements ComandoTroco {
    private int quantidade;

    public ComandoTroco5(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        System.out.println("Notas de R$5.00: " + quantidade);
    }
}
