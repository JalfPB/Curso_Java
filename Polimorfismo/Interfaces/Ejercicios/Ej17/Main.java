package Polimorfismo.Interfaces.Ejercicios.Ej17;

public class Main {

    public static void main(String[] args) {
        for(Semaforo semaforo : Semaforo.values()){
            semaforo.mostrarColor();
        }
    }

}
