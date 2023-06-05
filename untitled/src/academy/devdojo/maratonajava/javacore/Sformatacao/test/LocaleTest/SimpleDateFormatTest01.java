package academy.devdojo.maratonajava.javacore.Sformatacao.test.LocaleTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse( "Amsterdam 05 de junho de 2023"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
