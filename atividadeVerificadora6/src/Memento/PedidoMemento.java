package Memento;

import java.util.List;

public class PedidoMemento {
    private List<String> estado;

    public PedidoMemento(List<String> estado) {
        this.estado = estado;
    }
    public List<String> getEstado() {
        return this.estado;
    }
}
