package SupuestoPractico.Ej5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    

    public static void main(String[] args) {

        GestorMisiones gm = new GestorMisiones();

        List<Mision> misionesPrueba = gm.cargarMisionesDesdeArchivo("SupuestoPractico\\Ej5\\misiones.txt");

        // Mostrar las misiones cargadas
        System.out.println("___MISIONES___");
        for (Mision mision : misionesPrueba) {
            System.out.println("Misión: " + mision.getDescripcion() + ", Dificultad: " + mision.getNivelDificultad() +
                               ", Recompensa: " + mision.getRecompensa() + ", Estado: " + mision.getEstado());
        }

        // Supongamos que tenemos listas de misiones y personajes, y un objeto Mapa
        List<Mision> misiones = new ArrayList<>();
        List<Personaje> personajes = new ArrayList<>();
        Mapa mapa = new Mapa();

        // Crear una instancia de Juego
        Juego juego = new Juego(misiones, personajes, mapa);

        // Guardar el juego en un archivo binario
        juego.guardarJuego("SupuestoPractico\\Ej5\\partidaGuardada.bin");

        // Cargar el juego desde el archivo binario
        Juego juegoCargado = Juego.cargarJuego("SupuestoPractico\\Ej5\\partidaGuardada.bin");

        if (juegoCargado != null) {
            // Acciones después de cargar el juego, como continuar el juego o mostrar estado
            System.out.println("Estado del juego cargado: " + juegoCargado);

        }     
    }

}
