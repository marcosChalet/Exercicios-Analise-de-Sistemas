package ex1;

public abstract class ClasseAbstrata {
	public final void templateMethod() {
		System.out.println("Classe abstrata [templateMethod");
		operacao1();
		operacao2();
	}
	
	public abstract void operacao1();
	public abstract void operacao2();
}
