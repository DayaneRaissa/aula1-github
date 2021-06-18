package secao03;

import java.util.Scanner;

public class Exercicio06 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		float horas_trabalhadas, valor_horas, salario;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Quanto você ganha por hora? ");
		valor_horas = teclado.nextFloat();
		
		System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
		horas_trabalhadas = teclado.nextFloat();
		
		salario = horas_trabalhadas * valor_horas;
		
		System.out.print("O valor a receber referente ao salário é R$ " +salario);
		
		teclado.close();
	}

}
