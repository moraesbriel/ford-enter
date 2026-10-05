package Decisao;

import java.util.Scanner;

public class Exercicio01 {
	/* Faça um programa que peça dois números ao usuário e 
	 * mostre qual o maior e qual o menor número, ou se são iguais */

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = ler.nextInt();
		
		System.out.print("Digite outro número: ");
		int num2 = ler.nextInt();
		
		if (num1 > num2) {
			System.out.print(num1 + " é maior que " + num2);
		} 
		
		else if (num1 < num2) {
			System.out.print(num1 + " é menor que " + num2);
		}
		
		else {
			System.out.print("Os número são iguais");
		}
	}
}