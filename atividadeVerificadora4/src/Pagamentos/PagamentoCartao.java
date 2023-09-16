package Pagamentos;

public class PagamentoCartao implements Pagamento {
    private String numeroCartao;

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com sucesso com o cartão " + numeroCartao);
    }
}
