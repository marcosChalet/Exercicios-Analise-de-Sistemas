package atividade;

public class BancoB extends Banco {
	public BancoB() {}
	public BancoB(Banco proximoBanco, int codBanco) {
		super(proximoBanco, codBanco);
	}
}
