package preco;

public enum TipoDesconto {
	FISICO {
		//@Override
		public double valorDesconto() {
			return 0.30;
		}
	},
	DIGITAL {
		//@Override
		public double valorDesconto() {
			return 0.15;
		}
	};

	public abstract double valorDesconto();
}
