package Polimorfismo.Interfaces.Ejercicios.Ej16;

public class Main {

    public static void main(String[] args) {
        for(CartaBaraja carta : CartaBaraja.values()){
            carta.mostrarPalo();
        }
    }

}
