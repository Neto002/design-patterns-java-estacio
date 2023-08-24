package FabricasConcretas;

import FabricasAbstratas.FabricaAutomovel;
import ProdutosAbstratos.Automovel;
import ProdutosConcretos.Onibus;

public class FabricaOnibus implements FabricaAutomovel {
    @Override
    public Automovel criaAutomovel() {
        return new Onibus();
    }
}
