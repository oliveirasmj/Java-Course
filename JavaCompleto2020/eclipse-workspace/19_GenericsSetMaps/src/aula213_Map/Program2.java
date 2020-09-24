package aula213_Map;

import java.util.HashMap;
import java.util.Map;

import aula213_Map.entities.Product;

public class Program2 {

	public static void main(String[] args) {

		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0); //criar um produto igual ao de cima
		
		//Ver se no map existe o ps
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps)); //N�o existe porque � usada referencia de ponteiros porque nao ha hash e equals
		//ps aponta para outro espa�o na mem�ria 
		//mas se tiver HashCode e Equals na classe Product j� n�o adiciona pois j� vai comparar pelo valor em vez dos ponteiros
	}

}
