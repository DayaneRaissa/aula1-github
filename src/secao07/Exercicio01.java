package secao07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		
		int numero, maior=0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe um n�mero");
        numero= teclado.nextInt();
        
        while (numero !=0) {
        	if (numero > maior) {
        		maior = numero;
        	}
        
		
        System.out.println("Informe um n�mero");
        numero= teclado.nextInt();	
        
        }
        
        System.out.printf("O maior n�mero � %d", maior);
		
        
		
		teclado.close();
	}

}
