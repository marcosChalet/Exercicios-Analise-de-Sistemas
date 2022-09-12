package opcoesFrete;

import frete.FreteStrategy;

public class Fedex implements FreteStrategy{
	public double calculaPreco(double precoInicial) {
		double precoFinal = precoInicial * 1.7;
		return precoFinal;
	}
}
