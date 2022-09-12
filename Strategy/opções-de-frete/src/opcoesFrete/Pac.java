package opcoesFrete;

import frete.FreteStrategy;

public class Pac implements FreteStrategy{
	public double calculaPreco(double precoInicial) {
		double precoFinal = precoInicial * 1.4;
		return precoFinal;
	}
}
