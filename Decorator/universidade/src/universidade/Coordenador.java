package universidade;

public class Coordenador extends Incorporado {

	public Coordenador(double salario, String descricao) {
		super(salario, descricao);
	}

	@Override
	public double calculaSalario() {
		return cargo.calculaSalario() + 1000;
	}

	@Override
	public String mostraNome() {
		return cargo.mostraNome() + " incorporado como Coordenador";
	}

}
