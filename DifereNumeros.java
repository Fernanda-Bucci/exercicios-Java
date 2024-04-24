package modelos.exercicios;

import java.util.Scanner;

public class DifereNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Informe o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        int numero2 = input.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os numeros são iguais!");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }

        input.close();
    }
}
