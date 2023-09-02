public abstract class JanelaAbstrata {
    protected IJanela janela;

    public JanelaAbstrata(IJanela j) {janela = j;}

    public void desenharJanela(String titulo) {
        janela.desenharJanela(titulo);
    }

    public void desenharBotao(String titulo) {
        janela.desenharBotao(titulo);
    }

    public abstract void desenhar();
}
