package atividade;

public class Supervisor extends Gestor {
	
	public Supervisor() {}
	public Supervisor(Gestor proximo, double limite, String cargo) {
		super(proximo, limite, cargo);
	}
	
	@Override
	public void aprovarVerba(Verba v) {
		if (v.getValor() <= 1_000) {
			System.out.println("Verba de " + v.getValor() +
					" aprovada por cargo: " + this.getCargo() );
		} else {
			proximo.aprovarVerba(v);
		}
	}	
}
