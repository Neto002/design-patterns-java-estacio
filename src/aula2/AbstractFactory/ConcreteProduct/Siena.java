package aula2.AbstractFactory.ConcreteProduct;

import aula2.AbstractFactory.AbstractProduct.CarroSedan;

public class Siena implements CarroSedan {
    @Override
    public void exibeInfoSedan() {
        System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria: Sedan");
    }
}
