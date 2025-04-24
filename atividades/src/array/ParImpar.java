package array;
import java.util.ArrayList;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<String> pares = new ArrayList<>();
        ArrayList<String> impares = new ArrayList<>();


        
        System.out.println("Digite as palavras(para encerrar digite fim):");
        while (true) {
            String palavra = scanner.nextLine();

            if (palavra.equals("fim")) {
                break; 
            }
           
            if (palavra.length() % 2 == 0) {
            	pares.add(palavra);
            }
            else {
            	impares.add(palavra);
            }
        }
            

        	System.out.println("\nPalavras ordenadas pelo comprimento par:");
        	for (String palavra : pares) {
        		System.out.println(palavra);
        	}
        	
        	System.out.println("\nPalavras ordenadas pelo comprimento par:");
        	for (String palavra : impares) {
        		System.out.println(palavra);
        	}
        
        
        
        
        scanner.close();
    }
}
