package secao03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Informe o segundo número: ");
		num2 = teclado.nextInt();
		
		soma= num1 + num2 ; 
		
		System.out.println("O resultado da soma é: " + soma);
		
		teclado.close();
		
		
		
		
	}

}
