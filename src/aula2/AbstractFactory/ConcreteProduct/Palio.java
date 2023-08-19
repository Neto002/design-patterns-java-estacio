package aula2.AbstractFactory.ConcreteProduct;

import aula2.AbstractFactory.AbstractProduct.CarroPopular;

public class Palio implements CarroPopular {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria: Popular");
    }
}
