package aula2.AbstractFactory.ConcreteFactory;

import aula2.AbstractFactory.Factory.FabricaDeCarro;
import aula2.AbstractFactory.AbstractProduct.CarroPopular;
import aula2.AbstractFactory.AbstractProduct.CarroSedan;
import aula2.AbstractFactory.ConcreteProduct.Fiesta;
import aula2.AbstractFactory.ConcreteProduct.FiestaSedan;

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
