package academy.devdojo.maratonajava.introdução;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 /(double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21%2;
        System.out.println(resto);

        // < > <= => == !=
        boolean isDezmaiorquevinte = 10>=20;
        boolean isDezmenorquevinte = 10<=20;
        boolean isDezigualquevinte = 10==20;
        boolean isDezigualquedez = 10==10;
        boolean isDezdiferentedez= 10!=10;
        System.out.println("Dez é maior que vinte? " +isDezmaiorquevinte);
        System.out.println("Dez é menor que vinte? " +isDezmenorquevinte);
        System.out.println("Dez é igual que vinte? " +isDezigualquevinte);
        System.out.println("Dez é igual a vinte? " +isDezigualquedez);
        System.out.println("Dez é igual dez? " +isDezdiferentedez);

        // && (AND) || (OR) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentrodaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentrodaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentrodaLeiMaiorQueTrinta? " +isDentrodaLeiMaiorQueTrinta);
        System.out.println("isDentrodaLeiMenorQueTrinta? " +isDentrodaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalCOntaPoupança = 3000;
        float valorPlastation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlastation || valorTotalCOntaPoupança> valorPlastation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador ++;
        contador --;
        System.out.println(contador);
    }
}
