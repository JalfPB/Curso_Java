import java.util.Arrays;
public class ForEachEjemplo {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        for(int n : array){
            System.out.println("[" + n + "]");
        }// [1][2][3][4][5][6][7][8]

        int[] array2 = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(array2));

        // Arrays multidimensionales
        int[][] array3 = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] fila : array3){
        for(int columna : fila) {
            System.out.println(columna);
        }}

        for(int[] fila : array3) {
            System.out.println(Arrays.toString(fila));
        }
    }

}
