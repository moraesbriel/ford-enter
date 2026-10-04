package Vetor;

import java.util.Scanner;

public class Exercicio05 {
	/* Faça um programa com três vetores de 10 elementos cada, onde o primeiro vetor será alimentado 
	 * com os 10 primeiros elementos da sequência Fibonacci. Para o segundo vetor o usuário irá informar 
	 * o valor de início e a razão para gerar uma P.A. que irá alimentá-lo. O terceiro vetor será alimentado 
	 * com a P. G., onde o usuário irá informar novamente o valor de início e a razão. No final imprima os elementos 
	 * dos três vetores. */

	public static void main(String[] args) {
		
		int fibo [] = new int [10];
		int pa [] = new int [10];
		int pg [] = new int [10];
		
		int anterior = 1, atual = 1, proximo;
		
		int inicioPA, razaoPA, inicioPG, razaoPG;
		
		for (int x = 0; x < 10; x ++) {
			fibo [x] = anterior;
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor de início da PA: ");
		inicioPA = ler.nextInt();
		
		System.out.print("Digite a razão da PA: ");
		razaoPA = ler.nextInt();
		
		for (int x = 0; x < 10; x ++) {
			pa [x] = inicioPA;
			inicioPA += razaoPA;
		}
		
		System.out.print("\nDigite o valor de início da PG: ");
		inicioPG = ler.nextInt();
		
		System.out.print("Digite a razão da PG: ");
		razaoPG = ler.nextInt();
		
		for (int x = 0; x < 10; x ++) {
			pg [x] = inicioPG;
			inicioPG *= razaoPG;
		}
		
		System.out.println("\nFibonacci: ");
		for (int x = 0; x < 10; x ++) {
			System.out.print(fibo [x] + " ");
		}
		
		System.out.println("\n\nPA: ");
		for (int x = 0; x < 10; x ++) {
			System.out.print(pa [x] + " ");
		}
		
		System.out.println("\n\nPG: ");
		for (int x = 0; x < 10; x ++) {
			System.out.print(pg [x] + " ");
		}
	}
}