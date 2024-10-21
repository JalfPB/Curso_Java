package Ejercicios4.EjerciciosRepaso;

public class Ej1 {

    static void mostrarEntero(int[] lista, int num){
        int contador = 0;

        for(int i = 0; i < lista.length; i++){
            if(lista[i]==num){
                contador++;
            }
        }
        System.out.println("El numero " + num + " aparece " + contador + " veces.");
    }

    public static void main(String[] args) {
        int[] lista = {1,1,1,4,5,6,7,8,9};

        mostrarEntero(lista, 1);
    }

}
