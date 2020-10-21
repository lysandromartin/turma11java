package programa;

import java.util.Scanner;

import classes.ComercianteConsumidor;
import classes.ComercianteProdutor;


public class AgriEco {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ComercianteConsumidor consumidor = new ComercianteConsumidor();
		ComercianteProdutor produtor = new ComercianteProdutor();
		
		char tipo = ' ';
		 
		System.out.println("Produtor, digite suas informações:");
		produtor.alimento(produtor.alimento);
		produtor.quantidade(produtor.quantidadeAlimento);
		System.out.println("Comprador, deseja comprar?");
		System.out.printf("O produto disponível é %s e a quantidade em Kg disponível é %.2f", produtor.alimento, produtor.quantidadeAlimento);	
		System.out.println();
		consumidor.alimento(consumidor.alimento);
		if (consumidor.comprar == 'S') {
			consumidor.quantidade(consumidor.quantidadeAlimento);
			System.out.printf("Vc comprou %s na quantidade de %.2f Kg ", produtor.alimento, consumidor.quantidadeAlimento);
			
		}else {
			System.out.println("Obrigado por visitar nosso site, volte sempre e tenha um ótimo dia!");
			
		}
		
		
		
		
	}


}
