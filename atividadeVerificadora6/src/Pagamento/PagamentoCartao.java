package Pagamento;

public class PagamentoCartao implements PagamentoStrategy {
    private String numeroCartao;
    private String nome;

    public PagamentoCartao(String numeroCartao, String nome) {
        this.numeroCartao = numeroCartao;
        this.nome = nome;
    }

    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Processando pagamento com cartão de crédito de R$" + String.format("%.2f", valor) + " com número " + numeroCartao);
    }
}
