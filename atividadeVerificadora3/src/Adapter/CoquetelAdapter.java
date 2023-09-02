package Adapter;

import Bridge.CoquetelPedido;

public class CoquetelAdapter implements CoquetelPedido {
    private CoquetelSystem sistema;

    public CoquetelAdapter(CoquetelSystem sistema) {
        this.sistema = sistema;
    }

    @Override
    public void fazerPedido(String coquetel) {
        sistema.fazerPedido(coquetel);
    }
}
