package br.com.aula.atividades;

import java.util.Scanner;

public class Atividade3 {

	// Colete a quantidade de alunos de uma turma
	// Colete o nome de cada um
	// Colete a média do aluno para cada trimestre de cada matéria, ou seja 4 notas
	// para cada materia, para cada um dos 4 periodos do ano
	// As materias podem estar fixa no código fonte, não precisa seguir um padrão de
	// quantidade de materias e nomes especificos para cada uma delas

	// Diga se o aluno está aprovado, reprovado ou em recuperação
	// Como funciona nossa metrica
	// Aprovado média >= 7
	// Recuperação média >= 6,25 e <= 6.99
	// Reprovado < 6,25

	// Você deve usar concatenação, variáveis String, int e double
	// deve usar if, swtich, array e looping for

	// concluindo a atividade subir ela para seu repositório do Git
	// cada Aluno poderá ter seu código analisado em uma call privada depois da aula
	// (de forma randon)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("*    SISTEMA DE NOTAS    *");
		System.out.println("* 1 - Calculo de notas   *");
		System.out.println("* 2 - Sair do sistema    *");
		System.out.println("**************************");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Escreva a quantidade de alunos:");
			int quantidadeAluno = sc.nextInt();
			String[] listaNomeAluno = new String[quantidadeAluno];

			int quantidadeMateria = 2;
			String[] listaMateria = new String[quantidadeMateria];
			listaMateria[0] = "Java";
			listaMateria[1] = "Logica";

			for (int i = 0; i < quantidadeAluno; i++) {
				System.out.println("Escreva o nome do aluno " + (i + 1) + ":");
				listaNomeAluno[i] = sc.next();
			}

			int quantidadeNotas = 4;
			double[] listaNotas = new double[quantidadeNotas];
			for (int x = 0; x < quantidadeAluno; x++) {
				System.out.println("Escreva as notas do aluno " + listaNomeAluno[x]);
				for (int y = 0; y < quantidadeMateria; y++) {
					System.out.println("Notas de " + listaMateria[y]);
					for (int z = 0; z < quantidadeNotas; z++) {
						System.out.println("Escreva a nota " + (z + 1));
						listaNotas[z] = sc.nextDouble();
					}
					double soma = 0;
					for (int z = 0; z < quantidadeNotas; z++) {
						soma = soma + listaNotas[z];
					}
					double media = (soma / quantidadeNotas);
					System.out.println("Media: " + media);
					if (media >= 7) {
						System.out.println("APROVADO");
					} else if (media < 6.25) {
						System.out.println("REPROVADO");
					} else {
						System.out.println("RECUPERACAO");
					}
					System.out.println("--------------------------------------------------");
				}
				System.out.println("==================================================");
			}
			break;

		default:
			break;
		}
		System.out.println("-Fim-");

	}

}
