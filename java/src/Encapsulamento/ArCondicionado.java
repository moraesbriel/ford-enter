package Encapsulamento;

public class ArCondicionado implements IManutencao {
	
	private String marca, modelo;
	private boolean estadoManutencao;
	
	public void iniciarManutencao() {
		if (this.estadoManutencao == true) {
			System.out.println("Manutenção já iniciada.");
		}
		
		else {
			this.estadoManutencao = true;
		}
	}
	
	public void finalizarManutencao() {
		if (this.estadoManutencao == false) {
			System.out.println("Manutenção já finalizada.");
		}
		
		else {
			this.estadoManutencao = false;
		}
	}
	
	public String consultarEstado() {
		String estadoManut;
		if (this.estadoManutencao == true) {
			estadoManut = "Manutenção iniciada.";
		}
		
		else {
			estadoManut = "Manutenção finalizada.";
		}
		
		return estadoManut;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}