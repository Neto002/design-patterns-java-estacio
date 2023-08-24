public abstract class Aplicacao {
    private Documento doc;

    abstract Documento criaDocumento();

    void novoDocumento() {
        this.doc = this.criaDocumento();
    }
    void abrirDocumento() {
        this.doc.abrir();
    }
}
