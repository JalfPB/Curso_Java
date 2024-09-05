package Ejercicios4;

public class Ej23 {
    //Convierte un número decimal a binario utilizando divisiones sucesivas.

    public static void main(String[] args) {
        int num = 10;
        String stringBinario = "";
    
        while(num != 0) {
            stringBinario = (num % 2) + stringBinario; // Concatenar el bit al principio de la cadena
            num = num / 2;
        }
    
        System.out.println("El binario es: " + stringBinario);
    }
    

}
