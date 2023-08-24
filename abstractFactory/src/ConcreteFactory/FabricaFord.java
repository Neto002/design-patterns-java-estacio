package ConcreteFactory;

import AbstractProduct.CarroPopular;
import AbstractProduct.CarroSedan;
import ConcreteProduct.Fiesta;
import Factory.FabricaDeCarro;
import ConcreteProduct.FiestaSedan;

public class FabricaFord implements FabricaDeCarro {
    @Override
    public CarroSedan criaCarroSedan() {
        return new FiestaSedan();
    }

    @Override
    public CarroPopular criaCarroPopular() {
        return new Fiesta();
    }
}
