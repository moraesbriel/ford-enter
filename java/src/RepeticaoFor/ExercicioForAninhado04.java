package RepeticaoFor;

import java.util.Scanner;

public class ExercicioForAninhado04 {

    // Faça um programa onde o usuário escolha a tabuada de início e faça até a tabuada do 9.

    public static void main(String[] args) {

        int n1, n2;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite com qual tabuada quer iniciar: ");
        n1 = ler.nextInt();

        for (int i = n1; n1 <= 9; n1 ++) {
            System.out.println("\nTabuada do " + n1 + "\n");
            
            for (n2 = 1; n2 <= 10; n2 ++) {
                System.out.println(n1 + "x" + n2 + "=" + n1 * n2);
            }
        }
    }
}