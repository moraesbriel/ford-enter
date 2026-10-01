package RepeticaoFor;

import java.util.Scanner;

public class ExercicioFor02 {
    // Faça um programa onde o usuário entre com um número e o programa mostra a tabuada desse número.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;

        System.out.print("Digite um número para calcular sua tabuada: ");
        num = ler.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}