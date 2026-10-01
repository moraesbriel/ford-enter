package VariaveisSimples;

import java.util.Scanner;

public class Exercicio06 {
	// Peça ao usuário para inserir a base e a altura de um retângulo a calcule a área.

	public static void main(String[] args) {
		
		double base;
		double altura;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a base do retângulo: ");
		base = ler.nextDouble();
		
		System.out.print("Digite a altura do retângulo: ");
		altura = ler.nextDouble();
		
		System.out.print("A área do retângulo é de " + (base * altura) + " m².");
	}
}