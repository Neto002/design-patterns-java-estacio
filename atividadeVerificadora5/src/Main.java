import Comandos.*;
import Iterators.ColecaoComandosTroco;
import Troco.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da sua conta: ");
        int valorConta = teclado.nextInt();

        System.out.println("Qual o valor que você quer pagar?");
        int valorPagamento = teclado.nextInt();

        int valorTroco = valorPagamento - valorConta;

        if (valorPagamento < valorConta) {
            System.out.println("Valor insuficiente para pagamento.");
        } else if (valorPagamento == valorConta) {
            System.out.println("Pagamento concluído com sucesso");
        } else {
            System.out.println("Devolvendo R$ " + valorTroco + ".00 reais de troco...");
            ColecaoComandosTroco comandosTroco = new ColecaoComandosTroco();

            int notas10 = valorTroco / 10;
            int resto10 = valorTroco % 10;
            comandosTroco.adicionarComando(new ComandoTroco10(notas10));

            int notas5 = resto10 / 5;
            int resto5 = resto10 % 5;
            comandosTroco.adicionarComando(new ComandoTroco5(notas5));

            int notas2 = resto5 / 2;
            int resto2 = resto5 % 2;
            comandosTroco.adicionarComando(new ComandoTroco2(notas2));

            int moedas1 = resto2;
            comandosTroco.adicionarComando(new ComandoTroco1(moedas1));

            for (ComandoTroco comando : comandosTroco) {
                comando.executar();
            }
        }

        teclado.close();
    }
}