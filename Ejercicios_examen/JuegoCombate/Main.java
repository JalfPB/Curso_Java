package JuegoCombate;

import java.io.IOException;
import java.util.Scanner;

import JuegoCombate.Arquero.Guerrero;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear personajes y territorios
        Personaje mago = new Mago("Mago");
        Personaje arquero = new Arquero("Arquero");

        Territorio bosque = new Territorio("Bosque", 30);
        Territorio castillo = new Territorio("Castillo", 50);

        // Crear mapa y asignar territorios
        Mapa mapa = new Mapa();
        mapa.agregarTerritorio("Bosque");
        mapa.agregarTerritorio("Castillo");
        mapa.agregarConexión("Bosque", "Castillo");

        // Guardar juego
        Juego juego = new Juego();
        juego.agregarTerritorio(bosque);
        juego.agregarTerritorio(castillo);

        System.out.println("¡Bienvenido a la Batalla por la Fortaleza de Java!");
        
        while (true) {
            // Menú de opciones
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Seleccionar Personaje");
            System.out.println("2. Iniciar Combate");
            System.out.println("3. Mover Personaje");
            System.out.println("4. Guardar y Salir");
            
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Seleccionar personaje (simplificado)
                    System.out.println("Elija un personaje: 1. Mago 2. Arquero");
                    int eleccion = scanner.nextInt();
                    Personaje personajeSeleccionado = null;
                    switch (eleccion) {
                        case 1: personajeSeleccionado = mago; break;
                        case 2: personajeSeleccionado = arquero; break;
                        default: System.out.println("Selección no válida.");
                    }
                    System.out.println("Has seleccionado a " + personajeSeleccionado.nombre);
                    break;
                case 2:
                    // Iniciar combate
                    System.out.println("Selecciona el territorio para combatir (1. Bosque 2. Castillo):");
                    int territorioSeleccionado = scanner.nextInt();
                    Territorio territorioCombate = (territorioSeleccionado == 1) ? bosque : castillo;
                    
                    Combate combate = new Combate();
                    combate.iniciarCombate(arquero, mago, territorioCombate);
                    break;
                case 3:
                    // Mover personaje
                    System.out.println("Mover personaje a otro territorio...");
                    break;
                case 4:
                    // Guardar juego
                    try {
                        GuardarJuego.guardar(juego);
                        System.out.println("Juego guardado.");
                    } catch (IOException e) {
                        System.out.println("Error al guardar el juego.");
                    }
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}