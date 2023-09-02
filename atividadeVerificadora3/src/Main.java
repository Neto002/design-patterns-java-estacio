import Adapter.CoquetelAdapter;
import Adapter.CoquetelSystem;
import Adapter.SistemaCoquetel;
import Bridge.CoquetelMargarita;
import Bridge.CoquetelMojito;
import Bridge.CoquetelPedido;
import Decorator.PedidoTeclado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoquetelSystem sistema = new SistemaCoquetel();
        CoquetelPedido pedido = new CoquetelAdapter(sistema);
        Scanner teclado = new Scanner(System.in);

        while (true) {
            int opcao = menu();

            if (opcao == 0 ) {
                System.out.println("Saindo...");
                break;
            }

            if (opcao == 1) {
                System.out.print("Qual coquetel você deseja?\n1 - Margarita\n2 - Mojito\n0 - Voltar\nSua escolha: ");
                int opcaoPedido = teclado.nextInt();
                escolheCoquetel(opcaoPedido);
            }
        }
    }

    public static int menu() {
        System.out.print("Digite a opção desejada:\n1 - Fazer Pedido\n0 - Sair\nSua escolha: ");
        return new Scanner(System.in).nextInt();
    }

    public static void escolheCoquetel(int opcaoPedido) {
        switch (opcaoPedido) {
            case 1:
                CoquetelPedido pedidoMargarita = new PedidoTeclado(new CoquetelMargarita());
                pedidoMargarita.fazerPedido("Margarita");
                break;
            case 2:
                CoquetelPedido pedidoMojito = new PedidoTeclado(new CoquetelMojito());
                pedidoMojito.fazerPedido("Mojito");
                break;
            case 0:
                System.out.println("Voltando...");
                break;
            default:
                System.out.println("Opção incorreta!");
        }
    }
}