package aula2.Builder;

public class LeitorRTF {

    private ConversorTexto conversor;

    LeitorRTF(ConversorTexto c) {
        this.conversor = c;
    }

    /*public void lerRTF() {
        List<Token> tokens = obterTokensTexto();

        for (Token t : tokens) {
            if (t.getTipo() == Token.Tipo.CARACTERE) {
                conversor.converterCaractere(t.getCaractere());
            }
            if (t.getTipo() == Token.Tipo.PARAGRAFO) {
                conversor.converterParagrafo();
            }
            if (t.getTipo() == Token.Tipo.FONTE) {
                conversor.converterFonte();
            }
        }
    }*/
}
