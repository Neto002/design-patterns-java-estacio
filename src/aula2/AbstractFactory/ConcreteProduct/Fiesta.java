package aula2.AbstractFactory.ConcreteProduct;

import aula2.AbstractFactory.AbstractProduct.CarroPopular;

public class Fiesta implements CarroPopular {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Fiesta\nFábrica: Ford\nCategoria: Popular");
    }
}
