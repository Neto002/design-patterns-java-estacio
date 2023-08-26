package Figuras;

import Prototype.FiguraPrototype;

public class Retangulo extends FiguraPrototype {

    public int largura;
    public int altura;

    public Retangulo() {
        super();
        largura = 0;
        altura = 0;
    }

    public Retangulo(Retangulo retangulo) {
        this.largura = retangulo.largura;
        this.altura = retangulo.altura;
    }

    @Override
    public FiguraPrototype clone() {
        return new Retangulo(this);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                ", corPadrao='" + corPadrao + '\'' +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}
