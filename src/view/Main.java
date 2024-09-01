//@author Daiane Tararam
package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[1000];
		
		for ( int i = 0; i < 1000; i++) {
			vetor[i] = (int)((Math.random() * 100) + 1);
		}
		
		ThreadVetor tVetor1 = new ThreadVetor(1, vetor);
		ThreadVetor tVetor2 = new ThreadVetor(2, vetor);
		
		tVetor1.start();
		tVetor2.start();

	}

}
