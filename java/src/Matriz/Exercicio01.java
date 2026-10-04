package Matriz;

import java.util.Scanner;

public class Exercicio01 {
	
	/* Desenvolva um programa que leia uma matriz 3x4 de números inteiros, uma variável (também inteira)
	 * e imprima o resultado da multiplicação da matriz pela variável. */
	
	public static void main(String[] args) {
		
		int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int num = 5;
				
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 4; coluna ++) {
				mat[linha][coluna] *= num;
			}
		}
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 4; coluna ++) {
				System.out.print(mat[linha][coluna] + "\t");
			}
			
			System.out.println();
		}
	}
}