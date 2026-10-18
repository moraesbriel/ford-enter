package Encapsulamento;

public class Gerador implements IEquipamento, IManutencao {
	
	private String marca, modelo;
	private boolean manut, ligado;
	private int potencia;
	
	@Override
	public void iniciarManutencao() {
		if (this.manut == true) {
			System.out.println("Manutenção já iniciada.");
		}
		
		else {
			this.manut = true;
		}
	}

	@Override
	public void finalizarManutencao() {
		if (this.manut == false) {
			System.out.println("Manutenção já finalizada.");
		}
		
		else {
			this.manut = false;
		}
	}

	@Override
	public String consultarEstado() {
		String manutencao;
		if (manut == true) {
			manutencao = "Manutenção iniciada.";
		}
		
		else {
			manutencao = "Manutenção finalizada.";
		}
		return manutencao;
	}

	@Override
	public void ligar() {
		if (this.ligado == true) {
			System.out.println("O gerador já está ligado.");
		}
		
		else {
			this.ligado = true;
		}
	}

	@Override
	public void desligar() {
		if(this.ligado == true) {
			this.ligado = false;
		}
		
		else {
			System.out.println("O gerador já está desligado.");
		}
	}

	@Override
	public void aumentarPotencia() {
		if (this.ligado == true) {
			this.potencia ++;
		}
		
		else {
			System.out.println("Ligue o gerador.");
		}
	}

	@Override
	public void diminuirPotencia() {
		if (this.ligado == true && this.potencia > 0) {
			this.potencia --;
		}
		
		else {
			System.out.println("Verifique se o gerador está ligado e a potência que ele está.");
		}
	}

	@Override
	public void executarFuncao() {
		System.out.println("Gerando energia.");
	}
}