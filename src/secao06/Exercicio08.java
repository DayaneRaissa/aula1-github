package secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		
		float num;
		
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Informe um n�mero");
		num = teclado.nextInt();
		
		
	   if (num %2 == 0) {
		   
		   System.out.printf("O n�mero " + num +" � par");
		   
	   } else {
		   System.out.print("O n�mero " + num +" � �mpar");
	   }
	   
	   if (num > 0) {
		   System.out.println(" e positivo");
	   } else {
		   
		   System.out.println(" e negativo");
	   }
	   
		   
		   teclado.close();
				
	}

}
