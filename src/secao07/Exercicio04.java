package secao07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		
		int numero, menor=999, maior=-999, soma=0, media;
		
		Scanner teclado = new Scanner (System.in);
		
		
		for (int i=1; i<=10; i++) {
		
	System.out.println("Informe um n�mero");
	numero = teclado.nextInt();
	
	if (numero > 0) {
		if (numero > maior) {
		maior = numero;
			
		
	} if (numero < menor ) {
		menor = numero;
				
	}	
		
		soma =  numero+soma;
	}else {
		i--;
	}
		}
		
		media = soma /10;
		
		System.out.println("O maior n�mero � " +maior);
		System.out.println("O menor n�mero � " +menor);
		System.out.println("O resultado da media � " + media);
		
		
		
		teclado.close();
		
		}
			
	}


