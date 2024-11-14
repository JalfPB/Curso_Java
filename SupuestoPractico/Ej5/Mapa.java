package SupuestoPractico.Ej5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.LinkedList;

class Ruta {
    private Territorio destino;
    private int distancia;

    public Ruta(Territorio destino, int distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }

    public Territorio getDestino() {
        return destino;
    }

    public int getDistancia() {
        return distancia;
    }
}

class Territorio {
    private String nombre;
    private List<Ruta> rutas;

    public Territorio(String nombre) {
        this.nombre = nombre;
        this.rutas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Ruta> getRutas() {
        return rutas;
    }

    public void agregarRuta(Ruta ruta) {
        rutas.add(ruta);
    }
}

public class Mapa implements Serializable {
    private Map<String, Territorio> territorios;

    public Mapa() {
        this.territorios = new HashMap<>();
    }

    // Agrega un nuevo territorio al mapa
    public void agregarTerritorio(String nombre) {
        if (!territorios.containsKey(nombre)) {
            territorios.put(nombre, new Territorio(nombre));
        }
    }

    // Agrega una ruta entre dos territorios (asume que ambos ya existen en el mapa)
    public void agregarRuta(String origen, String destino, int distancia) {
        Territorio territorioOrigen = territorios.get(origen);
        Territorio territorioDestino = territorios.get(destino);

        if (territorioOrigen != null && territorioDestino != null) {
            Ruta ruta = new Ruta(territorioDestino, distancia);
            territorioOrigen.agregarRuta(ruta);
        }
    }

    // Obtener territorio por nombre
    public Territorio getTerritorio(String nombre) {
        return territorios.get(nombre);
    }

    // Método para mover el personaje de un territorio a otro
    public boolean moverPersonaje(Personaje personaje, String destino) {
        Territorio territorioActual = personaje.getTerritorioActual();
        Territorio territorioDestino = getTerritorio(destino);

        if (territorioActual == null || territorioDestino == null) {
            System.out.println("Territorio no válido.");
            return false;
        }

        // Comprobar si hay una ruta válida desde el territorio actual al destino
        for (Ruta ruta : territorioActual.getRutas()) {
            if (ruta.getDestino().getNombre().equals(destino)) {
                // Si existe una ruta válida, movemos al personaje
                personaje.setTerritorioActual(territorioDestino);
                System.out.println(personaje.getNombre() + " se ha movido a " + destino);
                return true;
            }
        }

        // Si no existe una ruta válida
        System.out.println("No hay ruta directa a " + destino + " desde " + territorioActual.getNombre());
        return false;
    }

    // Método para buscar un camino mínimo entre dos territorios (por ejemplo, con Dijkstra)
    public List<String> buscarCaminoMinimo(String origen, String destino) {
        // Verificamos que ambos territorios existen en el mapa
        if (!territorios.containsKey(origen) || !territorios.containsKey(destino)) {
            return null; // Retornamos null si algún territorio no existe
        }

        // Inicializamos las estructuras para Dijkstra
        Map<Territorio, Integer> distancias = new HashMap<>();
        Map<Territorio, Territorio> predecesores = new HashMap<>();
        PriorityQueue<Territorio> cola = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

        for (Territorio territorio : territorios.values()) {
            distancias.put(territorio, Integer.MAX_VALUE); // Inicializamos las distancias como "infinito"
        }
        distancias.put(territorios.get(origen), 0); // Distancia al origen es 0
        cola.add(territorios.get(origen));

        // Implementación de Dijkstra
        while (!cola.isEmpty()) {
            Territorio actual = cola.poll();

            // Si hemos llegado al destino, podemos dejar de buscar
            if (actual.getNombre().equals(destino)) break;

            for (Ruta ruta : actual.getRutas()) {
                Territorio vecino = ruta.getDestino();
                int nuevaDistancia = distancias.get(actual) + ruta.getDistancia();

                if (nuevaDistancia < distancias.get(vecino)) {
                    distancias.put(vecino, nuevaDistancia);
                    predecesores.put(vecino, actual);

                    // Si el vecino ya está en la cola, se remueve y se agrega nuevamente con la nueva distancia
                    cola.remove(vecino);
                    cola.add(vecino);
                }
            }
        }

        // Reconstruimos el camino desde el destino al origen usando los predecesores
        List<String> camino = new LinkedList<>();
        Territorio paso = territorios.get(destino);

        if (distancias.get(paso) == Integer.MAX_VALUE) {
            return null; // No hay camino entre origen y destino
        }

        while (paso != null) {
            camino.add(0, paso.getNombre()); // Insertamos cada territorio al inicio
            paso = predecesores.get(paso);
        }

        return camino;
    }
}
