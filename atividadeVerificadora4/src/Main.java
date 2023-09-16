import Itens.SacolaCompra;
import Pagamentos.FachadaPagamento;
import Pagamentos.Pagamento;

public class Main {
    public static void main(String[] args) {
        SacolaCompra sacola1 = new SacolaCompra();
        sacola1.adicionarItem("Produto 1", 10);
        sacola1.adicionarItem("Produto 2", 20);

        Pagamento pagamentoCartao = FachadaPagamento.criarPagamentoCartao("1111-1111-1111-1111");
        sacola1.setPagamento(pagamentoCartao);
        sacola1.finalizarCompra();

        SacolaCompra sacola2 = new SacolaCompra();
        sacola2.adicionarItem("Produto 1", 10);
        sacola2.adicionarItem("Produto 3", 30);

        Pagamento pagamentoBoleto = FachadaPagamento.criarPagamentoBoleto("123456789");
        sacola2.setPagamento(pagamentoBoleto);
        sacola2.finalizarCompra();
    }
}