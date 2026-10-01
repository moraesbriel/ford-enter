package RepeticaoFor;

import java.util.Scanner;

public class ExercicioForAninhado05 {
    // Faça um programa onde o usuário esolha a tabuada de início e a tabuada de fim.

    public static void main(String[] args) {

        int inicio, fim;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        inicio = ler.nextInt();

        System.out.print("Digite outro número: ");
        fim = ler.nextInt();

        for (int i = inicio; i <= fim; i ++) {
            System.out.println("\nTabuada do " + i + "\n");

            for (int j = 1; j <= 10; j ++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }
    }
}