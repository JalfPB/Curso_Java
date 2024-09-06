package Ejercicios2;

public class Ej23 {

    public static void main(String[] args) {
        //Escribe un algoritmo que imprima los primeros 10 números de la secuencia de 	Fibonacci.
        int n1=0,n2=1, aux;

        for(int i = 0; i<10; i++){
            System.out.print(n1 + (i != 9 ? ", " : ""));
            aux = n1;
            n1 = n2;
            n2 = n2 + aux; 
        }
    }

}
