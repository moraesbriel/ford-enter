package VariaveisSimples;

import java.util.Scanner;

public class Exercicio05 {
	// Crie um programa que converta uma temperatura de Celsius para Kelvin.

	public static void main(String[] args) {
		
		int temp;
		double kelvin = 273.15;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius para convertê-lá em Kelvin: ");
		temp = ler.nextInt();
		
		System.out.print(temp + "ºC = " + (temp + kelvin) + "K.");
	}
}