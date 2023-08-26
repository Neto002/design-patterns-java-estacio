package Fabricas;

import Prototype.FiguraPrototype;

public abstract class FigurasFactory {
    private FiguraPrototype figura;
    public abstract FiguraPrototype criaFigura(String tipoFigura);
}
