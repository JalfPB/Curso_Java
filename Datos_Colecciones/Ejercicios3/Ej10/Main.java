package Datos_Colecciones.Ejercicios3.Ej10;

public class Main {

    public static void main(String[] args) {
        Range range = new Range(1, 5);

        System.out.println("Elementos del rango:");
        for (int number : range) {
            System.out.print(number + " ");
        }
    }

}
