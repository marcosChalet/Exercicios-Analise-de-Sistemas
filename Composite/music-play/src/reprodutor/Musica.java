package reprodutor;

public class Musica implements Componente {

	private String nome;
	private String artista;
	private float velocidade;
	
	public Musica(String nome, String artista) {
		this.nome = nome;
		this.artista = artista;
	}
	
	public String getArtista() {
		return artista;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando: " + nome);
		velocidade = 1;
	}

	@Override
	public void setVelocidadeReproducao(float velocidade) {
		this.velocidade = velocidade;
		System.out.println("Velocidade: " + this.velocidade + "x");
	}

	@Override
	public String getNome() {
		return nome;
	}
	
}
