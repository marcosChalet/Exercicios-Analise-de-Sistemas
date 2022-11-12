package lanchonete;

public class Lanchonete {
	public SanduichesIngredientFactory pedidoSanduiche(String cidade) {
		switch(cidade) {
		case "Juazeiro":
			return new SanduichesIngredienteFactoryJuazeiro();
		case "Crato":
			return new SanduichesIngredienteFactoryCrato();
		case "Barbalha":
			return new SanduichesIngredienteFactoryBarbalha();
		}
		return null;
	}
}
