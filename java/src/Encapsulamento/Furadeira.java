package Encapsulamento;

public class Furadeira implements IEquipamento {
	
	private String marca;
	private int potencia;
	private boolean ligado;
	
	@Override
	public void ligar() {
		
		if (this.ligado == false) {
			this.ligado = true;
		}
		
		else {
			System.out.println("A furadeira já está ligada.");
		}
	}
	
	@Override
	public void desligar() {
		
		if (this.ligado == true) {
			this.ligado = false;
		}
		
		else {
			System.out.println("A furadeira já está desligada.");
		}
	}
	@Override
	public void aumentarPotencia() {
		
		if (this.ligado == true) {
			this.potencia ++;
		}
		
		else {
			System.out.println("Verifique se a furadeira está ligada.");
		}
	}
	
	@Override
	public void diminuirPotencia() {
		
		if (this.ligado == true && this.potencia > 0) {
			this.potencia --;
		}
		
		else {
			System.out.println("Verifique se a furadeira está ligada e se a potência já está no mínimo.");
		}
	}
	
	@Override
	public void executarFuncao() {
		System.out.println("Rotacionando a broca.");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getPotencia () {
		return potencia;
	}

	public boolean isLigado() {
		return ligado;
	}
}