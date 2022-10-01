package pacoteViagem;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Adquirindo pacote para o caribe: Pacote com "
				+ "Bebida (550R$), Massagem (300R$) e Passeio (800R$) inclusos");
		
		Pacote pacoteCruzeiro = new DecoradorServicoMassagem(
			new DecoradorServicoBebidas (
				new DecoradorPasseioExtra (
					new PacoteCruzeiro("Caribe", 9_000d)
				)
			)
		);
		
		System.out.println("Descrição: " + pacoteCruzeiro.getDescricao());
		System.out.println("Valor Final: " + pacoteCruzeiro.getPreco() + " R$");
		
	}
}
