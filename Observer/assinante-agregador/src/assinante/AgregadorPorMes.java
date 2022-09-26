package assinante;

public class AgregadorPorMes extends Agregador {

	private int primeiroMes = -1;
	
	public AgregadorPorMes() {
		super("mensal");
		primeiroMes = -1;
	}
	
	@Override
	public void notificaNoticiasAcumuladas() {

		if (primeiroMes == -1) {
			primeiroMes = mes;

		}else if (mes == primeiroMes + 1)  {
			Noticia n = new Noticia();
			
			n.setDia(0);
			n.setMes(mes);
			n.setTopico(topico);
			n.setTextoNoticia(textosNoticias);
			
			notificaNoticia(n);
			
			textosNoticias = "";
			qtdNoticias = 0;
			primeiroMes = -1;
		}
		
	}

}
