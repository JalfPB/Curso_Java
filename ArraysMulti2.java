public class ArraysMulti2 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 4, 5},{6,7,2}, {8, 3, 8}};
        // Recorrido de la matriz
        for(int fila = 0; fila<matriz.length; fila++) {
            for(int columna = 0; columna <matriz[fila].length; columna++){
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }

}
