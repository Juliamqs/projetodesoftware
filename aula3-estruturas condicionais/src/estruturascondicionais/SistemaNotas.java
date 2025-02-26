package estruturascondicionais;

import java.util.Scanner;

public class SistemaNotas {

	public static void main(String[] args) {
		// Calcule a media de um aluno e diga se ele foi:
		// Aprovado - 7 a 10 
		// Recuperação - 5 a 6.9
		
		// mediaFinal = (media + notaExame) / 2
		// Aprovado - 7 a 10
		// Reprovado - 0 a 6.9
		
		
		// Reprovado - 0 a 4.9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota:");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota:");
		double nota2 = sc.nextDouble();
		
	
		 
		double media = ( nota1 + nota2) / 2;
	
		
		System.out.println("A sua média final foi de: " + media);
		
		if (media >= 7) {
		   System.out.println("Aprovado");
		}
		else if (media >= 5) {
			System.out.println("Recuperação");
			System.out.print("Digite a nota do exame:");
			double notaExame = sc.nextDouble();
			double mediaFinal = ( media + notaExame) / 2;
			if (mediaFinal > 6.9) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
		}
		else {
			 System.out.println("Reprovado");
		}
		 
		
		
		sc.close();
		

	}

}
