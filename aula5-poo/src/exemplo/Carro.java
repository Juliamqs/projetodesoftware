package exemplo;

public class Carro {
	//Atributos
	double motor;
	String fabricante;
	String modelo;
	int ano;
	String placa;
	String cor;
	int velocidade;
	
	public void exibirInfo() {
		System.out.println(
				"fabricante:" + fabricante +
				"\nmodelo:" + modelo +
				"\ncor:" + cor +
				"\nano:" + ano +
				"\nplaca:" + placa +
				"\nmotor:" + motor +
				"\nvelocidade:" + velocidade
				
				);
	}
	public void acelera(int vel) {
		velocidade = velocidade + vel;
		
			
	}
	public void freiar (int frei) {
		velocidade = velocidade - frei;
	}


}

