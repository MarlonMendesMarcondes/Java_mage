package Atividade;


import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite tres numeros e obtenha a media: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double soma = num1 + num2 + num3;
        double media = (soma/3);
        System.out.println("Esses sao os seus numeros: "+ num1 + ", " + num2 + ", " + num3 + ", " + media + " !");

    }
}
