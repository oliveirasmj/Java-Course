package aula139_StackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
	}
	
	public static void method1() {
		System.out.println("***M�todo 1 Start");
		method2();
		System.out.println("***M�todo 1 End");
	}
	
	public static void method2() {
		System.out.println("***M�todo 2 Start");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			
			e.printStackTrace(); //Imprime na tela o rasteamento do stack quando n�mero � inv�lido
			sc.next(); //delay enquanto n�o escrever
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
	
		sc.close();
		System.out.println("***M�todo 2 End");
	}

}
