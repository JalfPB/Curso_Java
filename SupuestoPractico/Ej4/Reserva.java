package SupuestoPractico.Ej4;

import java.time.LocalDateTime;

public class Reserva extends Transaccion{

    private String nombreCliente;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;
    private int habitacion;

    public Reserva(String nombreCliente, LocalDateTime fechaEntrada, LocalDateTime fechaSalida, int habitacion) {
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public int getHabitacion() {
        return habitacion;
    }

    @Override
    public void procesar(){
        System.out.println("Cliente: " + nombreCliente + " fecha entrada: " + fechaEntrada + "\nfecha salida: "
        + fechaSalida + " con habitacion: " + habitacion);
    }

    @Override
    public String toString() {
        return "Reserva [nombreCliente=" + nombreCliente + ", fechaEntrada=" + fechaEntrada + ", fechaSalida="
                + fechaSalida + ", habitacion=" + habitacion + "]";
    }

    

}
