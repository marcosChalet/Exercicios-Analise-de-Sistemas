package opcoesFrete;

import frete.FreteStrategy;

public class JadLog implements FreteStrategy {
	public double calculaPreco(double precoInicial) {
		double precoFinal = precoInicial * 1.2;
		return precoFinal;
	}
}
