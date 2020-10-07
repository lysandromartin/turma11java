package aplicacoesJava;

import java.util.Scanner;

public class lista1ex7 {

	public static void main(String[] args) {
		
		/*
		7. Um sistema de equações lineares do tipo:pode ser resolvido segundo mostrado abaixo : 
		*/
		
		Scanner leia = new Scanner(System.in);
		int a , b , c , d , e , f ;
		double x=0 , y=0;
		
		
		System.out.print("Informe o Valor de A : ");
		a = leia.nextInt();
		System.out.print("Informe o Valor de B : ");
		b = leia.nextInt();
		System.out.print("Informe o Valor de C : ");
		c = leia.nextInt();
		System.out.print("Informe o Valor de D : ");
		d = leia.nextInt();
		System.out.print("Informe o Valor de E : ");
		e = leia.nextInt();
		System.out.print("Informe o Valor de F : ");
		f = leia.nextInt();
		x = (((c*e)-(b*f))/((a*e)-(b*d)));
		y =  ( ( (a*f) - (c*d) ) / ( (a*e) - (b*d) ) );
		System.out.printf("\nO valor de X é :  %.2f \n", x );
		System.out.printf("\nO valor de Y é :  %.2f", y);
		
		leia.close();
	}

}
