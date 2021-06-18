package secao06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		 
		int idade;
		
		try (Scanner teclado = new Scanner (System.in))
		{
			System.out.println("Informe a idade");	
			idade = teclado.nextInt();
		}
		
	if (idade>=5 && idade <=7 ) {
    	System.out.println("Infantil a");
    	
    }  if (idade>=8 && idade <=11) {
    	System.out.println("Infantil b");
    
    }  if (idade>=12 && idade <=13 ) {
    	System.out.println("Juvenil a");
    	
    }  if (idade>=14 && idade <=17 ) {
    	System.out.println("Juvenil b");	
    	
    }  if (idade>=18) {
    	System.out.println("Adulto");	
    	
    	
    }
    
    
	}

}
