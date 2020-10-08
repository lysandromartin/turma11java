package aplicacoesJava;

import java.util.Scanner;

public class lista2ex1 {

	public static void main(String[] args) {
		 /*
		  * 1 - Faça um programa que receba três inteiros e diga qual deles é o maior.
		  */

		Scanner tec = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("Digite o valor do primeiro número :");
		x = tec.nextInt();
		System.out.print("Digite o valor do segundo número :");
		y = tec.nextInt();
		System.out.print("Digite o valor do terceiro número :");
		z = tec.nextInt();
		
		 if (x > y)
		    {
		        if(x > z)
		        {
		            System.out.printf("O maior numero é %d", x);
		        }
		        else
		        {
		        	System.out.printf("O maior numero é %d", z);
		        }
		    }
		    else
		    {
		        if(y > z)
		        {
		        	System.out.printf("O maior numero é %d", y);
		        }
		        else
		        {
		        	System.out.printf("O maior numero é %d", z);
		        }
		    }
		
	}

}
