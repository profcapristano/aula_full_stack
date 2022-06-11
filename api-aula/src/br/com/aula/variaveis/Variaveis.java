package br.com.aula.variaveis;

/**
 * @author Cleiton
 */
/*
	nome		valor padrão		tamanho
	boolean		false				1 bit
	char		'\u0000'			2 byte
	byte		0					1 byte
	short		0					2 byte
	int			0					4 byte
	long		0L					8 byte
	float		0.0f				4 byte
	double		0.0d				8 byte
*/
/*
	nome		valor padrão		tamanho
	String		""					40 byte
	
	O tamano dos demais tipos se calcula com base em seu primitivo, respeitando os memos valores padrão, sendo n o tamnho do primitivo.
	...
	n * 32 bits = x
	x / 8 = <byte size>
	...
	Ex.: int to Integer
	4 * 32 = 128
	128 / 8 = 16
	
	Integer = 16 byte
 */

public class Variaveis {
	
	public static void main(String[] args) {
		
		//armazena valores equivalentes a sim e não true/false
		boolean vBoolean = false;
		
		boolean teste = 1 == 2;
		//irá imprimir o resultado do teste acima, no caso false
		System.out.println(teste);
		
		//armasena uma unica letra ou numero
		char letraS = 's';
		System.out.println(letraS);
		
		//verifiquem a tabela unicode para entender
		char letraC = 64;
		//irá imprimir a letra C
		System.out.println(letraC);
		
		//String se usa aspas duplas
		//char se usa aspas simples
		//char letraQualquer = ""; errado
		
		//String é um conjunto de char
		//não posso converter uma String para char, mas posso pegar o primeiro registro
		//char letraQualquer = "".charAt(0); //errado, se sua string não tiver nada vai dar erro
		char letraQualquer = "L".charAt(0); //errado, se sua string não tiver nada vai dar erro
		
		//o código abaixo separa o conjunto e pega a primeira unidade, porém de uma maneira diferente
		//há varias vaneiras de se fazer a mesma coisa por um motivo, a diante vai ficando mais claro, pois tudo depende da situação
		char letra = "Cleiton".toCharArray()[0];
		//irá imprimir a letra C
		System.out.println(letra);
		

		//menor valor da tabela unicode
		//char vazio, equivalente a espaço
		char espaco = '\u0000';
		System.out.println(espaco);
		
		//uma variavel que pode ser usada para armazenar o tamanho de algo em bytes, o que equivale a tamanho real se tratando de dados
		//para que ela possa armazenar arquivos ela deve ser um array, o que veremos mais para frente
		byte dados = 0;
		
		short sVal = 0;
		int iVal = 0;
		long lVal = 0;
		//ao colocar a letra L no final garanto que apenas uma variavel que suporte valores do tipo a contenham
		long llVal = 0L;
		//int ilVal = 0L; errado
		//Explicação e documentação será feito na aula
		
		float fVal = 0.0f;
		double dVal = 0.0;
		double ddVal = 0d;
		double dddVal = 0.0d;
		
		//variaveis tipo objeto, são iguais as primitivas porém com metodos que nos auxilian, logo ocupam mais espaço na memoria da aplicação
		String nome = "";
		System.out.println(nome);
		
		//há três formas de inicializar variaveis de tipo objeto
		Boolean oB = null;//passando nulo que é o valor padrão de objetos
		Boolean ob3 = new Boolean(false);//criando uma instancia dela e atribuindo a variável
		Boolean ob4 = new Boolean(null);
		//e isso equivale a todas as variaveis
		
		//todas as variaveis terão a mesma variação
		Character oC = new Character('\u0000');//char
		Byte oBy = new Byte((byte) 0);
		Short oS = new Short((short)0);
		Integer oI = new Integer(0);//int
		Long oL = new Long(0L);
		Float oF = new Float(0F);
		Double oD = new Double(0.0);
		
		//pra matemática avançada há mais tipagens que não serão utilizadas no momento, somente a diante
	}

}
