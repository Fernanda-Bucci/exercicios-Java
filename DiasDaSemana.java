package modelos.exercicios;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 7 " +
                "para descobrir o dia da semana correspondente: ");
        int numero = input.nextInt();

        if (numero == 1) {
            System.out.println("Domingo");
        } else if (numero == 2) {
            System.out.println("Segunda-Feira");
        } else if (numero == 3) {
            System.out.println("Terça-Feira");
        } else if (numero == 4) {
            System.out.println("Quarta-Feira");
        } else if (numero == 5) {
            System.out.println("Quinta-feira");
        } else if (numero == 6) {
            System.out.println("Sexta-feira");
        } else if (numero == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("N4úmero de entrada incorreto.");
        }

        input.close();
    }
}
