package SupuestoPractico.Ej5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoMenu {

    private ArrayList<Personaje> personajes = new ArrayList<>();
    private ArrayList<Mision> misiones = new ArrayList<>();
    private Mapa mapa = new Mapa();

    public JuegoMenu(Mapa mapa) {
        this.mapa = mapa;
        this.personajes = new ArrayList<>(); // Inicializa la lista de personajes
    }

    public static void main(String[] args) {
        // Inicializamos el mapa con territorios y rutas
        Mapa mapa = new Mapa();

        // Agregar territorios al mapa
        mapa.agregarTerritorio("Ciudad Central");
        mapa.agregarTerritorio("Bosque Encantado");
        mapa.agregarTerritorio("Montaña Misteriosa");
        mapa.agregarTerritorio("Desierto Perdido");
        mapa.agregarTerritorio("Lago de la Luna");

        // Crear rutas entre territorios (nombres deben coincidir con los agregados)
        mapa.agregarRuta("Ciudad Central", "Bosque Encantado", 10);
        mapa.agregarRuta("Bosque Encantado", "Montaña Misteriosa", 15);
        mapa.agregarRuta("Montaña Misteriosa", "Desierto Perdido", 20);
        mapa.agregarRuta("Ciudad Central", "Lago de la Luna", 25);
        mapa.agregarRuta("Lago de la Luna", "Desierto Perdido", 30);

        // Inicializar el menú del juego con el mapa creado
        JuegoMenu juegoMenu = new JuegoMenu(mapa);

        // Ejecutar el menú principal del juego
        juegoMenu.ejecutarMenu();
    }

    public void ejecutarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú del Juego ---");
            System.out.println("1. Crear personaje y elegir habilidades");
            System.out.println("2. Asignar y completar misiones");
            System.out.println("3. Gestionar inventario de un personaje");
            System.out.println("4. Moverse por el mapa y descubrir territorios");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> crearPersonaje();
                case 2 -> gestionarMisiones();
                case 3 -> gestionarInventario();
                case 4 -> explorarMapa();
                case 5 -> salir = true;
                default -> System.out.println("Opción inválida, por favor intente de nuevo.");
            }
        }
        scanner.close();
    }

    // Opción 1: Crear personaje y elegir habilidades
    private void crearPersonaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la clase del personaje (Guerrero | Mago | Arquero): ");
        String clase = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese el nombre del personaje: ");
        String nombre = scanner.nextLine();

        // Declaramos un objeto Personaje aquí para asignarle una subclase
        Personaje nuevoPersonaje = null;

        // Creamos el personaje de acuerdo a la clase seleccionada
        switch (clase) {
            case "guerrero" -> nuevoPersonaje = new Guerrero(nombre, 10, 10, 10, 10, new Inventario(), 0);
            case "mago" -> nuevoPersonaje = new Mago(nombre, 10, 10, 10, 10, new Inventario(), 0);
            case "arquero" -> nuevoPersonaje = new Arquero(nombre, 10, 10, 10, 10, new Inventario(), 0);
            default -> System.out.println("Clase no válida.");
        }

        // Verificar si se creó un personaje válido antes de continuar
        if (nuevoPersonaje != null) {
            personajes.add(nuevoPersonaje); // Añadimos el personaje a la lista

            System.out.println("Seleccione habilidades para " + nombre + ":");

            // Selección de habilidades
            boolean eligiendo = true;
            int contador = 0;
            while (eligiendo && contador < 3) {
                System.out.print(
                        "Ingrese el número de la habilidad (1 - Fuerza | 2 - Vida | 3 - Defensa | 0 para terminar): ");
                System.out.println("\nPuntos disponibles: " + (3 - contador));
                int habilidadNum = scanner.nextInt();
                switch (habilidadNum) {
                    case 1:
                        nuevoPersonaje.subirHabilidad("Fuerza");
                        contador++;
                        break;
                    case 2:
                        nuevoPersonaje.subirHabilidad("Vida");
                        contador++;
                        break;
                    case 3:
                        nuevoPersonaje.subirHabilidad("Defensa");
                        contador++;
                        break;
                    case 0:
                        eligiendo = false;
                        break;
                    default:
                        System.out.println("Habilidad no válida.");
                        break;
                }
            }
            System.out.println("Personaje " + nombre + " creado.");
        }

        // Asignar un territorio inicial
        Territorio territorioInicial = mapa.getTerritorio("Ciudad Central");
        if (territorioInicial != null) {
            nuevoPersonaje.setTerritorioActual(territorioInicial);
            personajes.add(nuevoPersonaje);
            System.out.println("Personaje " + nombre + " creado y asignado a " + territorioInicial.getNombre());
        } else {
            System.out.println("Territorio inicial no encontrado en el mapa.");
        }
        
    }

    // Opción 2: Asignar y completar misiones
    private void gestionarMisiones() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Gestión de Misiones ---");
        System.out.println("1. Asignar misión a un personaje");
        System.out.println("2. Completar una misión");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> asignarMision();
            case 2 -> completarMision();
            default -> System.out.println("Opción no válida.");
        }
    }

    private void asignarMision() {
        Scanner scanner = new Scanner(System.in);

        if (misiones.isEmpty()) {
            System.out.println("No hay misiones disponibles.");
            return;
        }

        System.out.println("Seleccione una misión para asignar:");
        for (int i = 0; i < misiones.size(); i++) {
            System.out.println((i + 1) + ". " + misiones.get(i).getDescripcion());
        }
        int indiceMision = scanner.nextInt() - 1;

        System.out.println("Seleccione un personaje para asignar la misión:");
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
        }
        int indicePersonaje = scanner.nextInt() - 1;

        personajes.get(indicePersonaje).asignarMision(misiones.get(indiceMision));
        System.out.println("Misión asignada al personaje " + personajes.get(indicePersonaje).getNombre());
    }

    private void completarMision() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un personaje para completar una misión:");
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
        }
        int indicePersonaje = scanner.nextInt() - 1;

        personajes.get(indicePersonaje).completarMision();
        System.out.println("Misión completada.");
    }

    // Opción 3: Gestionar inventario
    private void gestionarInventario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un personaje para gestionar su inventario:");
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
        }
        int indicePersonaje = scanner.nextInt() - 1;

        personajes.get(indicePersonaje).mostrarInventario();
        System.out.println("Inventario gestionado para " + personajes.get(indicePersonaje).getNombre());
    }

    // Opción 4: Moverse y descubrir territorios
    private void explorarMapa() {
        Scanner scanner = new Scanner(System.in);

        // Seleccionar un personaje
        System.out.println("Seleccione un personaje para mover en el mapa:");
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
        }
        int indicePersonaje = scanner.nextInt() - 1;

        // Validación de índice seleccionado
        if (indicePersonaje < 0 || indicePersonaje >= personajes.size()) {
            System.out.println("Selección inválida. Intente de nuevo.");
            return;
        }

        Personaje personaje = personajes.get(indicePersonaje);
        Territorio territorioActual = personaje.getTerritorioActual();

        System.out.println("El personaje está actualmente en: " + territorioActual.getNombre());
        System.out.println("Territorios disponibles para moverse:");

        // Mostrar territorios accesibles desde el territorio actual
        List<Ruta> rutasDisponibles = territorioActual.getRutas();
        for (int i = 0; i < rutasDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + rutasDisponibles.get(i).getDestino().getNombre());
        }

        // Seleccionar territorio destino
        System.out.print("Seleccione el territorio al que desea moverse: ");
        int indiceDestino = scanner.nextInt() - 1;

        // Validación de selección de destino
        if (indiceDestino < 0 || indiceDestino >= rutasDisponibles.size()) {
            System.out.println("Selección de destino no válida. Intente de nuevo.");
            return;
        }

        String destino = rutasDisponibles.get(indiceDestino).getDestino().getNombre();

        // Intentar mover al personaje al territorio de destino
        boolean movimientoExitoso = mapa.moverPersonaje(personaje, destino);
        if (movimientoExitoso) {
            System.out.println(personaje.getNombre() + " se ha movido a " + destino + ".");
        } else {
            System.out.println("Movimiento no permitido. No hay ruta directa a " + destino + ".");
        }
    }
}
