package modelos.exercicios;

import java.util.Scanner;

public class MaiorElemento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maiorElemento = Integer.MIN_VALUE;
        int contadorMaiorElemento = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            int numero = input.nextInt();

            if (numero > maiorElemento) {
                maiorElemento = numero;
                contadorMaiorElemento = 1;
            } else if (numero == maiorElemento) {
                contadorMaiorElemento++;
            }

            System.out.println("O maior elemento é: " + maiorElemento);
            System.out.println("Ele apareceu " + contadorMaiorElemento + "vezes");
        }

        input.close();
    }
}
