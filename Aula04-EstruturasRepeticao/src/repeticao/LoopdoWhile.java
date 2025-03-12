package repeticao;

import java.util.Scanner;

public class LoopdoWhile {

	public static void main(String[] args) {
		// Jogo de adivinhação
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Math.random());
		
		int maquina =(int) (Math.random() * 10);
		int usuario;
		
		do {
			System.out.print("Informe um numero: ");
			usuario = sc.nextInt();
		
		if(usuario < maquina) {
		    System.out.println("O número que voce digitou é menor ");
		}else if(usuario > maquina){
			System.out.println("O número que voce digitou é maior");
		} 
		}while(usuario != maquina);
		
		System.out.println("Parabéns, voce venceu");
		
		
		sc.close();

	}

}
