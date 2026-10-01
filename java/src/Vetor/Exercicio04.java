package Vetor;

public class Exercicio04 {
    /* Faça um programa com três vetores de 10 elementos cada, onde o usuário alimenta 
     * os dois primeiros vetores com números inteiros e o terceiro vetor seja alimentado 
     * com a soma dos elementos dos vetores anteriores.
     * No final imprima os elementos dos três vetores. */

    public static void main(String[] args) {

        int vet [] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int vet2 [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int vet3 [] = new int [10];

        for (int x = 0; x < 10; x ++) {
            vet3 [x] = vet [x] + vet2 [x];
        }

        for (int x = 0; x < 10; x ++) {
            System.out.print(vet [x] + " ");
        }
        
        System.out.println("\n");
        
        for (int x = 0; x < 10; x ++) {
        	System.out.print(vet2 [x] + " ");
        }
        
        System.out.println("\n");
        
        for (int x = 0; x < 10; x ++) {
        	System.out.print(vet3 [x] + " ");
        }
    }
}