package secao08;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int codigo;
		int [] vetor = new int [5];
		
		Scanner teclado = new Scanner (System.in);
		
	System.out.println("Informe o código");
	codigo = teclado.nextInt();
	
	if (codigo == 0 || codigo >2) {
		System.out.println("Codigo Invalido! O codigo deve ser 1 ou 2");
		
		System.out.println("Informe o código");
		codigo = teclado.nextInt();
		
	}
	
	if (codigo != 0) {				
	 				for (int i=0; i<5; i++) {
		
		System.out.printf("Informe os números para o vetor: ");
		vetor[i] = teclado.nextInt();
		
		}
		if (codigo == 1){		
			for (int i=0; i<5; i++) {
				System.out.println(vetor[i]);
			} 
}		
		if (codigo ==2 ) {			
			for (int i=(vetor.length-1); i>=0; i--) {
				System.out.println(vetor [i]);
			}
		}
	}
     
	teclado.close();
		
	}

}
