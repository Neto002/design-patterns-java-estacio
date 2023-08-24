package ProdutosConcretos;

import ProdutosAbstratos.Automovel;

public class Carro implements Automovel {
    @Override
    public String tipoVeiculo() {
        return "Tipo de veículo: Carro";
    }
}
