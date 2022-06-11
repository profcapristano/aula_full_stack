package br.com.aula.operadores.switchcase;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {

		// comparador switch
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecione uma opcao do menu:");
		System.out.println("1 - Opcao 1");
		System.out.println("2 - Opcao 2");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Selecionou a opcao 1");
			break;
		case 2:
			System.out.println("Selecionou a opcao 2");
			break;

		default:
			break;
		}
	}

}
