package modelos.exercicios;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        int A = input.nextInt();
        System.out.println("Informe o valor de B: ");
        int B =input.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("São Multiplos de 2!");

        } else {
            System.out.println ("Não são multiplos de 2!");
        }

        input.close();
    }

    public static class CalculaPrestacao {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Informe o valor: ");
            double valor = input.nextDouble();

            System.out.println("Informe a taxa: ");
            double taxa = input.nextDouble();

            System.out.println("Informe o tempo: ");
            int tempo = input.nextInt();

            double prestacao = valor + (valor * (taxa/100) * tempo);
            System.out.println(prestacao);

            input.close();
        }
    }
}
