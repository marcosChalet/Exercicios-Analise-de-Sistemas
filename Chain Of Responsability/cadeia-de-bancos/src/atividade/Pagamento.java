package atividade;

public class Pagamento {
	private double valor;
	private int codBancoDestino;
	
	public Pagamento() {}
	public Pagamento(double valor, int codBancoDestino) {
		this.valor = valor;
		this.codBancoDestino = codBancoDestino;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCodBancoDestino() {
		return codBancoDestino;
	}
	public void setCodBancoDestino(int codBancoDestino) {
		this.codBancoDestino = codBancoDestino;
	}
}
