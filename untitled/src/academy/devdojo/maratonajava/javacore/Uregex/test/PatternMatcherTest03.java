package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = todos os que n for digitos
        // \s = todos os espaços em branco \t \n \f \r
        // \S = todos os caracters excluindo os brancos
        // \w = a-z A-Z, digitos , _
        // \W = Todos os nao inclusos em \w
        // []
        // ? zero ou uma ocorrencia
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()  | o(v|c) o ovo | oco
        // $
        String regex = "[a-zA-C]";
        String texto = "cafeBABE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+ texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("posicoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+ matcher.group() +"\n ");
        }
    }
 }
