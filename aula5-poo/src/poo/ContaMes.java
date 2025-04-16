package poo;

public class ContaMes {
	double agua;
	double alimentacao;
	double luz;
	
	public double somaGasto() {
		double gastoMes = agua + alimentacao + luz;
		return gastoMes;
	}
	
	
}
