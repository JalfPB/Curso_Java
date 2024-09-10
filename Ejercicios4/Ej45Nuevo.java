package Ejercicios4;

public class Ej45Nuevo {

    static int[] rotarIzquierda(int[] array) {
        if (array.length > 0) {
            int primero = array[0]; // Guardar el primer elemento
            int segundo = array[1];
            int tercero = array[2];
            int contador= 0,c = 0;

            // Desplazar todos los elementos una posición a la izquierda
            do{
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            contador++;
        }while(contador < array.length-1);

            // Colocar el primer elemento al final del array
            //array[array.length - 3] = primero;
            //array[array.length - 2] = segundo;
            //array[array.length - 1] = tercero;

            for(int i = array.length-1;i>0;i--){
                array[i] = array[c];
                c++;
                System.out.println(array[c]);
            }
        }
        return array;
    }

    static int[] desencolar(int[] lista){
        lista[lista.length-1] = 0;
        return rotarIzquierda(lista);
    }

    static int[] encolar(int[] lista, int num){
        desencolar(lista);
        lista[0] = num;
        return lista;
    }

    // Método para imprimir el array
    static void imprimirArray(int[] array) {
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
        int[] cola = {1,2,3,4};

        imprimirArray(encolar(cola,7));


    }

}
