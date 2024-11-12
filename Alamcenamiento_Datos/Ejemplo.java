package Alamcenamiento_Datos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        File fichero = new File("ejemplo1.txt");
        if(fichero.exists())
            System.out.println("El fichero existe");
        else
            System.out.println("El fichero no existe");
            System.out.println("Nombre: " + fichero.getName());
            System.out.println("Longitud: " + fichero.length());
            System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());

        String texto = "Este es un ejemplo de uso de FileWriter en Java";
        String fichero2 = "fichero.txt";
        try{
            // Creamos un objeto FileWriter
            FileWriter fileWriter = new FileWriter(fichero2);
            // Escribimos una String en el archivo
            fileWriter.write(texto);
            // Cerramos el FileWriter
            fileWriter.close();
            System.out.println("Se ha escrito en el fichero correctamente");
        }catch(IOException e){
            System.out.println("Error al escribir en el fichero");
            e.printStackTrace();
        }

        /*String fichero3 = "fichero.txt";
        try{
            FileReader fileReader = new FileReader(fichero3);
            int caracter;
            System.out.println("Contenido del archivo " + fichero + ":");
            while((caracter = fileReader.read()) != 1) {
                System.out.println((char) caracter);
            }
            fileReader.close();
        }catch( IOException e){
            System.out.println("Ocurrio un error");
            e.printStackTrace();
        }*/

        try{
            String nombreArchivo = "salida.txt";
            PrintWriter escritor = new PrintWriter(new FileWriter(nombreArchivo));

            escritor.println("Hola mundo!");
            escritor.println("Escribiendo en un archivo usando PrintWriter.");
            escritor.printf("Este es un numero: %d\n", 42);
            escritor.printf("Este es un decimal: %.2f\n", 3.14159);
            escritor.close();

            System.out.println("Texto escrito en el archivo con exito");
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }

        // Para leer archivos con scanner
        try{
            
            File archivo = new File("salida.txt");
            Scanner scn = new Scanner(archivo);
            while (scn.hasNextLine()) {
                    String linea = scn.nextLine();
                    System.out.println(linea);
            }
            scn.close();

        }catch(Exception e){
            System.out.println("Ha ocurrido un Error");
        }

        try{
            int numLineas = 5;
            String directorioDestino = Paths.get("Datos_Colecciones", "Alamcenamiento_Datos").toString();
            File nombreFichero = new File(directorioDestino + "\\PruebaBufferedWriter.txt");
            FileWriter fw = new FileWriter(nombreFichero);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 1; i <= numLineas; i++){
                bw.write("Esta es la linea: " + i);
                bw.newLine();
            }
            // Al cerrar el BufferedWriter se cierra tambien el Filewriter
            bw.close();
            System.out.println(nombreFichero + " creado con " + numLineas + " lineas");
        }catch(IOException e){
            System.out.println("Error al crear el archivo " + e.getMessage());
        }

        
    }
}
