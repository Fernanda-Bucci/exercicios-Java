package modelos.exercicios;

import java.util.Scanner;

public class ExibePares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println ("Escreva um número inteiro: ");
        int N = input.nextInt();

        System.out.println("Os números pares entre 1 e " + N + ":");

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0 ) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
