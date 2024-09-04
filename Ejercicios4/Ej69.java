package Ejercicios4;

public class Ej69 {
    //Encuentra el valor mínimo y máximo de un array.
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = lista[1], min = lista[1];     // Se asigna el maximo y el minimo antes de entrar
        for(int i = 0; i<lista.length; i++){    // al bucle, porque ya se conoce el primer valor
            if(lista[i]>max){
                max = lista[i];
            }
            if(lista[i]<min){
                min = lista[i];
            }
        }

        System.out.println("El valor menor del array es " + min + " y el mayor es " + max);
    }

}
