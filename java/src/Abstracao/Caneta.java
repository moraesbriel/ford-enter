package Abstracao;

public class Caneta {
	
	//atributos (características)
	
	String cor;
	int carga;
	double ponta;
	boolean tampada;
	
	// método construtor
	
	public Caneta (String cor, double ponta) {
		
		this.carga = 100;
		this.tampada = true;
		this.cor = cor;
		this.ponta = ponta;
	}
	
	//métodos (comportamentos)
	
	public void tampar() {
		
		if (this.tampada == true) {
			System.out.print("Erro! A caneta já está tampada.");
		}
		
		else {
			this.tampada = true;
		}
	}
	
	public void destampar() {
		
		if (this.tampada == true) {
			this.tampada = false;
		}
		
		else {
			System.out.print("Erro! A caneta já está destampada.");
		}
	}
	
	public void escrever() {
		
		if (this.tampada == true) {
			System.out.print("Erro! Caneta tampada.");
		}
		
		else {
			if (this.carga < 5) {
				System.out.print("Carga insuficiente, recarregue.");
			}
			
			else {
				this.carga -= 5;
			}
		}
	}
	
	//estado atual
	
	public void estado() {
		
		System.out.println("A cor da caneta é: " + this.cor);
		System.out.println("A ponta da caneta é: " + this.ponta);
		System.out.println("A carga da caneta está em: " + this.carga + "%");
		System.out.println("A caneta está tampada? " + this.tampada);
	}
}