package Ejemplos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2011,9,23);
        LocalDate localDate2 = LocalDate.now();

        Period period = Period.between(localDate, localDate2);
        System.out.println("period = " + period);

        System.out.printf(" Periodo entre %s y %s hay %d años %d meses y %d dias" , localDate, localDate2, period.getYears(), period.getMonths(), period.getDays());
    }
}
