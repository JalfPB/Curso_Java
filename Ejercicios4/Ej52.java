package Ejercicios4;

public class Ej52 {
    //Divide los elementos de un array numérico en dos arrays: uno para los positivos y otro para los negativos.

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

        System.out.println("La liste de negativos es: ");

        for(int i = 0; i<listaNegativos.length; i++){
            System.out.println(listaNegativos[i]);;
        }

        System.out.println("La liste de positivos es: ");

        for(int i = 0; i<listaPositivos.length; i++){
            System.out.println(listaPositivos[i]);;
        }
    }

}
