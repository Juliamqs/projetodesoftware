package array;
import java.util.ArrayList;


public class array {
	    public static void main(String[] args) {
	      
	        ArrayList<String> listaNomes = new ArrayList<>();

	        
	        listaNomes.add("Ana");
	        listaNomes.add("Bruno");
	        listaNomes.add("Carlos");
            listaNomes.add("Amanda");
	       
            String letra="B";
            int cont=0;
	       
	       
	        for (int i = 0; i < listaNomes.size(); i++) {
	             String nome = listaNomes.get(i);
	             if (nome.startsWith(letra)) {
	        
	             cont++;
	             }       
	        }
	        System.out.println("Quantidade de nomes com a letra A:\n"  +cont);
	    }
}

	     

