package ConcreteFactory;

import AbstractProduct.CarroPopular;
import AbstractProduct.CarroSedan;
import ConcreteProduct.Palio;
import ConcreteProduct.Siena;
import Factory.FabricaDeCarro;

public class FabricaFiat implements FabricaDeCarro {
    @Override
    public CarroSedan criaCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular criaCarroPopular() {
        return new Palio();
    }
}
