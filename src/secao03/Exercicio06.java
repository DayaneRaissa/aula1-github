package secao03;

import java.util.Scanner;

public class Exercicio06 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		float horas_trabalhadas, valor_horas, salario;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Quanto voc� ganha por hora? ");
		valor_horas = teclado.nextFloat();
		
		System.out.print("Informe a quantidade de horas trabalhadas no m�s: ");
		horas_trabalhadas = teclado.nextFloat();
		
		salario = horas_trabalhadas * valor_horas;
		
		System.out.print("O valor a receber referente ao sal�rio � R$ " +salario);
		
		teclado.close();
	}

}
