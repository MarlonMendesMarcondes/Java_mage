package Calculadora.Learning;

import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = input.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int choice = input.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("O resultado é: " + result);

        input.close();
    }
}
