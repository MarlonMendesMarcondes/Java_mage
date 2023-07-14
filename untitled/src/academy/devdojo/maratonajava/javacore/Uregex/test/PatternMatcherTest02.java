package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = todos os que n for digitos
        // \s = todos os espaços em branco \t \n \f \r
        // \S = todos os caracters excluindo os brancos
        // \w = a-z A-Z, digitos , _
        // \W = Todos os nao inclusos em \w
        String regex = "\\w";
        //String texto = "abaaba";
        String texto2 = "uia32sd ha42sidu24 _2hsiab";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  "+ texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("posicoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+ matcher.group() +"\n ");
        }
    }
 }
