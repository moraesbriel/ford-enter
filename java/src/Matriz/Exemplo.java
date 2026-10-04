package Matriz;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		int [][] mat = new int [3][3]; // definindo uma matriz com 3 linhas (vetores) e 3 colunas (valores dos vetores)
		int linha, coluna, soma = 0;
		
		Scanner ler = new Scanner(System.in);
				
		// alimentando a matriz
		for (linha = 0; linha < 3; linha ++) {
			for (coluna = 0; coluna < 3; coluna ++) {
				System.out.print("Digite o valor para a linha " + linha + " e coluna " + coluna + ": ");
				mat [linha][coluna] = ler.nextInt();
				soma += mat [linha][coluna];
				
			}
		}
		
		// imprimindo os valores da matriz
		for (linha = 0; linha < 3; linha ++) {
			for (coluna = 0; coluna < 3; coluna ++) {
				System.out.print(mat [linha][coluna] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("A soma dos valores da matriz é igual a " + soma);
	}
}