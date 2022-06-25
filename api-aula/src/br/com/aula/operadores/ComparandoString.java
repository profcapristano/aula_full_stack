package br.com.aula.operadores;

import java.util.Scanner;

public class ComparandoString {
	
	//
	public static void main(String[] args) {
		
		//para testar o valor das strings
		//onde uma string deve ser exatamente igual a outra, sendo case sensitive, ou seja...
		//levando em consideração maiusculas e minusculas
		boolean teste1 = "CLEITON".equals("CLEITON");//TRUE
		System.out.println(teste1);
		
		boolean teste2 = "cleiton".equals("Cleiton");//FALSE
		System.out.println(teste2);
		
		//para testar o valor das strings
		//onde uma string deve ser exatamente igual a outra, mas não sendo case sensitive
		boolean teste3 = "Cleiton".equalsIgnoreCase("cleiton");//TRUE
		System.out.println(teste3);
		
		String nomeSorteado = "MatheUs";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eu sou o sistema, quem vc acha que foi sorteado por mim?");
		String palpiteUsuario = sc.next();
		
		if(nomeSorteado.equals(palpiteUsuario)) {
			System.out.println("Uall, vc acertou, mesmo que tinha pegadinha.");
		} else if (nomeSorteado.equalsIgnoreCase(palpiteUsuario)) {
			System.out.println("OK, vc acertou, mas nao se ligou na pegadinha.");
		} else {
			System.out.println("ERRROOOOOU!!");
		}
		
	}

}
