package aula138_TryCatch;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] vect = sc.nextLine().split(" "); // ler varios dados na mesma linha separados por espa�o em branco
		int position = sc.nextInt();
		System.out.println(vect[position]);

		System.out.println("End of program"); // Mensagem n�o � apresentada caso se coloque um n�mero inv�lido ou uma letra em position

		sc.close();
	}

}
