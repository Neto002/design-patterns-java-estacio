package Memento;

import Pagamento.PagamentoStrategy;

import java.util.Stack;

public class SistemaPedido {
    private PagamentoStrategy pagamentoStrategy;
    private Pedido pedido;
    private Stack<PedidoMemento> mementos = new Stack<>();

    public SistemaPedido(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
        this.pedido = new Pedido();
    }

    public void addItem(String item) {
        mementos.push(pedido.criarMemento());
        pedido.addItem(item);
    }

    public void removerItem(String item) {
        mementos.push(pedido.criarMemento());
        pedido.removerItem(item);
    }

    public void desfazer() {
        if (!mementos.isEmpty()) {
            pedido.restaurarDoMemento(mementos.pop());
        }
    }

    public void processarPedido(double valor) {
        pagamentoStrategy.processarPagamento(valor);
        System.out.println("Detalhes do pedido: " + pedido);
    }

    public Pedido getPedido() {
        return pedido;
    }
}
