package aula2.AbstractFactory.Factory;

import aula2.AbstractFactory.AbstractProduct.CarroPopular;
import aula2.AbstractFactory.AbstractProduct.CarroSedan;

public interface FabricaDeCarro {
    CarroSedan criaCarroSedan();
    CarroPopular criaCarroPopular();
}
