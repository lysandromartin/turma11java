package aplicacoesJava;

import java.util.Scanner;

public class Tabelatimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * VETOR COM OS 4 TIMES DE SÃO PAULO
CORINTHIANS
PALMEIRAS
SPFC
SANTOS
GANHA - 3 PONTOS
EMPATA - 1 PONTO
PERDE - 0 PONTO
PRIMEIRA RODADA
CADA TIME SE GANHOU, PERDEU OU EMPATOU
MOSTRA A PONTUAÇÃO DA PRIMEIRA RODADA
SEGUNDA RODADA
		 */
		int ganha = 3;
		int empata = 1;
		int perde = 0;
		int contador=1;
		String times [] = {"Corinthians", "Palmeiras", "SPFC", "Santos"};
		int pontuacao [];
		char resposta;
		pontuacao = new int[4];
		
		
		int rodada=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(contador != 0)
		{
			
			System.out.println("Se o time Corinthians ganhou digite G - Se o time Corinthians perdeu digite P- Se o time Corinthians empatou digite E");
			resposta = leia.next().toUpperCase().charAt(0);
			
			if(resposta == 'G')
			{
				pontuacao[0] = pontuacao[0] + ganha;
				
			}else if(resposta == 'E')
			{
				pontuacao[0] = pontuacao[0] + empata;
			}else if(resposta == 'P')
			{
				pontuacao[0] = pontuacao[0] + perde;
			}else
			{
				System.out.println("Opção inválida!");
			}
			
			System.out.println("Se o time Palmeiras ganhou digite G - Se o time Palmeiras perdeu digite P- Se o time Palmeiras empatou digite E");
			resposta = leia.next().toUpperCase().charAt(0);
			
			if(resposta == 'G')
			{
				pontuacao[1] = pontuacao[1] + ganha;
				
			}else if(resposta == 'E')
			{
				pontuacao[1] = pontuacao[1] + empata;
			}else if(resposta == 'P')
			{
				pontuacao[1] = pontuacao[1] + perde;
			}else
			{
				System.out.println("Opção inválida!");
			}
			
			System.out.println("Se o time SPFC ganhou digite G - Se o time SPFC perdeu digite P- Se o time SPFC empatou digite E");
			resposta = leia.next().toUpperCase().charAt(0);
			
			if(resposta == 'G')
			{
				pontuacao[2] = pontuacao[2] + ganha;
				
			}else if(resposta == 'E')
			{
				pontuacao[2] = pontuacao[2] + empata;
			}else if(resposta == 'P')
			{
				pontuacao[2] = pontuacao[2] + perde;
			}else
			{
				System.out.println("Opção inválida!");
			}
			
			System.out.println("Se o time Santos ganhou digite G - Se o time Santos perdeu digite P- Se o time Santos empatou digite E");
			resposta = leia.next().toUpperCase().charAt(0);
			
			if(resposta == 'G')
			{
				pontuacao[3] = pontuacao[3] + ganha;
				
			}else if(resposta == 'E')
			{
				pontuacao[3] = pontuacao[3] + empata;
			}else if(resposta == 'P')
			{
				pontuacao[3] = pontuacao[3] + perde;
			}else
			{
				System.out.println("Opção inválida!");
			}
			
			rodada++;
			System.out.printf("A pontuação da %d° rodada  é: \nO time %s conquistou %d pontos \nO time %s conquistou %d pontos \nO time %s conquistou %d pontos \nO time %s conquistou %d pontos \n", rodada, times[0], pontuacao[0],times[1], pontuacao[1],times[2], pontuacao[2], times[3], pontuacao[3] );
			
			System.out.print("Deseja continuar para a próxima rodada? Digite um número diferente de 0 para continuar");
			contador = leia.nextInt();
			
			
			
		}
		
	}

}
