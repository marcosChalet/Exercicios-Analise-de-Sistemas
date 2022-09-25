package prateleira;

public class Main {

	public static void main(String[] args) {
		Jogo gta = new Jogo("GTA", 130);
		Jogo cod = new Jogo("COD", 180);

		Usuario usr1 = new Usuario("Marcos");
		Usuario usr2 = new Usuario("Chalet");
		
		Prateleira prateleira = new Prateleira();
		
		prateleira.addObserver(usr1);
		prateleira.addObserver(usr2);
		
		prateleira.setJogo(gta);
		prateleira.setJogo(cod);
		
	}

}
