package Adapter;

public class SistemaCoquetel implements CoquetelSystem {
    @Override
    public void fazerPedido(String coquetel) {
        System.out.println("Pedido do coquetel: " + coquetel);
    }
}
