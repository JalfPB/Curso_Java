package Ejercicios4;

public class Ej77 {
    // Crea un método que obtenga la suma de los números naturales desde 1 hasta N.
    // Se debe pasar como parámetro el número N, debe ser mayor que cero. Se debe
    // imprimir toda la cadena por consola.

    static void numerosNaturales(int n){
        int suma=0;
        for(int i = 0; i<n;i++){
            System.out.println(i);
            suma += i;
        }
        System.out.println("La suma de los " + n + " primeros numeros naturales es " + suma);
    }
    public static void main(String[] args) {

        numerosNaturales(10);

    }

}
