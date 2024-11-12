package SupuestoPractico.Ej2;

import java.util.ArrayList;
import java.util.Stack;
import java.time.LocalDateTime;

public class RedSocial {

    private ArrayList<Publicacion> publicaciones = new ArrayList<>();
    private Stack<Publicacion> pilaEliminados = new Stack<>();

    public Publicacion crearPublicacion(int id,String contenido, Usuario autor, LocalDateTime fecha){
        Publicacion publicacion = new Publicacion(id, contenido , autor, fecha);
        publicaciones.add(publicacion);
        return publicacion;
    }

    public void eliminarPublicacion(int id){
        for(Publicacion p : publicaciones){
            if(p.getId() == id){
                pilaEliminados.add(p);
                publicaciones.remove(p);
            }
        }
    }

    public void mostrarPublicaciones(){
        for(Publicacion p : publicaciones){
            System.out.println(p.toString());
        }
    }

    public void mostrarPublicacionesPorAutor(String nombreAutor){
        for(Publicacion p : publicaciones){
            if(p.getAutor().getNombre().equals(nombreAutor)){
                System.out.println(p.toString());
            }
        }
    }

    public void deshacerEliminacion() {
        // Verificar si hay algún producto en la pila para deshacer
        if (!pilaEliminados.isEmpty()) {
            Publicacion ultimoEliminado = pilaEliminados.pop();
            publicaciones.add(ultimoEliminado);
            System.out.println("Se ha deshecho la eliminación del producto: " + ultimoEliminado);
        } else {
            System.out.println("No hay productos para deshacer la eliminación.");
        }
    }

}
