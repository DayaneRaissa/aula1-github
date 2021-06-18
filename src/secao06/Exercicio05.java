package secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		
		float peso, excesso, multa;
		
		Scanner teclado = new Scanner (System.in);

		
		System.out.println("Informe o peso do peixe ");
		peso = teclado.nextFloat();
		
			
		if (peso > 50) {
			
			excesso = peso - 50;
			multa = excesso * 4;
						
		
		System.out.println("O peso do peixe é " + peso);
		System.out.println(" O excesso de peixe é " + excesso);
		System.out.println("A multa a ser pago por excesso de peixe é R$ " + multa);
		
		
	}	else {
		
		System.out.println("Não há excesso de peixe e multa a pagar ");
		
	}	
		
		teclado.close();
	}

}
