package secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n;
	
	Scanner teclado = new Scanner (System.in);
	
	System.out.print("Informe um número: ");
	n = teclado.nextInt();
	
	if (n >100) {
		
		System.out.println(n);
		
		
	} else {
		
		n =0;
		
		System.out.println(n);
	}
	
	teclado.close();
	
	}

}
