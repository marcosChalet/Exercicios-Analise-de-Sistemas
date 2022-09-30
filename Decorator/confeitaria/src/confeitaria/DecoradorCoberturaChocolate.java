package confeitaria;

public class DecoradorCoberturaChocolate extends BoloDecorator {
	public DecoradorCoberturaChocolate(Bolo boloMontado) {
		super(boloMontado, 7.0d + boloMontado.getPreco());
		System.out.println("adicionando cobertura de chocolate... +7.0R$");
	}
}
