package aplicacoesJava;

import java.util.Scanner;

public class lista2ex2 {

	public static void main(String[] args) {
		/*
		2 - Fa�a um programa que entre com tr�s n�meros e coloque em ordem 
		crescente.
		 */
		
		
	    Scanner tec = new Scanner(System.in);
	    
	    int x, y, z;
		
		System.out.print("Digite o valor do primeiro n�mero :");
		x = tec.nextInt();
		System.out.print("Digite o valor do segundo n�mero :");
		y = tec.nextInt();
		System.out.print("Digite o valor do terceiro n�mero :");
		z = tec.nextInt();
		
		
	   
	    if (x < y)
	    {
	        if(y < z)
	        {
	            System.out.printf("O numero em ordem crescente � %d %d %d", x, y, z);
	        }
	        else if(x < z)
	        {
	        	System.out.printf("O numero em ordem crescente � %d %d %d", x, z, y);
	        }
	        else {
	        	System.out.printf("O numero em ordem crescente � %d %d %d", z, x, y);
	        }
	    }
	    else if(y < z)
	    {
	        if(x < z)
	        {
	        	System.out.printf("O numero em ordem crescente � %d %d %d", y, x, z);
	        }
	        else
	        {
	        	System.out.printf("O numero em ordem crescente � %d %d %d", y, z, x);
	        }
	    }
	    else {
	    	System.out.printf("O numero em ordem crescente � %d %d %d", z, y, x);
	    }

	}

}
