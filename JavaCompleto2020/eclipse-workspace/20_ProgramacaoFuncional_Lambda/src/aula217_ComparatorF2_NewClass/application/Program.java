package aula217_ComparatorF2_NewClass.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import aula217_ComparatorF2_NewClass.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//Collections.sort(list); //ordenar por ordem alfabetica - compare to na classe Product
		//No entanto n�o � a melhor solu��o, pois se um dia for preciso alterar a compara��o temos de abrir a classe Product
		//Ent�o vamos criar uma classe de compara��o que implementa a interface Comparator
		
		list.sort(new MyComparator()); //Forma 2 de ordenar por ordem alfabetica - assim desta forma fica mais optimizado que a primeira
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
