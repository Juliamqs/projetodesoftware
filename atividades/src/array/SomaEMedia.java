package array;
import java.util.ArrayList;
public class SomaEMedia {

	public static void main(String[] args) {

	ArrayList<Integer> numeros = new ArrayList<>();

	numeros.add(10);
	numeros.add(8);
	numeros.add(9);
	numeros.add(7);
			       
    int soma = 0;
    double media;
			       
			       
	for (int i = 0; i < numeros.size(); i++) {
	     soma += numeros.get(i);
	}       
	    media=(double) soma/numeros.size();
	    System.out.println("A soma dos números é:" +soma);
	    System.out.println("A média dos números é:" +media);

			 
	}

}
