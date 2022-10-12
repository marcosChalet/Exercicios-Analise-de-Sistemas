package dance;

public class Mario extends DanceTemplate {

	@Override
	public void movimento1() {
		System.out.println("Joga cogumelo para cima...");
	}

	@Override
	public void movimento2() {
		System.out.println("Faz um giro de 360º...");
	}

	@Override
	public void saudacao() {
		System.out.println("Acena com o chapéu...");
	}

}
