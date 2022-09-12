package atividade;

public class Gerente extends Gestor {
	public Gerente() {}
	public Gerente(Gestor proximo, double limite, String cargo) {
		super(proximo, limite, cargo);
	}
	@Override
	public void aprovarVerba(Verba v) {
		if (v.getValor() <= 2_000) {
			System.out.println("Verba de " + v.getValor() +
					" aprovada por cargo: " + this.getCargo() );
		} else {
			proximo.aprovarVerba(v);
		}
	}
}
