package Polimorfismo;

public class Sobrecarga { // sobrecarga é quando temos métodos iguais com assinaturas() diferentes
	
	private double n1 = 1.95, n2 = 1.55;
	
	public void soma() {
		System.out.println("A soma é: " + (n1 + n2));
	}
	
	public void soma(int x) { // polimorfismo de sobrecarga
		System.out.println("A soma é: " + (n1 + x));
	}
	
	public void soma(double x) { // polimorfismo de sobrecarga
		System.out.println("A soma é: " + (n1 + x));
	}
	
	public void soma(int x, int y) { // polimorfismo de sobrecarga
		System.out.println("A soma é: " + (x + y));
	}
	
	public void soma(int x, double y) { // polimorfismo de sobrecarga
		System.out.println("A soma é: " + (x + y));
	}
	
	public void soma(double x, int y) { // polimorfismo de sobrecarga
		System.out.println("A soma é: " + (x + y));
	}
}