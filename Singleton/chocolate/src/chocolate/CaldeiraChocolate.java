package chocolate;

public class CaldeiraChocolate {

	public static final CaldeiraChocolate caldeira = new CaldeiraChocolate();
	private boolean empty;
	private boolean boiled;

	//só é iniciado quando a caldeira está vazia
	private CaldeiraChocolate() {
		this.empty = true;
		this.boiled = true;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			//preencha a caldeira com uma mistura de leite e chocolate
		}
	}
 
//para drenar a caldeira ela deve estar cheia e também em ebulição
	public void drain() {
		if(isEmpty() && isBoiled()) {
			//drene o leite e o chocolate fervidos
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			//coloque o conteúdo em ebulição
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	

}
