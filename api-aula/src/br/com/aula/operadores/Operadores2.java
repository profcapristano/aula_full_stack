package br.com.aula.operadores;

public class Operadores2 {
	
	public static void main(String[] args) {
		
		//Incremento e Decremento
		System.out.println("Incremento e Decremento");
		int n1 = 0;
		++n1;// soma 1 = 1
		n1++;// soma 1 = 2
		--n1;// subtrai 1 = 1
		n1--;//subtrai 1 = 0
		System.out.println(n1);
		
		System.out.println("--");
		int resultado1 = ++n1;
		System.out.println(resultado1);
		int resultado2 = n1++;
		System.out.println(resultado2);
		int resultado3 = ++n1;
		System.out.println(resultado3);
		int resultado4 = ++n1 + 1;
		System.out.println(resultado4);
		
		System.out.println("--");
		int resultado5 = 0;
		resultado5 += 2;//resultado5 = resultado5 + 2
		System.out.println(resultado5);
		resultado5 *= 1;
		System.out.println(resultado5);
		resultado5 -= 1;
		System.out.println(resultado5);
		resultado5 /= 1;
		System.out.println(resultado5);
		System.out.println();
		System.out.println("----------------------------------");
		
		//MOD é o resto da divisão
		System.out.println("MOD");
		System.out.println(4 % 2);//podemos saber se algum numero é PAR se o resto da sua divisão por 2 for igual a zero
		System.out.println(3 % 2);// 3/2 | 3-2 = 1
		System.out.println("----------------------------------");
		
		//comparativos etapa 2
		System.out.println("comparativos etapa 2");
		//negação
		System.out.println(!true);//false
		System.out.println(!(1==1));//false
		System.out.println(!true == false);//true
		
		//testando se é igual
		System.out.println(1 == 1);//true
		//testando se é diferente
		System.out.println(1 != 1);//false
		System.out.println("--");
		
		//para mais de um teste...
		//se ambos forem true, o resultado é true
		//se a comparação 1 E 2 forem verdadeiras
		System.out.println(true && true);//true
		//se um deles for false, o resultato será false
		System.out.println(true && false);//false
		
		//sempre retorna true se um dos testes for true
		//quando encontra um teste que retorna true (VERDADEIRO) não faz os demais testes
		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		
		//??
		System.out.println("true || true && false");
		System.out.println(true || true && false);
		
		//isolando a operação o resultado pode ser diferente
		//então use a lógica para isolar o que for necessário
		System.out.println("(true || true) && false");
		System.out.println((true || true) && false);

	}

}
