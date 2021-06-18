package secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int centimetros, metros;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o tamanho em metros: ");
		metros = teclado.nextInt();
		
		centimetros = metros * 100;
		
		System.out.print ("O valor em centimentros é: " +centimetros);
		
		
		teclado.close();
		
		
		
	} 
}
