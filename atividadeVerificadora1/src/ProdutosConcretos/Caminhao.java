package ProdutosConcretos;

import ProdutosAbstratos.Automovel;

public class Caminhao implements Automovel {
    @Override
    public String tipoVeiculo() {
        return "Tipo de veículo: Caminhão";
    }
}
