package Ejercicios;

public class Ej9 {
    //Escribe un programa que encuentre el mayor de dos números.
    public static void main(String[] args) {
        int num1, num2;

        num1=1;
        num2=6;

        if(num1>num2 && num1!=num2){
            System.out.println("El primer numero es mayor");
        }else if(num1<num2 && num1!=num2){
            System.out.println("El segundo numero es mayor");
        }else{
            System.out.println("Son iguales");
        }

    }

}
