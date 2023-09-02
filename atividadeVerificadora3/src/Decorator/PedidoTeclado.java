package Decorator;

import Bridge.CoquetelPedido;
import Bridge.TipoCoquetel;

import java.util.Scanner;

public class PedidoTeclado implements CoquetelPedido {
    private TipoCoquetel tipo;
    private Scanner teclado = new Scanner(System.in);

    public PedidoTeclado(TipoCoquetel tipo) {
        this.tipo = tipo;
    }

    @Override
    public void fazerPedido(String coquetel) {
        System.out.println("Digite a quantidade desejada: ");
        int quantidade = teclado.nextInt();
        if (quantidade > 1) {
            coquetel = coquetel + "s";
        }
        System.out.println("Você pediu " + quantidade + " " + coquetel);
        tipo.preparar();
    }
}
