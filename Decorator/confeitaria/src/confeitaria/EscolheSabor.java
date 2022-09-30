package confeitaria;

public class EscolheSabor {
	public static SaborStrategy getSabor(int sabor) {

		if (sabor == 1) {
			return new StrategySaborChocolate();
		} else if(sabor == 2) {
			return new StrategySaborBaunilha();
		} else if(sabor == 3) {
			return new StrategySaborLaranja();
		} else if(sabor == 4) {
			return new StrategySaborLimao();
		}

		return null;
	}
}
