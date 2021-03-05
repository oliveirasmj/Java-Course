package aula000_teste;

public class Program {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo();
		Carro c = new Carro();
		Veiculo xpto = new Carro(); //Outra forma: Veiculo xpto = c;
		
		v.getNumRodas(); // o que v consegue ver
		c.getNumRodas(); c.getNumCavalos(); // o que c consegue ver
		xpto.getNumRodas(); // o que xpto consegue ver
		
		// UPCASTING - converter veiculo em carro
		Veiculo v2 = c; // n�o d� erro porque carro � um ve�culo
		Veiculo v3 = new Carro(); //outra forma - n�o d� erro porque carro � um ve�culo
		
		// DOWNCASTING  - converter carro em veiculo
		//Carro c2 = v; //N�o se pode converter de Veiculo para carro
		Carro c2 = (Carro) v3; //Fazendo a conversao manual j� � poss�vel converter para Carro
		
		//Verificar se um objeto � um Carro
		if(v3 instanceof Carro) {
			System.out.println("� um carro");
		}
	}
}
