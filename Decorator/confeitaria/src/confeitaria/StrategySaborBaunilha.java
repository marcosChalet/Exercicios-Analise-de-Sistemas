package confeitaria;

public class StrategySaborBaunilha implements SaborStrategy {
	@Override
	public String getSabor() {
		return "baunilha";
	}

	@Override
	public double getPreco() {
		return 13.0d;
	}

	@Override
	public void adicionaSabor() {
		addSaborBaunilha();
	}

	public void addSaborBaunilha() {
		System.out.println("Define sabor como baunilha...");
	}
}
