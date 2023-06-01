package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Marlon"; //String constant pool
        String nome2 = "Marlon";
        nome= nome.concat("Marcondes");
        System.out.println(nome);
        System.out.println(nome == nome2 ) ;
        String nome3 = new String("Marlon");// 1 variavel de referencia, 2 objetos od tipo string, 3 uma string pool
        System.out.println( nome2 == nome3);
        System.out.println( nome2 == nome3.intern());
    }
}
