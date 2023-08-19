package atividadeVerificadora1;

import atividadeVerificadora1.Builders.AutomovelBuilder;
import atividadeVerificadora1.FabricasAbstratas.FabricaAutomovel;
import atividadeVerificadora1.FabricasConcretas.FabricaCaminhao;
import atividadeVerificadora1.FabricasConcretas.FabricaCarro;
import atividadeVerificadora1.FabricasConcretas.FabricaOnibus;
import atividadeVerificadora1.ProdutosAbstratos.Automovel;
import atividadeVerificadora1.enums.TipoVeiculo;

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
