package Ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EjemploDuration {
    public static void main(String[] args) {
        LocalDateTime actual = LocalDateTime.now();
        LocalDateTime actualMas1 = LocalDateTime.now().plus(1, ChronoUnit.HOURS).plus(3,ChronoUnit.DAYS);
        Duration lapsus = Duration.between(actual,actualMas1);
        System.out.println(lapsus);
        System.out.println(lapsus.getSeconds());
        System.out.println(lapsus.toDays());

    }
}
