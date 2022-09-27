package teclado;

public class LabelNumCaracteres implements Observer {
	@Override
	public void update(String texto) {
		System.out.println("Número de caracteres: " + texto.length());
	}
}
