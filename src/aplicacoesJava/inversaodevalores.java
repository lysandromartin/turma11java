package aplicacoesJava;

import java.util.Scanner;

public class inversaodevalores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a=0,b=0, c=0;
		System.out.print("Leia A:");
		a = leia.nextInt();
		System.out.println();
		System.out.print("Leia B:");
		b = leia.nextInt();
		System.out.println("Valores antes da invers�o: A - "+a+"; B - "+b);
		System.out.println();
		System.out.println("Valores depois da invers�o: A - "+((a-a)+b)+"; B - "+(b-b)+a);
		leia.close();
}


	}


