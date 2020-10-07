package aplicacoesJava;

import java.util.Scanner;

public class lista1ex2 {

	public static void main(String[] args) {
		
		/*
		2. Faça um sistema que leia a idade de uma pessoa expressa em dias e
		 mostre-a expressa em anos, meses e dias. 
		*/
			
			//declaração de variaveis
			int d = 0, a = 0, m = 0;
			
		
			Scanner tec = new Scanner(System.in);
			System.out.print("Informe a sua idade em dias: ");
			d = tec.nextInt();
			
			//calculo
			a = (d/365);
			m = (d%365)/30;
			d = (d%365)%30;
			
			//saida
			System.out.printf("Voce possui %d anos, %d meses e %d dias", a, m, d);

	}

}
