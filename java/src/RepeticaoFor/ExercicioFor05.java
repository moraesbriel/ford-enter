package RepeticaoFor;

import java.util.Scanner;

public class ExercicioFor05 {
    // Faça um programa em que o usuário entre com um número, com a razão e com a finalização, e o programa mostre a P.A. do mesmo.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valorInicial;
        int razao;
        int valorFinal;

        System.out.print("Digite o valor inicial: ");
        valorInicial = ler.nextInt();

        System.out.print("Digite a razão: ");
        razao = ler.nextInt();

        System.out.print("Digite o valor final: ");
        valorFinal = ler.nextInt();

        for (int x = valorInicial; x <= valorFinal; x += razao) {
            System.out.print(x + " ");
        }
    }
}