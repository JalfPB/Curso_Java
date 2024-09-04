package Ejercicios4;

public class Ej70 {
    //Llena un array y suma los valores que están en posiciones impares.

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma=0;

        for(int i = 0; i<lista.length; i++){
            if(i%2!=0){                         // Compruebo las posiciones impares
                suma += lista[i];
            }
        }

        System.out.println("La suma de las posiciones impares de la lista son: " + suma);
    }
}
