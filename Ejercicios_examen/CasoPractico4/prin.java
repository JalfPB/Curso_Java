package CasoPractico4;

public class prin {
    public static void main(String[] args) {
        SistemaDeReservas sistema = new SistemaDeReservas();

        try {
            // Agregar reservas
            sistema.agregarReserva("Carlos Pérez", "2024-12-01", "2024-12-05", 1, 200.0);
            sistema.agregarReserva("Ana López", "2024-12-02", "2024-12-06", 2, 180.0);

            // Intentar modificar una reserva
            sistema.modificarReserva(1, "2024-12-10", "2024-12-15");

            // Cancelar una reserva
            sistema.cancelarReserva(2);

            // Consultar disponibilidad
            System.out.println("Disponibilidad de la habitación 1 para 2024-12-03: " +
                    sistema.consultarDisponibilidad(1, "2024-12-03"));

            // Imprimir todas las reservas
            sistema.imprimirReservas();

            // Aplicar descuento
            double descuento = sistema.aplicarDescuento("Carlos Pérez");
            System.out.println("Descuento aplicado: " + descuento * 100 + "%");

        } catch (HabitacionOcupadaException | ReservaNoEncontradaException | FechasOcupadasException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}