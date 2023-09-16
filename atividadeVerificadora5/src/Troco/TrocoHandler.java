package Troco;

public abstract class TrocoHandler {
    protected TrocoHandler proximo;

    public void setProximo(TrocoHandler proximo) {
        this.proximo = proximo;
    }

    public abstract void processarTroco(int valor);
}
