package SupuestoPractico.Ej4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Cancelacion extends Transaccion {
    private final LocalDateTime fecha = LocalDateTime.now();

    @Override
    public void procesar(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Cancelación tramitada el: " + fecha.format(formatter));
    }

}
