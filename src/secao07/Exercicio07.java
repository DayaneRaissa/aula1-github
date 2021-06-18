package secao07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		
		int identificacao,defeito, necessita_esfera=0, necessita_limpeza=0, necessita_troca=0, quebrado=0, quantidade=0;
		float perc_esfera, perc_limpeza, perc_troca, perc_quebrado, perc_quantidade;
		
		Scanner teclado = new Scanner (System.in);
			
			
		
		System.out.println("Informe o número de idenficação do mouse");
		identificacao = teclado.nextInt();
		
		while (identificacao != 0) {
			
			System.out.println("Informe o defeito");
			defeito = teclado.nextInt();
		
		System.out.println("Informe o número de idenficação do mouse");
		identificacao = teclado.nextInt();
		
		

if (defeito == 1) {
			
			necessita_esfera = necessita_esfera + 1;
					}
		
if (defeito == 2) {
			
			necessita_limpeza = necessita_limpeza + 1;
}

if (defeito == 3) {
	
	        necessita_troca = necessita_troca + 1;
}

if (defeito == 4) {
	
	        quebrado = quebrado + 1;
}


                quantidade = quantidade + 1;				
		}
		
	perc_esfera = (necessita_esfera * 100) / quantidade;	
	perc_limpeza = (necessita_limpeza * 100) / quantidade;
	perc_troca = (necessita_troca * 100) / quantidade;	
	perc_quebrado = (quebrado* 100) / quantidade;	
	perc_quantidade = (quantidade * 100)/quantidade;
		
		System.out.printf("Quantidade de mouses \t %d  %.2f%% \n\n " ,quantidade, perc_quantidade);
		System.out.println("Situação \t Quantidade \t Percentual");
		System.out.printf("Necessita de esfera \t %d \t%.2f%% \n ", necessita_esfera, perc_esfera);
		System.out.printf("Necessita de limpeza \t %d \t%.2f%% \n ",necessita_limpeza  ,perc_limpeza);
		System.out.printf("Necessita de troca \t %d \t%.2f%% \n " ,necessita_troca  ,perc_troca);
		System.out.printf("Quebrado \t\t %d \t%.2f%% \n " ,quebrado , perc_quebrado);
		
		
		
		
		
		
		teclado.close();
	}



	}
