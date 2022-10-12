package dance;

public abstract class DanceTemplate {
	
	public final void dancar() {
		movimento1();
		movimento2();
		saudacao();
	}
	
	public abstract void movimento1();
	public abstract void movimento2();
	public abstract void saudacao();
}
