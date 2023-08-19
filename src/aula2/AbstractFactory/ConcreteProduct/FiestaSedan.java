package aula2.AbstractFactory.ConcreteProduct;

import aula2.AbstractFactory.AbstractProduct.CarroSedan;

public class FiestaSedan implements CarroSedan {
    @Override
    public void exibeInfoSedan() {
        System.out.println("Modelo: Fiesta\nFábrica: Ford\nCategoria: Sedan");
    }
}
