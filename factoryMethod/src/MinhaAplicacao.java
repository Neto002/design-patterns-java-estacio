public class MinhaAplicacao extends Aplicacao {
    @Override
    Documento criaDocumento() {
        return new MeuDocumento();
    }
}
