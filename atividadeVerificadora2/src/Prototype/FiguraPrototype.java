package Prototype;

public abstract class FiguraPrototype {
    public String corPadrao;
    public int posX;
    public int posY;

    public FiguraPrototype() {
        this.corPadrao = "azul";
        this.posX = 0;
        this.posY = 0;
    }

    public FiguraPrototype(FiguraPrototype prototype) {
        this.corPadrao = prototype.corPadrao;
        this.posX = prototype.posX;
        this.posY = prototype.posY;
    }

    public abstract FiguraPrototype clone();
}
