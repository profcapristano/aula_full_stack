package br.com.aula.operadores.loop;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de participantes");
		int qntParticipantes = sc.nextInt();
		
		String[] arrayNome = new String[qntParticipantes];
		for(int i = 0; i < qntParticipantes; i++) {
			System.out.println("Escreva seu nome: ");
			arrayNome[i] = sc.next();
		}
		
		for(int i = 0; i < qntParticipantes; i++) {
			System.out.println("Seja Bem Vindo " + arrayNome[i]);
		}
		
		
	}

}
