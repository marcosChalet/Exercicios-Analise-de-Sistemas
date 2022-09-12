package livraria;

import java.util.Scanner;

import produtos.Jogo;
import produtos.Livro;
import produtos.Revista;

public class Main {

	public static void main(String[] args) {
		
		int produto, tipoProduto;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println(" Escolha um produto:\n" +
			" [1] Livro\n" +
			" [2] Revista\n" +
			" [3] Jogo");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.print("-> ");
			produto = input.nextInt();
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println(" Escolha uma opção:\n" +
			" [1] Físico  [tabuleiro | livro físico  | revista física]\n" +
			" [2] Digital [Videgame  | livro digital | revista digital]\n");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			tipoProduto = input.nextInt();
			tipoProduto--;
			
			if (produto == 1) {
				Livro l = new Livro(tipoProduto);
				System.out.println("Preço com desconto: " + l.valorTotal());
				
			}else if (produto == 2) {
				Revista r = new Revista(tipoProduto);
				System.out.println("Preço com desconto: " + r.valorTotal());
				
			}else {
				Jogo j = new Jogo(tipoProduto);
				System.out.println("Preço com desconto: " + j.valorTotal());
			}
		
		} catch (Exception e) {
			System.out.println("error! Tente novamente");
		}

	}

}
