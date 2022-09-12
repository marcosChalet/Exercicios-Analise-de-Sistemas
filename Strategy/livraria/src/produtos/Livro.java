package produtos;

import preco.DescontoStrategy;
import preco.Produto;

public class Livro extends Produto implements DescontoStrategy {
	
	double preco = 70.00;
	
	public Livro(){}
	public Livro(int ehDigital){
		super(ehDigital);
	}
	
	@Override
	public double valorTotal() {
		return precoComDesconto(this.preco);
	}
}
