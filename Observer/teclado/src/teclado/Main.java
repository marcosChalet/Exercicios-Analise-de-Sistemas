package teclado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		InputTeclado       tecladoOb = new InputTeclado();
		LabelNumPalavras   labelA    = new LabelNumPalavras();
		LabelNumCaracteres labelB    = new LabelNumCaracteres();
		LabelCaixaAlta     labelC    = new LabelCaixaAlta();
		String texto;
		
		tecladoOb.addObserver(labelA);
		tecladoOb.addObserver(labelB);
		tecladoOb.addObserver(labelC);
		
		try (Scanner input = new Scanner(System.in)) {
			while (true) {
				try {
					System.out.print("Entre com o texto:\n-> ");
					texto = input.nextLine();
					System.out.println("\n********* PROCESSAMENTO *********");
					System.out.println("\nTexto: [" + texto + "]\n");
					tecladoOb.setTexto(texto);
					System.out.println("\n=-=-=-=-=-=-= FIM =-=-=-=-=-=-=-=\n");
					
				}catch(Exception e) {
					System.out.println("Error");
				}
			}
		}
		
	}

}
