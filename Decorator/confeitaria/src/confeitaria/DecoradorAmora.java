package confeitaria;

public class DecoradorAmora extends BoloDecorator {
	public DecoradorAmora(Bolo boloMontado) {
		super(boloMontado, 4.0d + boloMontado.getPreco());
		System.out.println("adicionando amora...   +4.0R$");
	}
}
