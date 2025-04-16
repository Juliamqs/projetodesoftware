package exemplo;

public class Principal {

	public static void main(String[] args) {
		
		
		Carro civic = new Carro();
		
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.motor= 2.0;
		civic.placa = "EIC-2490";
		civic.cor = "Preta";
		civic.ano = 2024;
		civic.velocidade = 0;
		civic.acelera(20);
		civic.freiar(10);
		civic.exibirInfo();
		
		
		Carro corolla = new Carro();
		corolla.fabricante = "Toyota";
		corolla.modelo = "Corolla";
		corolla.motor = 2.0;
		corolla.placa = "EUC-2015";
		corolla.cor = "Preta";
		corolla.ano = 2023;
		corolla.velocidade = 0;
		corolla.acelera(20);
		corolla.freiar(10);
		corolla.exibirInfo();
		
		Carro porche = new Carro ();
		porche.fabricante = "Porche";
		porche.modelo = "Panamera";
		porche.motor = 2.9;
		porche.placa = "EUC-2025";
		porche.cor = "Prata";
		porche.ano = 2023;
		porche.velocidade = 0;
		porche.acelera(20);
		porche.freiar(10);
		porche.exibirInfo();
		

	}

}
