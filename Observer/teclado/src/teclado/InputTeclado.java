package teclado;

import java.util.ArrayList;
import java.util.List;

public class InputTeclado implements Observable {
	private List<Observer> observados;
	private String texto;
	
	InputTeclado() {
		observados = new ArrayList<Observer>();
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
		notificaObservers();
	}

	@Override
	public void addObserver(Observer label) {
		observados.add(label);
	}

	@Override
	public void removeObserver(Observer label) {
		observados.remove(label);
	}

	@Override
	public void notificaObservers() {
		for (Observer ob : observados) {
			ob.update(this.texto);
		}
	}
	
}
