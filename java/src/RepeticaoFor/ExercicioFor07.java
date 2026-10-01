package RepeticaoFor;

import java.util.Scanner;

public class ExercicioFor07 {
    // Faça um programa em que o usuário entre com um número de elementos que deseja que o programa mostre a sequência Fibonacci (1, 1, 2, 3, 5, 8, 13, 21, ...).

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int proximo = 0;
        int anterior = 0;
        int atual = 1;
        int limite;

        System.out.print("Digite quantos números deseja exibir na sequência Fibonacci: ");
        limite = ler.nextInt();

        System.out.print(atual + " ");
        for (int x = atual; x < limite; x ++) {
            proximo = anterior + atual;
            System.out.print(proximo + " ");
            anterior = atual;
            atual = proximo;
        }
    }
}