package br.com.aula.variaveis;

public class ExemploVariaveis {
	
	public static void main(String[] args) {
		String nome = "Cleiton";
		System.out.println(nome.length());
		
		Integer ex = new Integer(0);
		int i1 = ex.parseInt("10");
		System.out.println(i1);
		
		int i2 = Integer.parseInt("10");
		System.out.println(i2);
	}

}
