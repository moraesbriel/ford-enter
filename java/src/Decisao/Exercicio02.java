package Decisao;

import java.util.Scanner;

public class Exercicio02 {
	// Escreva um programa que receba um número inteiro e diga se ele é par ou ímpar.

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = ler.nextInt();
		
		if (num % 2 == 0) {
			System.out.print("O número " + num + " é par.");
		}
		
		else {
			System.out.print("O número " + num + " é ímpar.");
		}
	}
}