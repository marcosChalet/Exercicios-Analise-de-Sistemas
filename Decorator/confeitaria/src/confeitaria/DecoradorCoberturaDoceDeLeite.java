package confeitaria;

public class DecoradorCoberturaDoceDeLeite extends BoloDecorator {
	public DecoradorCoberturaDoceDeLeite(Bolo boloMontado) {
		super(boloMontado, 6.5d + boloMontado.getPreco());
		System.out.println("adicionando cobertura de doce de leite... +6.5R$");
	}
}
