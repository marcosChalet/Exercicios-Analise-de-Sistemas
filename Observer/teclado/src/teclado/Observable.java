package teclado;

public interface Observable {
	public void addObserver(Observer label);
	public void removeObserver(Observer label);
	public void notificaObservers();
}
