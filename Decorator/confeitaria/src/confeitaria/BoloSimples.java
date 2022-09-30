package confeitaria;

public class BoloSimples implements Bolo {	
	SaborStrategy sabor;

	BoloSimples(SaborStrategy sabor) {
		this.sabor = sabor;
		System.out.println("Preparando o bolo de " + sabor.getSabor() + "...   +" + sabor.getPreco() + "R$");
	}

	@Override
	public double getPreco() {
		return sabor.getPreco();
	}
}
