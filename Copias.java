import java.util.Arrays;
public class Copias {

    public static void main(String[] args) {
        /* 
        int nums[] = { 1, 0, 3, 4, 5 };
        int[] copiaArray;
        copiaArray = nums;

        copiaArray[1] = 0;

        System.out.println(copiaArray + " " + nums);

        System.out.println(Arrays.toString(copiaArray));
        System.out.println(Arrays.toString(nums));

        int primos[] = {1,2,3,5,7,11,13,17,19,23};
        int[] copiaClonado;
        int[] copiaReferencia;
        copiaClonado = primos.clone();
        copiaClonado[0] = 0;
        copiaReferencia = primos;
        copiaReferencia[1] = 0;
        System.out.println(Arrays.toString(primos));
        System.out.println(Arrays.toString(copiaClonado));
        System.out.println(Arrays.toString(copiaReferencia));
        */

        /* 
        int[][] primos = {{1, 2, 3, 5}, {7, 11, 13}};
        int[][] copia = new int[primos.length][primos[0].length];
        //copia
        System.arraycopy(primos[0],0,copia[0],0,4);
        System.arraycopy(primos[1],0,copia[1],0,3);
        //salida
        System.out.println(Arrays.toString(primos[0]));
        System.out.println(Arrays.toString(copia[0]));
        System.out.println(Arrays.toString(primos[1]));
        System.out.println(Arrays.toString(copia[1]));
        */

        int[][] primos = {{1,2,3,4,5,6,7},{11,13,17,19,23}};
        int[][] copiaClonado = new int[2][5];
        copiaClonado[0]=primos[0].clone();
        System.out.println(Arrays.toString(copiaClonado[0]));


    }

}
