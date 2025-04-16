package poo;

public class Principal {

	public static void main(String[] args) {
		
		ContaMes janeiro = new ContaMes();
		ContaMes fevereiro = new ContaMes();
		
		//Gastos Janeiro
		janeiro.alimentacao = 1500;
		janeiro.agua = 300;
		janeiro.luz = 300;
		
		//Gastos Fevereiro
		fevereiro.alimentacao = 2000;
		fevereiro.agua = 300;
		fevereiro.luz = 300;
		
		//Gasto Total
		double gastoJan = janeiro.somaGasto();
		double gastoFev = fevereiro.somaGasto();
		
		if (gastoJan > gastoFev) {
			System.out.println("O gasto de Janeiro foi maior que Fevereiro");
		}
		else if (gastoFev > gastoJan) {
			System.out.println("O gasto de Fevereiro foi maior que Janeiro");
		}
		else {
			System.out.println("Ambos os meses tiveram o mesmo gato");
		}
		
		
		
		
	}

}
