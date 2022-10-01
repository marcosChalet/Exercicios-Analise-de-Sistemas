package pacoteViagem;

public class DecoradorServicoBebidas extends PacoteDecorator {
	public DecoradorServicoBebidas(Pacote pacote) {
		super(pacote, "Bebidas", 550.0);
	}
}
