package main;

import frete.FreteStrategy;

public class Main {

	public static void main(String[] args) {

		FreteStrategy transportadora = EscolheTransportadora.transportadora();
		System.out.println("O valor do frete é: " + transportadora.calculaPreco(100) + " R$");

	}

}
