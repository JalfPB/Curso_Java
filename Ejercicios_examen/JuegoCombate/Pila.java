package JuegoCombate;
import java.util.*;
// Pila para movimientos de ataque previos
class Pila {
    Stack<String> pila;

    public Pila() {
        pila = new Stack<>();
    }

    public void apilar(String ataque) {
        pila.push(ataque);
    }

    public String desapilar() {
        return pila.isEmpty() ? null : pila.pop();
    }
}

