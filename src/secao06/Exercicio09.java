package secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		float indice;
		
		try (Scanner teclado = new Scanner (System.in)) 
		{
			System.out.println("Informe o indice de polui��o");
			indice = teclado.nextFloat();
		}
		
		if (indice < 0.3) {
			System.out.println("Indice Aceit�vel");
			
		} if (indice >= 0.3 && indice < 0.4) {
			System.out.println("As ind�strias do grupo 1 devem suspender suas atividades");
			
		} if (indice >= 0.4 && indice <0.5) {
			System.out.println("As industrias dos grupos 1 e 2 devem suspender as atividades");
			
		} if (indice >=0.5) {
			System.out.println("Todos os grupos devem ser notificados e suspender as atividades");
		}
		
	}

}
