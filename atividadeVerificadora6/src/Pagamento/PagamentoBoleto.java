package Pagamento;

public class PagamentoBoleto implements PagamentoStrategy {
    private String numeroBoleto;

    public PagamentoBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Processando pagamento por boleto de R$" + String.format("%.2f", valor) + " com número " + numeroBoleto);
    }
}
