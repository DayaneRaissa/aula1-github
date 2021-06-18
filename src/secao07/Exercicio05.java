package secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		
		String senha, nome;
		
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Informe o nome de usuário");
		nome = teclado.next();
		
		System.out.println("Crie uma senha");
		senha = teclado.next();
		
		while (nome.equals(senha)) {
			
			System.out.println("A senha deve ser diferente do nome");
		
		
		System.out.println("Informe o nome de usuário");
		nome = teclado.next();
		
		System.out.println("Crie uma senha");
		senha = teclado.next();
		
		}
		
		teclado.close();
		

	}

}
