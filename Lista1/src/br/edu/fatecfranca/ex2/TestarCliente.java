package br.edu.fatecfranca.ex2;

public class TestarCliente {

	public static void main(String[] args) {
		//Cliente Fulano
		Cliente fulano = new Cliente(3431, 15432, "Fulano", 20);
		fulano.realizarDeposito(4);
		fulano.realizarSaque(14);
		fulano.dadosCliente();
		
		//Cliente Beltrano
		Cliente beltrano = new Cliente(1520, 20876, "Beltrano", 50);
		beltrano.realizarDeposito(20);
		beltrano.realizarSaque(10);
		beltrano.dadosCliente();

	}

}
