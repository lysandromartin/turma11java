package aplicacoesJava;

import java.util.Scanner;

public class lista2ex1 {

	public static void main(String[] args) {
		 /*
		  * 1 - Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		  */

		Scanner tec = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("Digite o valor do primeiro n�mero :");
		x = tec.nextInt();
		System.out.print("Digite o valor do segundo n�mero :");
		y = tec.nextInt();
		System.out.print("Digite o valor do terceiro n�mero :");
		z = tec.nextInt();
		
		 if (x > y)
		    {
		        if(x > z)
		        {
		            System.out.printf("O maior numero � %d", x);
		        }
		        else
		        {
		        	System.out.printf("O maior numero � %d", z);
		        }
		    }
		    else
		    {
		        if(y > z)
		        {
		        	System.out.printf("O maior numero � %d", y);
		        }
		        else
		        {
		        	System.out.printf("O maior numero � %d", z);
		        }
		    }
		
	}

}
