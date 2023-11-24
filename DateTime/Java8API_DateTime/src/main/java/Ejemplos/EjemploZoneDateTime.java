package Ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploZoneDateTime {
    public static void main(String[] args) {
        LocalDateTime fechaLocal = LocalDateTime.now();

        ZoneId gdl = ZoneId.of("Mexico/BajaSur");
        ZonedDateTime zonaGdl = ZonedDateTime.of(fechaLocal,gdl);
        System.out.println("zonaGdl = " + zonaGdl);
        
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaGdl.withZoneSameInstant(madrid).plus(8, ChronoUnit.HOURS);
        System.out.println("zonaMadrid = " + zonaMadrid);

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("El avion de GDL sale a las = " + formatoHora.format(zonaGdl) + " el " + formatoFecha.format(zonaGdl));
        System.out.println("El avion aterriza a las = " + formatoHora.format(zonaMadrid) + " el "+ formatoFecha.format(zonaMadrid) + " en Madrid");

    }
}
