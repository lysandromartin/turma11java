package aplicacoesJava;

import java.util.Scanner;

public class lista2ex3 {

	public static void main(String[] args) {
		/*
		 3 - Faça um programa que receba a idade de uma pessoa e mostre na 
		saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
		 */
		
		int idade = 0;
						
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
		idade = tec.nextInt();
		
		
		if(idade >= 10 && idade <=14){
			System.out.printf("Voce tem %d anos e sua categoria é a Infantil", idade);
		}
		else if (idade >= 15 && idade <=17){
			System.out.printf("Voce tem %d anos e sua categoria é a Juvenil", idade);
		}
		else if (idade >= 18 && idade <=25){
			System.out.printf("Voce tem %d anos e sua categoria é a Adulto", idade);
		}
	}

}
