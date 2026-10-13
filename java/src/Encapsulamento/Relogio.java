package Encapsulamento;

public class Relogio implements InterRelogio {
	
	private int hora, minuto;
	private boolean despertador;
	
	@Override
	public void ajustarHora(int h) {
		
		if (h >= 0 && h <= 23) {
			this.hora = h;
		}
		
		else {
			System.out.println("Hora inválida.");
		}
	}
	
	@Override
	public void ajustarMinuto(int m) {
		
		if (m >= 0 && m <= 59) {
			this.minuto = m;
		}
		
		else {
			System.out.println("Minuto inválida.");
		}
	}
	
	@Override
	public void despertar() {
		
		if (this.despertador == true) {
			this.despertador = false;
		}
		
		else {
			this.despertador = true;
		}
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public boolean isDespertador() {
		return despertador;
	}
}