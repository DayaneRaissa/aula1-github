package secao08;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
 		int [] vetor = new int [20];
 		int soma = 0;
 		
 		Scanner teclado = new Scanner (System.in);
 		
 		
        for (int i=0; i<20; i++) {
        	
        	System.out.printf("Informe os valores para o vetor %d/20\n " , (i+1));
        	vetor[i] = teclado.nextInt();
        	
        	soma = soma + vetor[i];
        	
        	       	
        }
        	
        	System.out.println("A soma do vetor é "+soma) ;
 				
 		
 		
 		teclado.close();

	}

}
