package Atividade;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite tres numeros e obtenha a media: ");
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        System.out.println("Bom dia/ Boa tarde/ Boa noite" + nome + " " + idade + " Anos" + "!");
    }
}
