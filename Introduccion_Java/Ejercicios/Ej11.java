package Ejercicios;

public class Ej11 {
    //Escribe un programa que calcule la hipotenusa de un triángulo rectángulo.

    public static void main(String[] args) {
        double lado1,lado2, hipotenusa;

        lado1 = 3;
        lado2 = 5;
        hipotenusa = Math.sqrt(((lado1 * lado1) + (lado2 * lado2)));
        System.out.println("la hipotenusa de un triangulo rectangulo con los catetos " + lado1 +
                            " , "+lado2 + " es " + hipotenusa);
    }

}
