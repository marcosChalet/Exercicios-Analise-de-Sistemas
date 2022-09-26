package assinante;

public class Main {

	public static void main(String[] args) {
		Publicador assinante1 = new Publicador("Marcos", "tecnologia");
		Publicador assinante2 = new Publicador("Jorge", "greve");
		Publicador assinante3 = new Publicador("Maria", "greve");
		Publicador assinante4 = new Publicador("Amanda", "livro");
		Publicador assinante5 = new Publicador("Carla", "livro");
		Publicador assinante6 = new Publicador("Vinicius", "tecnologia");
		
		AgregadorPorQuantidade webAgregadorQtd = new AgregadorPorQuantidade("livro");
		AgregadorPorMes webAgregadorMes = new AgregadorPorMes();
		
		webAgregadorQtd.addAssinante(assinante1);
		webAgregadorQtd.addAssinante(assinante2);
		webAgregadorQtd.addAssinante(assinante3);
		webAgregadorQtd.addAssinante(assinante4);
		webAgregadorQtd.addAssinante(assinante5);
		webAgregadorQtd.addAssinante(assinante6);
		
		webAgregadorMes.addAssinante(assinante1);
		webAgregadorMes.addAssinante(assinante2);
		webAgregadorMes.addAssinante(assinante3);
		webAgregadorMes.addAssinante(assinante4);
		webAgregadorMes.addAssinante(assinante5);
		webAgregadorMes.addAssinante(assinante6);
		
		
		Noticia noticia1 = new Noticia("Caminhoneiros entram em greve...", 23, 7, "greve");
		Noticia noticia2 = new Noticia("Professores entram em greve...", 24, 7, "greve");
		Noticia noticia3 = new Noticia("Inteligência artificial do google...", 25, 8, "tecnologia");
		Noticia noticia4 = new Noticia("Dom Quixote: Leitura comentada...", 26, 8, "livro");
		Noticia noticia5 = new Noticia("O Cortiço: Leitura comentada...", 27, 9, "livro");
		Noticia noticia6 = new Noticia("Usuário recebe notícia falsa...", 28, 9, "tecnologia");
		
		System.out.println("=-=-=-=-= Agregador por quantidade de mensagens =-=-=-=-=");
		webAgregadorQtd.addNoticia(noticia1);
		webAgregadorQtd.addNoticia(noticia2);
		webAgregadorQtd.addNoticia(noticia3);
		webAgregadorQtd.addNoticia(noticia4);
		webAgregadorQtd.addNoticia(noticia5);
		webAgregadorQtd.addNoticia(noticia6);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("\n=-=-=-=-= Agregador por mensagens do mês =-=-=-=-=");
		webAgregadorMes.addNoticia(noticia1);
		webAgregadorMes.addNoticia(noticia2);
		webAgregadorMes.addNoticia(noticia3);
		webAgregadorMes.addNoticia(noticia4);
		webAgregadorMes.addNoticia(noticia5);
		webAgregadorMes.addNoticia(noticia6);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
	}
}
