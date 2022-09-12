package preco;

public abstract class Produto {
	
	private TipoDesconto desconto;
	private int ehDigital = 0;
	
	public Produto() {
		desconto = TipoDesconto.values()[ehDigital];
	}
	
	public Produto(int ehDigital) {
		this.ehDigital = ehDigital;
		this.desconto = TipoDesconto.values()[ehDigital];
	}
	
	public double precoComDesconto(double preco) {
		return (1 - desconto.valorDesconto()) * preco;
	}
}
