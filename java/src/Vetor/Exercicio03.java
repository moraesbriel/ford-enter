package Vetor;

public class Exercicio03 {
    // Desenvolva um programa que leia um vetor de 5 números inteiros, uma variável (também inteira) e imprima o resultado da multiplicação do vetor pela variável.

    public static void main(String[] args) {

        int vet[] = {13, 22, 51, 67, 69};
        int num = 2;

        for (int x = 0; x < 5; x++) {
            vet[x] = vet[x] * num;
        }

        for (int x = 0; x < 5; x++) {
            System.out.println(vet[x]);
        }
    }
}