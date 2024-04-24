package modelos.exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numeroTabuada = 7;
        System.out.println("** Tabuada do número 7 **");
        for (int contador = 1; contador <= 10; contador ++){
            int valorResultado = numeroTabuada * contador;
            System.out.println(numeroTabuada + " X " + contador + " = " + valorResultado);
        }


    }
}
