package array;
import java.util.ArrayList;
import java.util.Iterator;

public class Remover {

	public static void main(String[] args) {

    ArrayList<String> palavras = new ArrayList<>();
    palavras.add("Sol");
    palavras.add("Porta");
	palavras.add("Celular");
	palavras.add("Computador");
	palavras.add("Papel");

	char letra = 'l';

    Iterator<String> iterator = palavras.iterator();
	while (iterator.hasNext()) {
		 String palavra = iterator.next();
		 if (palavra.contains(String.valueOf(letra))) {
		    iterator.remove();
		 }
    }

	System.out.println("Palavras sem a letra " + letra + ":");
	for (String palavra : palavras) {
	   System.out.println(palavra);
		        }
		   
	}

}
