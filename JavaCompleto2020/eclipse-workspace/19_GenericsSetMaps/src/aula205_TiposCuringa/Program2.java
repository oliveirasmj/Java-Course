package aula205_TiposCuringa;

import java.util.Arrays;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("A", "B", "C");
		printList(myStrs);
	}
	
	//public static void printList(List<Integer> list) {
	public static void printList(List<?> list) { //assim imprime uma lista de qualquer tipo ---> <?>
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
