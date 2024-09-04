package Ejercicios4;

public class Ej79 {
    // Implementa un método que reciba un número n y devuelva un array con las
    // potencias de 2 desde 20 hasta 2n.

    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static int[] potencia2(int n){
        int[] lista = new int[n];

        for(int i = 1; i < n; i++){
            lista[i] = (int)Math.pow(2,i);
        }

        return lista;
    }

    public static void main(String[] args) {

        imprimirArray(potencia2(5));
        
    }

}
