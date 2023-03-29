package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("naruto", "TV",12);
        anime.setGenero("Ação");
        anime.init2("naruto", "TV",12,"ação");
        anime.imprime();
    }



}
