package aplicacoesJava;

import java.util.Scanner;

public class lista3ex4 {

	public static void main(String[] args) {
		
		/*
		 Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
		e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3,
		se a pessoa era agressiva). 
		
		Pede-se para elaborar um sistema que permita 
		ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		
		o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos; 
		o número de pessoas calmas com menos de 18 anos.
		 */

		Scanner tec = new Scanner(System.in);
		
		int idade;
		byte sexo;
		byte humor;
		final int LIMITE = 2;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervosas40=0, calmas18=0; 
		int contador =1;
		
		System.out.println("_________________________________________Pesquisa Cadastro");
		
		while (contador<=LIMITE) {
			System.out.println("Digite sua idade: ");
			idade = tec.nextInt();
			System.out.println("Digite 1-feminino / 2-masculino / 3-Outros. ");
			sexo = tec.nextByte();
			System.out.println("Digite 1-calma/ 2-nervosa / 3-agressiva. ");
			humor = tec.nextByte();
			tec.nextInt();
			
			if (humor == 1) {
				pessoasCalmas = pessoasCalmas = 1;
			}
			if ((humor == 2) && (sexo == 1)) {
				mulheresNervosas = mulheresNervosas + 1; 	
			}
			if ((humor == 3) && (sexo == 2)) {
				homensAgressivos = homensAgressivos + 1;
			}
			if (())
			
			//fuga do laço
			contador++;
			
			
		}
			System.out.printf("\nTotal de pessoas calmas? %d", pessoasCalmas);
			System.out.printf("\nTotal de mulheres nervisas? %d", mulheresNervosas);
			System.out.printf("\nTotal de homens agressivos? %d", homensAgressivos);
		
		tec.close();
		
		
		
	}

}
