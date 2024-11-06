package Examen.Ej4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Metodo que ejecuta busquedaBinaria y muestra el resultado
    static void mostrarBusquedaBinaria(ArrayList<Integer> numeros, int numeroBuscado) {
        if (busquedaBinaria(numeros, numeroBuscado, 0, numeros.size() - 1))
            System.out.println("El número " + numeroBuscado + " está en el Array.");
        else
            System.out.println("El número " + numeroBuscado + " NO está en el Array.");
    }
 
    // Metodo para realizar la busqueda binaria
    static boolean busquedaBinaria(ArrayList<Integer> nums, int numBuscado, int limiteInf, int limiteSup) {
        if (limiteInf > limiteSup)
            return false;
        int mitad = (limiteInf + limiteSup) / 2;
        if (nums.get(mitad) < numBuscado)
            return busquedaBinaria(nums, numBuscado, mitad + 1, limiteSup); 
        else if (nums.get(mitad) > numBuscado)
            return busquedaBinaria(nums, numBuscado, limiteInf, mitad - 1); 
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Introduce 5 numeros");

        for(int i = 0; i < 5; i++){
            int n = scanner.nextInt();
            lista.add(n);
        }

        System.out.println("Esta el 4 en el ArrayList?");
        mostrarBusquedaBinaria(lista, 4);

        System.out.println("\nEsta el numero 10 en el ArrayList?");
        mostrarBusquedaBinaria(lista, 10);

        scanner.close();
    }

}
