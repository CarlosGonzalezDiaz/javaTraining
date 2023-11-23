package Ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        System.out.println("Año = " + fechaActual.getYear());
        System.out.println("mes = " + fechaActual.getMonth().getDisplayName(TextStyle.FULL, new Locale("es","ES")));
        System.out.println("mes = " + fechaActual.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es","ES")));


        fechaActual= LocalDate.of(2020,1,25);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual=LocalDate.of(2020, Month.AUGUST,11);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2020-02-24");
        System.out.println("fechaActual = " + fechaActual);

        LocalDate diaDeMañana = LocalDate.now().plusDays(1);
        System.out.println("diaDeMañana = " + diaDeMañana);
        
        LocalDate mesAnterior = LocalDate.now().minusMonths(1);
        System.out.println("mesAnterior = " + mesAnterior);

        //mismo metodo especificandolo
        LocalDate mesAnteriorEspecificado = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnteriorEspecificado = " + mesAnteriorEspecificado);

        DayOfWeek diaDeLaSemana = LocalDate.parse("2023-11-22").getDayOfWeek();
        System.out.println("diaDeLaSemana = " + diaDeLaSemana);

        int once = LocalDate.of(2023,11,22).getDayOfMonth();
        System.out.println("once = " + once);
        
        boolean esViciesto = LocalDate.now().isLeapYear();
        System.out.println("esViciesto = " + esViciesto);

        boolean esAntes = LocalDate.of(2023,11,22).isBefore(LocalDate.parse("2023-01-10"));
        System.out.println("esAntes = " + esAntes);

    }
}
