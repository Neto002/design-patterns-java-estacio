package Troco;

public class Troco2 extends TrocoHandler {
    private static final int VALOR_TROCO = 2;
    @Override
    public void processarTroco(int valor) {
        int quantidade = valor / VALOR_TROCO;
        int resto = valor % VALOR_TROCO;
        System.out.println("Notas de R$2.00: " + quantidade);
        if (resto != 0 && proximo != null) {
            proximo.processarTroco(resto);
        }
    }
}
