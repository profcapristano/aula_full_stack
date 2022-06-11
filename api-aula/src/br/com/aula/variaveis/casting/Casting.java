package br.com.aula.variaveis.casting;

public class Casting {
	
	public static void main(String[] args) {
	    int myInt = 9;
	    double myDouble = myInt; // autocasting

	    System.out.println(myInt);      // 9
	    System.out.println(myDouble);   // 9.0
	    
	    //casting forçado
	    double divisaoTruncada = (double)1;
	    //int divisaoTruncada = (double)1;//erro
	    
	    System.out.println(divisaoTruncada);
	 }
	
	

}
