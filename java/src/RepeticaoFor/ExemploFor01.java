package RepeticaoFor;

public class ExemploFor01 {

    public static void main(String[] args) {
        System.out.println("Tabuada do 6");
        
        int contador;
        
        for (contador = 10; contador >= 1; contador--) {
            System.out.println("6 x " + contador + " = " + 6 * contador);
        }
    }
}