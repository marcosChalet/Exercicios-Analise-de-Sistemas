package atividade;

public class Presidente extends Gestor {
	public Presidente() {}
	public Presidente(Gestor proximo, double limite, String cargo) {
		super(proximo, limite, cargo);
	}
	
	@Override
	public void aprovarVerba(Verba v) {
		if (v.getValor() > 5_000) {
			System.out.println("Verba de " + v.getValor() +
					" aprovada por cargo: " + this.getCargo() );
		} else {
			proximo.aprovarVerba(v);
		}
	}
}
