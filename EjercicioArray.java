public class EjercicioArray {
    // Crea un metodo que reciba un array de strings y muestre la string mas larga

    static void cadenas(String[] cadenas){
        String max="";

        for(int i = 0; i < cadenas.length; i++){
            if(cadenas[i].length()>max.length()){
                max = cadenas[i];
            }
        }
        System.out.println(max);
    }

    // crea un metodo que reciba dos arays como parametros, y devuelva un array con
    // los vaores maximos en cada una de las posiciones. se debe tener en cuenta que
    // los arrays pueden ser de tamaños distintos

    static int[] valorMax(int[] lista1,int[] lista2){
        int tamano1 = lista1.length, tamano2 = lista2.length, limite;
        if(tamano1>tamano2){
            limite = tamano2;
        }else{
            limite = tamano1;
        }

        int[] maximos = new int[limite]; 

        for(int i = 0; i < limite; i++){
            if(lista1[i]>lista2[i]){
                maximos[i] = lista1[i];
            }else{
                maximos[i] = lista2[i];
            }
        }

        return maximos;

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
        String[] cadenas = {"Hola", "Hola, buenos dias"};

        cadenas(cadenas);

        int[] lista1 = {1,23,2,34,65,45,78};
        int[] lista2 = {13,21,2,25,43,68};

        imprimirArray(valorMax(lista1, lista2));
    }

}
