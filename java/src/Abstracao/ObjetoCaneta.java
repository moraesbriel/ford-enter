package Abstracao;

public class ObjetoCaneta { //instanciando o objeto caneta

	public static void main(String[] args) {
		
		Caneta bic = new Caneta("Azul", 0.7); // método construtor de objetos
		System.out.println("Caneta Bic");
		bic.estado();
		
		Caneta c1 = new Caneta("Verde", 0.5);
		System.out.println("\nCaneta c1");
		c1.estado();
	}
}