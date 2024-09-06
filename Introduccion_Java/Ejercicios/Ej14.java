package Ejercicios;

public class Ej14 {
    public static void main(String[] args) {
    //Escribe un programa que convierta grados Celsius a Fahrenheit.
    double celsius = 10, fahrenheit;

    //(0 °C × 9 / 5) + 32
    fahrenheit = (celsius * (9/5)) + 32;
    System.out.println(celsius + " grados celsius son " + 
                    fahrenheit + " grados fahrenheit");
    }

}
