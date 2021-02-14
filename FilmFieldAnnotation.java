package cinema.film;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(value = ElementType.FIELD)
@Retention(value = RUNTIME)
public @interface FilmFieldAnnotation {

    String value() default "This field is default";

}
