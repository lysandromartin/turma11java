package aplicacoesJava;

import java.util.Scanner;

public class exAula {

	public static void main(String[] args) 	
	{
		Scanner leia = new Scanner (System.in);
		
		String nome;
		char sexo; // M para mulher e H para homem
		char chefeFamilia;
		int anoNascimento;
		int auxilo = 600;
		
		System.out.print("Digite seu nome :");
		nome = leia.next();
		System.out.print("Digite o ano de Nascimento :");
		anoNascimento = leia.nextInt();
		System.out.print("Digite seu sexo, 'H' para homem e 'M' para mulher :");
		sexo =leia.next().charAt(0);
		System.out.print("Digite se voce é chefu de familia, 'S' para sim e 'N' para não :");
		chefeFamilia =leia.next().charAt(0);
		
		if ((2020-anoNascimento)>=18)
		{
			if (chefeFamilia == 'S' || chefeFamilia == 's')
			{
				if (sexo == 'M' || sexo == 'm')
				{
					System.out.printf("Ola chefa %s seu auxilo é R$%d,00",nome,(auxilo*2));
				} else {
					System.out.printf("Ola chefe %s seu auxilo é R$%d,00",nome,(auxilo));
				}
				
			} else {
				System.out.printf("Ola %s voce nao pode receber por nao ser chefu de familia",nome);
			}
		} else {''
			System.out.printf("Ola %s voce nao tem idade para participar do programa",nome);
		}
		
	}	
}