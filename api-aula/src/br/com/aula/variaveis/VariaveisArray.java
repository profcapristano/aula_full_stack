package br.com.aula.variaveis;

public class VariaveisArray {
	public static void main(String[] args) {

		// sao como as variaveis normais, porem com uma quantidade X de camadas
		// a quantidade de camadas é definida pelo Dev de forma iterativa ou estatica
		String[] arrayNome = new String[2];// o tamanho do array foi definido como 2
		// uma vez que definimos o tamanho do array, sabemos que ele tera uma quantidade
		// X de lugares para armazenar informações
		// esses lugares de armazenamento são buscados com indices, sempre começando
		// pelo indice 0 (zero) em diante...

		arrayNome[0] = "Nome 1";//
		arrayNome[1] = "Nome 2";
		// você só pode resgatar os lugare que existem
		// arrayNome[2] = "Nome 3";//vai dar erro em tempo de execução, pois o lugar não
		// está reservado, uma vez que o tamanho do array é 2

		System.out.println(arrayNome[0]);
		System.out.println(arrayNome[1]);

	}

}
