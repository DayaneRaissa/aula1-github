package secao06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		char sexo;
		float altura, peso_ideal;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Informe a altura: ");
		altura = teclado.nextFloat();
		
		System.out.print("Informe o sexo: ");
		sexo = teclado.next().charAt(0);
		 
		if (sexo == 'f') {
			
			peso_ideal = (float)(altura * 62.1) - (float)44.7;
			
			System.out.printf("O peso ideal é %.2f " , peso_ideal);
			
		} if (sexo == 'm') {
			
			peso_ideal = (float)(altura * 72.7) - 58;
						
		
		System.out.printf("O peso ideal para o sexo " + sexo + " é " + peso_ideal);
		
		}
		
		teclado.close();
	}

}
