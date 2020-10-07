package aplicacoesJava;

import java.util.Scanner;

public class lista1ex1 {

	public static void main(String[] args) {
		/*
		1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
		meses e dias e mostre-a expressa apenas em dias. 
		*/
			//Declaração de variaveis
			int a = 0, m = 0, d = 0, resultado = 0;
					
			
			Scanner tec = new Scanner(System.in);
			System.out.print("Informe seu ano de nascimento: ");
			a = tec.nextInt();
			
			System.out.print("Informe quantos meses: ");
			m = tec.nextInt();
			
			System.out.print("Informe quantos dias: ");
			d = tec.nextInt();
			
			
			//calculo
			resultado = (a*365)+(m*30)+d;
			
			//saida
			System.out.print(resultado);

	}

}
