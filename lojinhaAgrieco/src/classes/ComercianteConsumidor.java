package classes;

import java.util.Scanner;

public class ComercianteConsumidor extends Comerciantes {
	
	Scanner leia = new Scanner (System.in); 
	
	public char comprar = ' ';
	
	@Override
	
		public void alimento(String alimento) {
		System.out.println("Deseja comprar?");
		comprar = leia.next().toUpperCase().charAt(0);
	}

	@Override
	
		public void quantidade(double quantidadeAlimento) {
		System.out.println("Quanto(s) kg deseja comprar?");
		super.quantidadeAlimento = leia.nextDouble();	
	}


}
