package Polimorfismo.Interfaces.Ejercicios.Ej3;

public interface Desplazable {

    void moverAdelante();
    void moverAtras();
    default void detener(){
        System.out.println("Se ha detenido");
    }

}
