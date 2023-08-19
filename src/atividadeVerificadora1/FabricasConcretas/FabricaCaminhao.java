package atividadeVerificadora1.FabricasConcretas;

import atividadeVerificadora1.FabricasAbstratas.FabricaAutomovel;
import atividadeVerificadora1.ProdutosAbstratos.Automovel;
import atividadeVerificadora1.ProdutosConcretos.Caminhao;

public class FabricaCaminhao implements FabricaAutomovel {
    @Override
    public Automovel criaAutomovel() {
        return new Caminhao();
    }
}
