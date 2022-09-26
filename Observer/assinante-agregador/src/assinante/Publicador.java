package assinante;

public class Publicador implements ConsomeNoticia {

	private String nome, topico;
	
	public Publicador() {
		this.nome = "None";
		this.topico = "All";
	}
	public Publicador(String nome, String topico) {
		this.nome = nome;
		this.topico = topico;
	}
	
	public String getTopico() {
		return topico;
	}
	
	@Override
	public void notificaNoticia(Noticia noticia) {

		if (this.topico.equals(noticia.getTopico()) || noticia.getTopico().equals("mensal")) {
			System.out.println("Olá " + this.nome + ".\nTópico: " +
					noticia.getTopico() + " [" + noticia.getDia() + "/" + noticia.getMes() + "]\n" +
					noticia.getTextoNoticia());
		}
	}

}
