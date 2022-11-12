package lanchonete;

public class Main {
	public static void main(String[] args) {
		Lanchonete lanchonete = new Lanchonete();
		SanduichesIngredientFactory sanduiche;
		
		System.out.println("Preparando sanduiche [Juazeiro]\n");
		sanduiche = lanchonete.pedidoSanduiche("Juazeiro");
		sanduiche.getHamburguer();
		
		System.out.println("\nPreparando sanduiche [Crato]\n");
		sanduiche = lanchonete.pedidoSanduiche("Crato");
		sanduiche.getHamburguer();
		
		System.out.println("\nPreparando sanduiche [Barbalha]\n");
		sanduiche = lanchonete.pedidoSanduiche("Barbalha");
		sanduiche.getHamburguer();
	} 
}

