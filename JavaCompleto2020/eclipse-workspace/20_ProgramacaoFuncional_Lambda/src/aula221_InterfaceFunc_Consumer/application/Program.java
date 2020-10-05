package aula221_InterfaceFunc_Consumer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import aula221_InterfaceFunc_Consumer.entities.Product;
import aula221_InterfaceFunc_Consumer.util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// FORMAS DE AUMENTAR O PRECO DOS PRODUTOS EM 10%
		
		//FORMA 1 - express�o Lambda inline
//		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
				
		//FORMA 2 - express�o Lambda declarada
//		Consumer<Product> cons = p -> {
//			p.setPrice(p.getPrice() * 1.1);
//		};
//		list.forEach(cons);
				
		//FORMA 3 - criar uma classe(priceUpdate) que implementa interface Consumer
//		list.forEach(new PriceUpdate());
				
		//FORMA 4 - criar novo m�todo static na classe Product
//		list.forEach(Product::staticPriceUpdate); //com refer�ncia para o m�todo
				
		//FORMA 5 - criar novo m�todo comum na classe Product
//		list.forEach(Product::nonstaticPriceUpdate); //com refer�ncia para o m�todo
		
		
		//LISTAR
		list.forEach(System.out::println);
	}
}
