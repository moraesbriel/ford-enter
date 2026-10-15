package Encapsulamento;

public class Furadeira implements IEquipamento {
	
	private String marca;
	private int potencia;
	private boolean ligado;
	private boolean furar;
	
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
		
		if (this.ligado == true && this.potencia <= 10) {
			this.potencia ++;
		}
		
		else {
			System.out.println("Verifique se a furadeira está ligada e se a potência já está no máximo.");
		}
	}
	
	@Override
	public void diminuirPotencia() {
		
		if (this.ligado == true && this.potencia >= 0) {
			this.potencia --;
		}
		
		else {
			System.out.println("Verifique se a furadeira está ligada e se a potência já está no mínimo.");
		}
	}
	
	@Override
	public void executarFuncao() {
		
		if (this.ligado == true && this.potencia > 0 || this.potencia <= 10) {
			this.furar = true;
		}
		
		else {
			System.out.println("Verfique se a furadeira está ligada.");
		}
	}
}