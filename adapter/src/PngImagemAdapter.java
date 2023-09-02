public class PngImagemAdapter extends PngImagem implements IImagem {
    @Override
    public void carregarImagem(String nomeArquivo) {
        carregarImagemPng(nomeArquivo);
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        desenharImagemPng(largura, altura, posX, posY);
    }
}
