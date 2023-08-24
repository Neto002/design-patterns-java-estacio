import Builders.AutomovelBuilder;
import FabricasAbstratas.FabricaAutomovel;
import FabricasConcretas.FabricaCaminhao;
import FabricasConcretas.FabricaCarro;
import FabricasConcretas.FabricaOnibus;
import ProdutosAbstratos.Automovel;
import enums.TipoVeiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        FabricaAutomovel fabricaAutomoveis = null;
        AutomovelBuilder builder;
        Automovel automovel;

        System.out.println("Digite o tipo de veículo que deseja criar: ");
        String tipoVeiculo = teclado.next();

        if (tipoVeiculo.equalsIgnoreCase(String.valueOf(TipoVeiculo.CARRO))) {
            fabricaAutomoveis = new FabricaCarro();
        } else if (tipoVeiculo.equalsIgnoreCase(String.valueOf(TipoVeiculo.ONIBUS))) {
            fabricaAutomoveis = new FabricaOnibus();
        } else if (tipoVeiculo.equalsIgnoreCase(String.valueOf(TipoVeiculo.CAMINHAO))) {
            fabricaAutomoveis = new FabricaCaminhao();
        }

        if (fabricaAutomoveis != null) {
            builder = new AutomovelBuilder(fabricaAutomoveis);
            automovel = builder.build();
            System.out.println(automovel.tipoVeiculo());
        }
    }
}