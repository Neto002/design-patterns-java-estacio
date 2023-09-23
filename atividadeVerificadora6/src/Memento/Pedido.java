package Memento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<String> itens = new ArrayList<>();

    public Pedido() {
    }

//    public Pedido(List<String> itens) {
//        this.itens = itens;
//    }

    public List<String> getItens() {
        return itens;
    }

    public void addItem(String item) {
        itens.add(item);
    }

    public void removerItem(String item) {
        itens.remove(item);
    }

    public PedidoMemento criarMemento() {
        return new PedidoMemento(new ArrayList<>(this.itens));
    }

    public void restaurarDoMemento(PedidoMemento memento) {
        this.itens = new ArrayList<>(memento.getEstado());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "itens=" + itens +
                '}';
    }
}
