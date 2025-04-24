package array;
import java.util.ArrayList;
public class Pares {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();

		       
		num.add(5);
		num.add(8);
		num.add(17);
		num.add(24);
		num.add(14);
		num.add(10);

		ArrayList<Integer> numerosPares = new ArrayList<>();

		for (int i = 0; i < num.size(); i++) {
		   int numero = num.get(i);
		   if (numero % 2 == 0) {
		     numerosPares.add(numero);
		            }
		        }

		     
		System.out.println("Números pares da lista:");
		for (int numero : numerosPares) {
		System.out.println(numero);
		        }
	
	}

}
