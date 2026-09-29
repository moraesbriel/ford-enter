public class Fatorial {
    public static void main(String[] args) {

        double fatorial = 1;

        for (double x = 30; x > 0; x --) {
            fatorial *= x;
        }

        System.out.print("30! = " + fatorial);
    }
}