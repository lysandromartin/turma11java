package aplicacoesJava;

import java.util.Scanner;

public class tabuada {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 1; x <= 10; x++) 
		{
			System.out.println("Tabuada: " + x);
			for(int y = 1; y <= 10; y++) 
			{
				System.out.println(x + " X " +  y + " = " + (x * y));
				
			}
			System.out.println();
			
		}
		
		leia.close();
		
	}

}

