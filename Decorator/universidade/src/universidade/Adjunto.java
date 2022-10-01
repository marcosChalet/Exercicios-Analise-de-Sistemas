package universidade;

public class Adjunto extends Cargo {

	public Adjunto(double salario, String descricao) {
		super(salario, descricao);
	}

	@Override
	public double calculaSalario() {
		return salario + 2500;
	}

	@Override
	public String mostraNome() {
		return "Adjunto";
	}

}
