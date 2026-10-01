package VariaveisSimples;

import java.util.Scanner;

public class Exercicio03 {
	// Pedir para o usuário adicionar dois números e calcular a média deles.

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		num1 = ler.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		num2 = ler.nextInt();
		
		System.out.print("A média é: " + (num1 + num2) / 2);
	}
}