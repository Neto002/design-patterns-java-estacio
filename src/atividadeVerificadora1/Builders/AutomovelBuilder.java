package atividadeVerificadora1.Builders;

import atividadeVerificadora1.FabricasAbstratas.FabricaAutomovel;
import atividadeVerificadora1.ProdutosAbstratos.Automovel;

public class AutomovelBuilder {
    private final FabricaAutomovel fabrica;

    public AutomovelBuilder(FabricaAutomovel fabrica) {
        this.fabrica = fabrica;
    }

    public Automovel build() {
        return fabrica.criaAutomovel();
    }
}
