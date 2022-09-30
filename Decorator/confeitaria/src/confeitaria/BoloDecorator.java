package confeitaria;

public abstract class BoloDecorator implements Bolo {
	protected Bolo boloMontado;
	protected double preco;

	public BoloDecorator(Bolo boloMontado, double preco) {
		this.boloMontado = boloMontado;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
}
