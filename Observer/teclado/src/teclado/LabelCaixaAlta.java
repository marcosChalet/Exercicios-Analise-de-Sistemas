package teclado;

public class LabelCaixaAlta implements Observer {

	@Override
	public void update(String texto) {
		System.out.println("Caixa alta: " + texto.toUpperCase());
	}

}
