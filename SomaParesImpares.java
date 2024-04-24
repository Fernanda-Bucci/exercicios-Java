package modelos.exercicios;

import java.util.Scanner;

public class SomaParesImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int A = input.nextInt();

        if (A <= 0) {
            System.out.println("Número inválido! " +
                    "Por favor, digite um número inteiro positivo.");
        } else {
            int somaPares = 0;
            int produtoImpares = 1;

            for (int i = 1; i <= A; i++) {
                if (i % 2 == 0) {
                    somaPares += i;
                } else {
                    produtoImpares *= i;
                }
            }

            System.out.println("Soma dos números pares até " + A + ": " + somaPares);
            System.out.println("Produto dos números ímpares até " + A + ": " + produtoImpares);
        }

        input.close();
    }
}
