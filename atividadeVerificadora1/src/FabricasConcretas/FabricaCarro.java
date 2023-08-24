package FabricasConcretas;

import FabricasAbstratas.FabricaAutomovel;
import ProdutosAbstratos.Automovel;
import ProdutosConcretos.Carro;

public class FabricaCarro implements FabricaAutomovel {
    @Override
    public Automovel criaAutomovel() {
        return new Carro();
    }
}
