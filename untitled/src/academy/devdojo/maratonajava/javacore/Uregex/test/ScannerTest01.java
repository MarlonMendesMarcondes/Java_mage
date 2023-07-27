package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = " levi eren mikasa";
        String[] nomes = texto.split(" ");
        String[] nomes1 = nomes;
        for (String nome: nomes){
            System.out.println(nome);
        }
    }
}
