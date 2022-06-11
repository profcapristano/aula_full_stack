package br.com.aula.operadores.switchcase;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {

		// comparador switch, utilidade do break
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nivel de acesso: ");
		System.out.println("1 - Leitura");
		System.out.println("2 - Escrita");
		System.out.println("3 - Administrador");
		int nvlAcesso = sc.nextInt();

		// exemplo caso não usem break
		System.out.print("Nivel de acesso: ");
		switch (nvlAcesso) {
		case 3:
			System.out.print("admin, ");
		case 2:
			System.out.print("escrita, ");
		case 1:
			System.out.print("leitura");
			break;
		default:
			System.out.print("nenhum");
			break;
		}
	}

}
