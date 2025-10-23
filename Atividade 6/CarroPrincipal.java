package sef.module8.sample;

public class CarroPrincipal {

	public static void main(String[] args) {
		Carro carro = new Carro("Renault", "Branco", 120000);
		
		carro.Exibir();
		carro.Ligar();
		carro.Movimentar();
		carro.Buzinar();
	}

}
