package prateleira;

public class Usuario implements Observer {

	private String nome;
	
	public Usuario() {}
	public Usuario(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void update(Jogo jogo) {
		System.out.println("Olá " + nome + ". O jogo \"" + jogo.getNome() + 
						   "\" está disponível por apenas: " + jogo.getPreco() + " R$");
	}

}
