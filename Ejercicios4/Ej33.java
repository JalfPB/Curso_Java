package Ejercicios4;

public class Ej33 {
    // Escribe un programa que sume todos los elementos de un array de números
    // enteros.

    public static void main(String[] args) {
        int[] lista = {1,2,3};
        int suma=0;

        for(int i = 0; i < lista.length; i++){
            suma += lista[i];
        }

        System.out.println("La suma de los elementtos del array es: " + suma);
    }

}
