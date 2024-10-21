package EjerciciosRepasoGeneral;

public class Ej8 {
    /*
     * 8- Escribe un método que reciba un array de enteros y devuelva la suma de todos
     *  los números pares en el array. Usa un bucle para recorrer el array y
     *  condicionales para identificar los números pares.
     */

     static int sumaPares(int[] array){
        int suma = 0;
        for(int i = 0; i < array.length; i++){
            if( array[i]%2==0){
                suma += array[i];
            }
        }

        return suma;

     }

     public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(sumaPares(array));
     }

}
