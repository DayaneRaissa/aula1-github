package secao06;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		float codigo, horas_trabalhadas, salario, excesso;
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe o c�digo do funcion�rio: ");
		codigo = teclado.nextFloat();
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		horas_trabalhadas= teclado.nextFloat();
		
		if (horas_trabalhadas > 50) {
			
			excesso =  (horas_trabalhadas - 50) * (float)20.00;
			salario= (50*10) +  excesso;
			
						
			System.out.println("O valor a receber referente ao excesso de trabalho � R$ " + excesso);
			System.out.println("O valor total a receber � R$ " +salario);	
			
		}else {
			
			salario = (horas_trabalhadas *10);
		
			System.out.println("O valor a receber referente a salario � R$" + salario);
			System.out.println("N�o h� excedente");
	
		}
		
		teclado.close();
		
	}

}
