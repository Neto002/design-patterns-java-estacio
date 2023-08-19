package aula2;

import aula2.AbstractFactory.Factory.FabricaDeCarro;
import aula2.AbstractFactory.AbstractProduct.CarroPopular;
import aula2.AbstractFactory.AbstractProduct.CarroSedan;
import aula2.AbstractFactory.ConcreteFactory.FabricaFiat;
import aula2.AbstractFactory.ConcreteFactory.FabricaFord;
import aula2.Builder.ConversorASCII;
import aula2.Builder.ConversorPDF;
import aula2.Builder.ConversorTeX;
import aula2.Builder.ConversorTexto;

public class Main {
    public static void main(String[] args) {
        abstractFactory();

        ConversorTexto conversor;

        if (args[0].equals("pdf")) {
            conversor = new ConversorPDF();
        } else if (args[0].equals("tex")) {
            conversor = new ConversorTeX();
        } else if (args[0].equals("ascii")) {
            conversor = new ConversorASCII();
        }


    }

    public static void abstractFactory() {
        System.out.println("----------------- FIAT -----------------");

        FabricaDeCarro fabrica = new FabricaFiat();
        CarroSedan sedan = fabrica.criaCarroSedan();
        CarroPopular popular = fabrica.criaCarroPopular();

        sedan.exibeInfoSedan();
        popular.exibirInfoPopular();

        System.out.println("----------------- FORD -----------------");

        fabrica = new FabricaFord();
        sedan = fabrica.criaCarroSedan();
        popular = fabrica.criaCarroPopular();

        sedan.exibeInfoSedan();
        popular.exibirInfoPopular();
    }
}