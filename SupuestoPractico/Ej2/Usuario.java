package SupuestoPractico.Ej2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String nombre;
    private String email;
    private ArrayList<Usuario> amigos = new ArrayList<>();

    public Usuario(String nombre, String email, ArrayList<Usuario> amigos) {
        this.nombre = nombre;
        this.email = email;
        this.amigos = amigos;
    }

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void anadirAmigo(Usuario u) {
        amigos.add(u);
    }

    public void eliminarAmigo(Usuario u) {
        try{
        amigos.remove(u);
        System.out.println("Amigo " + u.toString() + " eliminado con exito");
        }catch(Exception e){
            System.out.println("Ha courrido un error al eliminar el amigo: ");
            e.printStackTrace();
        }
    }

    public void mostrarAmigos() {
        System.out.println("Lista de amigos del usuario " + nombre + ":");
        for (Usuario u : amigos) {
            //System.out.println(u.toString());
            System.out.println("Usuario: " + u.getNombre() + " email: " + u.getEmail());
        }
    }

    public void mostrarPublicacionesAmigos(RedSocial red) {
        for (Usuario u : amigos) {
            red.mostrarPublicacionesPorAutor(u.getNombre());
        }

    }

    public void guardarAmigosTexto(String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            Set<Usuario> procesados = new HashSet<>(); // Para evitar duplicados
            guardarAmigosRecursivo(writer, this, procesados, 0); // Llamada inicial con nivel 0
            System.out.println("Amigos y amigos de amigos guardados exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los amigos: " + e.getMessage());
        }
    }

    // Método recursivo para guardar amigos y amigos de amigos
    private void guardarAmigosRecursivo(BufferedWriter writer, Usuario usuario, Set<Usuario> procesados, int nivel)
            throws IOException {
        // Marcar este usuario como procesado
        if (!procesados.contains(usuario)) {
            procesados.add(usuario);
            writer.write("Nivel " + nivel + ": " + usuario.getNombre() + "," + usuario.getEmail());
            writer.newLine();
        }

        // Procesar los amigos de este usuario, incrementando el nivel de profundidad
        for (Usuario amigo : usuario.getAmigos()) {
            if (!procesados.contains(amigo)) { // Evitar duplicados
                guardarAmigosRecursivo(writer, amigo, procesados, nivel + 1);
            }
        }
    }

    public void cargarAmigosDesdeTexto(String rutaArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            HashMap<Integer, ArrayList<Usuario>> nivelMap = new HashMap<>();
            nivelMap.put(0, new ArrayList<>()); // Nivel 0 es para el usuario principal

            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(": |,");
                if (partes.length >= 3) {
                    // Obtener el nivel y datos del usuario
                    int nivel = Integer.parseInt(partes[0].split(" ")[1]);
                    String nombre = partes[1].trim();
                    String email = partes[2].trim();

                    // Crear el usuario amigo
                    Usuario nuevoAmigo = new Usuario(nombre, email);

                    // Añadirlo al nivel actual en el mapa
                    nivelMap.putIfAbsent(nivel, new ArrayList<>());
                    nivelMap.get(nivel).add(nuevoAmigo);

                    // Asignar como amigo al nivel inmediatamente superior
                    if (nivel > 0 && nivelMap.containsKey(nivel - 1)) {
                        Usuario amigoPadre = nivelMap.get(nivel - 1).get(nivelMap.get(nivel - 1).size() - 1);
                        amigoPadre.getAmigos().add(nuevoAmigo);
                    }
                }
            }

            // Asignar todos los amigos de nivel 1 al usuario principal
            if (nivelMap.containsKey(1)) {
                this.amigos.addAll(nivelMap.get(1));
            }

            System.out.println("Amigos cargados exitosamente desde " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al cargar los amigos: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return nombre + ", email: " + email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

}
