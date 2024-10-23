package Polimorfismo.Interfaces;

public interface Vehiculo {
    // Metodo abstracto
    void conducir();

    // Metodo por defecto con implementación (desde java 8)
    default void detener() {
        System.out.println("El vehiculo se ha detenido");
    }

    // Metodo estatico (desde java 8)
    static void servicio(){
        System.out.println("El vehiculo esta siendo reparado");
    }

}
