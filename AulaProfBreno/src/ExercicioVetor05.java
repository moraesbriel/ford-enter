
import java.util.Scanner;

public class ExercicioVetor05 {
    /* Faça um programa com três vetores de 10 elementos cada, onde o primeiro vetor será alimentado 
	 * com os 10 primeiros elementos da sequência Fibonacci. Para o segundo vetor o usuário irá informar 
	 * o valor de início e a razão para gerar uma P.A. que irá alimentá-lo. O terceiro vetor será alimentado 
	 * com a P. G., onde o usuário irá informar novamente o valor de início e a razão. No final imprima os elementos 
	 * dos três vetores. */

    public static void main(String[] args) {

        int fibonacci [] = new int [10], pa [] = new int [10], pg [] = new int [10];
        int inicioPA, finalPA, razaoPA;
        int inicioPG, finalPG, razaoPG;

        fibonacci [0] = 0;
        fibonacci [1] = 1;

        for (int i = 1; i < 10; i ++) {
            fibonacci [i] = fibonacci [i - 1] + fibonacci [i - 2];
        }

        Scanner ler = new Scanner(System.in);

        System.out.print("DIgite o valor inicial da P.A.: ");
        inicioPA = ler.nextInt();

        System.out.print("Digite a razão da P.A.: ");
        razaoPA = ler.nextInt();
    }
}