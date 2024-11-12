package Alamcenamiento_Datos.Ejercicios.Ej5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    /*
     * Crea un método que encripta y otro que desencripta el contenido de un fichero
     * de texto utilizando el código césar. El cifrado César es un tipo de cifrado
     * de sustitución en el que cada letra en el texto se desplaza un cierto número
     * de lugares en el alfabeto. Por ejemplo, con un desplazamiento de 2, 'A' se
     * reemplazaría por 'C', 'B' se convertiría en 'D'. Con desplazamiento 5, 'C' se
     * reemplazaría por 'H', 'E' se convertiría en 'J', etc.
     */

    private static final int a = 0x41;
    private static final int z = 0x5a;
    private static int s;
    private static int lugares = 0;

    public static char[] creaTabla() {
        char[] tablaCifrado = new char[26];
        for (int i = 0; i < 26; i++) {
            int k = (i % 26) + 65;
            tablaCifrado[i] = (char) k;
        }
        return tablaCifrado;
    }

    public static void descifra(String clave, String entrada) throws IOException {
        String linea = null;
        BufferedReader texto = null;
        char[] tabla = creaTabla();
        try {
            String clave1 = (new BufferedReader(new FileReader(clave))).readLine();
            BufferedWriter escritor = new BufferedWriter(new FileWriter("salida.descifrado"));
            lugares = Integer.parseInt(clave1);
            texto = new BufferedReader(new FileReader(entrada));
            while ((linea = texto.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    char fila = linea.toUpperCase().charAt(i);
                    if (a > (s = (int) fila) || (s > z)) {
                        System.out.print((char) s);
                        escritor.write((char) s);
                    } else {
                        int x = ((s - 65) - lugares) % tabla.length;
                        if (x < 0)
                            x += tabla.length;
                        System.out.print(tabla[x]);
                        escritor.write(tabla[x]);
                    }
                    escritor.flush();
                }
            }
            System.out.println("");
        } catch (FileNotFoundException e) {
            System.err.println("El archivo de entrada no existe.");
        } catch (NumberFormatException n) {
            System.err.println("Se debe pasar un numero.");
        }
    }

    public static void encriptar(String clave, String entrada) throws IOException {
        String linea = null;
        BufferedReader texto = null;
        char[] tabla = creaTabla();
        try {
            String directorioDestino = Paths.get("Alamcenamiento_Datos", "Ejercicios", "Ej5")
                .toString();
            String clave1 = (new BufferedReader(new FileReader(clave))).readLine();
            BufferedWriter escritor = new BufferedWriter(new FileWriter(directorioDestino+"\\salida.cifrado"));
            lugares = Integer.parseInt(clave1);
            texto = new BufferedReader(new FileReader(entrada));
            while ((linea = texto.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    char fila = linea.toUpperCase().charAt(i);
                    if (a > (s = (int) fila) || (s > z)) {
                        System.out.print((char) s);
                        escritor.write((char) s);
                    } else {
                        System.out.print(tabla[((s - 65) + lugares) % tabla.length]);
                        escritor.write(tabla[((s - 65) + lugares) % tabla.length]);
                    }
                    escritor.flush();
                }
            }
            System.out.println("");
        } catch (FileNotFoundException e) {
            System.err.println("El archivo de entrada no existe.");
        } catch (NumberFormatException n) {
            System.err.println("Se debe pasar un numero.");
        }
    }

    public static void main(String[] args) {
        String directorioDestino = Paths.get("Alamcenamiento_Datos", "Ejercicios", "Ej5")
                .toString();
        directorioDestino = "C:\\Users\\Usuario\\Desktop\\Curso_Java\\Alamcenamiento_Datos\\Ejercicios\\Ej5\\fichero.txt";
        System.out.println(directorioDestino);
        try {
            encriptar("ABCDEFGHIJKLMNOPQRSTUVWXYZ", directorioDestino);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
