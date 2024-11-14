package SupuestoPractico.Ej5;

import java.io.*;
import java.util.List;

public class Juego implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Mision> misiones;
    private List<Personaje> personajes;
    private Mapa mapa;

    public Juego(List<Mision> misiones, List<Personaje> personajes, Mapa mapa) {
        this.misiones = misiones;
        this.personajes = personajes;
        this.mapa = mapa;
    }

    // Método para guardar el juego en un archivo binario
    public void guardarJuego(String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(this); // Guarda el estado completo del juego
            System.out.println("Partida guardada correctamente en " + archivo);
        } catch (IOException e) {
            System.err.println("Error al guardar la partida: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método estático para cargar el juego desde un archivo binario
    public static Juego cargarJuego(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            Juego juego = (Juego) ois.readObject();
            System.out.println("Partida cargada correctamente desde " + archivo);
            return juego;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar la partida: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    // Métodos adicionales para manipular el juego, como agregar misiones, personajes, etc.

    
}

