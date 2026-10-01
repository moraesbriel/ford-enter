package Vetor;

public class ExemploVetor01 {

    public static void main(String[] args) {

        int vet [] = new int [5]; // declarando um vetor vazio, com o seu tamanho [5]
        int vet2 [] = {13,22,51,67,69}; // declarando um vetor com valores {}

        for (int x = 0; x < 5; x ++) {
            vet [x] = vet2 [x] * x;
        }

        for (int x = 0; x < 5; x ++) {
            System.out.println(vet [x]);
        }
    }
}