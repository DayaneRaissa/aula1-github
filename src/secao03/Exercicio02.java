package secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int quantminima, quantmaxima, estoque;
		
        Scanner teclado = new Scanner (System.in);
		
		System.out.print("Informe a quantidade minima do estoque  ");
		quantminima = teclado.nextInt();
		
		System.out.print("Informe a quantmaxima maxima do estoque  " );
		quantmaxima = teclado.nextInt();
		
		
		estoque = (quantminima + quantmaxima)/2;
		
        System.out.println("O estoque médio da peça é " + estoque );
        
       
		
		teclado.close();
		
	}

}
