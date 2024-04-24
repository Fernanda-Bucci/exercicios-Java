package modelos.exercicios;

import java.util.Scanner;

public class MenorMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valores = new int[5];

        System.out.println("Digite 5 valores:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = input.nextInt();
            }

            int maior = valores[0];
            int menor = valores[0];

            for (int i = 1; i < 5; i++) {
                if (valores[i] > maior) {
                    maior = valores[i];
                }
                if (valores[i] < menor) {
                    menor = valores[i];
                }
            }

            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);

            input.close();
        }
    }
