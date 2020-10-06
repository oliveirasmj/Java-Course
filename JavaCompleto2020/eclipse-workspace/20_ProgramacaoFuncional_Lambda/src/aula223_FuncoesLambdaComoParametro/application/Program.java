package aula223_FuncoesLambdaComoParametro.application;

import java.util.ArrayList;
import java.util.List;

import aula223_FuncoesLambdaComoParametro.entities.Product;
import aula223_FuncoesLambdaComoParametro.util.ProductService;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Calcular soma do pre�o dos produtos que come�a por T
		ProductService ps = new ProductService();
		double sum = ps.filteredSumm(list);
		System.out.println("Sum: " + String.format("%.2f", sum));
	}

}
