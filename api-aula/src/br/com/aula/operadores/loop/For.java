package br.com.aula.operadores.loop;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de participantes");
		int qntParticipantes = sc.nextInt();
		
		String[] arrayNome = new String[qntParticipantes];
		
		//int i = 0; todas as variaveis criadas fora do for estão disponiveis dentro do For, mas não o contrário
		for(int i = 0; i < qntParticipantes; i++) {//i++ ... i = i +1
			System.out.println("Escreva seu nome: ");
			arrayNome[i] = sc.next();
		}
		//System.out.println(i);erro a variável, criada pelo For, existe apenas dentro do For
		
		for(int i = 0; i < qntParticipantes; i++) {
			System.out.println("Seja Bem Vindo " + arrayNome[i]);
		}
		
		
	}

}
