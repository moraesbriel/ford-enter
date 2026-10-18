package Polimorfismo;

public class ObjetoFrete {

	public static void main(String[] args) {
		
		Frete frete = new Frete();
		
		frete.calcularFrete(4); //frete básico
		frete.calcularFrete(4, 10); // frete com distância
		frete.calcularFrete(4, 10, 15); // frete expresso
		frete.calcularFrete(4.0, 10.0, 8.0, 10.0); // frete para encomendas frágeis
		frete.calcularFrete(4, 10, 4, 0.5); // frete com desconto
	}
}