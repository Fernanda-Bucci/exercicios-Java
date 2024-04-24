package modelos.exercicios;

import java.util.Scanner;


public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3;

        System.out.println("Informe a primeira nota: ");
        n1 = input.nextDouble();
        System.out.println("Informe a segunda nota: ");
        n2 = input.nextDouble();
        System.out.println("Informe a terceira nota: ");
        n3 = input.nextDouble();

        double media = (n1+n2+n3) / 3 ;
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("A média das notas é: " + media);

        input.close();

    }
}
