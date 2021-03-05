package aula183_TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) { //Classe para ler arquivo com FileReader
		
		// Bloco try-with-resources - � um bloco try que declara recursos e garante que eles ser�o fechados no final(n�o � preciso fecho manual)
		
		String path = "C:\\Git\\Java_Course\\JavaCompleto2020\\17_Arquivos\\in.txt"; // caminho do arquivo

		try(BufferedReader br = new BufferedReader(new FileReader(path))) { //N�o � preciso mais declara��es a seguir
			
			String line = br.readLine(); // se arquivo estiver no final � devolvido nulo
			while (line != null) { // enquanto nao estiver no final
				System.out.println(line); // escrever a linha
				line = br.readLine(); // ler a linha e quebra
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		//N�o � preciso mais o finally
	}

}
