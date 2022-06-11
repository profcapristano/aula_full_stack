package br.com.aula.operadores.ifelse;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		//utilizo para pegar inputs do usuário no console
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		//se essa condição for verdadeira.. execute o bloco que a pertence
		if(idade > 50) {
			System.out.println("Voce pode entrar! Seja feliz!");
		} else if (idade >= 18) {//se nenhuma opção anterior for verdadeira e essa for verdadeira, execute o código dentro do bloco
			System.out.println("Voce pode entrar! Mas não pode passar vergonha...");
		} else {//se nenhuma opção foi verdadeira executa este bloco
			System.out.println("Nao e permitido menores de idade!");
		}
		
		if(true) {
			System.out.println("Sempre escreve!");
		} else {
			System.out.println("Nunca entrara aqui!");
		}
		
		
	}

}
