package secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		
		float num;
		
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Informe um número");
		num = teclado.nextInt();
		
		
	   if (num %2 == 0) {
		   
		   System.out.printf("O número " + num +" é par");
		   
	   } else {
		   System.out.print("O número " + num +" é ímpar");
	   }
	   
	   if (num > 0) {
		   System.out.println(" e positivo");
	   } else {
		   
		   System.out.println(" e negativo");
	   }
	   
		   
		   teclado.close();
				
	}

}
