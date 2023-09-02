public abstract class CoquetelDecorator extends Coquetel {
    private Coquetel coquetel;

    public CoquetelDecorator(Coquetel coquetel) {
        this.coquetel = coquetel;
    }

    @Override
    public String getNome() {
        return coquetel.getNome() + " + " + this.nome;
    }

    @Override
    public double getPreco() {
        return coquetel.getPreco() + this.preco;
    }
}
