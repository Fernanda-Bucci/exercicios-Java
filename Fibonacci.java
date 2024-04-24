package modelos.exercicios;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for(int i = 0; i < 15; i ++) {
            System.out.println(a + "");

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
