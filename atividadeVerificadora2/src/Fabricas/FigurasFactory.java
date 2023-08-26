package Fabricas;

import Prototype.FiguraPrototype;
import enums.TipoFigura;

public abstract class FigurasFactory {
    private FiguraPrototype figura;
    public abstract FiguraPrototype criaFigura(String tipoFigura);
}
