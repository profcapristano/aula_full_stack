package br.com.aula.atividades;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		//termine o codigo
		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema de Calculo, digite a operacao:");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		int operacao = sc.nextInt();
		
		System.out.println("Escreva o valor de N1:");
		double n1 = sc.nextDouble();
		System.out.println("Escreva o valor de N2:");
		double n2 = sc.nextDouble();
		
		switch (operacao) {
		case 1:
			//TODO
			break;

		default:
			break;
		}
	}

}
