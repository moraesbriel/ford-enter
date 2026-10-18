package Polimorfismo;

public class ExemploSobrecarga {
	
	public static void main(String[] args) {
		
		Sobrecarga s = new Sobrecarga();
		
		s.soma();
		s.soma(6.7);
		s.soma(22);
		s.soma(6.9, 51);
	}
}