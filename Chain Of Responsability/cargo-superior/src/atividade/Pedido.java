package atividade;

public class Pedido {
	
	private double valor;
	private String descricao;

	public Pedido() {}
	public Pedido(double valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}
		
	public double getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
