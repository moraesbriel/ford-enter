package Polimorfismo;

public class Frete {
	
	private double freteKg = 5, freteKm = 0.5;
	
	public void calcularFrete(double kg) { // frete básico
		System.out.println("Frete básico: R$" + (freteKg * kg));
	}
	
	public void calcularFrete(double kg, double km) { // frete com distância
		System.out.println("Frete com distância: R$" + ((freteKg * kg) + (freteKm * km)));
	}
	
	public void calcularFrete(double kg, double km, double taxaAdicional) { // frete expresso
		System.out.println("Frete expresso: R$" + (((freteKg * kg) + (freteKm * km) + taxaAdicional)));
	}
	
	public void calcularFrete(double kg, double km, double seguro, double taxaManuseio) { // frete para encomendas frágeis
		System.out.println("Frete para encomendas frágeis: R$" + ((((freteKg * kg) + (freteKm * km) + seguro) + taxaManuseio)));
	}
	
	public void calcularFrete(double kg, double km, int qnt, double desc) { // frete com desconto
		System.out.println("Frete com desconto: R$" + (((freteKg * kg) + (freteKm * km)) - (qnt * desc)));
	}
}