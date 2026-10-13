package Encapsulamento;

public class RadioRelogio implements InterRelogio, InterRadio {
	
	private int vol, hora, min;
	private boolean ligado, despertador;
	private double estacao;

	@Override
	public void ligar() {
		
		if (this.ligado == true) {
			System.out.println("O rádio já está ligado.");
		}
		
		else {
			this.ligado = true;
			this.vol = 10;
		}
	}

	@Override
	public void desligar() {
		
		if (this.ligado == true) {
			this.ligado = false;
		}
		
		else {
			System.out.println("O rádio já está desligado.");
		}
	}

	@Override
	public void aumentarVol() {
		
		if (this.ligado == false || this.vol >= 100) {
			System.out.println("Verifique o volume e se está ligado.");
		}
		
		else {
			this.vol ++;
		}
	}

	@Override
	public void diminuirVol() {
		
		if (this.ligado == false || this.vol <= 0) {
			System.out.println("Verifique o volume e se está ligado.");
		}
		
		else {
			this.vol --;
		}
	}

	@Override
	public void trocarEstacao() {
		
		this.estacao += 0.10;
	}

	@Override
	public void ajustarHora(int h) {
		
		if (this.ligado == true && h >= 0 || h <= 23) {
			this.hora = h;
		}
		
		else {
			System.out.println("Erro!");
		}
	}

	@Override
	public void ajustarMinuto(int m) {
		
		if (this.ligado == true && m >= 0 || m <= 59) {
			this.min = m;
		}
		
		else {
			System.out.println("Erro!");
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

	public int getVol() {
		return vol;
	}

	public int getHora() {
		return hora;
	}

	public int getMin() {
		return min;
	}

	public boolean isLigado() {
		return ligado;
	}

	public boolean isDespertador() {
		return despertador;
	}

	public double getEstacao() {
		return estacao;
	}
}