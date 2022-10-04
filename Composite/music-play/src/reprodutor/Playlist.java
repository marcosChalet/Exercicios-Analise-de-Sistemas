package reprodutor;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Componente {

	private String nome;
	private List<Componente> playlist;
	
	public Playlist(String nome){
		playlist = new ArrayList<Componente>();
		this.nome = nome;
	}
	
	
	@Override
	public void tocar() {
		for (Componente c : playlist) {
			c.tocar();
		}
	}

	@Override
	public void setVelocidadeReproducao(float velocidade) {
		for (Componente c : playlist) {
			c.setVelocidadeReproducao(velocidade);
		}
	}

	@Override
	public String getNome() {
		return nome;
	}
	
	public void add(Componente c) {
		playlist.add(c);
	}
	
	public void remover(Componente c) {
		playlist.remove(c);
	}

}
