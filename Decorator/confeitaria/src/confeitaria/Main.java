package confeitaria;

public class Main {
	public static void main(String[] args) {

		SaborStrategy sabor1 = EscolheSabor.getSabor(1);
		SaborStrategy sabor2 = EscolheSabor.getSabor(2);
		SaborStrategy sabor3 = EscolheSabor.getSabor(3);

		System.out.println("*************** Primeiro Bolo ***************");
		Bolo boloPronto1 = new DecoradorMorango(
			new DecoradorAmora(
				new DecoradorAmora(
					new DecoradorCoberturaMorango(
						new BoloSimples(sabor1)
					)
				)
			)
		);

		System.out.println("Preço Final: " + boloPronto1.getPreco() + "R$");
		System.out.println("*********************************************\n");


		System.out.println("*************** Segundo Bolo ***************");
		Bolo boloPronto2 = new DecoradorMorango(
			new DecoradorPessego(
				new DecoradorAmora(
					new DecoradorCoberturaDoceDeLeite(
						new BoloSimples(sabor2)
					)
				)
			)
		);

		System.out.println("Preço Final: " + boloPronto2.getPreco() + "R$");
		System.out.println("********************************************\n");

		System.out.println("*************** Terceiro Bolo ***************");
		Bolo boloPronto3 = new DecoradorMorango(
			new DecoradorAmora(
				new DecoradorCoberturaChocolate(
					new BoloSimples(sabor3)
				)
			)
		);

		System.out.println("Preço Final: " + boloPronto3.getPreco() + "R$");
		System.out.println("*********************************************");
	}
}
