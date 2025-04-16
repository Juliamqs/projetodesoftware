package principal;

import entidades.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria joao = new ContaBancaria("João",1000);
		
		//Acessando o atributo
		//System.out.println(joao.saldo);
		//Alterando o atributo
		//joao.saldo = 3000;
		
		System.out.println("Titular: " + joao.getTitular());
		System.out.println("Saldo: " + joao.getSaldo());
		
		//Alterando o atributo privado
		joao.setTitular("João Kléber");
		joao.depositar(500);
		joao.depositar(1000);
		joao.depositar(-50);
		
		joao.sacar(3000);
		joao.sacar(200);
		
		System.out.println(joao.toString());
		
		
	

	}

}
