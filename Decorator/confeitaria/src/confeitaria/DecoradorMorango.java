package confeitaria;

public class DecoradorMorango extends BoloDecorator {
	public DecoradorMorango(Bolo boloMontado) {
		super(boloMontado, 6.5d + boloMontado.getPreco());
		System.out.println("adicionando morango... +6.5R$");
	}
}
