package Figuras;

import Prototype.FiguraPrototype;

public class Triangulo extends FiguraPrototype {

    public int lado1;
    public int lado2;
    public int lado3;

    public Triangulo() {
        super();
        lado1 = 0;
        lado2 = 0;
        lado3 = 0;
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
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", corPadrao='" + corPadrao + '\'' +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}
