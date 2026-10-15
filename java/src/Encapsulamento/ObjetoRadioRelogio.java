package Encapsulamento;

import java.util.Scanner;

public class ObjetoRadioRelogio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		RadioRelogio rr = new RadioRelogio();
		
		System.out.println("Estado inicial do rádio relógio");
		System.out.println("Está ligado? " +rr.isLigado());
		System.out.println("Volume atual: " + rr.getVol());
		System.out.println("Estação: " + rr.getEstacao());
		System.out.println("Horário atual: " + rr.getHora() + ":" + rr.getMin());
		System.out.println("Despertador: " + rr.isDespertador());
		
		rr.ligar();
		System.out.print("\nAtualize as horas: ");
		rr.ajustarHora(ler.nextInt());
		System.out.println("Atualize os minutos: ");
		rr.ajustarMinuto(ler.nextInt());
		rr.aumentarVol();
		rr.trocarEstacao();
		rr.despertar();
		
		System.out.println("\nEstado atualizado do rádio relógio");
		System.out.println("Está ligado? " + rr.isLigado());
		System.out.println("Volume atual: " + rr.getVol());
		System.out.println("Estação: " + rr.getEstacao());
		System.out.println("Horário atual: " + rr.getHora() + ":" + rr.getMin());
		System.out.println("Despertador: " + rr.isDespertador());
	}
}