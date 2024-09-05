package Ejercicios4;

public class Ej87 {
    // Escribe un método que reciba un array de enteros y devuelva un nuevo array
    // con los factoriales de los elementos originales.

    public static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
          factorial *= i;
        }
        return factorial;
      }

    static int[] factoriales(int[] lista){
        int[] factos = new int[lista.length];
        int n, indiceFactos=0;

        for(int i = 0; i<lista.length; i++){
            n = calcularFactorial(lista[i]);
            factos[indiceFactos] = n;
            indiceFactos++;
        }

        return factos;
    }

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

    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 4, 5};

        imprimirArray(factoriales(lista));

    }

}
