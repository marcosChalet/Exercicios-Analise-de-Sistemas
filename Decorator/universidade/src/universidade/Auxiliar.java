package universidade;

public class Auxiliar extends Cargo {

	public Auxiliar(double salario, String descricao) {
		super(salario, descricao);
	}

	@Override
	public double calculaSalario() {
		return salario + 1000;
	}

	@Override
	public String mostraNome() {
		return "Auxiliar";
	}
}
