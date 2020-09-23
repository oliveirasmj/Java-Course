package aula208_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		//Set<String> set = new HashSet<>(); //instanciar um Set usando a implementa��o HashSet (mais r�pida) mas N�O GARANTE ORDEM
		//Set<String> set = new TreeSet<>(); //instanciar um Set usando a implementa��o TreeSet (mais lento) e GARANTE ORDEM ALFAB�TICA pelo CompareTo
		Set<String> set = new LinkedHashSet<>(); //instanciar um Set usando a implementa��o LinkedHashSet (velocidade meia) e GARANTE ORDEM COLOCADA
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		set.remove("Tablet"); //remover o "Tablet"
		set.removeIf(x -> x.length()>3); //remover todos os que t�m mais do que 3 caracteres
		set.removeIf(x -> x.charAt(0) == 'T'); //remover todos os que t�m a primeira letra T
		System.out.println(set.contains("Notebook")); //ver se existe o elemento "Noteboook" no conjunto
		
		for (String p : set) {
			System.out.println(p);
		}
	
	}

}
