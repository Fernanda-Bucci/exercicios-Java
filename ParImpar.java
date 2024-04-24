package modelos.exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }

        if (num > 0) {
            System.out.println("...E é positivo.");
        } else if (num < 0) {
            System.out.println ("... E é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        input.close();

    }
}
