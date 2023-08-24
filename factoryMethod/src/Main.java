public class Main {
    public static void main(String[] args) {
        MinhaAplicacao aplicacao = new MinhaAplicacao();
        Documento doc = aplicacao.criaDocumento();

        doc.abrir();

        MeuDocumento meuDocumento = new MeuDocumento();

        System.out.println("Documento: " + meuDocumento.getWord());
    }
}