package entidades;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		
	}

	//Getters - Permite ler o valor do atributo
	
	public String getTitular() {
		return titular;
	} 
	
	public double getSaldo() {
		return saldo;
	}
	
	
	//Setters - Permite alterar o valor do atributo
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	//Metodo - Depositar
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
		else {
			System.out.println("Informe um valor válido");
		}
		
	}
	
	//Metodo - Sacar
	public void sacar(double valor) {
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("O saque no valor de R$" + valor + "foi efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insulficiene ou valor inválido");
		}
		
	}
	

	
	
	
	@Override
	public String toString() {
		return "titular: " + titular + 
				"\n saldo: R$" + saldo ;
	}

	


	
	
	

}
