package prateleira;

import java.util.ArrayList;
import java.util.List;

public class Prateleira implements Observable {
	private List<Observer> usuarios;
	private List<Jogo> jogo;
	
	public Prateleira() {
		usuarios = new ArrayList<Observer>();
		jogo = new ArrayList<Jogo>();
	}
	
	public void setJogo(Jogo jogo) {
		this.jogo.add(jogo);
		notificaObservers();
	}

	@Override
	public void addObserver(Observer usuario) {
		usuarios.add(usuario);
	}

	@Override
	public void removeObserver(Observer usuario) {
		usuarios.remove(usuario);
	}

	@Override
	public void notificaObservers() {
		for (Observer ob : usuarios) {
			ob.update(this.jogo.get(this.jogo.size()-1));
		}
	}
}
