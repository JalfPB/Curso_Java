package Excepciones.Ejercicios2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static void division(int a, int b) throws ArithmeticException {

        if (b == 0)
            throw new ArithmeticException("El divisor es cero");

    }

    public static void validar(int a) throws IllegalArgumentException {

        if (a < 0)
            throw new IllegalArgumentException("Debe ser mayor de edad");

    }

    public static void leerArchivo(String rutaArchivo) throws IOException {
        Path ruta = Paths.get(rutaArchivo);

        if (!Files.exists(ruta)) {
            throw new IOException("La ruta no es correcta");
        }
    }

    static int convertir(String s) throws NumberFormatException {
        int num = Integer.parseInt(s);
        return num;
    }

    static void validarCorreo(String correo) {
        if (!correo.contains("@"))
            throw new IllegalArgumentException("El formato del correo no es valido");
        System.out.println("El correo es correcto");
    }

    static void indiceArray(int i) {
        int[] lista = { 1, 2, 3 };
        if (i > lista.length)
            throw new ArrayIndexOutOfBoundsException("El indice no existe");
        System.out.println(lista[i]);
    }

    static void inventario(int i) {
        int[] inventario = { 1, 2, 3 };
        if (!recorrerArray(inventario, i))
            throw new NoSuchElementException("El producto no existe en el inventario");
        System.out.println(inventario[i]);
    }

    static boolean recorrerArray(int[] array, int n) {
        boolean existe = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    static void contrasena (String contrasena){
        if(contrasena.length() < 5) throw new IllegalArgumentException("La contraseña debe tener mas de 5 caracteres");
    }

    static void raizCuadrada(int n){

        if (n < 0) throw new IllegalArgumentException("El numero no debe ser negativo");
        System.out.println(Math.sqrt(n));
    }

    public static void main(String[] args) throws IOException {

        // division(1, 0);
        // validar(5);
        // leerArchivo("sdjfhdsifsdjif");
        // convertir("null");
        // validarCorreo("null@");
        // validarCorreo("null");
        // indiceArray(1);
        // indiceArray(23);
        //inventario(1);
        //inventario(123);
        //contrasena("123");
        raizCuadrada(2);
        raizCuadrada(-2);
    }

}
