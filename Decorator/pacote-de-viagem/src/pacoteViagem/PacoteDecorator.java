package pacoteViagem;

public abstract class PacoteDecorator extends Pacote {
	
	protected Pacote pacote;
	
	public PacoteDecorator(Pacote pacote, String descricaoServ, double precoServ) {
		super(pacote.getDescricao() + " + " + descricaoServ, pacote.getPreco() + precoServ);
		this.pacote = pacote;
	}
}
