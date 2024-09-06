package Ejercicios4;

public class Ej19While {

    public static void main(String[] args) {
        int suma = 0;
        int i = 0;

        while(i<=100){
            if(i%5==0){
                suma += i;
            }
            i++;
        }

        System.out.println("La suma de todos los multiplos de 5 entre 1 y 100 son: " + suma);
    }

}
