package VariaveisSimples;

import java.util.Scanner;

public class Exercicio01 {
	/* Crie três variáveis e peça para o usuário:
	 * 
	 * a) uma chamada cidade que guarde o nome da sua cidade;
	 * b) uma chamada ano que guarde o ano atual;
	 * c) uma chamada temperatura que guarde um valor numérico representando a temperatura média da sua cidade;
	 * 
	 * Em seguida, imprima uma frase completa usando essas variáveis. */

	public static void main(String[] args) {
		String cidade;
		int ano;
		float temp;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o nome da sua cidade: ");
		cidade = ler.nextLine();
		
		System.out.print("Digite o ano atual: ");
		ano = ler.nextInt();
		
		System.out.print("Digite a temperatura atual: ");
		temp = ler.nextFloat();
		
		System.out.print("Na cidade de " + cidade + ", ano de " + ano + ", está fazendo " + temp + "ºC.");
	}
}