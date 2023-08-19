package atividadeVerificadora1.ProdutosConcretos;

import atividadeVerificadora1.ProdutosAbstratos.Automovel;

public class Carro implements Automovel {
    @Override
    public String tipoVeiculo() {
        return "Tipo de veículo: Carro";
    }
}
