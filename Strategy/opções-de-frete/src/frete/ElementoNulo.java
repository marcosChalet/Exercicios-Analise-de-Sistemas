package frete;

public class ElementoNulo implements FreteStrategy {
	@Override
	public double calculaPreco(double precoInicial) {
		System.out.println("Tipo de frete inválido! Por padrão será selecionado o Sedex");
		return 1.5 * precoInicial;
	}
}
