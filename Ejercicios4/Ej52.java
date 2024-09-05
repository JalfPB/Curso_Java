package Ejercicios4;

public class Ej52 {
    //Divide los elementos de un array numérico en dos arrays: uno para los positivos y otro para los negativos.

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
        int[] lista = { -1, 1, 2, 3, -4, 4, -10, 6, 7, -8, 8 };
        int[] listaPositivos = new int[lista.length];
        int[] listaNegativos = new int[lista.length];
        int indicePositivo = 0, indiceNegativo = 0;

        for(int i=0;i<lista.length;i++){
            if(lista[i]<0){
                listaNegativos[indiceNegativo] = lista[i];
                indiceNegativo++;
            }else{
                listaPositivos[indicePositivo] = lista[i];
                indicePositivo++;
            }
        }

        System.out.println("La lista de negativos es: ");

        imprimirArray(listaNegativos);

        System.out.println("La lista de positivos es: ");

        imprimirArray(listaPositivos);
    }

}
