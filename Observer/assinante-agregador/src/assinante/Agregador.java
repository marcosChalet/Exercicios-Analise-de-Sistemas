package assinante;

import java.util.ArrayList;
import java.util.List;

public abstract class Agregador extends Noticiario {
	
	protected String textosNoticias, topico;
	protected int dia, mes;
	protected int qtdNoticias = 0;
	List<ConsomeNoticia> assinantes;
	
	public Agregador() {
		assinantes = new ArrayList<ConsomeNoticia>();
		this.topico = "All";
	}
	
	public Agregador(String topico) {
		textosNoticias = "";
		this.topico = topico;
		assinantes = new ArrayList<ConsomeNoticia>();
	}
	
	public void addAssinante(ConsomeNoticia assinante) {
		assinantes.add(assinante);
	}
	
	public void addNoticia(Noticia noticia) {
		//System.out.println(noticia.getTopico() + ", " + topico);
		if (noticia.getTopico().equals(topico) || topico.equals("mensal")) {
			textosNoticias += "* " + noticia.getTextoNoticia() + "\n";
			dia = noticia.getDia();
			mes = noticia.getMes();
			qtdNoticias++;
			
			notificaNoticiasAcumuladas();
		}
	}

	@Override
	public void notificaNoticia(Noticia noticia) {
		for (ConsomeNoticia cn : assinantes) {
			cn.notificaNoticia(noticia);
		}
	}
	
	public abstract void notificaNoticiasAcumuladas(); 
}
