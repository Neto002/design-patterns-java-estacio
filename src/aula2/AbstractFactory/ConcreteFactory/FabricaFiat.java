package aula2.AbstractFactory.ConcreteFactory;

import aula2.AbstractFactory.Factory.FabricaDeCarro;
import aula2.AbstractFactory.AbstractProduct.CarroPopular;
import aula2.AbstractFactory.AbstractProduct.CarroSedan;
import aula2.AbstractFactory.ConcreteProduct.Palio;
import aula2.AbstractFactory.ConcreteProduct.Siena;

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
