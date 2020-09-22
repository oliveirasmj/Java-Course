package aula205_TiposCuringa;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		//List<Object> n�o � o supertipo de qualquer tipo de lista:
//		List<Object> myObjs = new ArrayList<Object>();
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers; // erro de compila��o
		
		//O supertipo de qualquer tipo de lista � List<?>. Este � um tipo curinga:
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
	}

}
