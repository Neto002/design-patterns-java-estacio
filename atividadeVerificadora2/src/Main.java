import Fabricas.ConcreteFigurasFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figuras listaFiguras = Figuras.getInstance();
        ConcreteFigurasFactory fabrica = new ConcreteFigurasFactory();
        while (true) {
            int opcao = menu();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1 -> listaFiguras.figuras.add(fabrica.criaFigura("TRIANGULO"));
                case 2 -> listaFiguras.figuras.add(fabrica.criaFigura("RETANGULO"));
                case 3 -> System.out.println(listaFiguras.figuras);
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Adicionar Triângulo na lista");
        System.out.println("2 - Adicionar Retângulo na lista");
        System.out.println("3 - Exibir a lista");
        System.out.println("0 - Sair");

        return scanner.nextInt();
    }
}