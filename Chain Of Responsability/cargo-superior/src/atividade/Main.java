package atividade;

public class Main {

	public static void main(String[] args) {
		Gestor proximo = null;

		Presidente presidente = new Presidente(proximo, 10_000, "Presidente");
		Diretor diretor1 = new Diretor(presidente, 4_000, "Diretor");
		Gerente gerente1 = new Gerente(diretor1, 1_800, "Gerente");
		Supervisor supervisor1 = new Supervisor(gerente1, 500, "Supervisor");
				
		Pedido pedido1 = new Pedido(3_000 , "Notebook"            );
		Pedido pedido2 = new Pedido(150   , "Mouse e Teclado"     );
		Pedido pedido3 = new Pedido(1_700 , "Mesa digitalizadora" );
		Pedido pedido4 = new Pedido(6_000 , "iMac"                );
		
		Verba v1 = new Verba(500);
		Verba v2 = new Verba(1_800);
		Verba v3 = new Verba(3_000);
		Verba v4 = new Verba(7_000);
			
		//diretor1.setProximo(presidente);
		//gerente1.setProximo(diretor1);
		//supervisor1.setProximo(gerente1);
		
		supervisor1.aprovarVerba(v1);
		supervisor1.aprovarVerba(v2);
		supervisor1.aprovarVerba(v3);
		supervisor1.aprovarVerba(v4);
		
		supervisor1.processarCompra(pedido1);
		supervisor1.processarCompra(pedido2);
		supervisor1.processarCompra(pedido3);
		supervisor1.processarCompra(pedido4);
		
	}

}
