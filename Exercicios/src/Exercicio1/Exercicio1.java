package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus celsius :");
		double celsius = sc.nextDouble();
		double fahrtnheit = (celsius * 9 / 5) + 32;
		double kelvin = celsius + 273.15;
		
		System.out.println("a temperatura em fahrtnheit é: " + fahrtnheit);
		System.out.println(" a temperatura em kelvin é: " + kelvin);
		
		sc.close();
	}

}
