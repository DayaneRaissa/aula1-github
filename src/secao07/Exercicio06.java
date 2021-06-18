package secao07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe um número");
		numero = teclado.nextInt();
		
		while (numero > 10) {
			
			System.out.println("O número deve ser menor que 10");
			
			System.out.println("Informe um número");
			numero = teclado.nextInt();
		}
			System.out.println("Tabuada do numero " +numero);
			
			for (int i=1; i<=10; i++) {
				
				
				
				System.out.printf(" %d X %d = %d \n" ,numero, i, (numero * i));
						
			}
			
		
		teclado.close();

	}

}
