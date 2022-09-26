package assinante;

public class Noticia {
	
	private String textoNoticia, topico;
	private int dia, mes;
	
	public Noticia() {}
	public Noticia(String textoNoticia, int dia, int mes, String topico) {
		this.textoNoticia = textoNoticia;
		this.topico = topico;
		this.dia = dia;
		this.mes = mes;
	}
	
	public String getTextoNoticia() {
		return textoNoticia;
	}
	public void setTextoNoticia(String textoNoticia) {
		this.textoNoticia = textoNoticia;
	}
	public String getTopico() {
		return topico;
	}
	public void setTopico(String topico) {
		this.topico = topico;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

}
