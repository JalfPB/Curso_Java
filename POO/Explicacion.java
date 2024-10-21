package POO;

public class Explicacion {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe");
        Persona p2 = new Persona("Marta");

        p2.cambioNombre("Carlos");
        p2.cambioEdad(-5);
        p1.mostrarDatos();
        p2.mostrarDatos();
    }

}
