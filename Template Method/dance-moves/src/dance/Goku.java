package dance;

public class Goku extends DanceTemplate {

	@Override
	public void movimento1() {
		System.out.println("Faz alongamento...");
	}

	@Override
	public void movimento2() {
		System.out.println("Olha para os lados...");
	}

	@Override
	public void saudacao() {
		System.out.println("Movimento de negação com a cabeça...");
	}

}
