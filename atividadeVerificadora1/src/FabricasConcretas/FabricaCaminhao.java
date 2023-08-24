package FabricasConcretas;

import FabricasAbstratas.FabricaAutomovel;
import ProdutosAbstratos.Automovel;
import ProdutosConcretos.Caminhao;

public class FabricaCaminhao implements FabricaAutomovel {
    @Override
    public Automovel criaAutomovel() {
        return new Caminhao();
    }
}
