public class JanelaLinux implements IJanela {
    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + ": Janela Linux");
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + ": Botão Linux");
    }
}
