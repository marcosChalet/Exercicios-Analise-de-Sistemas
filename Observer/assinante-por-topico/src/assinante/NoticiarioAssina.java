package assinante;

import java.util.ArrayList;
import java.util.List;

public class NoticiarioAssina extends Noticiario {

	List<ConsomeNoticia> assinantes;
	
	public NoticiarioAssina() {
		assinantes = new ArrayList<ConsomeNoticia>();
	}
	
	public void addAssinante(ConsomeNoticia assinante) {
		assinantes.add(assinante);
	}
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		for (ConsomeNoticia cn : assinantes) {
			cn.notificaNoticia(textoNoticia, dia, mes, topico);
		}
	}

}
