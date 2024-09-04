package Ejercicios4;

public class Ej23 {
    //Convierte un número decimal a binario utilizando divisiones sucesivas.

    public static void main(String[] args) {
        int num = 10, total, binario, resto, invertido = 0;
        String stringBinario="";


        //Convertir a binario
        while(num != 0){
            System.out.print(num%2);
            stringBinario = stringBinario + num%2;
            num = num/2;
        }

        binario = Integer.parseInt(stringBinario);
        //Darle la vuelta al numero
        while (binario > 0) {
            resto = binario % 10;
            invertido = invertido * 10 + resto;
            binario /= 10;
        }

        System.out.println("El binario es: " + invertido);
    }

}
