public class JanelaDialogo extends JanelaAbstrata {
    public JanelaDialogo(IJanela j) {
        super(j);
    }

    @Override
    public void desenhar() {
        desenharJanela("Janela de Diálogo");
        desenharBotao("Sim");
        desenharBotao("Não");
        desenharBotao("Cancelar");
    }
}
