package repeticao;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		//Login e Senha
		//Limitar o numero de tentativas em 5 vezes
		
		Scanner sc = new Scanner(System.in);
		String loginSalvo = "admin";
		String senhaSalva = "admin";
		String login = "";
		String senha = "";
		int tentativas= 1;
		int maxTentativas = 5 ;
		
		
		
		while (true) {
			
			System.out.println("Digite seu login:");
			login = sc.nextLine();
			
			System.out.println("Digite sua senha:");
			senha = sc.nextLine();
			
			
			if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
			   System.out.println("Acesso liberado");
			   break;
			}
			else if(tentativas >= maxTentativas ) {
				System.out.println("Número maxímo de tentativas excedidas");
				break;
			}
			else {
				tentativas++;
				System.out.println("Acesso negado,tente novamente");
			}
		}
			
		
		
		sc.close();

	}

	}
