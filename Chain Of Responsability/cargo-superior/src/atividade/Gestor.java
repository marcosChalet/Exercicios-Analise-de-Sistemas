package atividade;

public abstract class Gestor {
	protected Gestor proximo;
	private double limiteDeGastos;
	private String cargo;
	
	public Gestor() {}
	public Gestor(Gestor proximo, double limite, String cargo) {
		this.proximo = proximo;
		this.limiteDeGastos = limite;
		this.cargo = cargo;
	}
	
	public abstract void aprovarVerba(Verba v);
	
	public void processarCompra(Pedido pedido) {
		
		if (pedido.getValor() <= limiteDeGastos) {
			System.out.println("O " + cargo + " aprovou o a compra no valor de " + pedido.getValor());
		} else if (proximo != null) {
			proximo.processarCompra(pedido);
		} else {
			System.out.println("O limite de gastos ("+ limiteDeGastos +" R$) foi ultrapassado " +
								"ou o cargo não possui superior");
		}
		
	}
	
	public Gestor getProximo() {
		return proximo;
	}
	public void setProximo(Gestor proximo) {
		this.proximo = proximo;
	}
	public double getLimiteDeGastos() {
		return limiteDeGastos;
	}
	public void setLimiteDeGastos(double limite) {
		this.limiteDeGastos = limite;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
