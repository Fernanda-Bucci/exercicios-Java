package modelos.exercicios;

import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o sexo ('M' para MASCULINO e 'F' para FEMININO)");
        char sexo = input.next().charAt(0);

        System.out.println("Informe a altura em metros ('Exemplo:1,70'): ");
        double altura = input.nextDouble();

        double imcIdeal;
        if (sexo == 'M' || sexo == 'm') {
            imcIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            imcIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. " +
                    "Por favor, informe M para masculino ou F para feminino.");
            return;
        }

        System.out.println("IMC ideal: " + imcIdeal);

        input.close();
    }
}

