package Abstracao;

public class Celular {
	
	String marca, modelo, cor;
	int ano, preco, volume;
	boolean ligado;
	
	public Celular (String marca, String modelo, String cor) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = 2026;
		this.preco = 10000;
		this.ligado = false;
	}
	
	public void ligar () {
		
		if (this.ligado == false) {
			this.ligado = true;
			System.out.println("O celular está sendo ligado.");
		}
		
		else {
			System.out.println("O celular já está ligado.");
		}
	}
	
	public void desligar () {
		
		if (this.ligado == true) {
			this.ligado = false;
			System.out.println("O celular foi desligado.");
		}
		
		else {
			System.out.println("O celular já está desligado.");
		}
	}
	
	public void aumentar_volume () {
		
		if (this.ligado == true && this.volume < 100) {
			volume ++;
		}
	}
	
	public void diminuir_volume () {
		
		if (this.ligado == true && this.volume > 0) {
			volume --;
		}
	}
	
	public void estado () {
		
		System.out.println("A marca do celular é: " + this.marca);
		System.out.println("O modelo do celular é: " + this.modelo);
		System.out.println("A cor do celular é: " + this.cor);
		System.out.println("O ano do celular é: " + this.ano);
		System.out.println("O preço do celular é: " + this.preco);
		System.out.println("O celular está ligado? " + this.ligado);
	}
}