package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1685734052743l); // long 100000
        System.out.println(date.getTime()+3600000);
        System.out.println(date);
    }

}
