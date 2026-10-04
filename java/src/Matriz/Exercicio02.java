package Matriz;

import java.util.Scanner;

public class Exercicio02 {
	
	/* Faça um programa com três matrizes de 3x4 elementos cada, onde o usuário alimente 
	 * as duas primeiras matrizes com números inteiros e a terceira matriz seja alimentada
	 * com a soma dos elementos das matrizes anteriores. No final, imprima os elementos das três matrizes.*/

	public static void main(String[] args) {
		
		int mat1 [][] = new int [3][4];
		int mat2 [][] = new int [3][4];
		int mat3 [][] = new int [3][4];
		
		Scanner ler = new Scanner(System.in);
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 4; coluna ++) {
				System.out.print("Digite o valor para a linha " + linha + " e coluna " + coluna + " da primeira matriz: ");
				mat1 [linha][coluna] = ler.nextInt();
			}
		}
		
		System.out.println();
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 4; coluna ++) {
				System.out.print("Digite o valor para a linha " + linha + " e coluna " + coluna + " da segunda matriz: ");
				mat2 [linha][coluna] = ler.nextInt();
			}
		}
		
		System.out.println();

		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 4; coluna ++) {
				mat3 [linha][coluna] = mat1 [linha][coluna] + mat2 [linha][coluna];
			}
		}
		
		System.out.println("\tMatriz 1\n");
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 4; coluna ++) {
				System.out.print(mat1 [linha][coluna] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("\n\tMatriz 2\n");
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 4; coluna ++) {
				System.out.print(mat2 [linha][coluna] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("\n\tMatriz 3\n");
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 4; coluna ++) {
				System.out.print(mat3 [linha][coluna] + "\t");
			}
			
			System.out.println();
		}
	}
}