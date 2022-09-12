package atividade;

public class Main {

	public static void main(String[] args) {
		Banco proximo = null;
		
		BancoA bancoA = new BancoA(proximo, 1111);
		BancoB bancoB = new BancoB(bancoA,  2222);
		BancoC bancoC = new BancoC(bancoB,  3333);
		
		Pagamento pg1 = new Pagamento(500, 1111);
		Pagamento pg2 = new Pagamento(500, 2222);
		Pagamento pg3 = new Pagamento(500, 3333);
		
		bancoC.efetuarPagamento(pg1);
		bancoC.efetuarPagamento(pg2);
		bancoC.efetuarPagamento(pg3);
	}

}
