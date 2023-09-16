package Troco;

public class Troco5 extends TrocoHandler {
    private static final int VALOR_TROCO = 5;
    @Override
    public void processarTroco(int valor) {
        int quantidade = valor / VALOR_TROCO;
        int resto = valor % VALOR_TROCO;
        System.out.println("Notas de R$5.00: " + quantidade);
        if (resto != 0 && proximo != null) {
            proximo.processarTroco(resto);
        }
    }
}