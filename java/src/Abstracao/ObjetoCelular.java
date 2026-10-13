package Abstracao;

public class ObjetoCelular {

	public static void main(String[] args) {
		
		Celular cel = new Celular ("Apple", "iPhone", "Preto");
		cel.estado();
		cel.ligar();
		cel.desligar();
		cel.aumentar_volume();
		cel.diminuir_volume();
	}
}