package Ejercicios4;

public class Ej41 {
    //Crea un nuevo array con los elementos del array original duplicados (cada elemento se repite).

    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        int[][] duplicados = {lista,lista};

        for(int i = 0; i <duplicados.length; i++){
            for(int j = 0; j<duplicados[i].length;j++){
                System.out.println(duplicados[i][j]);
            }
        }

    }

}
