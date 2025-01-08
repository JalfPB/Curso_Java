package JuegoCombate;

class Nodo {
    Personaje personaje;
    Nodo siguiente;

    public Nodo(Personaje personaje) {
        this.personaje = personaje;
        this.siguiente = null;
    }
}