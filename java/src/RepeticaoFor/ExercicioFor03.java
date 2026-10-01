package RepeticaoFor;

import java.util.Scanner;

public class ExercicioFor03 {
    // Faça um programa onde o usuário entre com um número e o programa mostra a tabuada invertida desse número.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;

        System.out.print("Digite um número para calcular sua tabuada invertida: ");
        num = ler.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}