package produtos;

import preco.DescontoStrategy;
import preco.Produto;

public class Jogo extends Produto implements DescontoStrategy {
	double preco = 100.00;
	
	public Jogo(){}
	public Jogo(int ehDigital){
		super(ehDigital);
	}
	
	@Override
	public double valorTotal() {
		return precoComDesconto(this.preco);
	}
}
