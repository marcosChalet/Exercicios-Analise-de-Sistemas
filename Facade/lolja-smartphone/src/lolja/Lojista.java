package lolja;

public class Lojista {
	private LojaCelular apple;
	private LojaCelular samsung;
	private LojaCelular xiaomi;
	
	public Lojista() {
		apple = new Apple();
		samsung = new Samsung();
		xiaomi = new Xiaomi();
	}
	
	public void appleVenda() {
		System.out.println("\nModelo:  " + apple.getModelo() + "\n" + 
					"Preço:   " + apple.getPreco() + "\n" +
					"Estoque: " + apple.getQuantidadeEstoque() + "\n"
		);
	}
	
	public void samsungVenda() {
		System.out.println("\nModelo:  " + samsung.getModelo() + "\n" +
				   "Preço:   " + samsung.getPreco() + "\n" +
				   "Estoque: " + samsung.getQuantidadeEstoque() + "\n"
		);
	}

	public void xiaomiVenda() {
		System.out.println("\nModelo:  " + xiaomi.getModelo() + "\n" +
				   "Preço:   " + xiaomi.getPreco() + "\n" +
				   "Estoque: " + xiaomi.getQuantidadeEstoque() + "\n"
		);
	}

}
