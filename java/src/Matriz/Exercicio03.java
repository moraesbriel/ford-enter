package Matriz;

import java.util.Scanner;

public class Exercicio03 {
	/* Faça um programa com uma matriz de 3x10 elementos, onde a primeira linha será alimentada com os 10 primeiros elementos 
	 * da sequência de Fibonacci. Para a segunda linha, o usuário irá informar o valor de início e a razão para gerar uma PA 
	 * que irá alimentá-la. A terceira linha será alimentada com a PG, onde o usuário irá informar novamente o valor de início 
	 * e a razão. No final, imprima a matriz. */

	public static void main(String[] args) {
		
		int mat [][] = new int [3][10];
		
		int anterior = 1, atual = 1, proximo;
		
		int inicioPA, razaoPA, inicioPG, razaoPG;
		
		for (int linha = 0; linha < 1; linha ++) {
			for (int coluna = 0; coluna < 10; coluna ++) {
				mat[linha][coluna] = anterior;
				proximo = anterior + atual;
				anterior = atual;
				atual = proximo;
			}
		}
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o início da PA: ");
		inicioPA = ler.nextInt();
		
		System.out.print("Digite a razão da PA: ");
		razaoPA = ler.nextInt();
		
		for (int linha = 1; linha < 2; linha ++) {
			for (int coluna = 0; coluna < 10; coluna ++) {
				mat[linha][coluna] = inicioPA;
				inicioPA += razaoPA;
			}
		}
		
		System.out.print("\nDigite o início da PG: ");
		inicioPG = ler.nextInt();
		
		System.out.print("Digite a razão da PG: ");
		razaoPG = ler.nextInt();
		
		for (int linha = 2; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 10; coluna ++) {
				mat[linha][coluna] = inicioPG;
				inicioPG *= razaoPG;
			}
		}
		
		System.out.println();
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 10; coluna ++) {
				System.out.print(mat[linha][coluna] + "\t");
			}
			
			System.out.println();
		}
	}
}