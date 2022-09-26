package assinante;

public class AgregadorPorQuantidade extends Agregador {

	private int quantidadeMaxima = 2;
	
	public AgregadorPorQuantidade(String topico) {
		super(topico);
	}
	
	@Override
	public void notificaNoticiasAcumuladas() {
		if (qtdNoticias == quantidadeMaxima) {
			Noticia n = new Noticia();
			
			n.setDia(dia);
			n.setMes(mes);
			n.setTopico(topico);
			n.setTextoNoticia(textosNoticias);
			
			notificaNoticia(n);
			
			textosNoticias = "";
			qtdNoticias = 0;
		}
	}
	
	public int getQuantidadeMaxima() {
		return quantidadeMaxima;
	}

}
