package threads1;

public class MinhaThread extends Thread { // primeiro passo � extender a class Thread

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		//start(); //assim � AUTOMATICO para executar a Thread
	}
	
	//subscrever o metodo Run para executar a Thread e colocar as instru��es la dentro
	public void run() {
		for(int i=0; i<6; i++) {
			System.out.println("Executando a " + nome + " contador " + i);
			
			//Colocar Thread a dormir por uns milissegundos
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(nome + " terminou a execu��o");
	}
}
