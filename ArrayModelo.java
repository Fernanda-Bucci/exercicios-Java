package modelos.arrays;

import java.util.Scanner;

public class ArrayModelo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int [10];
        int[] b = new int [10];

        //carrega valores no Array A
        for (int i = 0; i < 10; i++){
            System.out.println("Informe o valor do elemento " + (i+1));
            a[i] = input.nextInt();
        }

        //Carrega valores no Array B que tem que ser metade do A;
        for(int i = 0; i < 10; i++){
            b[i] = a[i] / 2;

        }

        //Exibe os resultados
        for(int i = 0; i < 10; i++){

            System.out.println("Valores dos Arrays A e B, na posição: " + (i+1));
            System.out.println(a[i] + " | " + b[i]);
        }

        input.close();
    }
}
