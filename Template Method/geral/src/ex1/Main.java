package ex1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Template Method");
		
		ClasseAbstrata classe1 = new Concreta1();
		ClasseAbstrata classe2 = new Concreta2();
		
		classe1.operacao1();
		classe1.operacao2();
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=\n");
		
		classe2.operacao1();
		classe2.operacao2();
	}

}
