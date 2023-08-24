package ProdutosConcretos;

import ProdutosAbstratos.Automovel;

public class Onibus implements Automovel {
    @Override
    public String tipoVeiculo() {
        return "Tipo de veículo: Ônibus";
    }
}
