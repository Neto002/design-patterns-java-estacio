package Figuras;

import Prototype.FiguraPrototype;

public class Triangulo extends FiguraPrototype {

    public int lado1;
    public int lado2;
    public int lado3;

    public Triangulo() {
        super();
    }

    public Triangulo(Triangulo triangulo) {
        this.lado1 = triangulo.lado1;
        this.lado2 = triangulo.lado2;
        this.lado3 = triangulo.lado3;
    }

    @Override
    public FiguraPrototype clone() {
        return new Triangulo(this);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "corPadrao='" + corPadrao + '\'' +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}
