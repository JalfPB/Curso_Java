package Ejercicios;

public class Ej3 {
    //Escribe un programa que calcule el área de un círculo dado su radio.
    public static void main(String[] args) {
        double area, radio = 3;

        //area = 2 * Math.PI * radio;
        //System.out.println("El area es de: "+ area);

        area = Math.PI * (radio * radio);
        System.out.println("El area es de: "+ area);
    }

}
