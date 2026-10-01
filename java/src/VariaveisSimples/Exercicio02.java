package VariaveisSimples;

import java.util.Scanner;

public class Exercicio02 {
	/* Crie um programa onde a pessoa irá escrever dois números inteiros
	 * quaisquer, e que tenha a soma, subtração, divisão, multiplicação, 
	 * exponenciação, divisão inteira, e o módulo dos dois números.
	 * Em seguida, print o resultado de cada operação. */

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		num1 = ler.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		num2 = ler.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 / num2);
		System.out.println(num1 * num2);
		System.out.println(num1 % num2);
	}
}