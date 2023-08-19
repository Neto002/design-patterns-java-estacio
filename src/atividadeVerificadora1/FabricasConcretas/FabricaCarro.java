package atividadeVerificadora1.FabricasConcretas;

import atividadeVerificadora1.FabricasAbstratas.FabricaAutomovel;
import atividadeVerificadora1.ProdutosAbstratos.Automovel;
import atividadeVerificadora1.ProdutosConcretos.Carro;

public class FabricaCarro implements FabricaAutomovel {
    @Override
    public Automovel criaAutomovel() {
        return new Carro();
    }
}
