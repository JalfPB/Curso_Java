package Ejercicios2;

public class Ej4 {

    public static void main(String[] args) {
        /*
         * Los 	padres de una niña le prometieron darle 10 dólares cuando
         * cumpliera 12 años de edad y duplicar el regalo en cada cumpleaños
         * subsiguiente hasta que el regalo excediera 1000 dólares. Escriba un
         * algoritmo para determinar qué edad tendrá la niña cuando se le dé
         * la última cantidad y la cantidad total recibida.
         */

         int edad = 12, regalo = 10, total = 10;

         do{
            total+=total+regalo;
            regalo=regalo*2;
            edad++;

         }while(regalo<1000);

         System.out.println("La niña tendra " + edad + " años cuando el regalo supere 1000 dolares, el regalo sera de " + regalo +" y el total sera " + total);

    }

}
