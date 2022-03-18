package app;

import entites.Conta;
import entites.ContaCorrente;
import entites.ContaPoupança;

public class application {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		c.setTitular("Pedro Sampaio");
		c.setNumeroconta(123456789);
		c.setSaldo(7600.00);
		
		System.out.println(c);
		
		c.Depositar(1000);
		c.Sacar(500);

	}

}
