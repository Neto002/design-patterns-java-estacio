package Comandos;

public class ComandoTroco1 implements ComandoTroco {
    private int quantidade;

    public ComandoTroco1(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        System.out.println("Moedas de R$1.00: " + quantidade);
    }
}
