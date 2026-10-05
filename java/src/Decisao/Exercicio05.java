package Decisao;

import java.util.Scanner;

public class Exercicio05 {
	/* Refaça o programa anterior mostrando entrada proibida se o usuário for 
	 * menor  de 18 anos, e seja bem vindo se o usuário tiver 18 anos ou mais. */

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = ler.nextInt();
		
		if (idade < 18) {
			System.out.print("Entrada proibida");
		}
		
		else {
			System.out.print("Seja bem vindo!");
		}
	}
}