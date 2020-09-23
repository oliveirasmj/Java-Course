package aula207_HashCodeEquals;

public class Program {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b)); //retorna false porque n�o s�o iguais
		
		System.out.println(a.hashCode()); //gera um c�digo de 32bits para cada texto
		System.out.println(b.hashCode()); //gera um c�digo de 32bits para cada texto
		//mas se os c�digos forem iguais certamente os objetos s�o iguais
		//se forem diferentes h� uma pequena probabiblidade de serem iguais
	}

}
