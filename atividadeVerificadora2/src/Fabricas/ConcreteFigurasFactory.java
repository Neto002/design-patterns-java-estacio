package Fabricas;

import Figuras.Retangulo;
import Figuras.Triangulo;
import Prototype.FiguraPrototype;

import java.util.Objects;

public class ConcreteFigurasFactory extends FigurasFactory{
    @Override
    public FiguraPrototype criaFigura(String tipoFigura) {
        if (tipoFigura.equalsIgnoreCase("TRIANGULO")) {
            System.out.println("Criando triângulo...");
            return new Triangulo().clone();
        } else if (tipoFigura.equalsIgnoreCase("RETANGULO")) {
            System.out.println("Criando retângulo...");
            return new Retangulo().clone();
        }
        return null;
    }
}
