package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        // . 1.3 = 123, 133, 103, 1A3
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10g 0x1";
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
