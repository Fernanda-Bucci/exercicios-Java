package modelos.funcoes;

import java.util.Scanner;

public class ModeloFuncoes {

    //criar constante de PI
    public static final double PI = 3.1416;
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Informe o valor do raio: ");
        double raio = input.nextDouble();

        //double areaDoCirculo = PI * (raio*raio);
        double areaDoCirculo = calculaAreaDoCirculo(raio);
        System.out.println("Valor da área do círculo: " + areaDoCirculo);

        double novaArea = calculaAreaDoCirculo(2);
        System.out.println("Nova área " + novaArea);

        input.close();

    }
    private static double calculaAreaDoCirculo(double raio) {
        return PI * (raio*raio);
    }
}
