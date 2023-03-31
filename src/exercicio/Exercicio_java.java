package exercicio;

import java.util.Scanner;

public class Exercicio_java {

	public static void main(String[] args) {

		/* Faça um programa para ler os valores inteiros, e depois mostrar na tela
		 * a soma desses números com uma mensagem explicativa, conforme exemplos:
		 * 
		 * Exemplos:
		 * 
		 * Entrada: 10			Saída: soma = 40
		 * 			30
		 * 
		 * Entrada: -30			Saída: soma = -20
		 * 			10	
		 * 
		 * Entrada: 0			Saída: soma = 0
		 * 			0
		 */
		
		Scanner ler = new Scanner(System.in);
		 
		 System.out.printf("Informe um número para a soma:\n");

		 int a, b;

		  System.out.printf("Informe o primeiro valor: ");
		  a = ler.nextInt(); 
		  
		  System.out.printf("Informe o segundo valor: ");
		  b = ler.nextInt(); 
		  
		  System.out.printf("\nResultados:\n");
		  System.out.printf("%d + %d = %d\n", a, b, (a + b));


		
		
	}

}
