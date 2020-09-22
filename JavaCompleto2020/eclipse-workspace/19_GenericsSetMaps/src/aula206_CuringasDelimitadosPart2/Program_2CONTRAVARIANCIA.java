package aula206_CuringasDelimitadosPart2;

import java.util.ArrayList;
import java.util.List;

public class Program_2CONTRAVARIANCIA { 

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs; //Criar myNums (de qualquer tipo que seja SUPERTIPO de Number) e copiar para myObjs
		//Supertipo de Number � Object
		
		myNums.add(10); //j� � poss�vel adicionar
		myNums.add(3.14); //j� � poss�vel adicionar
		
		//Number x = myNums.get(0); // erro de compilacao - Number � SUBTIPO de object
		
		
		//CONTRAVARIANCIA: get - ERROR; put - OK
	}
}
