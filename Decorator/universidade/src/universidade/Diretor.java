package universidade;

public class Diretor extends Incorporado {

	public Diretor(double salario, String descricao) {
		super(salario, descricao);
	}

	@Override
	public double calculaSalario() {
		return cargo.calculaSalario() + 2000;
	}

	@Override
	public String mostraNome() {
		return cargo.mostraNome() + " incorporado como Diretor";
	}

}
