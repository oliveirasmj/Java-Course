package aula138_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" "); //ler varios dados na mesma linha separados por espa�o em branco
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) { //Excepcao que � gerada quando o n�mero n�o est� dentro dos limites
			System.out.println("Invalid position");
		}
		catch (InputMismatchException e) { //Excepcao que � gerada quando � inserida uma letra
			System.out.println("Input error");
		}
		System.out.println("End of program"); //Agora mensagem j� � apresentada com limite invalido ou com letra
		
		sc.close();
	}

}
