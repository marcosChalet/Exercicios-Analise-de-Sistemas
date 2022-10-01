package pacoteViagem;

public class DecoradorServicoMassagem extends PacoteDecorator {
	public DecoradorServicoMassagem(Pacote pacote) {
		super(pacote, "Massagem", 300.0);
	}
}
