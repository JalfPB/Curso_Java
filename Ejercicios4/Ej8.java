package Ejercicios4;

import java.util.Scanner;

public class Ej8 {
    // Escribe un programa que determine el tipo de triángulo (equilátero,
    // isósceles, escaleno) basándose en la longitud de sus lados.
    static void comprobarTriangulo(float l1, float l2, float l3){
        if(l1 == l2 && l1 == l3){
            System.out.println("Es Equilatero");
        }else if(l1 == l2 && l1 != l3 || l2 == l3 && l2 != l1 ||l1 == l3 && l1 != l2){
            System.out.println("Es isosceles");
        }else{
            System.out.println("Es escaleno");
        }   
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float l1, l2, l3;

        
            System.out.println("Introduce lado 1");
            l1 = scanner.nextFloat();
            System.out.println("Introduce lado 2");
            l2 = scanner.nextFloat();
            System.out.println("Introduce lado 3");
            l3 = scanner.nextFloat();

            comprobarTriangulo(l1, l2, l3);
    }

}
