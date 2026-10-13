package Encapsulamento;

import java.util.Scanner;

public class ObjetoRelogio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Relogio rolex = new Relogio();
		int horas, min;
		
		System.out.println("Estado inicial do relógio.");
		System.out.println("Hora atual " + rolex.getHora() + ":" + rolex.getMinuto());
		System.out.println("O despertador está ativado? " + rolex.isDespertador());

		System.out.print("\nDigite a hora: ");
		horas = ler.nextInt();
		rolex.ajustarHora(horas);
		
		System.out.print("Digite os minutos: ");
		min = ler.nextInt();
		rolex.ajustarMinuto(min);
		rolex.despertar();
		
		System.out.println("Estado inicial do relógio");
		System.out.println("Hora atual " + rolex.getHora() + ":" + rolex.getMinuto());
		System.out.println("O despertador está ativado? " + rolex.isDespertador());
	}
}