package universidade;

public class Reitor extends Incorporado {

	public Reitor(double salario, String descricao) {
		super(salario, descricao);
	}
		

	@Override
	public double calculaSalario() {
		return cargo.calculaSalario() + 5000;
	}

	@Override
	public String mostraNome() {
		return cargo.mostraNome() + " incorporado como Reitor";
	}

}
