package CasoPractico4;

import java.time.LocalDate;

// Clase Reserva (inmutable) que extiende Transaccion
class Reserva extends Transaccion {
    private final String nombreCliente;
    private final LocalDate fechaEntrada;
    private final LocalDate fechaSalida;
    private final int habitacion;
    private final double tarifaTotal;

    public Reserva(String nombreCliente, LocalDate fechaEntrada, LocalDate fechaSalida, int habitacion, double tarifaTotal) {
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
        this.tarifaTotal = tarifaTotal;
    }

    // Getters
    public String getNombreCliente() { return nombreCliente; }
    public LocalDate getFechaEntrada() { return fechaEntrada; }
    public LocalDate getFechaSalida() { return fechaSalida; }
    public int getHabitacion() { return habitacion; }
    public double getTarifaTotal() { return tarifaTotal; }

    @Override
    public void procesar() {
        System.out.println("Procesando reserva: " + this);
    }

    @Override
    public String toString() {
        return "Reserva: Cliente=" + nombreCliente + ", Entrada=" + fechaEntrada + ", Salida=" + fechaSalida +
               ", Habitación=" + habitacion + ", Tarifa=" + tarifaTotal;
    }
}