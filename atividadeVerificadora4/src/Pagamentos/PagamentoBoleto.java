package Pagamentos;

public class PagamentoBoleto implements Pagamento {
    private String codigoBoleto;

    public PagamentoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com sucesso via boleto " + codigoBoleto);
    }
}
