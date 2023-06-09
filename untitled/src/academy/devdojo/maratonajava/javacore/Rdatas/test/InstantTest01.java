package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(now.ofEpochSecond(3));
        System.out.println(now.ofEpochSecond(3,1000_000_000));
        System.out.println(now.ofEpochSecond(3,-1000_000_000));
    }
}
