package Troco;

public class Troco10 extends TrocoHandler {
    private static final int VALOR_TROCO = 10;
    @Override
    public void processarTroco(int valor) {
        int quantidade = valor / VALOR_TROCO;
        int resto = valor % VALOR_TROCO;
        System.out.println("Notas de R$10.00: " + quantidade);
        if (resto != 0 && proximo != null) {
            proximo.processarTroco(resto);
        }
    }
}
