package Ejercicios3;

import java.util.Scanner;

public class Ej6 {
    // Implementa un método para mostrar un menú de opciones, cuyas opciones serán
    // los ejercicios anteriores;
    // la última opción será para salir, debe pedir opciones hasta que se ponga
    // salir.
    static void saludo(String nombre) {
        System.out.println("Hola, " + nombre);
        System.out.println();
    }

    static void calcularCubo(int n) {
        int cubo = (int) Math.pow(n, 3);
        System.out.println("El cubo de " + n + " es " + cubo);
        System.out.println();
    }

    static int multiplicar(int n1, int n2) {
        int total = n1 * n2;
        // System.out.println(" La multiplicacion de " + n1 + " * " + " n2 es: " +
        // total);
        System.out.println();
        return total;
    }

    static void tablaMultiplicar(int n) {
        int resul;
        for (int i = 1; i <= 10; i++) {
            resul = multiplicar(n, i);
            System.out.println(n + " * " + i + " = " + resul);
        }
        System.out.println();
    }

    static void esPar(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " Es par");
        } else {
            System.out.println(n + " No es par");
        }
        System.out.println();
    }

    static void borrar() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /* No hacer nada */
        }
    }

    // Crear un método que reciba un número n y devuelva la suma de los primeros n
    // números naturales.
    static int sumaNaturales(int n) {
        int suma = 0;

        if (n < 0) {
            System.out.println("No se pueden introducir numeros negativos");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                suma += i;
            }
        }
        System.out.println("La suma de los primeros " + n + " numeros naturales es: " + suma);
        System.out.println();
        return suma;
    }

    // Crear un método que reciba un número n y devuelva su factorial.

    static int factorial(int n) {
        int aux, numOriginal;

        aux = n;
        numOriginal = aux;

        while (aux - 1 != 0) {
            if (aux - 1 != 0) {
                aux = aux - 1;
                System.out.println(n + " * " + aux + " = " + (n * aux));
                n = n * aux;
            }
            System.out.println(n);
        }
        System.out.println("El factorial de " + numOriginal + " es: " + n);
        System.out.println();
        return n;
    }

    // Crear un método que reciba un número n y devuelva true si es primo y false si
    // no lo es.

    static boolean esPrimo(int n) {
        boolean primo;
        int c = 0;

        if (n < 1) {
            System.out.println("El numero es menor que 1");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    c++;
                }
            }
        }
        if (c > 2) {
            System.out.println("El numero no es primo");
            primo = false;
        } else {
            System.out.println("El numero es primo");
            primo = true;
        }
        System.out.println();
        return primo;

    }

    // Crear un método que reciba dos números base y potencia y devuelva el
    // resultado de la potencia.

    static double calcularPotencia(double base, int potencia) {
        double resul;

        resul = Math.pow(base, potencia);
        System.out.println("La potencia de " + base + " elevado a " + potencia + " es " + resul);
        System.out.println();
        return resul;
    }

    // Crear un método que reciba un número n y devuelva los primeros n números de
    // la serie de Fibonacci.

    static void fibonacci(int n) {
        int n1 = 0, n2 = 1, aux;

        for (int i = 0; i < n; i++) {
            System.out.print(n1 + (i != 9 ? ", " : ""));
            aux = n1;
            n1 = n2;
            n2 = n2 + aux;
        }
        System.out.println("\n");
    }

    // Crear un método que reciba una cadena de texto y devuelva el número de
    // caracteres que tiene la cadena.

    static int longitudCadena(String cadena) {
        int longitud;

        longitud = cadena.length();
        System.out.println("La cadena tiene " + longitud + " caracteres");

        System.out.println();
        return longitud;
    }

    // Crear un método que reciba un número n y devuelva true si es un número
    // perfecto (la suma de sus divisores propios es igual al número) y false en
    // caso contrario.

    static boolean esPerfecto(int n){
        int suma = 0;
        boolean perfecto;

        if (n < 1) {
            System.out.println("El numero es menor que 1");
        } else {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    suma += i;
                    //System.out.println("num " + i + "suma: " + suma);
                }
            }
        }

        if(suma==n){
            perfecto=true;
            System.out.println("El numero es perfecto");
        }else{
            perfecto=false;
            System.out.println("El numero no es perfecto");
        }

        System.out.println();
        return perfecto;

    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("Elige opcion: ");
            System.out.println("1 - Saludo ");
            System.out.println("2 - Calcular cubo");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Tabla de multiplicar");
            System.out.println("5 - Comprobar par");
            System.out.println("6 - Suma de los naturales");
            System.out.println("7 - Factorial");
            System.out.println("8 - Primo");
            System.out.println("9 - Potencia");
            System.out.println("10 - Fibonacci");
            System.out.println("11 - Longitud cadena");
            System.out.println("12 - Perfecto");
            System.out.println("13 - Salir");

            opcion = scanner.nextInt();

            borrar();
            System.out.println();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Introduce nombre ");
                    String nombre = scanner.nextLine();
                    saludo(nombre);
                    break;
                case 2:
                    System.out.println("Introduce numero a calcular cubo");
                    int n = scanner.nextInt();
                    calcularCubo(n);
                    break;
                case 3:
                    System.out.println("Introduce numeros a multiplicar");
                    int n1 = scanner.nextInt();
                    int n2 = scanner.nextInt();
                    System.out.println("Resultado: " + multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.println("Introduce numero para calcular tabla de multiplicar");
                    int num = scanner.nextInt();
                    tablaMultiplicar(num);
                    break;
                case 5:
                    System.out.println("Introduce numero para comporbar par");
                    int comprobarPar = scanner.nextInt();
                    esPar(comprobarPar);
                    break;
                case 6:
                    System.out.println("Introduce numero objetivo");
                    int nObjetivo = scanner.nextInt();
                    sumaNaturales(nObjetivo);
                    break;
                case 7:
                    System.out.println("Introduce numero");
                    int nFactorial = scanner.nextInt();
                    factorial(nFactorial);
                    break;
                case 8:
                    System.out.println("Introduce numero");
                    int nPrimo = scanner.nextInt();
                    esPrimo(nPrimo);
                    break;
                case 9:
                    System.out.println("Introduce numero base");
                    double base = scanner.nextDouble();
                    System.out.println("Introduce potencia");
                    int potencia = scanner.nextInt();
                    calcularPotencia(base, potencia);
                    break;
                case 10:
                    System.out.println("Introduce numero");
                    int nFibonacci = scanner.nextInt();
                    fibonacci(nFibonacci);;
                    break;
                case 11:
                    System.out.println("Introduce cadena");
                    scanner.nextLine();
                    String cadena = scanner.nextLine();
                    longitudCadena(cadena);
                    break;
                case 12:
                    System.out.println("Introduce numero");
                    int numPerfecto = scanner.nextInt();
                    esPerfecto(numPerfecto);
                    break;
                default:
                    System.out.println(opcion + " no es una opcion");
                    break;
            }
        } while (opcion != 13);

        scanner.close();

    }

    public static void main(String[] args) {
        menu();
    }

}
