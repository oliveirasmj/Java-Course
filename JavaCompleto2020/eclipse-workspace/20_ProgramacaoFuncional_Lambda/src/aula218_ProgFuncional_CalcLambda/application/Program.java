package aula218_ProgFuncional_CalcLambda.application;

import java.util.Arrays;

public class Program { //Existe programa��o imperativa e programa��o funcional - TRANSPARENCIA REFERENCIAL

	public static int globalValue = 3;

	public static void main(String[] args) {
		
		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
		
	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue; //N�o � referencialmente transparente pois n�o depende exclusivamente dos valores de entrada (globalValue) - programa��oo imperativa
			}
		}
	}

}
