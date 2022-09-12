package atividade;

public class BancoA extends Banco {
	public BancoA() {}
	public BancoA(Banco proximoBanco, int codBanco) {
		super(proximoBanco, codBanco);
	}
}
