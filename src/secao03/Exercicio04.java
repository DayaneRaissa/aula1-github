package secao03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Informe o segundo n�mero: ");
		num2 = teclado.nextInt();
		
		soma= num1 + num2 ; 
		
		System.out.println("O resultado da soma �: " + soma);
		
		teclado.close();
		
		
		
		
	}

}
