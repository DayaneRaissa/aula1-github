package secao08;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		
		int [] vetor = new int [10];
		int maior50=0;       
		
		Scanner teclado = new Scanner (System.in);
		
		for (int i=1; i<10; i++) {
			
			System.out.printf("Informe os n�meros para o vetor %d/10 \n", i);
			vetor[i] = teclado.nextInt();
			
		}
		
		for (int i=0; i<10; i++) {
			
			if (vetor[i] > 50) {
				
				System.out.printf("O n�mero %d est� na posi��o %d \n", vetor[i], i);
				
				maior50=1; 
			}
						
		}
		
		if (maior50 <1) {
			
			System.out.println("N�o tem n�mero maior que 50");
		}
			
		teclado.close();
	}

}
