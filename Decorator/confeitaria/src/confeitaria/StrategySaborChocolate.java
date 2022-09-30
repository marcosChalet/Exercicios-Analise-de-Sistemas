package confeitaria;

public class StrategySaborChocolate implements SaborStrategy {
	
	@Override
	public String getSabor() {
		return "chocolate";
	}

	@Override
	public double getPreco() {
		return 16.0d;
	}

	@Override
	public void adicionaSabor() {
		addSaborChocolate();
	}

	public void addSaborChocolate() {
		System.out.println("Define sabor como chocolate...");
	}
}
