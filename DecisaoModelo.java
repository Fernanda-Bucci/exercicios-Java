package modelos.decisao;

import java.util.Scanner;

public class DecisaoModelo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Informe o valor da nota N1: ");
        int N1 = input.nextInt();
        System.out.println("Informe o valor da nota N2: ");
        int N2 = input.nextInt();
        System.out.println("Informe o valor da nota N3: ");
        int N3 = input.nextInt();
        System.out.println("Informe o valor da nota N4: ");
        int N4 = input.nextInt();

        int media = (N1 + N2 + N3 + N4) / 4;

        if (media >= 5) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        System.out.println("A média das notas é: " + media);

        input.close();

    }
}

//Daria para ser assim também:
// double n1, n2, n3, n4;
// double md;
//Scanner input = new Scanner (System.in);
//System.out.println (Informe a prmeira nota:)
//n1 = input.nextDouble();
//...
//md = (n1+n2+n3+n4) / 4;

