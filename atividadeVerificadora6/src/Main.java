import Memento.SistemaPedido;
import Pagamento.PagamentoBoleto;
import Pagamento.PagamentoCartao;
import Pagamento.PagamentoStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaPedido sistemaPedido = null;
        PagamentoStrategy pagamentoStrategy;
        while (true) {
            int escolha = menu();

            switch (escolha) {
                case 1:
                    if (sistemaPedido == null) {
                        pagamentoStrategy = defineFormaPagamento();
                        sistemaPedido = new SistemaPedido(pagamentoStrategy);
                    }
                    adicionarItem(sistemaPedido);
                    break;
                case 2:
                    if (sistemaPedido == null) {
                        System.out.println("Pedido vazio");
                    } else {
                        sistemaPedido.processarPedido(50.00);
                    }
                    break;
                case 3:
                    if (sistemaPedido == null) {
                        System.out.println("Pedido vazio");
                    } else {
                        System.out.println("Desfazendo última alteração no pedido...");
                        sistemaPedido.desfazer();
                        System.out.println("Alteração desfeita. Dados atuais do pedido: " + sistemaPedido.getPedido());
                    }
                    break;
                case 4:
                    if (sistemaPedido == null) {
                        System.out.println("Pedido vazio");
                    } else {
                        System.out.println("Digite o item que deseja remover do pedido: ");
                        sistemaPedido.removerItem(new Scanner(System.in).nextLine());
                    }
                    break;
                case 5:
                    if (sistemaPedido == null) {
                        System.out.println("Pedido vazio");
                    } else {
                        System.out.println(sistemaPedido.getPedido());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção incorreta!");
            }

            if (escolha == 2 && sistemaPedido != null) {
                System.out.println("Obrigado por comprar conosco!");
                break;
            }

            if (escolha == 0) {
                break;
            }
        }
    }

    private static void adicionarItem(SistemaPedido sistemaPedido) {
        System.out.println("Digite o nome do produto que deseja adicionar: ");
        sistemaPedido.addItem(new Scanner(System.in).nextLine());
    }

    private static PagamentoStrategy defineFormaPagamento() {
        Scanner scanner = new Scanner(System.in);
        PagamentoStrategy pagamentoStrategy = null;
        while (true) {
            System.out.println("Qual forma de pagamento deseja utilizar?\n1 - Cartão de Crédito\n2 - Boleto\nSua escolha: ");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Digite o número do cartão: ");
                    String numeroCartao = scanner.next();
                    System.out.println("Digite o nome do dono do cartão: ");
                    String nome = scanner.nextLine();
                    scanner.nextLine();
                    pagamentoStrategy = new PagamentoCartao(numeroCartao, nome);
                    break;
                case 2:
                    System.out.println("Digite o número do boleto: ");
                    String numeroBoleto = scanner.nextLine();
                    pagamentoStrategy = new PagamentoBoleto(numeroBoleto);
                    break;
                default:
                    System.out.println("Opção incorreta!!");
            }
            return pagamentoStrategy;
        }
    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção desejada:\n1 - Adicionar item ao pedido\n2 - Finalizar pedido\n3 - Desfazer\n4 - Remover item do pedido\n5 - Ver pedido\n0 - Sair\nSua escolha: ");
        return scanner.nextInt();
    }
}