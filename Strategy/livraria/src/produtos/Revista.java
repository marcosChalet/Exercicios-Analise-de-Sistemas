package produtos;

import preco.DescontoStrategy;
import preco.Produto;

public class Revista extends Produto implements DescontoStrategy {
	double preco = 30.00;
	
	public Revista(){}
	public Revista(int ehDigital){
		super(ehDigital);
	}
	
	@Override
	public double valorTotal() {
		return precoComDesconto(this.preco);
	}
}
