public class OrdenarArrays {

    static int[] burbuja(int[] vector) {
        int aux;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                // El valor maximo lo más a la derecha posible
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        return vector;
    }

    static void quicksort(int A[], int izq, int der) {
        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;
        while (i < j) {
            while (A[i] <= pivote && i < j)
                i++;
            while (A[j] > pivote)
                j--;
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1)
            quicksort(A, izq, j - 1);
        if (izq < der)
            quicksort(A, j + 1, der);
    }

    static boolean busquedaB(int[] nums, int numBuscado, int limiteInf, int limiteSup){
        if(limiteInf > limiteSup)
            return false;
        int mitad = (limiteInf + limiteSup) / 2;
        if(nums[mitad] < numBuscado)
            return busquedaB(nums, numBuscado, limiteInf, mitad - 1);
        else    return true;
        

    }

    public static void main(String[] args) {
        
    }

}
