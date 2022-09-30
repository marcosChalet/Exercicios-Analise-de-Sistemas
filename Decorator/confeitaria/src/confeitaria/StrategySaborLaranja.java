package confeitaria;

public class StrategySaborLaranja implements SaborStrategy {
	
	@Override
	public String getSabor() {
		return "laranja";
	}

	@Override
	public double getPreco() {
		return 15.0d;
	}

	@Override
	public void adicionaSabor() {
		addSaborLaranja();
	}

	public void addSaborLaranja() {
		System.out.println("Define sabor como laranja...");
	}
}
