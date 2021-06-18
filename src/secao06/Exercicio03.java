package secao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe um número");
		numero= teclado.nextInt();
		
		if (numero % 2==0 ) {
			
			System.out.println("O numero "+numero +" é par ");
		
		}else {
			
			System.out.println("O número é ímpar");
		}
		
			
		
		teclado.close();
	}

}
