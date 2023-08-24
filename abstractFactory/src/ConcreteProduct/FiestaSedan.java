package ConcreteProduct;

import AbstractProduct.CarroSedan;

public class FiestaSedan implements CarroSedan {
    @Override
    public void exibeInfoSedan() {
        System.out.println("Modelo: Fiesta\nFábrica: Ford\nCategoria: Sedan");
    }
}
