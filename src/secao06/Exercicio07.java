package secao06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int n1, n2, n3, n4, q1, q2, q3, q4;
		
		Scanner teclado = new Scanner (System.in);
				

		System.out.println("Informe o primeiro n�mero: ");
		n1 = teclado.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		n2 = teclado.nextInt();
		
		System.out.println("Informe o terceiro n�mero: ");
		n3 = teclado.nextInt();
		
		System.out.println("Informe o quarto n�mero");
		n4 = teclado.nextInt();
		
		q1 = n1 * n1;
		q2 = n2 * n2;
		q3 = n3 * n3;
		q4 = n4 * n4;
		
		if (q3 >= 100) {
			
			System.out.println("O valor resultante do quadrado do terceiro � 100");
		}else {
			
			System.out.println("O quadrado do " + n1 + " � " + q1);
			System.out.println("O quadrado do " + n2 + " � " + q2);
			System.out.println("O quadrado do " + n3 + " � " + q3);
			System.out.println("O quadrado do " + n4 + " s� " + q4);
		}
		
       teclado.close();
		
	}

}
