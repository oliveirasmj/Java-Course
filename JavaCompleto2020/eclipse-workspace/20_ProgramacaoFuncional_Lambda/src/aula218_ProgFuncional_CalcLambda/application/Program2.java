package aula218_ProgFuncional_CalcLambda.application;

import java.util.ArrayList;
import java.util.List;

import aula218_ProgFuncional_CalcLambda.entities.Product;

public class Program2 { //Existe programa��o imperativa e programa��o funcional - OBJECTOS DE PRIMEIRA ORDEM

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort(Program2::compareProducts); //Ordenar - Funcoes podem se passadas como parametros de m�todos e retornadas
		// "method references"
		// Operador ->  :: 
		// Sintaxe ->  Classe::m�todo
		
		list.forEach(System.out::println);
		
	}

}
