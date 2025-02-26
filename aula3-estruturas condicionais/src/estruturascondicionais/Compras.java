package estruturascondicionais;

import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {
		//Switch Case 
		// Máquina de Cartão
		
		// Métodos de Pagamento
		//   1 - Dinheiro/PIX - 10% de desconto
		//   2 - Debito - 5% de desconto
		//   3 - Credito - Valor Total
		
		// Valor da compra 
		
		// Metodos de Parcelamento
		// 1-  A vista = Valor Total
		// 2- 2x - 5% de juros
		// 3- 3x - 10% de juros
      
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Iforme o valor da sua compra R$:");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Metodos de pagamento");
		System.out.println("1 - Dinheiro/PIX");
		System.out.println("2 - Debito");
		System.out.println("3 - Credito");
		int metodoPagamento = sc.nextInt();
		
		
		switch (metodoPagamento) {
		   
		    case 1:
		    	double valorFinal = valorCompra * 0.9;
		    	System.out.println("Sua compra ficou R$:" + valorFinal);
		    	break;
		    case 2:
		        valorFinal = valorCompra * 0.95;
		        System.out.println("Sua compra ficou R$:" + valorFinal);
		        break;
		    case 3:
		    	System.out.println("Metodo de Parcelamento");
		    	System.out.println("1 - A vista");
		    	System.out.println("2 - 2x, 5% de juros");
		    	System.out.println("3 - 3x, 10% de juros");
		    	int metodoParcelamento = sc.nextInt();
		    	switch(metodoParcelamento) {
					case 1: 
						valorFinal = valorCompra;
						System.out.println("Sua compra ficou: " + valorCompra);
						break;
					case 2:
						valorFinal = (valorCompra * 1.05);
						System.out.println("Sua compra ficou R$:" + valorFinal);
						break;
					case 3:
						valorFinal = (valorCompra * 1.10);
						System.out.println("Sua compra ficou R$:" + valorFinal);
						break;
		    	}
		    	break;
		    default:
		    	System.out.println("Opção Invalida");
                break;		
		
		}
		sc.close();
	}

}
