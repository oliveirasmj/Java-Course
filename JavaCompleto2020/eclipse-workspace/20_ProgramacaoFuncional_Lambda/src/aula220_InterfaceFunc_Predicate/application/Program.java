package aula220_InterfaceFunc_Predicate.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import aula220_InterfaceFunc_Predicate.entities.Product;
import aula220_InterfaceFunc_Predicate.util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//FORMAS DE REMOVER PRODUTOS COM O PRECO MAIOR QUE 100
		
		//FORMA 1 - express�o Lambda inline
		list.removeIf(p -> p.getPrice() >= 100); //remover todos os produtos acima de 100
		
		//FORMA 2 - express�o Lambda declarada
//		Predicate<Product> pred = p -> p.getPrice() >= 100; //retorna boolean
//		list.removeIf(pred);
		
		//FORMA 3 - criar uma classe(ProductPredicate) que implementa interface Predicate
//		list.removeIf(new ProductPredicate()); //remove todos os que sao true dessa classe
		
		//FORMA 4 - criar novo m�todo static na classe Product
//		list.removeIf(Product::staticProductPredicate); //com refer�ncia para o m�todo
		
		//FORMA 5 - criar novo m�todo comum na classe Product
//		list.removeIf(Product::nonstaticProductPredicate); //com refer�ncia para o m�todo
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
