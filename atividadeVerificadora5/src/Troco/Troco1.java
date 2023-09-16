package Troco;

public class Troco1 extends TrocoHandler {
    private static final int VALOR_TROCO = 1;
    @Override
    public void processarTroco(int valor) {
        int quantidade = valor / VALOR_TROCO;
        int resto = valor % VALOR_TROCO;
        System.out.println("Moedas de R$1.00: " + quantidade);
        if (resto != 0 && proximo != null) {
            proximo.processarTroco(resto);
        }
    }
}
