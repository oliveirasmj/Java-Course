package aula138_TryCatch;

import java.util.Scanner;

public class Program2 {

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
		
		System.out.println("End of program"); //Agora mensagem j� � apresentada pois o programa n�o p�ra caso se coloque um n�mero invalido
		
		sc.close();
	}

}
