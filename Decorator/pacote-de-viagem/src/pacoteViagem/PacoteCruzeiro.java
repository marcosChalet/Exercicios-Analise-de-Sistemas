package pacoteViagem;

public class PacoteCruzeiro extends Pacote {
	public PacoteCruzeiro(String descricao, double preco) {
		super("[Cruzeiro] Selecionando pacote para: " + descricao, preco);
	}
}
