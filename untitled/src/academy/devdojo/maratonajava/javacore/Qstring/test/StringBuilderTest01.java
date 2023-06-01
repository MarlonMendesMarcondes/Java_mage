package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome ="Marlon Marcondes";
        nome.concat(" Morth35");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("marlon marcondes");
        sb.append(" marlim").append(" senpai");
        System.out.println(sb);
    }
}
