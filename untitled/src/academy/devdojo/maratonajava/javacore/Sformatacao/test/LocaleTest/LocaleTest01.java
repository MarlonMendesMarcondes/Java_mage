package academy.devdojo.maratonajava.javacore.Sformatacao.test.LocaleTest;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //pt - BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndian = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Calendar calender =  Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndian);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        System.out.println("Italy "+df1.format(calender.getTime()));
        System.out.println("Suiça " +df2.format(calender.getTime()));
        System.out.println("India " +df3.format(calender.getTime()));
        System.out.println("Japao " +df4.format(calender.getTime()));
        System.out.println("Holanda " +df5.format(calender.getTime()));
    }
}
