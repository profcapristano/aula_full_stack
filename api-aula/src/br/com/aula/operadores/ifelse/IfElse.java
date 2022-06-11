package br.com.aula.operadores.ifelse;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		//utilizo para pegar inputs do usuário no console
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		//1 - jeito correto, porém com uma lógica ruim para se fazer um bloco ifelse
		if(idade > 50) {//testa a condição, se ela for verdadeira, executa o que há dentro
			System.out.println("Voce pode entrar! Seja feliz!");
		} else  {//se nenhuma opção foi verdadeira executa este bloco
			if (idade >= 18) {
				System.out.println("Voce pode entrar! Mas não pode passar vergonha...");
			} else {				
				System.out.println("Nao e permitido menores de idade!");
			}
		}
		
		//2 - jeito correto, porém com uma lógica ruim para se fazer um bloco ifelse
		if(idade > 50) {//se essa condição for verdadeira.. execute seu conteudo
			System.out.println("Voce pode entrar! Seja feliz!");
		} else if (idade >= 18) {//se nenhuma opção anterior for verdadeira e essa for verdadeira, execute o código dentro do bloco
			System.out.println("Voce pode entrar! Mas não pode passar vergonha...");
		} else {//se nenhuma opção foi verdadeira executa este bloco
			System.out.println("Nao e permitido menores de idade!");
		}
		
		//o jeito 1 e 2 lhe tras o mesmo resultado, apenas foi descrito das duas formas para facilitar o entendimento
		
		if(true) {
			System.out.println("Sempre escreve!");
		} else {
			System.out.println("Nunca entrara aqui!");
		}
		
		
	}

}
