package aula203_IntroducaoGenericsV3.application;

import java.util.Scanner;

import aula203_IntroducaoGenericsV3.services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//agora � do tipo Integer - sendo que a classe PrintService � Generics <T> pode ser de todos os tipos
		PrintService<Integer> ps = new PrintService<>(); //posso mudar de Integer para o que for desej�vel

		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		//ps.addValue("Maria"); //agora j� n�o � permitido porque s� pode aceitar inteiros

		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		ps.print();
		
		
		Integer x = ps.first(); //j� n�o � preciso cast porque vai ser sempre Integer
		System.out.println("First: " + x);

		sc.close();
		
	}

}
