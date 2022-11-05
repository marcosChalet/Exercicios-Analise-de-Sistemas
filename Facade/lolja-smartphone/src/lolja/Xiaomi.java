package lolja;

public class Xiaomi implements LojaCelular {

	@Override
	public double getPreco() {
		return 1700;
	}

	@Override
	public String getModelo() {
		return "Xiaomi Note 11 LTE";
	}

	@Override
	public int getQuantidadeEstoque() {
		return 99999;
	}

}
