package secao06;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Float a, b, numero;
		
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Informe um n�mero: ");
		numero = teclado.nextFloat();
		
		if (numero > 0) {
			
			a = numero;
			
			System.out.println("O valor � positivov" +a);
			
		
		}else {
		
		b = numero;				
		
		System.out.println("O valor � negativo " +b);
		
		
		teclado.close();
		
		}
		
	}

}
