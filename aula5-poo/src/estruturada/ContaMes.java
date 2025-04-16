package estruturada;

public class ContaMes {

	public static void main(String[] args) {
		double janAlim, janAgua, janLuz, fevAlim, fevAgua, fevLuz;
		
		//Gatos Janeiro
		janAlim = 1000;
		janAgua = 300;
		janLuz = 300;
		
		//Gastos Fevereiro
		fevAlim = 2000;
		fevAgua = 300;
		fevLuz = 300;
		
		//Gasto Total
		double gastoTotaljan = janAgua + janAlim + janLuz;
		double gastoTotalfev = fevAgua + fevAlim + fevLuz;
		
		if(gastoTotaljan > gastoTotalfev) {
			System.out.println("O gasto de Janeiro foi maior");
		}
		else if (gastoTotalfev > gastoTotaljan) {
			System.out.println("O gasto de Fevereiro foi maior");
		}
		else {
			System.out.println("Ambos os meses tiverem o mesmo gasto");
		}
	}
	

}
