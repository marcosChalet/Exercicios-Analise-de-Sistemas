package pacoteViagem;

public class PacotePraia extends Pacote {
	public PacotePraia(String descricao, double preco) {
		super("[Praia] Selecionando pacote para: " + descricao, preco);
	}
}
