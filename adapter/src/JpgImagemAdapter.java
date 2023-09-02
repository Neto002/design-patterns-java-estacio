public class JpgImagemAdapter extends JpgImagem implements IImagem {
    @Override
    public void carregarImagem(String nomeArquivo) {
        carregarImagemJpg(nomeArquivo);
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        desenharImagemJpg(largura, altura, posX, posY);
    }
}
