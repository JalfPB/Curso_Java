package Ejercicios4;

public class Ej48 {
    //Busca y cuenta cuantos números se repiten en un array.

    public static void main(String[] args) {
        int[] lista = {1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 8};
        int[] duplicados = new int[lista.length];
        int contador = 0;
        int indiceDuplicados = 0;
    
        for (int i = 0; i < lista.length; i++) {
            boolean esDuplicado = false;
    
            // Verificar si el elemento ya está en el array duplicados
            for (int j = 0; j < indiceDuplicados; j++) {
                if (duplicados[j] == lista[i]) {
                    esDuplicado = true;
                    break;
                }
            }
    
            // Si no es duplicado, añadir a duplicados
            if (!esDuplicado) {
                duplicados[indiceDuplicados] = lista[i];
                indiceDuplicados++;
            } else {
                System.out.println(lista[i] + " está duplicado");
                contador++;
            }
        }
    
        System.out.println("Hay " + contador + " números duplicados");
    }
    
}
