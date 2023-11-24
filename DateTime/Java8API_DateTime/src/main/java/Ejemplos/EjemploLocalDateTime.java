package Ejemplos;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);
        LocalDateTime fechaTiempoOf = LocalDateTime.of(2023,11,24,16,26);
        System.out.println("fechaTiempo = " + fechaTiempoOf);
        fechaTiempo=fechaTiempo.plus(1, ChronoUnit.DAYS);
        System.out.println("fechaTiempo = " + fechaTiempo);
        fechaTiempoOf=fechaTiempoOf.minus(6,ChronoUnit.HOURS);
        System.out.println("fechaTiempoOf = " + fechaTiempoOf);

        LocalDateTime diaActual = LocalDateTime.now();
        
        int dia = diaActual.getDayOfMonth();
        System.out.println("dia = " + dia);


        String diaDeLaSemana=diaActual.getDayOfWeek().getDisplayName(TextStyle.FULL,new Locale("es", "ES"));
        System.out.println("diaDeLaSemana = " + diaDeLaSemana);
        
        String formater = diaActual.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("formater = " + formater);
        
        String formato2 = diaActual.format(DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss a"));
        System.out.println("formato2 = " + formato2);
    }
}
