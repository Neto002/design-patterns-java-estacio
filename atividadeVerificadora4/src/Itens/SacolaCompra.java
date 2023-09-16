package Itens;

import Pagamentos.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class SacolaCompra {
    private List<Item> itens = new ArrayList<>();
    private Pagamento pagamento;

    public void adicionarItem(String nome, double preco) {
        Item item = ItemFlyweightFactory.obterItem(nome, preco);
        itens.add(item);
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizarCompra() {
        double total = calcularTotal();
        pagamento.pagar(total);
    }

    private double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
