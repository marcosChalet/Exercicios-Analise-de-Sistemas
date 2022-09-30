package confeitaria;

public class StrategySaborLimao implements SaborStrategy {
	@Override
	public String getSabor() {
		return "limão";
	}

	@Override
	public double getPreco() {
		return 15.0d;
	}

	@Override
	public void adicionaSabor() {
		addSaborLimao();
	}

	public void addSaborLimao() {
		System.out.println("Define sabor como limão...");
	}
}
