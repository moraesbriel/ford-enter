package RepeticaoFor;

public class ExercicioForAninhado03 {
    // Faça um programa que mostre a tabuada do 9 até a do 2 invertida.

    public static void main(String[] args) {
    	
        int n1, n2;
        
        for (n1 = 9; n1 >= 2; n1 --) {
            System.out.println("\nTabuada do " + n1 + "\n");

            for(n2 = 10; n2 >= 1; n2 --) {
                System.out.println(n1 + "x" + n2 + "=" + n1 * n2);
            }
        }
    }
}