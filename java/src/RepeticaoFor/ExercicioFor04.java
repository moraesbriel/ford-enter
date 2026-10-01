package RepeticaoFor;

import java.util.Scanner;

public class ExercicioFor04 {
    // Faça um programa em que o usuário entre com um número e o programa mostre o fatorial do mesmo.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;
        int fatorial = 1;

        System.out.print("Digite um número para calcular seu fatorial: ");
        num = ler.nextInt();

        for (int x = num; x >= 1; x--) {
            fatorial *= x;
        }
        
        System.out.println("O fatorial de " + num + " é igual a " + fatorial + ".");
    }
}