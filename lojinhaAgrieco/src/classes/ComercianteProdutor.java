package classes;

import java.util.Scanner;

	public class ComercianteProdutor extends Comerciantes {
	
		Scanner leia = new Scanner (System.in); 
	
		@Override
	
		public void alimento(String alimento) {
		System.out.println("Qual alimento vc produz?");
		super.alimento = leia.next();
	}

		@Override
	
		public void quantidade(double quantidadeAlimento) {
		System.out.println("Quanto(s) kg produz?");
		super.quantidadeAlimento = leia.nextDouble();	
	}

		
		
}
