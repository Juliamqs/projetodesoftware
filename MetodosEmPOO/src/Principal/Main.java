package Principal;

import java.util.Scanner;

import entidades.livro;

public class Main {

	public static void main(String[] args) {
		livro culpaDasEstrelas = new livro();
		Scanner sc = new Scanner(System.in);
		
		culpaDasEstrelas.livro = "A culpa é das estrelas";
		culpaDasEstrelas.autor = "John Green";
		culpaDasEstrelas.quantidade = 100;
		culpaDasEstrelas.valorUnit = 80;
		
		System.out.println(culpaDasEstrelas.exibeInfo());
		
		livro verity = new livro ();
		
		verity.livro= "Verity";
		verity.autor = "Colleen Hoover";
		verity.quantidade = 50;
		verity.valorUnit = 60;
		System.out.println(verity.exibeInfo());
		
		System.out.println("Informe a quantidade de livros emprestados:");
		int quantidade = sc.nextInt();
		verity.emprestaLivro(quantidade);
		
		System.out.println("Informe a quantidade de livros devolvidos:");
		quantidade = sc.nextInt();
		verity.devolveLivro(quantidade);
		
		System.out.println("Dados atualizados" +verity.exibeInfo());
		sc.close();
			
	}

	
	
}
