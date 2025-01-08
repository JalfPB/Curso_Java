package JuegoRol;

import java.util.*;
import java.io.*;

class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Personaje> personajes = new ArrayList<>();
    private static Mapa mapa = new Mapa();
    private static ArrayList<Mision> misiones = new ArrayList<>();
    
    
    public static void main(String[] args) {
        cargarMisionesDesdeArchivo("C:\\Users\\David\\Desktop\\CursoJava\\herencia\\JuegoRol\\misiones.txt");
        
        try {
            while (true) {
                mostrarMenu();
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar buffer
                switch (opcion) {
                    case 1: crearPersonaje(); break;
                    case 2: asignarMision(); break;
                    case 3: gestionarInventario(); break;
                    case 4: moversePorMapa(); break;
                    case 5: guardarPartida(); break;
                    case 6: cargarPartida(); break;
                    case 0: System.exit(0); break;
                    default: System.out.println("Opción no válida.");
                }
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    private static void mostrarMenu() {
        System.out.println("Bienvenido al Reino de JavaLand");
        System.out.println("1. Crear personaje");
        System.out.println("2. Asignar misión");
        System.out.println("3. Gestionar inventario");
        System.out.println("4. Moverse por el mapa");
        System.out.println("5. Guardar partida");
        System.out.println("6. Cargar partida");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static void crearPersonaje() {
        System.out.print("Ingrese el nombre del personaje: ");
        String nombre = scanner.nextLine();
        System.out.println("Elige una clase: 1. Guerrero, 2. Mago, 3. Arquero");
        int opcion = scanner.nextInt();
        Personaje personaje = null;
        switch (opcion) {
            case 1: personaje = new Guerrero(nombre); break;
            case 2: personaje = new Mago(nombre); break;
            case 3: personaje = new Arquero(nombre); break;
            default: System.out.println("Clase no válida.");
        }
        if (personaje != null) personajes.add(personaje);
    }


    private static void guardarPartida() {
        try {
            GuardarPartida.guardarEstado(personajes, mapa);
        } catch (IOException e) {
            System.out.println("Error al guardar la partida: " + e.getMessage());
        }
    }

    private static void cargarPartida() {
        try {
            GuardarPartida.cargarEstado();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar la partida: " + e.getMessage());
        }
    }

    private static void cargarMisionesDesdeArchivo(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Separar los campos usando el delimitador "|"
                String[] partes = linea.split("\\|");
                
                if (partes.length == 3) {
                    String descripcion = partes[0];
                    int nivelDificultad = Integer.parseInt(partes[1]);
                    String recompensa = partes[2];
                    
                    // Crear la misión y agregarla a la lista
                    misiones.add(new Mision(descripcion, nivelDificultad, recompensa));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo de misiones: " + e.getMessage());
        }
    }

    private static void asignarMision() {
        System.out.println("Selecciona una misión:");
        for (int i = 0; i < misiones.size(); i++) {
            Mision mision = misiones.get(i);
            System.out.println(i + 1 + ". " + mision.descripcion + " (Nivel de dificultad: " + mision.nivelDificultad + ")");
        }

        int opcionMision = scanner.nextInt() - 1;
        if (opcionMision < 0 || opcionMision >= misiones.size()) {
            System.out.println("Selección inválida.");
            return;
        }

        Mision mision = misiones.get(opcionMision);
        System.out.println("Misión seleccionada: " + mision.descripcion);
        // Aquí puedes agregar la lógica para asignar la misión al personaje
    }


    private static void gestionarInventario() {
        System.out.println("Selecciona el personaje cuyo inventario deseas gestionar:");
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println(i + 1 + ". " + personajes.get(i).nombre);
        }

        int opcionPersonaje = scanner.nextInt() - 1;
        if (opcionPersonaje < 0 || opcionPersonaje >= personajes.size()) {
            System.out.println("Selección inválida.");
            return;
        }

        Personaje personaje = personajes.get(opcionPersonaje);
        Inventario inventario = new Inventario();  // Asumiendo que cada personaje tiene su inventario

        System.out.println("¿Qué te gustaría agregar al inventario?");
        System.out.println("1. Agregar objeto");
        System.out.println("2. Agregar poción");
        System.out.println("3. Agregar habilidad");

        int opcion = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer
        switch (opcion) {
            case 1:
                System.out.print("Ingresa el nombre del objeto: ");
                String objeto = scanner.nextLine();
                inventario.agregarObjeto(objeto);
                System.out.println(objeto + " ha sido agregado al inventario.");
                break;
            case 2:
                System.out.print("Ingresa el nombre de la poción: ");
                String pocion = scanner.nextLine();
                inventario.agregarPocion(pocion);
                System.out.println(pocion + " ha sido agregado al inventario.");
                break;
            case 3:
                System.out.print("Ingresa el nombre de la habilidad: ");
                String habilidad = scanner.nextLine();
                inventario.agregarHabilidad(habilidad);
                System.out.println(habilidad + " ha sido agregado al inventario.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    private static void moversePorMapa() {
        System.out.println("Selecciona el personaje que se moverá por el mapa:");
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println(i + 1 + ". " + personajes.get(i).nombre);
        }

        int opcionPersonaje = scanner.nextInt() - 1;
        if (opcionPersonaje < 0 || opcionPersonaje >= personajes.size()) {
            System.out.println("Selección inválida.");
            return;
        }

        Personaje personaje = personajes.get(opcionPersonaje);
        System.out.println("Selecciona un territorio para moverse:");
        mapa.mostrarRutas("Aldea"); // Suponemos que el personaje está en la Aldea

        String destino = scanner.next();
        System.out.println(personaje.nombre + " se mueve hacia " + destino);
    }

}