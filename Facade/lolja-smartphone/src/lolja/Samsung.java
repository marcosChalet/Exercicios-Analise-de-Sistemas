package lolja;

public class Samsung implements LojaCelular {

	@Override
	public double getPreco() {
		return 1900;
	}

	@Override
	public String getModelo() {
		return "Samsung Galaxy A52s";
	}

	@Override
	public int getQuantidadeEstoque() {
		return 8700;
	}

}
