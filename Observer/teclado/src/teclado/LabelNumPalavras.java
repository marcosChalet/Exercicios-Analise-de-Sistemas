package teclado;

public class LabelNumPalavras implements Observer {

	@Override
	public void update(String texto) {
		int count = 1;
		
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == ' ') {
				count++;
			}
		}
		
		System.out.println("Número de palavras: " + count);
	}

}
