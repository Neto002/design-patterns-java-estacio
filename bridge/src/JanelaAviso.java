public class JanelaAviso extends JanelaAbstrata {
    public JanelaAviso(IJanela j) {
        super(j);
    }

    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("Ok");
    }
}
