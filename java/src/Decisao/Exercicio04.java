package Decisao;

import java.util.Scanner;

public class Exercicio04 {
	/* Elaborar um programa onde o usuário digite sua idade, 
	 * caso seja menor de 18, apareça a mensagem proibida a entrada. */

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = ler.nextInt();
		
		if (idade < 18) {
			System.out.println("Entrada proibida");
		}
	}
}