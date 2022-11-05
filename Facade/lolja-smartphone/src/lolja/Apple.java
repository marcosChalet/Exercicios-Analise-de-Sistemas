package lolja;

public class Apple implements LojaCelular {

	@Override
	public double getPreco() {
		return 3800;
	}

	@Override
	public String getModelo() {
		return "Apple Iphone 13";
	}

	@Override
	public int getQuantidadeEstoque() {
		return 500;
	}

}
