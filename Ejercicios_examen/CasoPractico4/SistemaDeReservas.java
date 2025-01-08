package CasoPractico4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class SistemaDeReservas {
    private final List<Reserva> reservas = new ArrayList<>();
    private final boolean[] habitaciones = new boolean[10]; // 10 habitaciones en el hotel

    // Agregar nueva reserva
    public void agregarReserva(String nombreCliente, String fechaEntrada, String fechaSalida, int habitacion, double tarifaTotal) throws HabitacionOcupadaException {
        LocalDate entrada = LocalDate.parse(fechaEntrada, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate salida = LocalDate.parse(fechaSalida, DateTimeFormatter.ISO_LOCAL_DATE);

        if (habitaciones[habitacion - 1]) {
            throw new HabitacionOcupadaException("La habitación " + habitacion + " ya está ocupada.");
        }

        Reserva nuevaReserva = new Reserva(nombreCliente, entrada, salida, habitacion, tarifaTotal);
        reservas.add(nuevaReserva);
        habitaciones[habitacion - 1] = true;
    }

    // Modificar las fechas de una reserva existente
    public void modificarReserva(int habitacion, String nuevaFechaEntrada, String nuevaFechaSalida) throws FechasOcupadasException, ReservaNoEncontradaException {
        LocalDate nuevaEntrada = LocalDate.parse(nuevaFechaEntrada, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate nuevaSalida = LocalDate.parse(nuevaFechaSalida, DateTimeFormatter.ISO_LOCAL_DATE);

        for (Reserva r : reservas) {
            if (r.getHabitacion() == habitacion) {
                // Verificar disponibilidad en las nuevas fechas
                for (Reserva reservaExistente : reservas) {
                    if (reservaExistente.getHabitacion() == habitacion &&
                            (nuevaEntrada.isBefore(reservaExistente.getFechaSalida()) && nuevaSalida.isAfter(reservaExistente.getFechaEntrada()))) {
                        throw new FechasOcupadasException("La habitación está ocupada en las nuevas fechas.");
                    }
                }

                // Modificar las fechas eliminando la reserva antigua y creando una nueva
                reservas.remove(r);
                reservas.add(new Reserva(r.getNombreCliente(), nuevaEntrada, nuevaSalida, habitacion, r.getTarifaTotal()));
                return;
            }
        }
        throw new ReservaNoEncontradaException("No se encontró una reserva para la habitación " + habitacion);
    }

    // Cancelar una reserva específica
    public void cancelarReserva(int habitacion) throws ReservaNoEncontradaException {
        for (Reserva r : reservas) {
            if (r.getHabitacion() == habitacion) {
                reservas.remove(r);
                habitaciones[habitacion - 1] = false;
                System.out.println("Reserva de la habitación " + habitacion + " cancelada.");
                return;
            }
        }
        throw new ReservaNoEncontradaException("No se encontró una reserva para la habitación " + habitacion);
    }

    // Consultar la disponibilidad de una habitación en una fecha específica
    public boolean consultarDisponibilidad(int habitacion, String fecha) {
        LocalDate fechaConsulta = LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);
        for (Reserva reserva : reservas) {
            if (reserva.getHabitacion() == habitacion &&
                    (fechaConsulta.isEqual(reserva.getFechaEntrada()) || fechaConsulta.isEqual(reserva.getFechaSalida()) ||
                     (fechaConsulta.isAfter(reserva.getFechaEntrada()) && fechaConsulta.isBefore(reserva.getFechaSalida())))) {
                return false;
            }
        }
        return !habitaciones[habitacion - 1];
    }

    // Clonar la lista de reservas
    public List<Reserva> clonarReservas() {
        return new ArrayList<>(reservas);
    }

    // Imprimir todas las reservas
    public void imprimirReservas() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    // Aplicar descuento para clientes con más de 3 reservas
    public double aplicarDescuento(String nombreCliente) {
        long count = reservas.stream().filter(r -> r.getNombreCliente().equals(nombreCliente)).count();
        if (count > 3) {
            return 0.90;
        }
        return 1.0;
    }
}