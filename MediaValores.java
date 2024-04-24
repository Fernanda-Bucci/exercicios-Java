package modelos.exercicios;

import java.util.Scanner;

public class MediaValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        double A = input.nextInt();
        System.out.println("Informe o valor de B: ");
        double B = input.nextInt();
        System.out.println("Informe o valor de C: ");
        double C = input.nextInt();

        double maior = A;
        if (B > maior){
            maior = B;
        }
        if (C > maior){
            maior = C;
        }

        System.out.println("O maior valor é " + maior);

        input.close();

    }
}
