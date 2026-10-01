package VariaveisSimples;

import java.util.Scanner;

public class Exercicio07 {
	// Crie um programa que peça o lado de um quadrado e calcule seu perímetro.

	public static void main(String[] args) {
		
		double lado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o lado do quadrado: ");
		lado = ler.nextDouble();
		
		System.out.print("O perímetro do quadrado é de " + (lado * 4) + " m.");
	}
}