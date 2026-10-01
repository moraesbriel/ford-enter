package VariaveisSimples;

import java.util.Scanner;

public class Exercicio04 {
	// Peça para o usuário calcular a idade de uma pessoa a partir do ano de nascimento.

	public static void main(String[] args) {
		
		int anoAtual, anoNascimento;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o ano atual: ");
		anoAtual = ler.nextInt();
		
		System.out.print("Digite o ano do seu nascimento: ");
		anoNascimento = ler.nextInt();
		
		System.out.print("Você tem " + (anoAtual - anoNascimento) + " anos de idade.");
	}
}