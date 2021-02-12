package reflection_annotation;

import cinema.film.Film;
import cinema.film.FilmFieldAnnotation;

public class TestAnnotation {
    public static void main(String[] args) throws NoSuchFieldException {
        FilmFieldAnnotation annotation = Film.class.getDeclaredField("name").getAnnotation(FilmFieldAnnotation.class);

        System.out.println(annotation.value());
    }
}
