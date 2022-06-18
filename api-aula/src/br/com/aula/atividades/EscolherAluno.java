package br.com.aula.atividades;

import java.util.Random;

public class EscolherAluno {
	
	public static void main(String[] args) {
		String[] nome = {"Daniel", "Guilherme"};
		int i = new Random().nextInt(nome.length-1);//numero random 0-2
		System.out.println(nome[i]);
	}

}
