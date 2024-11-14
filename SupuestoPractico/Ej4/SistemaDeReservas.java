package SupuestoPractico.Ej4;

import java.util.ArrayList;

public class SistemaDeReservas {

    ArrayList<Reserva> hotel = new ArrayList<>();
    ArrayList<Reserva> copiaHotel = new ArrayList<>();
    //ArrayList<Boolean> disponibles = new ArrayList<>();
    boolean[] disponibles = new boolean[10];
    private int contadorHabitaciones = 1; // Comienza en 1 para la primera habitacion
    private static final int LIMITE_HABITACIONES = 10; // Limite de habitaciones

    public void agregarReserva(Reserva reserva) {
        // Verifica si se ha alcanzado el límite de habitaciones disponibles
        if (contadorHabitaciones > LIMITE_HABITACIONES) {
            System.out.println("No quedan habitaciones disponibles.");
            return;
        }
        
        // Verifica la disponibilidad de la habitación solicitada
        if (!consultarDisponibilidad(reserva)) {
            System.out.println("La habitación número " + reserva.getHabitacion() + " ya está ocupada.");
            return;
        }
        
        // Agrega la reserva al sistema
        hotel.add(reserva);
        disponibles[reserva.getHabitacion()] = true; // Marca la habitacion como ocupada en el arreglo de disponibilidad
        System.out.println("Reserva realizada para la habitación número: " + reserva.getHabitacion());
    }

    public void copiarHotel(){
        try {
            copiaHotel = (ArrayList<Reserva>) hotel.clone();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al copiar la lista de reservas");
            e.printStackTrace();
        }
        
    }

    public void finalizarReserva(Reserva reserva) {
        hotel.remove(reserva);
        contadorHabitaciones--;
    }

    public void cancelarReserva(Reserva reserva) {
        try {
            hotel.remove(reserva);
            System.out.println("Reserva cancelada para la habitación número: " + reserva.getHabitacion());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al procesar la cancelacion");
            e.printStackTrace();
        }
    }

    public void mostrarReservas() {
        for (Reserva r : hotel) {
            r.procesar();;
        }
    }

    public boolean consultarDisponibilidad(Reserva reserva) {
        // Devuelve true si la habitación está disponible, false si está ocupada
        if (reserva.getHabitacion() < 1 || reserva.getHabitacion() > LIMITE_HABITACIONES) {
            System.out.println("Número de habitación inválido.");
            return false;
        }
        if (disponibles[reserva.getHabitacion()]) {
            System.out.println("La habitación número " + reserva.getHabitacion() + " no está disponible.");
            return false;
        } else {
            System.out.println("La habitación número " + reserva.getHabitacion() + " está disponible.");
            return true;
        }
    }

}
