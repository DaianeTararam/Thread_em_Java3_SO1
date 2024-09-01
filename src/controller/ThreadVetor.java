//@author Daiane Tararam
package controller;

public class ThreadVetor extends Thread {
	private int num;
	private int[] vetor;
	
	public ThreadVetor(int num, int [] vetor) {
		this.num = num;
		this.vetor = vetor;
	}
	

	@Override
	public void run() {
		percorra();	
	}

	private void percorra() {
		long inicio = System.currentTimeMillis();
		
		if(num % 2 == 0) {
			for(int i = 0; i < vetor.length; i++) {
				int valor = vetor[i];
				System.out.println(vetor[i]);
			}
		}else {
			for (int valor: vetor) {	
				System.out.println(valor);
			}
		}
		long fim = System.currentTimeMillis();
		double tempoSegundos = (fim -inicio)/1000.0;
		
		System.out.println("#"+  num + " percorreu o vetor em " + tempoSegundos + " segundos.");
		
	}
}
