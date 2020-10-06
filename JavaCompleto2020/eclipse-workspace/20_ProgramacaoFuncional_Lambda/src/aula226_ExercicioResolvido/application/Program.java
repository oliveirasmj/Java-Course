package aula226_ExercicioResolvido.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import aula226_ExercicioResolvido.entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\luisp\\Downloads\\Estudo\\Udemy\\JavaCompleto2020\\20_ProgramacaoFuncional_Lambda\\exercicio\\in.txt"; // caminho do arquivo

		try(BufferedReader br = new BufferedReader(new FileReader(path))) { //N�o � preciso mais declara��es a seguir
			
			List<Product> list = new ArrayList<>(); //criar lista de produtos
			
			String line = br.readLine(); // se arquivo estiver no final � devolvido nulo
			while (line != null) { // enquanto nao estiver no final
				String[] fields = line.split(","); //parar quando encontra virgula
				list.add(new Product(fields[0], Double.parseDouble(fields[1]))); //adicionar cada linha � lista de produtos
				line = br.readLine(); // ler a linha e quebra
			}
			
			//M�DIA PELA FORMA TIPICA
//			double sum = 0;
//			int count = 0;
//			for(Product p : list) {
//				sum += p.getPrice();
//				count ++;
//				//System.out.println(p);
//			}
//			System.out.println("Pre�o m�dio: " + String.format("%.2f", sum/count));
			
			//M�DIA PELA FORMA COM PIPELINE
			double avg = list.stream()
					.map(p -> p.getPrice()) //.map porque lista � de produtos e eu quero criar uma stream de pre�os
					.reduce(0.0, (x, y) -> x + y) / list.size(); //reduce: permite fazer o somatorio e m�dia - (come�a com valor 0, funcao de soma)
			System.out.println("Pre�o m�dio: " + String.format("%.2f", avg));
			
			
			//LISTAR OS PRODUTOS INFERIORES � MEDIA POR ORDEM DECRESCENTE DE NOME
			
			//criar um comparator para comparar duas strings por ordem alfabetica
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			//criar a lista com os nomes
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg) //filtrar todos os que est�o abaixo da m�dia
					.map(p -> p.getName()) //.map para criar uma stream com apenas os nomes dos produtos filtrados
					.sorted(comp.reversed()) //.reversed e o contrario da ordem crescente
					.collect(Collectors.toList()); //converter de novo para lista
			//Listar a cole��o
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	
	}
}
