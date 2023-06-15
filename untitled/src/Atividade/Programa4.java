package Atividade;

import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int soma = num1 + num2 ;
        System.out.println("Esses sao os seus numeros: "+ num1 + " + " + num2 + " = " + soma + " !");

    }
}
