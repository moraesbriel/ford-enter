package Abstracao;

public class Carro {
	
	private String marca, modelo, cor; // modificador de acesso private
	private int ano;
	private int preco;
	private int velocidade;
	private boolean ligado;
	
	// métodos acessores (getters) e modificadores (setters)
	
	public String getMarca (String marca) {
		
		if (this.marca == "VW" || this.marca == "GM" || this.marca == "Fiat" || this.marca == "Ford" ) {
			this.marca = marca;
		}
		
		return marca = null;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void ligar () {
		
		if (this.ligado == true) {
			System.out.println("O carro está ligado.");
		}
		
		else {
			this.ligado = true;
		}
	}

	public void desligar () {
		
		if (this.ligado == true) {
			this.ligado = false;
		}
		
		else {
			System.out.println("O carro já está desligado.");
		}
	}
	
	public void acelerar () {
		
		if (this.ligado == false) {
			System.out.println("O carro está desligado");
		}
		
		else {
			for (this.velocidade = 0; this.velocidade <= 200; this.velocidade ++) {
				System.out.println(velocidade + "km/h");
			}
		}
	}
	
	public void frear () {
		if (this.ligado == false) {
			System.out.println("O carro já está parado.");
		}
		
		else {
			for (this.velocidade = 200; this.velocidade > 0; this.velocidade --);
			System.out.println(velocidade + "km/h");
		}
	}
	
	public void estado () {
		
		System.out.println("A marca do carro é: " + this.marca);
		System.out.println("O modelo do carro é: " + this.modelo);
		System.out.println("A cor do carro é: " + this.cor);
		System.out.println("O ano do carro é: " + this.ano);
		System.out.println("O preço do carro é: " + this.preco);
		System.out.println("O carro está ligado? " + this.ligado);
	}
}