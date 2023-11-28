package Ejemplos;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface JsonAtributo {
    String nombre() default "";
    boolean capitalizar() default false;
}
