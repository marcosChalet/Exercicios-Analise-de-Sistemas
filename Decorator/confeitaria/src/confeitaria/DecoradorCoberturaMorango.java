package confeitaria;

public class DecoradorCoberturaMorango extends BoloDecorator {
	public DecoradorCoberturaMorango(Bolo boloMontado) {
		super(boloMontado, 8.0d + boloMontado.getPreco());
		System.out.println("adicionando cobertura de morango... +8.0R$");
	}

}
