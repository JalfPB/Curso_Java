public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
        mostrarBusquedaBinaria(nums, 4); // El número 4 está en el Array.
        mostrarBusquedaBinaria(nums, 9); // El número 9 NO está en el Array.
    }
 
    static void mostrarBusquedaBinaria(int[] numeros, int numeroBuscado) {
        if (busquedaBinaria(numeros, numeroBuscado, 0, numeros.length - 1))
            System.out.println("El número " + numeroBuscado + " está en el Array.");
        else
            System.out.println("El número " + numeroBuscado + " NO está en el Array.");
    }
 
    static boolean busquedaBinaria(int[] nums, int numBuscado, int limiteInf, int limiteSup) {
        if (limiteInf > limiteSup)
            return false; // no quedan elementos por analizar, NO ENCONTRADO
        int mitad = (limiteInf + limiteSup) / 2;
        if (nums[mitad] < numBuscado)
            return busquedaBinaria(nums, numBuscado, mitad + 1, limiteSup); // buscamos por la mitad der
        else if (nums[mitad] > numBuscado)
            return busquedaBinaria(nums, numBuscado, limiteInf, mitad - 1); // buscamos por la mitad izq
        else
            return true; // el elemento de la mitad coincide con numBuscado, ENCONTRADO
    }

}
