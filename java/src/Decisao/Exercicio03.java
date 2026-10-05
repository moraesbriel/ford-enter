package Decisao;

import java.util.Scanner;

public class Exercicio03 {
	/* Faça um programa que verifique o estado civil de uma pessoa.
	 * 
	 * "C" (Casado), 
	 * "S" (Solteiro), 
	 * "D" (Divorciado), 
	 * "V" (Viúvo) ou 
	 * "O" (Outros).
	 * 
	 * Conforme a letra escrita pelo usuário, seu programa deve escrever o estado civil, exemplo:
	 * 
	 * Usuário digita: C
	 * Seu programa deve responder: C - Casado */

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu estado civil\nC (Casado)\nS (Solteiro)\nD (Divorciado\nV (Viúvo)\nO (Outros)");
		String estadoCivil = ler.nextLine();
		
		if (estadoCivil == "C" | estadoCivil == "c") {
			System.out.print("Casado");
		}
		
		else if (estadoCivil == "S" | estadoCivil == "s") {
			System.out.print("Solteiro");
		}
		
		else if (estadoCivil == "D" | estadoCivil == "d") {
			System.out.print("Divorciado");
		}
		
		else if (estadoCivil == "V" | estadoCivil == "v") {
			System.out.print("Viúvo");
		}
		
		else if (estadoCivil == "O" | estadoCivil == "o") {
			System.out.print("Outros");
		}
	}
}