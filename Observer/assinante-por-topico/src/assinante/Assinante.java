package assinante;

public class Assinante implements ConsomeNoticia {

	private String nome, topico;
	
	public Assinante() {
		this.nome = "None";
		this.topico = "All";
	}
	public Assinante(String nome, String topico) {
		this.nome = nome;
		this.topico = topico;
	}
	
	public String getTopico() {
		return topico;
	}
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		if (this.topico.equals(topico)) {
			System.out.println("Olá " + nome + ". Notícia: " +
								topico + " [" + dia + "/" + mes + "]\n" +
								textoNoticia + "\n");
		}
	}

}
