package assinante;

public class Main {

	public static void main(String[] args) {
		Assinante assinante1 = new Assinante("Marcos", "tecnologia");
		Assinante assinante2 = new Assinante("Jorge", "greve");
		Assinante assinante3 = new Assinante("Maria", "greve");
		Assinante assinante4 = new Assinante("Amanda", "livro");
		Assinante assinante5 = new Assinante("Carla", "livro");
		Assinante assinante6 = new Assinante("Vinicius", "tecnologia");
		Assinante assinante7 = new Assinante();
		NoticiarioAssina webNoticiario = new NoticiarioAssina();
		
		webNoticiario.addAssinante(assinante1);
		webNoticiario.addAssinante(assinante2);
		webNoticiario.addAssinante(assinante3);
		webNoticiario.addAssinante(assinante4);
		webNoticiario.addAssinante(assinante5);
		webNoticiario.addAssinante(assinante6);
		webNoticiario.addAssinante(assinante7);
		
		//webNoticiario.notificaNoticia("Um homem infarta após receber zero em uma prova", 27, 9, "Saúde pública");
		webNoticiario.notificaNoticia("Caminhoneiros entram em greve", 23, 9, "greve");
		webNoticiario.notificaNoticia("Professores entram em greve", 24, 9, "greve");
		webNoticiario.notificaNoticia("Inteligência artificial do google", 25, 9, "tecnologia");
		webNoticiario.notificaNoticia("Dom Quixote: Leitura comentada", 26, 9, "livro");
		webNoticiario.notificaNoticia("O Cortiço: Leitura comentada", 27, 9, "livro");
		webNoticiario.notificaNoticia("Usuário sem nome e tópico recebe notícia...", 28, 9, "all");
	}

}
