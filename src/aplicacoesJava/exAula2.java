package aplicacoesJava;

import java.util.Scanner;

public class exAula2 {

	public static void main(String[] args) {
		
			int contador = 0;
			char leia = ' '; 
			
			Scanner tec = new Scanner(System.in);
			do {
				System.out.println(contador);
				System.out.println("Continua sim ou nao S ou N: ");
				leia = tec.next().toUpperCase().charAt(0);
				
				contador++;
				
				}while (leia == 'S');
			}

}


