package opcoesFrete;

import frete.FreteStrategy;

public class Sedex implements FreteStrategy {
	public double calculaPreco(double precoInicial) {
		double precoFinal = precoInicial * 1.5;
		return precoFinal;
	}
}
