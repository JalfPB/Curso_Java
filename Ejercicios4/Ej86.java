package Ejercicios4;

public class Ej86 {
    // Crea un método que encuentre el segundo mayor elemento en un array de
    // enteros.

    static int encontrarMayor(int[] lista) {
        if (lista.length < 2) {
            System.out.println("la lista debe contener al menos dos valores");;
        }
    
        int max = lista[0];     // Inicializo las variables antes de 
        int sMax = lista[0];    // entrar al bucle
    
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > max) {
                sMax = max;
                max = lista[i];
            //Realizo las comprobaciones necesarias                                 
            } else if (lista[i] > sMax && lista[i] != max) {
                sMax = lista[i];
            }
        }
    
        return sMax;
    }
    

    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("El segundo mayor es: " + encontrarMayor(lista));
    }

}
