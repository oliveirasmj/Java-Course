package threads2;

public class MinhaThreadRunnable implements Runnable { // primeiro passo � implementar a interface Runnable
	
	private String nome;
	private int tempo;
	
	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		
		//start(); //metodo n�o existe porque � Runnable
		
		//Thread t = new Thread(this); //assim � AUTOMATICO para executar a Thread
		//t.start(); //assim � AUTOMATICO para executar a Thread
	}
	
	@Override
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
