package SupuestoPractico.Ej4;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        // Crear el sistema de reservas
        SistemaDeReservas sistemaDeReservas = new SistemaDeReservas();

        // Crear reservas
        Reserva reserva1 = new Reserva("Juan Perez", LocalDateTime.of(2023, 11, 20, 14, 0),
                LocalDateTime.of(2023, 11, 22, 11, 0), 1);
        Reserva reserva2 = new Reserva("Maria Garcia", LocalDateTime.of(2023, 11, 21, 15, 0),
                LocalDateTime.of(2023, 11, 23, 10, 0), 2);

        // Agregar reservas al sistema
        System.out.println("Agregando reservas:");
        sistemaDeReservas.agregarReserva(reserva1);
        sistemaDeReservas.agregarReserva(reserva2);

        // Consultar disponibilidad
        System.out.println("\nConsultando disponibilidad:");
        sistemaDeReservas.consultarDisponibilidad(reserva1); // Debe ser false ya que se acaba de reservar
        sistemaDeReservas.consultarDisponibilidad(reserva2); // Debe ser false también

        // Mostrar todas las reservas actuales
        System.out.println("\nMostrando reservas actuales:");
        sistemaDeReservas.mostrarReservas();

        // Cancelar una reserva
        System.out.println("\nCancelando reserva:");
        sistemaDeReservas.cancelarReserva(reserva1);

        // Mostrar todas las reservas después de la cancelación
        System.out.println("\nMostrando reservas después de la cancelación:");
        sistemaDeReservas.mostrarReservas();

        // Copiar lista de reservas
        System.out.println("\nCopiando lista de reservas actuales:");
        sistemaDeReservas.copiarHotel();
        System.out.println("Lista de reservas copiada exitosamente.");

        // Finalizar una reserva
        System.out.println("\nFinalizando reserva:");
        sistemaDeReservas.finalizarReserva(reserva2);

        // Mostrar todas las reservas después de finalizar una
        System.out.println("\nMostrando reservas después de finalizar:");
        sistemaDeReservas.mostrarReservas();
    }

}
