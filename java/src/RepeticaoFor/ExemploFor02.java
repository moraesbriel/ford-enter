package RepeticaoFor;

import java.util.Scanner;

public class ExemploFor02 {

    public static void main(String[] args) {
    	
        Scanner ler = new Scanner(System.in);
        
        int valor;
        
        System.out.print("Digite o valor de início: ");
        valor = ler.nextInt();
        
        for (int x = valor; x <= 100; x += 3) {
            System.out.print(x + " ");
        }
        
        System.out.println("\nFim do laço");
    }
}