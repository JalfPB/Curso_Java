package Ejercicios4;

public class Ej19 {
    //Suma todos los múltiplos de 5 entre 1 y 100.
    public static void main(String[] args) {
        int suma=0;

        for(int i=1;i<=100;i++){
            if(i%5==0){
                suma+=i;
            }
        }

        System.out.println("La suma de todos los multiplos de 5 entre 1 y 100 son: " + suma);
    }

}
