package aplicacoesJava;

import java.util.Scanner;

public class exTenario {

	public static void main(String[] args) {
		String nomeAluno;
		char sexoAluno;
		int notaAnual;
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Nome: ");
		nomeAluno = tec.next();
		System.out.print("Digite o sexo M ou F ");
		sexoAluno = tec.next().toUpperCase().charAt(0);
		System.out.println("Digite a nota anual: ");
		notaAnual = tec.nextInt();
		
		System.out.println();
		System.out.println("---------------------------------Dados do aluno");
		System.out.println();
		if(sexoAluno =='M') {
			System.out.printf("Oi prezado aluno %s, obrigado pelo acesso!", nomeAluno);
		} else if(sexoAluno == 'F'){
			System.out.printf("Oi prezada aluna %s, obrigado pelo acesso!", nomeAluno);
		}
		
		mensagem = ((notaAnual < 5) && (sexoAluno =='M')) ? "Reprovado" : "Aprovado";
		mensagem = ((notaAnual < 5) && (sexoAluno =='F')) ? "Reprovada" : "Aprovada";
		
		System.out.printf("Oi %s você está %s", nomeAluno, mensagem);
		
		tec.close();

	}

}
