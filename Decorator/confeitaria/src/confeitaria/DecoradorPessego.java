package confeitaria;

public class DecoradorPessego extends BoloDecorator {
	public DecoradorPessego(Bolo boloMontado) {
		super(boloMontado, 3.0d + boloMontado.getPreco());
		System.out.println("adicionando pêssego... +3.0R$");
	}
}
