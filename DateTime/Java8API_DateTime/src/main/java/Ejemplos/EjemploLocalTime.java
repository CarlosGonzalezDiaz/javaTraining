package Ejemplos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println("Hora = " + localTime.getHour());
        System.out.println("Hora = " + localTime.getMinute());
        System.out.println("Hora = " + localTime.getSecond());

        LocalTime hora = LocalTime.of(6,30,59);
        System.out.println(hora);
        hora = LocalTime.parse("06:30:00");
        System.out.println("hora = " + hora);

        LocalTime horas = LocalTime.now().plus(10, ChronoUnit.MINUTES);
        System.out.println("horas = " + horas);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:SS a");
        String horaFormat = localTime.format(dateTimeFormatter);
        System.out.println("horaFormat = " + horaFormat);
        
        horaFormat = hora.format(dateTimeFormatter);
        System.out.println("horaFormat = " + horaFormat);
        
        LocalTime max = LocalTime.MAX;
        System.out.println(max);
        LocalTime min = LocalTime.MIN;
        System.out.println("min = " + min);

    }
}
