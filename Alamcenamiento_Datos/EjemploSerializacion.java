package Alamcenamiento_Datos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Paths;

public class EjemploSerializacion {

    public static void main(String[] args) {
        // Se crea un objeto de la clase persona
        Persona persona = new Persona("Alfonso", 23);

        String directorioDestino = Paths.get("Datos_Colecciones", "Alamcenamiento_Datos").toString();
        File nombreFichero = new File(directorioDestino + "\\persona.ser");

        // Serializacion
        try (ObjectOutputStream	 out = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
            out.writeObject(persona);
            System.out.println("Objeto serializado " + persona);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
