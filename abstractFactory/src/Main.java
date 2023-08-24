import AbstractProduct.CarroPopular;
import AbstractProduct.CarroSedan;
import ConcreteFactory.FabricaFiat;
import ConcreteFactory.FabricaFord;
import Factory.FabricaDeCarro;

public class Main {
    public static void main(String[] args) {
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