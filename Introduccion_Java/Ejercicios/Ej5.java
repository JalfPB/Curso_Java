package Ejercicios;

public class Ej5 {
    //Escribe un programa que calcule el interés generado por un capital.
    public static void main(String[] args) {
        double capital, interes,interesGenerado, total;
        int ano;

        capital = 1000;
        interes = 5;
        ano = 3;
        interesGenerado = (capital*interes*ano)/100;
        total = capital + (capital*interes*ano)/100;

        System.out.println("Con un capital de " + capital + " a un interes del " + interes + "% " 
                            + " por " + ano  + " años un interes generado de " + interesGenerado + " y un total de " + total);
    }

}
