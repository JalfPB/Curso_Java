package JuegoCombate;

import java.util.*;

class Mapa {
    Map<String, List<String>> conexiones;

    public Mapa() {
        this.conexiones = new HashMap<>();
    }

    public void agregarTerritorio(String nombre) {
        conexiones.putIfAbsent(nombre, new ArrayList<>());
    }

    public void agregarConexión(String territorio1, String territorio2) {
        conexiones.get(territorio1).add(territorio2);
        conexiones.get(territorio2).add(territorio1);
    }

    public List<String> obtenerConexiones(String territorio) {
        return conexiones.getOrDefault(territorio, new ArrayList<>());
    }
}