package Encapsulamento;

public class Radio implements InterRadio {
	
	private int volume, estacao;
	private boolean ligado;
	
	@Override
	public void ligar() {
		
		if (this.ligado == true) {
			System.out.println("O rádio já está ligado.");
		}
		
		else {
			this.ligado = true;
		}
	}
	@Override
	public void desligar() {
		
		if (this.ligado == false) {
			System.out.println("O rádio já está desligado.");
		}
		
		else {
			this.ligado = false;
		}
	}
	@Override
	public void aumentarVol() {
		
		if (this.ligado == true && this.volume < 100) {
			this.volume ++;
		}
		
		else {
			System.out.println("Verifique o volume e se o rádio está ligado.");
		}
	}
	@Override
	public void diminuirVol() {
		
		if (this.ligado == true && this.volume > 0) {
			this.volume --;
		}
		
		else {
			System.out.println("Verifique o volume e se o rádio está ligado.");
		}
	}
	@Override
	public void trocarEstacao() {
		
		if (this.ligado == true) {
			this.estacao ++;
		}
		
		else {
			System.out.println("Ligue o rádio.");
		}
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getEstacao() {
		return estacao;
	}
	
	public boolean isLigado() {
		return ligado;
	}
}