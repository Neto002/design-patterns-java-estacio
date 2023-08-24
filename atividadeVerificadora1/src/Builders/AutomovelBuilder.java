package Builders;

import FabricasAbstratas.FabricaAutomovel;
import ProdutosAbstratos.Automovel;

public class AutomovelBuilder {
    private final FabricaAutomovel fabrica;

    public AutomovelBuilder(FabricaAutomovel fabrica) {
        this.fabrica = fabrica;
    }

    public Automovel build() {
        return fabrica.criaAutomovel();
    }
}
