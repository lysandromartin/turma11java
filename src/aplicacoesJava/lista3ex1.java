package aplicacoesJava;

public class lista3ex1 {

	public static void main(String[] args) {
		
		/*
		 1.Informar todos os números de 1000 a 1999
		  que quando divididos por 11 obtemos resto = 5
		 */

		for (int x=1000; x < 2000; x++){
		    if (x%11==5) {
		        System.out.println(x);
		    }
		}

	}

}
