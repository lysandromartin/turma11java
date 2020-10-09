package aplicacoesJava;

import java.util.Scanner;

public class lista3ex2 {

	public static void main(String[] args) {
		
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		int x=0, par=0, impar=0, numero=0;
		
		Scanner tec  = new Scanner(System.in);
		for(x=1; x<=10; x++) {
		
		System.out.println("Digite um número: ");
		numero = tec.nextInt();
		
		if(numero%2 == 0)
		{
			par++;
		}else	
		{
			impar++;
		}
		
		}
		
		System.out.printf("Segundo os dados inputados, %d são numeros pares e %d são números ímpares", par, impar);
	}
		
}
