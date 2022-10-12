package dance;

public class Main {

	public static void main(String[] args) {
		DanceTemplate personagem1 = new Mario();
		DanceTemplate personagem2 = new Goku();
		DanceTemplate personagem3 = new Sonic();
		
		System.out.println("=-=-=-=-= Personagem Mario =-=-=-=-=");
		personagem1.dancar();
		
		System.out.println("\n=-=-=-=-= Personagem Goku =-=-=-=-=");
		personagem2.dancar();
		
		System.out.println("\n=-=-=-=-= Personagem Sonic =-=-=-=-=");
		personagem3.dancar();
	}

}
