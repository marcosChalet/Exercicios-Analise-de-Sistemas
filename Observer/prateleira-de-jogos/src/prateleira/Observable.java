package prateleira;

public interface Observable {
	public void addObserver(Observer usuario);
	public void removeObserver(Observer usuario);
	public void notificaObservers();
}
