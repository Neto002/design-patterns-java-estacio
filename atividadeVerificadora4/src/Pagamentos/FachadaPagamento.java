package Pagamentos;

public class FachadaPagamento {
    public static Pagamento criarPagamentoCartao(String numeroCartao) {
        return new PagamentoCartao(numeroCartao);
    }

    public static Pagamento criarPagamentoBoleto(String codigoBoleto) {
        return new PagamentoBoleto(codigoBoleto);
    }
}
