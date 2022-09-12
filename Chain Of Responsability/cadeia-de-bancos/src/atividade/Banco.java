package atividade;

public abstract class Banco {

	protected Banco proximoBanco;
	private int codBanco;
	
	public Banco() {}
	public Banco(Banco proximoBanco, int codBanco) {
		this.proximoBanco = proximoBanco;
		this.codBanco = codBanco;
	}
	
	public void efetuarPagamento(Pagamento pagamento) {
		if (pagamento.getCodBancoDestino() == codBanco) {
			System.out.println("Pagamento de "+pagamento.getValor()+"R$ efetuado com sucesso pelo banco " + codBanco);
		} else {
			System.out.println("O banco " + codBanco + " não pode efetuar o pagamento de "+ pagamento.getValor() +
								"R$ do banco "+ pagamento.getCodBancoDestino() +". Passando para o próximo banco.");
			proximoBanco.efetuarPagamento(pagamento);
		}
	}
	
	public Banco getProximoBanco() {
		return proximoBanco;
	}
	public void setProximoBanco(Banco proximoBanco) {
		this.proximoBanco = proximoBanco;
	}
	public int getCodBanco() {
		return codBanco;
	}
	public void setCodBanco(int codBanco) {
		this.codBanco = codBanco;
	}
}
