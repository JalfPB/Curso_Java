package JuegoCombate;
import java.util.*;

// Cola para los turnos de combate
class Cola {
    private Nodo frente;
    private Nodo finalDeCola;

    public Cola() {
        this.frente = null;
        this.finalDeCola = null;
    }

    // Método para agregar un personaje a la cola
    public void encolar(Personaje personaje) {
        Nodo nuevoNodo = new Nodo(personaje);
        if (finalDeCola == null) {
            frente = nuevoNodo;
            finalDeCola = nuevoNodo;
        } else {
            finalDeCola.siguiente = nuevoNodo;
            finalDeCola = nuevoNodo;
        }
    }

    // Método para quitar un personaje de la cola (desencolar)
    public Personaje desencolar() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        } else {
            Personaje personaje = frente.personaje;
            frente = frente.siguiente;
            if (frente == null) {
                finalDeCola = null;
            }
            return personaje;
        }
    }

    // Método para ver el primer personaje sin eliminarlo
    public Personaje frente() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }
        return frente.personaje;
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return frente == null;
    }
}