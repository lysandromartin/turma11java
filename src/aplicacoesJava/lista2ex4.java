package aplicacoesJava;

import java.util.Scanner;

public class lista2ex4 {

	public static void main(String[] args) {
		/*
		 4 - Fa�a um programa em que permita a entrada de um n�mero qualquer e 
		 exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
		 quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		
		double n = 0;
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		n = tec.nextDouble();
		
		if((n%2)==0) {
			System.out.printf("O numero � PAR e a raiz quadrada dele � %.2f", Math.sqrt(n));
		}
		else {
			System.out.printf("O numero � �MPAR e ao quadrado fica %.2f", Math.pow(n,2));
		}


	}

}
