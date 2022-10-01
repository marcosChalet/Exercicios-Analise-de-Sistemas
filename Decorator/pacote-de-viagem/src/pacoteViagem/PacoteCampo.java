package pacoteViagem;

public class PacoteCampo extends Pacote {
	public PacoteCampo(String descricao, double preco) {
		super("[Campo] Selecionando pacote para: " + descricao, preco);
	}
}
